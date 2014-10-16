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

	public String getWrittenVersion() {
		return writtenVersion;
	}

	public void setWrittenVersion(String writtenVersion) {
		this.writtenVersion = writtenVersion;
	}

	public String getImplementedBy() {
		return implementedBy;
	}

	public void setImplementedBy(String implementedBy) {
		this.implementedBy = implementedBy;
	}

	public String getMetadataFile() {
		return metadataFile;
	}

	public void setMetadataFile(String metadataFile) {
		this.metadataFile = metadataFile;
	}
	
}
