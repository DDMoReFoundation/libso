package eu.ddmore.libpharmml.so.test;

import eu.ddmore.libpharmml.dom.dataset.ExternalFile.Delimiter;
import eu.ddmore.libpharmml.so.dom.SOBlock;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;
import eu.ddmore.libpharmml.so.dom.ToolSettings;
import eu.ddmore.libpharmml.so.impl.SOVersion;

public class TestDomFactory {
	
	public static StandardisedOutput getValidSO(){
		StandardisedOutput so = new StandardisedOutput();
		
		so.createPharmMLRef("pharmml.xml");
		so.setWrittenVersion(SOVersion.v0_2.toString());
		
		SOBlock block = so.createSoBlock();
		ToolSettings ts = block.createToolSettings();
		ts.createExternalFile("files/data1.csv", "csv", Delimiter.COMMA, "data1");
		
		return so;
	}

}
