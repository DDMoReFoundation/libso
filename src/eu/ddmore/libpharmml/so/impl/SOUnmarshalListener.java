package eu.ddmore.libpharmml.so.impl;

import eu.ddmore.libpharmml.impl.UnmarshalListener;

public class SOUnmarshalListener extends UnmarshalListener {
	
	SOVersion soVersion;

	public SOUnmarshalListener(SOVersion version){
		super(version.getCorrespondingPharmMLVersion());
		this.soVersion = version;
	}
	
}
