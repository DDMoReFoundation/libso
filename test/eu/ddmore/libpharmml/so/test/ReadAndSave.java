package eu.ddmore.libpharmml.so.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import eu.ddmore.libpharmml.so.SOFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.impl.LibSO;

public class ReadAndSave {

	public static void main(String[] args) throws FileNotFoundException {
		
		LibSO libSo = SOFactory.getInstance().createLibSO();
		FileInputStream in = new FileInputStream(args[0]);
		StandardisedOutputResource resource = libSo.createDomFromResource(in);
		
		libSo.save(new FileOutputStream(args[1]), resource);
		
	}

}
