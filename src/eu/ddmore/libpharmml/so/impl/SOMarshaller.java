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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.Unmarshaller.Listener;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.validation.Schema;

import eu.ddmore.libpharmml.IErrorHandler;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLElement;
import eu.ddmore.libpharmml.impl.LoggerWrapper; //
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;

public class SOMarshaller {
	private static final String CONTEXT_NAME = Messages.getString("SOMarshaller.contextDefn"); //$NON-NLS-1$
	private IErrorHandler errorHandler;
	
	public SOMarshaller(){
	}
	
	public void marshall(StandardisedOutput dom, OutputStream os) {
		try {
			JAXBContext context = JAXBContext.newInstance(CONTEXT_NAME);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(dom, os);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public StandardisedOutput unmarshall(InputStream is) {
		try {
//			String packageName = PharmML.class.getPackage().getName();
			JAXBContext context = JAXBContext.newInstance(CONTEXT_NAME);
			Unmarshaller u = context.createUnmarshaller();
			u.setEventHandler(new ValidationEventHandler() {
				
				@Override
				public boolean handleEvent(ValidationEvent event) {
					int severity = event.getSeverity();
					switch(severity){
					case ValidationEvent.ERROR:
						errorHandler.handleError(event.getMessage());
						break;
					case ValidationEvent.FATAL_ERROR:
						errorHandler.handleError(event.getMessage());
						break;
					case ValidationEvent.WARNING:
						errorHandler.handleWarning(event.getMessage());
						break;
					}
					return true;
				}
			});
			
			// Convert inputStream to byteArray so it can be read twice (first to get PharmML version before unmarshalling)
			byte[] data = toByteArray(is);
			ByteArrayInputStream bais = new ByteArrayInputStream(data);
			final SOVersion currentDocVersion = parseVersion(bais);
			bais.reset();
			
			// Schema
			Schema mySchema = SOSchemaFactory.getInstance().createSOSchema(currentDocVersion);
			u.setSchema(mySchema);
			
			// Store version info into each element
			Listener listener = new Listener() {
				@Override
				public void beforeUnmarshal(Object target, Object parent) {
					if(target instanceof PharmMLElement){
						((PharmMLElement)target).setUnmarshalVersion(currentDocVersion.getCorrespondingPharmMLVersion());
					}
				}
			};
			u.setListener(listener);
			
			StandardisedOutput doc = (StandardisedOutput)u.unmarshal(bais);
			return doc;
		} catch (JAXBException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (XMLStreamException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public void setErrorHandler(IErrorHandler repFact) {
		this.errorHandler = repFact;
	}

	public IErrorHandler getErrorHandler() {
		return this.errorHandler;
	}
	
	private SOVersion parseVersion(InputStream is) throws XMLStreamException{
		XMLInputFactory factory = XMLInputFactory.newFactory();
		XMLStreamReader sReader = factory.createXMLStreamReader(is);
		String version = null;
		while(sReader.hasNext() && version == null){
			int event = sReader.next();
			switch(event){
			case XMLStreamConstants.START_ELEMENT:
				if("SO".equals(sReader.getLocalName())){
					version = sReader.getAttributeValue(null,"writtenVersion");
				}
			}
		}
		sReader.close();
		SOVersion phVersion = SOVersion.getEnum(version);
		if(phVersion == null){
			phVersion = SOVersion.DEFAULT;
			LoggerWrapper.getLogger().warning("Missing writtenVersion attribute or unknown version for SO element. Using default version ("+phVersion+").");
		}
		return phVersion;
	}
	
	private byte[] toByteArray(InputStream is) throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();				
		byte[] buffer = new byte[1024];
		int read = 0;
		while ((read = is.read(buffer, 0, buffer.length)) != -1) {
			baos.write(buffer, 0, read);
		}		
		baos.flush();	
		return baos.toByteArray();
	}
}
