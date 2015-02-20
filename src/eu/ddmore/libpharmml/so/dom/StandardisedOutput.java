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

/**
 * A type defining the SO. This is the root element of any standardised output document.
 *
 * <pre>
 * &lt;complexType name="SOType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="PharmMLRef" type="{http://www.pharmml.org/2013/03/StandardisedOutput}PharmMLRefType"/>
 *         &lt;element name="SOBlock" type="{http://www.pharmml.org/2013/03/StandardisedOutput}SOBlockType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="writtenVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="implementedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="metadataFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "SO")
@XmlType(propOrder = {
	    "pharmMLRef",
	    "toolSettings",
	    "rawResults",
	    "taskInformation",
	    "estimation",
	    "modelDiagnostic",
	    "simulation",
	    "soBlock"
	})
public class StandardisedOutput extends AbstractSOBlock {
	
	@XmlElement(name = "PharmMLRef")
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
