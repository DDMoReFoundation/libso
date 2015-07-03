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
import javax.xml.bind.Unmarshaller.Listener;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.validation.Schema;

import eu.ddmore.libpharmml.IErrorHandler;
import eu.ddmore.libpharmml.impl.LoggerWrapper; //
import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.impl.PharmMLSchemaFactory.NamespaceType;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;

public class SOMarshaller {
	private static final String CONTEXT_NAME = Messages.getString("SOMarshaller.contextDefn"); //$NON-NLS-1$
	private IErrorHandler errorHandler;
	
	public SOMarshaller(){
	}
	
	public void marshall(StandardisedOutput dom, OutputStream os, javax.xml.bind.Marshaller.Listener mListener) {
		try {
			JAXBContext context = JAXBContext.newInstance(CONTEXT_NAME);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//			m.marshal(dom, os);
			
			SOVersion version = SOVersion.getEnum(dom.getWrittenVersion());
			if(version == null){
				throw new IllegalStateException("writtenVersion attribute must be set.");
			}
			m.setListener(mListener);
			
			if(!version.equals(SOVersion.DEFAULT)){
				LoggerWrapper.getLogger().severe("This version of libSO is not compatible with SO version "+version);
			}
			
			if(!SOVersion.getEnum(dom.getWrittenVersion()).getCorrespondingPharmMLVersion().isEqualOrLaterThan(PharmMLVersion.V0_6)){
				// Marshalling into a XMLStreamWriter with filter for namespaces.
				// Into a ByteArray so it can be inputstreamed again.
				ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
				SOXMLFilter filter = new SOXMLFilter(version);	
//				XMLStreamWriter xmlsw = filter.getXMLStreamWriter(byteOut);	
				m.marshal(dom, byteOut);
				
				filter.filterPharmMLUris(new ByteArrayInputStream(byteOut.toByteArray()), os);
			} else { // no filtering, applying old default namespace
				m.marshal(dom, os);
			}
			
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public StandardisedOutput unmarshall(InputStream is) {
		try {
			byte[] data = toByteArray(is);
			ByteArrayInputStream bais = new ByteArrayInputStream(data);
			final SOVersion currentDocVersion = parseVersion(bais);
			bais.reset();
			
			return unmarshall(bais,currentDocVersion,null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (XMLStreamException e) {
			throw new RuntimeException(e);
		}
	}

	public StandardisedOutput unmarshall(InputStream is,final SOVersion currentDocVersion,Listener uListener) {
		if(!currentDocVersion.equals(SOVersion.DEFAULT)){
			LoggerWrapper.getLogger().severe("This version of libSO is not compatible with SO version "+currentDocVersion);
		}
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
						errorHandler.handleError("SCHEMA",event.getMessage(),event.getLocator());
						break;
					case ValidationEvent.FATAL_ERROR:
						errorHandler.handleError("SCHEMA",event.getMessage(),event.getLocator());
						break;
					case ValidationEvent.WARNING:
						errorHandler.handleWarning(event.getMessage());
						break;
					}
					return true;
				}
			});
			
			// Schema
			Schema mySchema = SOSchemaFactory.getInstance().createSOSchema(currentDocVersion, NamespaceType.DEFAULT);
			u.setSchema(mySchema);
			
			u.setListener(uListener);
			
			StandardisedOutput doc;
			if(!currentDocVersion.equals(SOVersion.DEFAULT)){
				XMLStreamReader xmlsr = new SOXMLFilter(currentDocVersion).getXMLStreamReader(is);
				doc = (StandardisedOutput)u.unmarshal(xmlsr);
			} else {
				doc = (StandardisedOutput)u.unmarshal(is);
			}
			
//			// Not calling the full validator, as the validation is performed but the
//			// UnmarshalListener.
//			if(version.isEqualOrLaterThan(PharmMLVersion.V0_6)){
//				SymbolResolver sr = new SymbolResolver(doc, errorHandler);
//				sr.validateAll();
//			} else {
//				LoggerWrapper.getLogger().info("Version is below "+PharmMLVersion.V0_6+", no complex validation performed.");
//			}
			

			return doc;
		} catch (JAXBException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (XMLStreamException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public void setErrorHandler(IErrorHandler repFact) {
		this.errorHandler = repFact;
	}

	public IErrorHandler getErrorHandler() {
		return this.errorHandler;
	}
	
	static SOVersion parseVersion(InputStream is) throws XMLStreamException{
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
	
	static byte[] toByteArray(InputStream is) throws IOException{
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
