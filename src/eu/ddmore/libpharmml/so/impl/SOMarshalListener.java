package eu.ddmore.libpharmml.so.impl;

import eu.ddmore.libpharmml.impl.MarshalListener;

public class SOMarshalListener extends MarshalListener {

	SOVersion soVersion;
	
	public SOMarshalListener(SOVersion version) {
		super(version.getCorrespondingPharmMLVersion());
		this.soVersion = version;
	}

}
