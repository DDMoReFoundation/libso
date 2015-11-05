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

import java.io.IOException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.xerces.util.XMLCatalogResolver;
import org.xml.sax.SAXException;

import eu.ddmore.libpharmml.impl.PharmMLSchemaFactory;
import eu.ddmore.libpharmml.impl.PharmMLSchemaFactory.NamespaceType;
import eu.ddmore.libpharmml.impl.PharmMLVersion;


public class SOSchemaFactory {
	private static SOSchemaFactory anInstance = null;

//	private static final String DEFINITIONS_XML_CATALOG_XML = Messages.getString("MarshallerImpl.xmlCatalogLocation"); //$NON-NLS-1$
//	private static final String SO_URI = Messages.getString("SOMarshaller.SOURI");
	
	
	public static SOSchemaFactory getInstance(){
		if(anInstance == null){
			anInstance = new SOSchemaFactory();
		}
		return anInstance;
	}
	
	/**
	 * Creates schema instance for given PharmML version.
	 * @param version the version of the schema
	 * @return 		a {@link Schema} instance of PharmML
	 */
	public Schema createSOSchema(SOVersion version, NamespaceType namespaceType){
		try {
			// merging SO and PharmML catalogs
			String[] locationData = resolveCatalogLocation(version, namespaceType);
			URL url = SOSchemaFactory.class.getResource(locationData[0]);
			String systemURI = locationData[1];

			String[] pharmmlLocationData;
			if(version.getCorrespondingPharmMLVersion().isEqualOrLaterThan(PharmMLVersion.DEFAULT)){
				pharmmlLocationData = PharmMLSchemaFactory.getInstance().resolveCatalogLocation(
						version.getCorrespondingPharmMLVersion(), NamespaceType.DEFAULT);
			} else {
				pharmmlLocationData = PharmMLSchemaFactory.getInstance().resolveCatalogLocation(
						version.getCorrespondingPharmMLVersion(), NamespaceType.OLD);
			}
			String pharmmlCatalogLocation = pharmmlLocationData[0];
			URL url_pharmml = PharmMLSchemaFactory.class.getResource(pharmmlCatalogLocation);
			
			if(url == null){
				throw new RuntimeException("Can't find schema for SO.");
			}
			if(url_pharmml == null){
				throw new RuntimeException("Can't find schema for PharmML");
			}
			String[] catalogs = { url.toExternalForm(), url_pharmml.toExternalForm() };
			XMLCatalogResolver resolver = new XMLCatalogResolver();
			resolver.setCatalogList(catalogs);
			String val = resolver.resolveSystem(systemURI); 
			StreamSource src = new StreamSource(val);
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			sf.setResourceResolver(resolver);
			Schema mySchema = sf.newSchema(new StreamSource[] { src });

			return mySchema;
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (SAXException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	/**
	 * Gets the right catalog location and system URI for the given PharmML version
	 * and the given namespace type.
	 * @param version The {@link SOVersion} enum value.
	 * @param type {@link NamespaceType} enum value.
	 * @return An array of {@link String}, where the 1st value is the catalog location
	 * and the 2nd value is the system URI.
	 */
	public String[] resolveCatalogLocation(SOVersion version, NamespaceType type){
		String catalogLocation;
		String systemURI;
		if(version.equals(SOVersion.DEFAULT)){
			catalogLocation = version.getCatalogLocation();
			systemURI = SOXMLFilter.NS_SO;
		} else {
			if(type.equals(NamespaceType.DEFAULT)){
				catalogLocation = version.getDefaultCatalogLocation();
				systemURI = SOXMLFilter.NS_SO;
			} else {
				catalogLocation = version.getCatalogLocation();
				systemURI = SOXMLFilter.getSONamespace(version);
			}
		}
		return new String[] {catalogLocation, systemURI};
	}
}
