/*******************************************************************************
 * Copyright (c) 2014-2016 European Molecular Biology Laboratory,
 * Heidelberg, Germany.
 * 
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 * 
 *  		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on 
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations 
 * under the License.
 ******************************************************************************/
package eu.ddmore.libpharmml.so.dom;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * A type defining the SO.
 * 
 * <p>Java class for SOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="PharmMLRef" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}PharmMLRefType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="SOBlock" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOBlockType" maxOccurs="unbounded"/>
 *         &lt;/choice>
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOType", propOrder = {
    "pharmMLRef",
    "soBlock"
})
public class StandardisedOutput
    extends PharmMLRootType
{

    @XmlElement(name = "PharmMLRef")
    protected PharmMLRef pharmMLRef;
    @XmlElement(name = "SOBlock")
    protected List<SOBlock> soBlock;

	@XmlAttribute(name = "writtenVersion",required = true)
	protected String writtenVersion;
	
	@XmlAttribute(name = "implementedBy",required = false)
	protected String implementedBy;
	
	@XmlAttribute(name = "metadataFile",required = false)
	protected String metadataFile;
	
	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>(super.listChildren())
				.addIfNotNull(pharmMLRef)
				.addIfNotNull(soBlock);
	}
	
	/**
     * Gets the value of the pharmMLRef property.
     * 
     * @return
     *     possible object is
     *     {@link PharmMLRef }
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
     *     {@link PharmMLRef }
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
     *    getListOfSOBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SOBlock }
     * 
     * 
     */
    public List<SOBlock> getListOfSOBlock() {
        if (soBlock == null) {
            soBlock = new ArrayList<SOBlock>();
        }
        return this.soBlock;
    }

    /**
     * Gets the value of the writtenVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrittenVersion() {
        return writtenVersion;
    }

    /**
     * Sets the value of the writtenVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrittenVersion(String value) {
        this.writtenVersion = value;
    }

    /**
     * Gets the value of the implementedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementedBy() {
        return implementedBy;
    }

    /**
     * Sets the value of the implementedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementedBy(String value) {
        this.implementedBy = value;
    }

    /**
     * Gets the value of the metadataFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataFile() {
        return metadataFile;
    }

    /**
     * Sets the value of the metadataFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataFile(String value) {
        this.metadataFile = value;
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
	
	/**
	 * Creates a new empty {@link SOBlock} soBlock element, adds it to the current object and returns it.
	 * @param blkId Block id for symbol scope.
	 * @return The created {@link SOBlock} object.
	 */
	public SOBlock createSoBlock(String blkId){
	        SOBlock el = new SOBlock(blkId);
	        getListOfSOBlock().add(el);
	        return el;
	}

}
