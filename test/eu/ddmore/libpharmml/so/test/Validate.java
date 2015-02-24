package eu.ddmore.libpharmml.so.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.so.SOFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;
import eu.ddmore.libpharmml.so.impl.LibSO;
import eu.ddmore.libpharmml.so.impl.SOValidator;

public class Validate {

	public static void main(String[] args) {
		
		LibSO libSo = SOFactory.getInstance().createLibSO();
		
		for(String fileName : args){
			
			try {
				print("\n---------------------------------------\n");
				print("MODEL: "+fileName+"\n");

				InputStream in = new FileInputStream(fileName);
				StandardisedOutputResource pmlResource = libSo.createDomFromResource(in);
				in.close();
				
				IValidationReport creationReport = pmlResource.getCreationReport();
				print("CREATION REPORT: "+creationReport.numErrors()+" error(s)\n");
				for(int i=1;i<=pmlResource.getCreationReport().numErrors();i++){
					print("\t- "+pmlResource.getCreationReport().getError(i)+"\n");
				}
				@SuppressWarnings("unused")
				StandardisedOutput dom = pmlResource.getDom();
	
				SOValidator validator = libSo.getValidator();
				IValidationReport rpt = validator.createValidationReport(pmlResource);
				print("VALIDATION REPORT: "+rpt.numErrors()+" error(s)\n");
				for(int i=1;i<=rpt.numErrors();i++){
					print("\t- "+rpt.getError(i)+"\n");
				}	
			
			} catch (IOException e) {
				print("Error: "+e.getMessage()+"\n");
			} finally {
				print("\n---------------------------------------\n");
			}
			
		}
		
	}
	
	private static void print(String o){
		System.out.print(o);
	}

}
