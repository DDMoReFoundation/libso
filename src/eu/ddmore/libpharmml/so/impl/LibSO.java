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

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.impl.MarshalListener;
import eu.ddmore.libpharmml.impl.ValidationReportFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;

public class LibSO {

	private SOMarshaller marshaller;
	private SOValidator validator;

	public void save(OutputStream opStr, StandardisedOutputResource resource) {
		if(resource.getDom().getWrittenVersion() == null){
			throw new RuntimeException("writtenVersion attribute must be set to the root element.");
		}
		
//		IdFactory idFactory = resource.getIdFactory();
		
		SOVersion version = SOVersion.getEnum(resource.getDom().getWrittenVersion());
		MarshalListener mListener;
		if(version != null){
			mListener = new SOMarshalListener(version, new VoidIdFactoryImpl());
		} else {
			throw new RuntimeException("Unknown or unsupported PharmML written version ("+resource.getDom().getWrittenVersion()+")");
		}
		
		mListener.autosetId(false);
		
		this.marshaller.marshall(resource.getDom(), opStr, mListener);
	}

	public StandardisedOutputResource createDomFromResource(InputStream inStr) {
		final ValidationReportFactory repFact = new ValidationReportFactory();
		this.marshaller.setErrorHandler(repFact);
		
		final SOVersion currentDocVersion;
		
		try {
		
			byte[] data = SOMarshaller.toByteArray(inStr);
			ByteArrayInputStream bais = new ByteArrayInputStream(data);
			currentDocVersion = SOMarshaller.parseVersion(bais);
			bais.reset();
			
			final StandardisedOutput dom = this.marshaller.unmarshall(bais,currentDocVersion,
					new SOUnmarshalListener(currentDocVersion, new VoidIdFactoryImpl(),repFact));
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
