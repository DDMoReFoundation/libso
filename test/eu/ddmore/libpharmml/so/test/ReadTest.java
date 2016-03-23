package eu.ddmore.libpharmml.so.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.dom.commontypes.Matrix;
import eu.ddmore.libpharmml.dom.commontypes.MatrixColumnRowNames;
import eu.ddmore.libpharmml.dom.commontypes.MatrixRow;
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.commontypes.SymbolType;
import eu.ddmore.libpharmml.dom.dataset.ColumnDefinition;
import eu.ddmore.libpharmml.dom.dataset.ColumnType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.so.SOFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.dom.DesignType;
import eu.ddmore.libpharmml.so.dom.OptimalDesign;
import eu.ddmore.libpharmml.so.dom.OptimalDesignBlock;
import eu.ddmore.libpharmml.so.dom.RawResults;
import eu.ddmore.libpharmml.so.dom.SOBlock;
import eu.ddmore.libpharmml.so.dom.SOMatrix;
import eu.ddmore.libpharmml.so.dom.Simulation;
import eu.ddmore.libpharmml.so.dom.SimulationBlock;
import eu.ddmore.libpharmml.so.dom.SimulationItem;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;
import eu.ddmore.libpharmml.so.dom.ToolSettings;
import eu.ddmore.libpharmml.so.impl.LibSO;
import eu.ddmore.libpharmml.so.impl.SOValidator;

public class ReadTest {
	
	final static private String validExample = "examples/0_3/valid.xml";
	final static private String invalidExample = "examples/0_3_1/invalid.xml";
	private SOFactory soFactory;
	private LibSO libSO;
	
	@Before
	public void setUp() throws Exception {
		soFactory = SOFactory.getInstance();
		libSO = soFactory.createLibSO();
	}
	
	@After
	public void tearDown() throws Exception {
		this.libSO = null;
	}
	
	@Test
	public void ReadValidFile() throws Exception{
		StandardisedOutputResource sor = libSO.createDomFromResource(new FileInputStream(validExample));
		IValidationReport report = sor.getCreationReport();
		AssertUtil.assertValid(report);
	}
	
	@Test
	public void ValidateFile() throws Exception{
		StandardisedOutputResource sor = libSO.createDomFromResource(new FileInputStream(validExample));
		SOValidator validator = libSO.getValidator();
//		libSO.save(System.out, sor);
		AssertUtil.assertValid(validator.createValidationReport(sor));
	}
	
	@Test
	public void ReadInvalidFile() throws Exception{
		StandardisedOutputResource sor = libSO.createDomFromResource(new FileInputStream(invalidExample));
		IValidationReport report = sor.getCreationReport();
		assertEquals("Creation errors detected", 41, report.numErrors());
		
		IValidationReport valReport = libSO.getValidator().createValidationReport(sor);
		assertEquals("Validation errors detected", 39, valReport.numErrors());
	}
	
	@Test
	public void ReadContent() throws Exception{
		StandardisedOutputResource sor = libSO.createDomFromResource(new FileInputStream(validExample));
		
		// SO Root element
		StandardisedOutput so = sor.getDom();
		assertEquals("0.3", so.getWrittenVersion());
		assertEquals("warfarin_PK_ODE_SO_FULL.rdf", so.getMetadataFile());
		assertEquals("i1", so.getId());
		
		// SOBlock
		SOBlock so1 = so.getListOfSOBlock().get(0);
		assertEquals("SO1", so1.getBlkId());
		
		// Toolsettings
		ToolSettings toolSettings = so1.getToolSettings();
		ExternalFile file1 = toolSettings.getListOfFile().get(0);
		ExternalFile file2 = toolSettings.getListOfFile().get(1);
		ExternalFile file3 = toolSettings.getListOfFile().get(2);
		
		testFile(file1, "ts1", null, "algorithms.xmlx");
		testFile(file2, "ts2", null, "solver.xmlx");
		testFile(file3, "ts3", null, "andNowForSomethingCompletelyDifferent.xmlx");
		
		// Rawresults
		RawResults rawResults = so1.getRawResults();
		DataSet d1 = (DataSet) rawResults.getDataFilesAndGraphicsFiles().get(0);
		ExternalFile g1 = (ExternalFile) rawResults.getDataFilesAndGraphicsFiles().get(1);
//		assertEquals("DataFile", d1.getName().getLocalPart());
//		assertEquals("GraphicsFile", g1.getName().getLocalPart());
		
//		testFile(d1.getValue(), "d1", "Original output wth population data", "dataFolder/estimates.txt");
		testFile(g1, "g1", null, "graphicsFolder/ObservationVSprediction.png");
		
		// Simulation
		Simulation simu = so1.getSimulation();
		SimulationBlock simuBlock = simu.getListOfSimulationBlocks().get(0);
		assertEquals(Integer.valueOf(1), simuBlock.getReplicate());
		SimulationItem simProfiles = simuBlock.getListOfSimulatedProfiles().get(0);
		List<ColumnDefinition> colDefs = simProfiles.getDefinition().getListOfColumn();
		ColumnDefinition col1 = colDefs.get(0);
		assertEquals("ID", col1.getColumnId());
		assertEquals(ColumnType.ID, col1.getListOfColumnType().get(0));
		assertEquals(SymbolType.STRING, col1.getValueType());
		assertEquals(Integer.valueOf(1), col1.getColumnNum());
		
		// OptimalDesign
		OptimalDesign od = so1.getOptimalDesign();
		assertEquals(DesignType.EVALUATION, od.getType());
		OptimalDesignBlock odb = od.getListOfOptimalDesignBlock().get(0);
		assertEquals(Integer.valueOf(1), odb.getBlockNumber());
		
		// FIM
		SOMatrix fim = odb.getFIM();
		Matrix fimMatrix = fim.getMatrix();
		assertNotNull(fimMatrix);
		assertEquals(Matrix.Type.ANY.toString(), fimMatrix.getMatrixType());
		MatrixColumnRowNames rowNames = fimMatrix.getRowNames();
		assertEquals("POP_CL", rowNames.getStringOrSymbRef().get(0).toString());
		assertEquals("POP_V", rowNames.getStringOrSymbRef().get(1).toString());
		assertEquals("POP_KA", rowNames.getStringOrSymbRef().get(2).toString());
		assertEquals("POP_TLAG", rowNames.getStringOrSymbRef().get(3).toString());
		MatrixColumnRowNames colNames = fimMatrix.getColumnNames();
		assertEquals("POP_CL", colNames.getStringOrSymbRef().get(0).toString());
		assertEquals("POP_V", colNames.getStringOrSymbRef().get(1).toString());
		assertEquals("POP_KA", colNames.getStringOrSymbRef().get(2).toString());
		assertEquals("POP_TLAG", colNames.getStringOrSymbRef().get(3).toString());
		MatrixRow row1 = (MatrixRow) fimMatrix.getListOfMatrixElements().get(0);
		assertEquals(Double.valueOf(4.21e-05), Double.valueOf(((RealValue)row1.getListOfValues().get(0)).getValue()));
		assertEquals(Double.valueOf(2.36e-04), Double.valueOf(((RealValue)row1.getListOfValues().get(1)).getValue()));
		assertEquals(Double.valueOf(-0.000124), Double.valueOf(((RealValue)row1.getListOfValues().get(2)).getValue()));
		assertEquals(Double.valueOf(-1.01e-04), Double.valueOf(((RealValue)row1.getListOfValues().get(3)).getValue()));
	}
	
	private static void testFile(ExternalFile file, String expectedOid, String expectedDescription, String expectedPath){
		assertEquals(expectedOid, file.getOid());
		if(expectedDescription != null){
			assertNotNull(file.getDescription());
			assertEquals(expectedDescription, file.getDescription().getValue());
		}
		assertEquals(expectedPath, file.getPath());
	}

}
