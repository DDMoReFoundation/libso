package eu.ddmore.libpharmml.so;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;

public interface StandardisedOutputResource {
	
	public StandardisedOutput getDom();
	
	public IValidationReport getCreationReport();

}
