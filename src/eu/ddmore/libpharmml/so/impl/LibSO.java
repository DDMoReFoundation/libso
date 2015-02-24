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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.stream.XMLStreamException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

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
//		this.marshaller.setErrorHandler(repFact);
		
		final SOVersion currentDocVersion;
		
		try {
		
			byte[] data = SOMarshaller.toByteArray(inStr);
			ByteArrayInputStream bais = new ByteArrayInputStream(data);
			currentDocVersion = SOMarshaller.parseVersion(bais);
			bais.reset();
			
			// Validating stream with schemas
			Schema schema = SOSchemaFactory.getInstance().createSOSchema(currentDocVersion);
			Validator validator = schema.newValidator();
			validator.setErrorHandler(new ErrorHandler() {
				
				@Override
				public void warning(SAXParseException exception) throws SAXException {
					repFact.handleWarning(exception.getMessage());
				}
				
				@Override
				public void fatalError(SAXParseException exception) throws SAXException {
					repFact.handleError(exception.getMessage());
				}
				
				@Override
				public void error(SAXParseException exception) throws SAXException {
					repFact.handleError(exception.getMessage());
				}
			});
			validator.validate(new StreamSource(bais));
			bais.reset();
			
			final StandardisedOutput dom = this.marshaller.unmarshall(inStr,currentDocVersion);
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
		
		} catch (XMLStreamException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (SAXException e) {
			throw new RuntimeException(e);
		}
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
