package eu.ddmore.libpharmml.so.impl;

import java.util.Set;

import eu.ddmore.libpharmml.IdFactory;
import eu.ddmore.libpharmml.dom.Identifiable;
import eu.ddmore.libpharmml.validation.exceptions.DuplicateIdentifierException;

class VoidIdFactoryImpl implements IdFactory {

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String generateAndStoreIdentifiable(Identifiable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Identifiable getIdentifiable(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Identifiable> getListOfIdentifiable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void storeIdentifiable(Identifiable arg0) throws DuplicateIdentifierException {
		// TODO Auto-generated method stub
		
	}

}
