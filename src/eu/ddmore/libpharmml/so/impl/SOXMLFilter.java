/*******************************************************************************
 * Copyright (c) 2014, 2015 European Molecular Biology Laboratory,
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import eu.ddmore.libpharmml.impl.LoggerWrapper;
import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.impl.XMLFilter;

public class SOXMLFilter extends XMLFilter {
	
	public final static String NS_SO = "http://www.pharmml.org/so/0.3/StandardisedOutput";
	
	protected PharmMLVersion pharmml_version;
	protected SOVersion so_version;
	
	private final String NS_DOC_SO;
	
	public SOXMLFilter(SOVersion writtenVersion){
		super(writtenVersion.getCorrespondingPharmMLVersion());
		LoggerWrapper.getLogger().info("Filtering namespaces of SO "+writtenVersion+" and PharmML "+writtenVersion.getCorrespondingPharmMLVersion().getValue());
		this.pharmml_version = writtenVersion.getCorrespondingPharmMLVersion();
		this.so_version = writtenVersion;
		NS_DOC_SO = getSONamespace(so_version);
	}
	
	void filterPharmMLUris(InputStream is, OutputStream os) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(is));
    	String line = null;
    	OutputStreamWriter osw = new OutputStreamWriter(os);
    	while((line = br.readLine()) != null){
    		line = line.replaceAll("xmlns(:\\w+)?=\"http://www.pharmml.org/[^\"(so)]+/([^\"]+)\"",
    				"xmlns$1=\"http://www.pharmml.org/pharmml/"+ pharmml_version.getURIVersion() +"/$2\"");
    		osw.append(line);
    		osw.append("\n");
    	}
    	br.close();
    	osw.close();
    }
	
	@Override
	public XMLStreamReader getXMLStreamReader(final InputStream is) throws XMLStreamException{
    	
    	XMLStreamReader filterReader = new XMLStreamReader(){
    		
    		XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(is);

			@Override
			public Object getProperty(String name) throws IllegalArgumentException {
				return reader.getProperty(name);
			}

			@Override
			public int next() throws XMLStreamException {
				return reader.next();
			}

			@Override
			public void require(int type, String namespaceURI, String localName) throws XMLStreamException {
				reader.require(type, filterInputNamespace(namespaceURI), localName);
			}

			@Override
			public String getElementText() throws XMLStreamException {
				return reader.getElementText();
			}

			@Override
			public int nextTag() throws XMLStreamException {
				return reader.nextTag();
			}

			@Override
			public boolean hasNext() throws XMLStreamException {
				return reader.hasNext();
			}

			@Override
			public void close() throws XMLStreamException {
				reader.close();
			}

			@Override
			public String getNamespaceURI(String prefix) {
				return filterInputNamespace(reader.getNamespaceURI(prefix));
			}

			@Override
			public boolean isStartElement() {
				return reader.isStartElement();
			}

			@Override
			public boolean isEndElement() {
				return reader.isEndElement();
			}

			@Override
			public boolean isCharacters() {
				return reader.isCharacters();
			}

			@Override
			public boolean isWhiteSpace() {
				return reader.isWhiteSpace();
			}

			@Override
			public String getAttributeValue(String namespaceURI, String localName) {
				return reader.getAttributeValue(filterInputNamespace(namespaceURI), localName);
			}

			@Override
			public int getAttributeCount() {
				return reader.getAttributeCount();
			}

			@Override
			public QName getAttributeName(int index) {
				return reader.getAttributeName(index);
			}

			@Override
			public String getAttributeNamespace(int index) {
				return filterInputNamespace(reader.getAttributeNamespace(index));
			}

			@Override
			public String getAttributeLocalName(int index) {
				return reader.getAttributeLocalName(index);
			}

			@Override
			public String getAttributePrefix(int index) {
				return reader.getAttributePrefix(index);
			}

			@Override
			public String getAttributeType(int index) {
				return reader.getAttributeType(index);
			}

			@Override
			public String getAttributeValue(int index) {
				return reader.getAttributeValue(index);
			}

			@Override
			public boolean isAttributeSpecified(int index) {
				return reader.isAttributeSpecified(index);
			}

			@Override
			public int getNamespaceCount() {
				return reader.getNamespaceCount();
			}

			@Override
			public String getNamespacePrefix(int index) {
				return reader.getNamespacePrefix(index);
			}

			@Override
			public String getNamespaceURI(int index) {
				return filterInputNamespace(reader.getNamespaceURI(index));
			}

			@Override
			public NamespaceContext getNamespaceContext() {
				final NamespaceContext context = reader.getNamespaceContext();
				return new NamespaceContext() {
					
					@Override
					public Iterator<?> getPrefixes(String namespaceURI) {
						return context.getPrefixes(namespaceURI);
					}
					
					@Override
					public String getPrefix(String namespaceURI) {
						return context.getPrefix(namespaceURI);
					}
					
					@Override
					public String getNamespaceURI(String prefix) {
						return filterInputNamespace(context.getNamespaceURI(prefix));
					}
				};
			}

			@Override
			public int getEventType() {
				return reader.getEventType();
			}

			@Override
			public String getText() {
				return reader.getText();
			}

			@Override
			public char[] getTextCharacters() {
				return reader.getTextCharacters();
			}

			@Override
			public int getTextCharacters(int sourceStart, char[] target, int targetStart, int length)
					throws XMLStreamException {
				return reader.getTextCharacters(sourceStart, target, targetStart, length);
			}

			@Override
			public int getTextStart() {
				return reader.getTextStart();
			}

			@Override
			public int getTextLength() {
				return reader.getTextLength();
			}

			@Override
			public String getEncoding() {
				return reader.getEncoding();
			}

			@Override
			public boolean hasText() {
				return reader.hasText();
			}

			@Override
			public Location getLocation() {
				return reader.getLocation();
			}

			@Override
			public QName getName() {
				QName qname = reader.getName();
				QName newQname = new QName(filterInputNamespace(qname.getNamespaceURI()), 
						qname.getLocalPart(), 
						qname.getPrefix());
				return newQname;
			}

			@Override
			public String getLocalName() {
				return reader.getLocalName();
			}

			@Override
			public boolean hasName() {
				return reader.hasName();
			}

			@Override
			public String getNamespaceURI() {
				return filterInputNamespace(reader.getNamespaceURI());
			}

			@Override
			public String getPrefix() {
				return reader.getPrefix();
			}

			@Override
			public String getVersion() {
				return reader.getVersion();
			}

			@Override
			public boolean isStandalone() {
				return reader.isStandalone();
			}

			@Override
			public boolean standaloneSet() {
				return reader.standaloneSet();
			}

			@Override
			public String getCharacterEncodingScheme() {
				return reader.getCharacterEncodingScheme();
			}

			@Override
			public String getPITarget() {
				return reader.getPITarget();
			}

			@Override
			public String getPIData() {
				return reader.getPIData();
			}

			
    		
    	};
    	
    	return filterReader;
    }
	
	@Override
	protected String filterInputNamespace(String ns) {
		if(ns == null){
			return null;
		} else {
			if(ns.equals(NS_DOC_SO)){
				return NS_SO;
			} else {
				return super.filterInputNamespace(ns);
			}
		}
	}
	
	/**
	 * Gets the namespace SO URI corresponding to the given SO version.
	 * @param version {@link SOVersion} of the file.
	 * @return The namespace URI as a {@link String}.
	 */
	public static String getSONamespace(SOVersion version){
		switch (version) {
		case v0_3_1:
			return NS_SO;
		case v0_3:
			return NS_SO;
		case v0_2:
			return "http://www.pharmml.org/so/0.2/StandardisedOutput";
		case v0_1:
			return "http://www.pharmml.org/so/0.1/StandardisedOutput";
		case v0_0:
			return "http://www.pharmml.org/2013/03/StandardisedOutput";
		default:
			throw new RuntimeException("No namespace set for version "+version);
		}
	}
}
