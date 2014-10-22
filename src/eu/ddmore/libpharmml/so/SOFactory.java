/*******************************************************************************
 * Copyright (c) 2014 European Molecular Biology Laboratory,
 * Heidelberg, Germany.
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on 
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations 
 * under the License.
 *******************************************************************************/
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
