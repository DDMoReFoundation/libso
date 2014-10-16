package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "SO")
public class StandardisedOutput extends PharmMLRootType {

	@XmlAttribute(name = "writtenVersion",required = true)
	protected String writtenVersion;
	
	@XmlAttribute(name = "implementedBy",required = false)
	protected String implementedBy;
	
	@XmlAttribute(name = "metadataFile",required = false)
	protected String metadataFile;
	
}
