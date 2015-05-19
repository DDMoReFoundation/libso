package eu.ddmore.libpharmml.so.test;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;

public class TestResourceFactory {
	
	public static StandardisedOutputResource buildResource(final StandardisedOutput dom){
		return new StandardisedOutputResource() {
			
			@Override
			public StandardisedOutput getDom() {
				return dom;
			}
			
			@Override
			public IValidationReport getCreationReport() {
				return null;
			}
		};
	}

}
