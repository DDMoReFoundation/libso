package eu.ddmore.libpharmml.so.dom;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "SO")
@XmlType(propOrder = {
	    "pharmMLRef",
	    "soBlock"
	})
public class StandardisedOutput extends PharmMLRootType {
	
	@XmlElement(name = "PharmMLRef", required = true)
    protected PharmMLRef pharmMLRef;
    @XmlElement(name = "SOBlock", required = true)
    protected List<SOBlock> soBlock;

	@XmlAttribute(name = "writtenVersion",required = true)
	protected String writtenVersion;
	
	@XmlAttribute(name = "implementedBy",required = false)
	protected String implementedBy;
	
	@XmlAttribute(name = "metadataFile",required = false)
	protected String metadataFile;
	
	/**
     * Gets the value of the pharmMLRef property.
     * 
     * @return
     *     possible object is
     *     {@link PharmMLRefType }
     *     
     */
    public PharmMLRef getPharmMLRef() {
        return pharmMLRef;
    }

    /**
     * Sets the value of the pharmMLRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmMLRefType }
     *     
     */
    public void setPharmMLRef(PharmMLRef value) {
        this.pharmMLRef = value;
    }

    /**
     * Gets the value of the soBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SOBlockType }
     * 
     * 
     */
    public List<SOBlock> getListOfSOBlock() {
        if (soBlock == null) {
            soBlock = new ArrayList<SOBlock>();
        }
        return this.soBlock;
    }

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
	
	/**
	 * Creates a new empty {@link PharmMLRef} pharmMLRef element, adds it to the current object and returns it.
	 * @param name The name of the PharmML file that this SO object refers to.
	 * @return The created {@link PharmMLRef} object.
	 */
	public PharmMLRef createPharmMLRef(String name){
	        PharmMLRef el = new PharmMLRef();
	        this.pharmMLRef = el;
	        el.setName(name);
	        return el;
	}

	/**
	 * Creates a new empty {@link SOBlock} soBlock element, adds it to the current object and returns it.
	 * @return The created {@link SOBlock} object.
	 */
	public SOBlock createSoBlock(){
	        SOBlock el = new SOBlock();
	        getListOfSOBlock().add(el);
	        return el;
	}

	
}
