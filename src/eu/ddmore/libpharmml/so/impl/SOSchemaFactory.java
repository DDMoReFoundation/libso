package eu.ddmore.libpharmml.so.impl;

import java.io.IOException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import org.apache.xerces.util.XMLCatalogResolver;


public class SOSchemaFactory {
	private static SOSchemaFactory anInstance = null;

//	private static final String DEFINITIONS_XML_CATALOG_XML = Messages.getString("MarshallerImpl.xmlCatalogLocation"); //$NON-NLS-1$
	private static final String SO_URI = Messages.getString("MarshallerImpl.SOURI");
	
	
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
	public Schema createSOSchema(SOVersion version){
		try {
			URL url = getClass().getResource(version.getCatalogLocation());
			String[] catalogs = { url.toExternalForm() };
			XMLCatalogResolver resolver = new XMLCatalogResolver();
			resolver.setCatalogList(catalogs);
			String val = resolver.resolveSystem(SO_URI); 
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
}
