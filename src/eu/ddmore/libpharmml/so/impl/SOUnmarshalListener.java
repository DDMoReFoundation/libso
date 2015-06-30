package eu.ddmore.libpharmml.so.impl;

import eu.ddmore.libpharmml.IErrorHandler;
import eu.ddmore.libpharmml.IdFactory;
import eu.ddmore.libpharmml.impl.UnmarshalListener;

public class SOUnmarshalListener extends UnmarshalListener {
	
	SOVersion soVersion;
	
	public SOUnmarshalListener(SOVersion version, IdFactory idFactory, IErrorHandler eh){
		super(version.getCorrespondingPharmMLVersion(),idFactory,eh);
		this.soVersion = version;
	}
	
	@Override
	public void afterUnmarshal(Object target, Object parent) {
		super.afterUnmarshal(target, parent);
	}
	
}
