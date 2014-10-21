package eu.ddmore.libpharmml.so;

import eu.ddmore.libpharmml.so.impl.SOMarshaller;
import eu.ddmore.libpharmml.so.impl.SOValidator;
import eu.ddmore.libpharmml.so.impl.LibSO;

public class SOFactory {

	private static SOFactory anInstance; 
	
	/**
	 * Get a singleton of this class.
	 * @return the singleton instance of this class.
	 */
	public static SOFactory getInstance(){
		if(anInstance == null){
			anInstance = new SOFactory();
		}
		return anInstance;
	}
	
	/**
	 * Create a new instance of the PharmML API. The instance will
	 * be ready to use and set with an appropriate marshaller and validator.
	 * @return the new instance of the API.
	 */
	public LibSO createLibSO(){
		LibSO retVal = new LibSO();
		retVal.setMarshaller(new SOMarshaller());
		retVal.setValidator(new SOValidator());
		return retVal;
	}
	
}
