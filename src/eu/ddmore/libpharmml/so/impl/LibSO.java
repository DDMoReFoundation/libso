package eu.ddmore.libpharmml.so.impl;

import java.io.InputStream;
import java.io.OutputStream;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.impl.ValidationReportFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;

public class LibSO {

	private SOMarshaller marshaller;
	private SOValidator validator;

	public void save(OutputStream opStr, StandardisedOutputResource resource) {
		// Set the correct written version that we are compliant with.
//		resource.getDom().setWrittenVersion(WRITTEN_VERSION);
		this.marshaller.marshall(resource.getDom(), opStr);
	}

	public StandardisedOutputResource createDomFromResource(InputStream inStr) {
		final ValidationReportFactory repFact = new ValidationReportFactory();
		this.marshaller.setErrorHandler(repFact);
		final StandardisedOutput dom = this.marshaller.unmarshall(inStr);
		StandardisedOutputResource retVal = new StandardisedOutputResource() {
			@Override
			public StandardisedOutput getDom() {
				return dom;
			}
			@Override
			public IValidationReport getCreationReport() {
				return repFact.createReport();
			}
		};
		return retVal;
	}
	
	public StandardisedOutputResource createDom(SOVersion version) {
		final StandardisedOutput dom = new StandardisedOutput();
		dom.setWrittenVersion(version.toString());
		
		final ValidationReportFactory repFact = new ValidationReportFactory();
		return new StandardisedOutputResource() {
			
			@Override
			public StandardisedOutput getDom() {
				return dom;
			}
			
			@Override
			public IValidationReport getCreationReport() {
				return repFact.createReport();
			}
		};
	}
	public void setValidator(SOValidator validator) {
		this.validator = validator;
	}

	public SOValidator getValidator() {
		return this.validator;
	}

	public void setMarshaller(SOMarshaller marshaller) {
		this.marshaller = marshaller;
	}

	public SOMarshaller getMarshaller() {
		return this.marshaller;
	}

}
