package eu.ddmore.libpharmml.so.impl;

import eu.ddmore.libpharmml.impl.PharmMLVersion;

public enum SOVersion {
	
	v0_1("0.1","SOMarshaller.xmlCatalogLocation.0.1",PharmMLVersion.V0_4);
	
	public static final SOVersion DEFAULT = v0_1;
	
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
		if(version.equals("0.1")){
			return SOVersion.v0_1;
		} else {
			return null;
		}
	}

	public String getCatalogLocation() {
		return catalogLocation;
	}
	
	public PharmMLVersion getCorrespondingPharmMLVersion(){
		return pharmmlVersion;
	}

}
