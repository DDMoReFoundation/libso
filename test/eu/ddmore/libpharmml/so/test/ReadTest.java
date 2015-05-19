package eu.ddmore.libpharmml.so.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.so.SOFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.impl.LibSO;

public class ReadTest {
	
	final static private String validExample = "examples/0_2/valid.xml";
	final static private String invalidExample = "examples/0_2/invalid.xml";
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
	public void ReadValidFile() throws FileNotFoundException{
		StandardisedOutputResource sor = libSO.createDomFromResource(new FileInputStream(validExample));
		IValidationReport report = sor.getCreationReport();
		assertTrue("No error", report.isValid());
	}
	
	@Test
	public void ReadInvalidFile() throws FileNotFoundException{
		StandardisedOutputResource sor = libSO.createDomFromResource(new FileInputStream(invalidExample));
		IValidationReport report = sor.getCreationReport();
		assertEquals("Creation errors detected", 2, report.numErrors());
		
		IValidationReport valReport = libSO.getValidator().createValidationReport(sor);
		assertEquals("Validation errors detected", 40, valReport.numErrors());
	}

}
