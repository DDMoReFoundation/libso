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

import eu.ddmore.libpharmml.impl.PharmMLVersion;
import eu.ddmore.libpharmml.impl.XMLFilter;

public class SOXMLFilter extends XMLFilter {
	
	public final static String NS_SO = "http://www.pharmml.org/so/0.2/StandardisedOutput";
	
	protected PharmMLVersion pharmml_version;
	protected SOVersion so_version;
	
	private final String NS_DOC_SO;
	
	public SOXMLFilter(SOVersion writtenVersion){
		super(writtenVersion.getCorrespondingPharmMLVersion());
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
    				"xmlns$1=\"http://www.pharmml.org/pharmml/"+ pharmml_version.toString() +"/$2\"");
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

			public Object getProperty(String name) throws IllegalArgumentException {
				return reader.getProperty(name);
			}

			public int next() throws XMLStreamException {
				return reader.next();
			}

			public void require(int type, String namespaceURI, String localName) throws XMLStreamException {
				reader.require(type, filterInputNamespace(namespaceURI), localName);
			}

			public String getElementText() throws XMLStreamException {
				return reader.getElementText();
			}

			public int nextTag() throws XMLStreamException {
				return reader.nextTag();
			}

			public boolean hasNext() throws XMLStreamException {
				return reader.hasNext();
			}

			public void close() throws XMLStreamException {
				reader.close();
			}

			public String getNamespaceURI(String prefix) {
				return filterInputNamespace(reader.getNamespaceURI(prefix));
			}

			public boolean isStartElement() {
				return reader.isStartElement();
			}

			public boolean isEndElement() {
				return reader.isEndElement();
			}

			public boolean isCharacters() {
				return reader.isCharacters();
			}

			public boolean isWhiteSpace() {
				return reader.isWhiteSpace();
			}

			public String getAttributeValue(String namespaceURI, String localName) {
				return reader.getAttributeValue(filterInputNamespace(namespaceURI), localName);
			}

			public int getAttributeCount() {
				return reader.getAttributeCount();
			}

			public QName getAttributeName(int index) {
				return reader.getAttributeName(index);
			}

			public String getAttributeNamespace(int index) {
				return filterInputNamespace(reader.getAttributeNamespace(index));
			}

			public String getAttributeLocalName(int index) {
				return reader.getAttributeLocalName(index);
			}

			public String getAttributePrefix(int index) {
				return reader.getAttributePrefix(index);
			}

			public String getAttributeType(int index) {
				return reader.getAttributeType(index);
			}

			public String getAttributeValue(int index) {
				return reader.getAttributeValue(index);
			}

			public boolean isAttributeSpecified(int index) {
				return reader.isAttributeSpecified(index);
			}

			public int getNamespaceCount() {
				return reader.getNamespaceCount();
			}

			public String getNamespacePrefix(int index) {
				return reader.getNamespacePrefix(index);
			}

			public String getNamespaceURI(int index) {
				return filterInputNamespace(reader.getNamespaceURI(index));
			}

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

			public int getEventType() {
				return reader.getEventType();
			}

			public String getText() {
				return reader.getText();
			}

			public char[] getTextCharacters() {
				return reader.getTextCharacters();
			}

			public int getTextCharacters(int sourceStart, char[] target, int targetStart, int length)
					throws XMLStreamException {
				return reader.getTextCharacters(sourceStart, target, targetStart, length);
			}

			public int getTextStart() {
				return reader.getTextStart();
			}

			public int getTextLength() {
				return reader.getTextLength();
			}

			public String getEncoding() {
				return reader.getEncoding();
			}

			public boolean hasText() {
				return reader.hasText();
			}

			public Location getLocation() {
				return reader.getLocation();
			}

			public QName getName() {
				QName qname = reader.getName();
				QName newQname = new QName(filterInputNamespace(qname.getNamespaceURI()), 
						qname.getLocalPart(), 
						qname.getPrefix());
				return newQname;
			}

			public String getLocalName() {
				return reader.getLocalName();
			}

			public boolean hasName() {
				return reader.hasName();
			}

			public String getNamespaceURI() {
				return filterInputNamespace(reader.getNamespaceURI());
			}

			public String getPrefix() {
				return reader.getPrefix();
			}

			public String getVersion() {
				return reader.getVersion();
			}

			public boolean isStandalone() {
				return reader.isStandalone();
			}

			public boolean standaloneSet() {
				return reader.standaloneSet();
			}

			public String getCharacterEncodingScheme() {
				return reader.getCharacterEncodingScheme();
			}

			public String getPITarget() {
				return reader.getPITarget();
			}

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
		case v0_2:
			return NS_SO;
		case v0_1:
			return "http://www.pharmml.org/so/0.1/StandardisedOutput";
		case v0_0:
			return "http://www.pharmml.org/2013/03/StandardisedOutput";
		default:
			throw new RuntimeException("No namespace set for version "+version);
		}
	}
}
