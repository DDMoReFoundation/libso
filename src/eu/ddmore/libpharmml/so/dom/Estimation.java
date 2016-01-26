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
 * Type defining the estimation section of the SO.
 * 
 * <p>Java class for EstimationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="PopulationEstimates" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}PopulationEstimatesType" minOccurs="0"/>
 *         &lt;element name="PrecisionPopulationEstimates" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}PrecisionPopulationEstimatesType" minOccurs="0"/>
 *         &lt;element name="IndividualEstimates" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}IndividualEstimatesType" minOccurs="0"/>
 *         &lt;element name="PrecisionIndividualEstimates" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}PrecisionIndividualEstimatesType" minOccurs="0"/>
 *         &lt;element name="Residuals" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}ResidualType" minOccurs="0"/>
 *         &lt;element name="Predictions" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *         &lt;element name="OFMeasures" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}OFMeasuresType" minOccurs="0"/>
 *         &lt;element name="TargetToolMessages" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}TargetToolMessagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimationType", propOrder = {
    "populationEstimates",
    "precisionPopulationEstimates",
    "individualEstimates",
    "precisionIndividualEstimates",
    "residuals",
    "predictions",
    "ofMeasures",
    "targetToolMessages"
})
public class Estimation
    extends PharmMLRootType
{

    @XmlElement(name = "PopulationEstimates")
    protected PopulationEstimates populationEstimates;
    @XmlElement(name = "PrecisionPopulationEstimates")
    protected PrecisionPopulationEstimates precisionPopulationEstimates;
    @XmlElement(name = "IndividualEstimates")
    protected IndividualEstimates individualEstimates;
    @XmlElement(name = "PrecisionIndividualEstimates")
    protected PrecisionIndividualEstimates precisionIndividualEstimates;
    @XmlElement(name = "Residuals")
    protected Residual residuals;
    @XmlElement(name = "Predictions")
    protected DataSet predictions;
    @XmlElement(name = "OFMeasures")
    protected OFMeasures ofMeasures;
    @XmlElement(name = "TargetToolMessages")
    protected TargetToolMessages targetToolMessages;

    /**
     * Gets the value of the populationEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link PopulationEstimates }
     *     
     */
    public PopulationEstimates getPopulationEstimates() {
        return populationEstimates;
    }

    /**
     * Sets the value of the populationEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopulationEstimates }
     *     
     */
    public void setPopulationEstimates(PopulationEstimates value) {
        this.populationEstimates = value;
    }

    /**
     * Gets the value of the precisionPopulationEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link PrecisionPopulationEstimates }
     *     
     */
    public PrecisionPopulationEstimates getPrecisionPopulationEstimates() {
        return precisionPopulationEstimates;
    }

    /**
     * Sets the value of the precisionPopulationEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecisionPopulationEstimates }
     *     
     */
    public void setPrecisionPopulationEstimates(PrecisionPopulationEstimates value) {
        this.precisionPopulationEstimates = value;
    }

    /**
     * Gets the value of the individualEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualEstimates }
     *     
     */
    public IndividualEstimates getIndividualEstimates() {
        return individualEstimates;
    }

    /**
     * Sets the value of the individualEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualEstimates }
     *     
     */
    public void setIndividualEstimates(IndividualEstimates value) {
        this.individualEstimates = value;
    }

    /**
     * Gets the value of the precisionIndividualEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link PrecisionIndividualEstimates }
     *     
     */
    public PrecisionIndividualEstimates getPrecisionIndividualEstimates() {
        return precisionIndividualEstimates;
    }

    /**
     * Sets the value of the precisionIndividualEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecisionIndividualEstimates }
     *     
     */
    public void setPrecisionIndividualEstimates(PrecisionIndividualEstimates value) {
        this.precisionIndividualEstimates = value;
    }

    /**
     * Gets the value of the residuals property.
     * 
     * @return
     *     possible object is
     *     {@link Residual }
     *     
     */
    public Residual getResiduals() {
        return residuals;
    }

    /**
     * Sets the value of the residuals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Residual }
     *     
     */
    public void setResiduals(Residual value) {
        this.residuals = value;
    }

    /**
     * Gets the value of the predictions property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getPredictions() {
        return predictions;
    }

    /**
     * Sets the value of the predictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setPredictions(DataSet value) {
        this.predictions = value;
    }

    /**
     * Gets the value of the ofMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link OFMeasures }
     *     
     */
    public OFMeasures getOFMeasures() {
        return ofMeasures;
    }

    /**
     * Sets the value of the ofMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFMeasures }
     *     
     */
    public void setOFMeasures(OFMeasures value) {
        this.ofMeasures = value;
    }

    /**
     * Gets the value of the targetToolMessages property.
     * 
     * @return
     *     possible object is
     *     {@link TargetToolMessages }
     *     
     */
    public TargetToolMessages getTargetToolMessages() {
        return targetToolMessages;
    }

    /**
     * Sets the value of the targetToolMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetToolMessages }
     *     
     */
    public void setTargetToolMessages(TargetToolMessages value) {
        this.targetToolMessages = value;
    }
    
    /**
     * Creates a new empty {@link PopulationEstimates} populationEstimates element, adds it to the current object and returns it.
     * @return The created {@link PopulationEstimates} object.
     */
    public PopulationEstimates createPopulationEstimates(){
    	PopulationEstimates el = new PopulationEstimates();
    	this.populationEstimates = el;
    	return el;
    }

    /**
     * Creates a new empty {@link PrecisionPopulationEstimates} precisionPopulationEstimates element, adds it to the current object and returns it.
     * @return The created {@link PrecisionPopulationEstimates} object.
     */
    public PrecisionPopulationEstimates createPrecisionPopulationEstimates(){
    	PrecisionPopulationEstimates el = new PrecisionPopulationEstimates();
    	this.precisionPopulationEstimates = el;
    	return el;
    }

    /**
     * Creates a new empty {@link IndividualEstimates} individualEstimates element, adds it to the current object and returns it.
     * @return The created {@link IndividualEstimates} object.
     */
    public IndividualEstimates createIndividualEstimates(){
    	IndividualEstimates el = new IndividualEstimates();
    	this.individualEstimates = el;
    	return el;
    }

    /**
     * Creates a new empty {@link PrecisionIndividualEstimates} precisionIndividualEstimates element, adds it to the current object and returns it.
     * @return The created {@link PrecisionIndividualEstimates} object.
     */
    public PrecisionIndividualEstimates createPrecisionIndividualEstimates(){
    	PrecisionIndividualEstimates el = new PrecisionIndividualEstimates();
    	this.precisionIndividualEstimates = el;
    	return el;
    }

    /**
     * Creates a new empty {@link Residual} residuals element, adds it to the current object and returns it.
     * @return The created {@link Residual} object.
     */
    public Residual createResiduals(){
    	Residual el = new Residual();
    	this.residuals = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} predictions element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createPredictions(){
    	DataSet el = new DataSet();
    	this.predictions = el;
    	return el;
    }

    /**
     * Creates a new empty {@link OFMeasures} ofMeasures element, adds it to the current object and returns it.
     * @return The created {@link OFMeasures} object.
     */
    public OFMeasures createOFMeasures(){
    	OFMeasures el = new OFMeasures();
    	this.ofMeasures = el;
    	return el;
    }

    /**
     * Creates a new empty {@link TargetToolMessages} targetToolMessages element, adds it to the current object and returns it.
     * @return The created {@link TargetToolMessages} object.
     */
    public TargetToolMessages createTargetToolMessages(){
    	TargetToolMessages el = new TargetToolMessages();
    	this.targetToolMessages = el;
    	return el;
    }

    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(populationEstimates)
    			.addIfNotNull(precisionPopulationEstimates)
    			.addIfNotNull(individualEstimates)
    			.addIfNotNull(precisionIndividualEstimates)
    			.addIfNotNull(residuals)
    			.addIfNotNull(predictions)
    			.addIfNotNull(ofMeasures)
    			.addIfNotNull(targetToolMessages);
    }

}
