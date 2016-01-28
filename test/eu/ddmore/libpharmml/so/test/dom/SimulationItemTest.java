package eu.ddmore.libpharmml.so.test.dom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.dom.commontypes.SymbolType;
import eu.ddmore.libpharmml.dom.dataset.ColumnType;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.dom.dataset.HeaderColumnsDefinition;
import eu.ddmore.libpharmml.so.SOFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.dom.SOBlock;
import eu.ddmore.libpharmml.so.dom.Simulation;
import eu.ddmore.libpharmml.so.dom.SimulationBlock;
import eu.ddmore.libpharmml.so.dom.SimulationItem;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;
import eu.ddmore.libpharmml.so.impl.LibSO;
import eu.ddmore.libpharmml.so.test.AssertUtil;
import eu.ddmore.libpharmml.so.test.TestDomFactory;
import eu.ddmore.libpharmml.so.test.TestResourceFactory;

public class SimulationItemTest {
	
	private SOFactory soFactory;
	private LibSO libSO;
	
	private static final String FILENAME = "simulationItem.xml";
	
	@Before
	public void setUp() throws Exception {
		soFactory = SOFactory.getInstance();
		libSO = soFactory.createLibSO();
	}
	
	@After
	public void tearDown() throws Exception {
		this.libSO = null;
		this.soFactory = null;
	}
	
	@Test
	public void validate() throws Exception {
		StandardisedOutputResource sor = TestResourceFactory.buildResource(TestDomFactory.getValidSO());
		SOBlock soBlock = sor.getDom().getListOfSOBlock().get(0);
		
		Simulation simul = soBlock.createSimulation();
		SimulationBlock simBlock = simul.createSimulationBlock();
		SimulationItem item = simBlock.createDosing();
		
		item.createExternalFile("/extFile.csv", "CSV", ExternalFile.Delimiter.COMMA, "e1");
		HeaderColumnsDefinition def = item.createDefinition();
		def.createColumnDefinition("c1", ColumnType.ID, SymbolType.ID, 1);
		def.createColumnDefinition("c2", ColumnType.CMT, SymbolType.INT, 2);
		
		IValidationReport report = libSO.getValidator().createValidationReport(sor);
		AssertUtil.assertValid(report);
	}
	
	@Test
	public void unmarshal() throws Exception {
		InputStream is = this.getClass().getResourceAsStream(FILENAME);
		StandardisedOutputResource sor = libSO.createDomFromResource(is);
		AssertUtil.assertValid(sor.getCreationReport());
		
		StandardisedOutput so = sor.getDom();
		SOBlock soblock = so.getListOfSOBlock().get(0);
		SimulationBlock simul = soblock.getSimulation().getListOfSimulationBlocks().get(0);
		assertEquals(1, simul.getListOfDosing().size());
		SimulationItem dosing = simul.getListOfDosing().get(0);
		HeaderColumnsDefinition def = dosing.getDefinition();
		assertNotNull(def);
		ExternalFile extFile = dosing.getExternalFile();
		assertNotNull(extFile);
		assertEquals("/extFile.csv", extFile.getPath());
		assertEquals("CSV", extFile.getFormat());
		assertEquals("COMMA", extFile.getDelimiter());
	}

}
