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
package eu.ddmore.libpharmml.so.impl;

import eu.ddmore.libpharmml.impl.PharmMLVersion;

public enum SOVersion {
	
	v0_0("0.0","SOMarshaller.xmlCatalogLocation.0.0",PharmMLVersion.V0_4),
	v0_1("0.1","SOMarshaller.xmlCatalogLocation.0.1",PharmMLVersion.V0_6),
	v0_2("0.2","SOMarshaller.xmlCatalogLocation.0.1",PharmMLVersion.V0_6);
	
	public static final SOVersion DEFAULT = v0_0;
	
	private String version;
	private String catalogLocation;
	private PharmMLVersion pharmmlVersion;
	
	private SOVersion(String version,String catalogMessage,PharmMLVersion pharmmlVersion){
		this.version = version;
		this.catalogLocation = Messages.getString(catalogMessage);
		this.pharmmlVersion = pharmmlVersion;
	}
	
	@Override
	public String toString() {
		return version;
	}

	public static SOVersion getEnum(String version) {
		for(SOVersion soVersion : values()){
			if(version.equals(soVersion.toString())){
				return soVersion;
			}
		}
		return null;
	}

	public String getCatalogLocation() {
		return catalogLocation;
	}
	
	public PharmMLVersion getCorrespondingPharmMLVersion(){
		return pharmmlVersion;
	}

}
