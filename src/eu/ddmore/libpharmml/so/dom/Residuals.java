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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.16 at 04:24:00 PM BST 
//


package eu.ddmore.libpharmml.so.dom;

import java.util.List;

import javax.swing.tree.TreeNode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining the residuals.
 * 
 * <p>Java class for ResidualsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidualsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="RES" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="IRES" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="WRES" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="CWRES" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="IWRES" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="PD" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="NPDE" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated See {@link Residual}.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidualsType", propOrder = {
    "res",
    "ires",
    "wres",
    "cwres",
    "iwres",
    "pd",
    "npde"
})
@Deprecated
public class Residuals
    extends PharmMLRootType
{

    @XmlElement(name = "RES")
    protected DataSet res;
    @XmlElement(name = "IRES")
    protected DataSet ires;
    @XmlElement(name = "WRES")
    protected DataSet wres;
    @XmlElement(name = "CWRES")
    protected DataSet cwres;
    @XmlElement(name = "IWRES")
    protected DataSet iwres;
    @XmlElement(name = "PD")
    protected DataSet pd;
    @XmlElement(name = "NPDE")
    protected DataSet npde;
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(res)
    			.addIfNotNull(ires)
    			.addIfNotNull(wres)
    			.addIfNotNull(cwres)
    			.addIfNotNull(iwres)
    			.addIfNotNull(pd)
    			.addIfNotNull(npde);
    			
    }

    /**
     * Gets the value of the res property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getRES() {
        return res;
    }

    /**
     * Sets the value of the res property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setRES(DataSet value) {
        this.res = value;
    }

    /**
     * Gets the value of the ires property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getIRES() {
        return ires;
    }

    /**
     * Sets the value of the ires property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setIRES(DataSet value) {
        this.ires = value;
    }

    /**
     * Gets the value of the wres property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getWRES() {
        return wres;
    }

    /**
     * Sets the value of the wres property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setWRES(DataSet value) {
        this.wres = value;
    }

    /**
     * Gets the value of the cwres property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getCWRES() {
        return cwres;
    }

    /**
     * Sets the value of the cwres property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setCWRES(DataSet value) {
        this.cwres = value;
    }

    /**
     * Gets the value of the iwres property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getIWRES() {
        return iwres;
    }

    /**
     * Sets the value of the iwres property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setIWRES(DataSet value) {
        this.iwres = value;
    }

    /**
     * Gets the value of the pd property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getPD() {
        return pd;
    }

    /**
     * Sets the value of the pd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setPD(DataSet value) {
        this.pd = value;
    }

    /**
     * Gets the value of the npde property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getNPDE() {
        return npde;
    }

    /**
     * Sets the value of the npde property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setNPDE(DataSet value) {
        this.npde = value;
    }
    
    /**
     * Creates a new empty {@link DataSet} res element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createRes(){
    	DataSet el = new DataSet();
    	this.res = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} ires element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createIres(){
    	DataSet el = new DataSet();
    	this.ires = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} wres element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createWres(){
    	DataSet el = new DataSet();
    	this.wres = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} cwres element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createCwres(){
    	DataSet el = new DataSet();
    	this.cwres = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} iwres element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createIwres(){
    	DataSet el = new DataSet();
    	this.iwres = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} pd element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createPd(){
    	DataSet el = new DataSet();
    	this.pd = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} npde element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createNpde(){
    	DataSet el = new DataSet();
    	this.npde = el;
    	return el;
    }


}
