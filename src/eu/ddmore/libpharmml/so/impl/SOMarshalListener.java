package eu.ddmore.libpharmml.so.impl;

import eu.ddmore.libpharmml.IdFactory;
import eu.ddmore.libpharmml.impl.MarshalListener;

public class SOMarshalListener extends MarshalListener {

	SOVersion soVersion;
	
	public SOMarshalListener(SOVersion version, IdFactory idFactory) {
		super(version.getCorrespondingPharmMLVersion(),idFactory);
		this.soVersion = version;
	}

}
