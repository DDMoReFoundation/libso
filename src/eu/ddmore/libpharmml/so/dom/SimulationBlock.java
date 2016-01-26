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
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type for the simulation block for on ereplicate.
 * 
 * <p>Java class for SimulationBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimulationBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="SimulatedProfiles" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndivParameters" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RandomEffects" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Covariates" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Regressors" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PopulationParameters" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dosing" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RawResultsFile" type="{http://www.pharmml.org/pharmml/0.8/Dataset}ExternalFile" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="replicate" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimulationBlockType", propOrder = {
    "listOfSimulatedProfiles",
    "listOfIndivParameters",
    "listOfRandomEffects",
    "listOfCovariates",
    "listOfRegressors",
    "listOfPopulationParameters",
    "listOfDosing",
    "rawResultsFile"
})
public class SimulationBlock
    extends PharmMLRootType
{
    
    @XmlElement(name = "SimulatedProfiles")
    protected List<SimulationItem> listOfSimulatedProfiles;
    @XmlElement(name = "IndivParameters")
    protected List<SimulationItem> listOfIndivParameters;
    @XmlElement(name = "RandomEffects")
    protected List<SimulationItem> listOfRandomEffects;
    @XmlElement(name = "Covariates")
    protected List<SimulationItem> listOfCovariates;
    @XmlElement(name = "Regressors")
    protected List<SimulationItem> listOfRegressors;
    @XmlElement(name = "PopulationParameters")
    protected List<SimulationItem> listOfPopulationParameters;
    @XmlElement(name = "Dosing")
    protected List<SimulationItem> listOfDosing;
    @XmlElement(name = "RawResultsFile")
    protected ExternalFile rawResultsFile;
    @XmlAttribute(name = "replicate")
    protected Integer replicate;

    /**
     * Gets the value of the simulatedProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simulatedProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimulatedProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfSimulatedProfiles() {
        if (listOfSimulatedProfiles == null) {
        	listOfSimulatedProfiles = new ArrayList<SimulationItem>();
        }
        return this.listOfSimulatedProfiles;
    }
    
    /**
     * Gets the value of the indivParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indivParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndivParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfIndivParameters() {
        if (listOfIndivParameters == null) {
        	listOfIndivParameters = new ArrayList<SimulationItem>();
        }
        return this.listOfIndivParameters;
    }

    /**
     * Gets the value of the randomEffects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the randomEffects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRandomEffects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfRandomEffects() {
        if (listOfRandomEffects == null) {
        	listOfRandomEffects = new ArrayList<SimulationItem>();
        }
        return this.listOfRandomEffects;
    }

    /**
     * Gets the value of the covariates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the covariates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCovariates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfCovariates() {
        if (listOfCovariates == null) {
        	listOfCovariates = new ArrayList<SimulationItem>();
        }
        return this.listOfCovariates;
    }
    
    /**
     * Gets the value of the regressors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regressors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfRegressors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfRegressors() {
        if (listOfRegressors == null) {
        	listOfRegressors = new ArrayList<SimulationItem>();
        }
        return this.listOfRegressors;
    }

    /**
     * Gets the value of the populationParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the populationParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopulationParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfPopulationParameters() {
        if (listOfPopulationParameters == null) {
        	listOfPopulationParameters = new ArrayList<SimulationItem>();
        }
        return this.listOfPopulationParameters;
    }

    /**
     * Gets the value of the dosing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfDosing() {
        if (listOfDosing == null) {
        	listOfDosing = new ArrayList<SimulationItem>();
        }
        return this.listOfDosing;
    }
    
    /**                                                              
     * Creates a new empty {@link SimulationItem} simulatedProfiles element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.                                                                 
     */                                                                                                            
    public SimulationItem createSimulatedProfiles(){                                                                      
    	SimulationItem el = ObjectFactory.getInstance().createSimulationItem();                                                                           
        getListOfSimulatedProfiles().add(el);                                                                          
        return el;                                                                                             
    }                                                                                                              

    /**
     * Creates a new empty {@link SimulationItem} indivParameters element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.                                                               
     */                                                                                                          
    public SimulationItem createIndivParameters(){                                                                      
    	SimulationItem el = ObjectFactory.getInstance().createSimulationItem();                                                                           
        getListOfIndivParameters().add(el);                                                                           
        return el;                                                                                           
    }

    /**
     * Creates a new empty {@link SimulationItem} randomEffects element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createRandomEffects(){
    	SimulationItem el = ObjectFactory.getInstance().createSimulationItem();                                                                           
        getListOfRandomEffects().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link SimulationItem} covariates element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createCovariates(){
    	SimulationItem el = ObjectFactory.getInstance().createSimulationItem();                                                                           
        getListOfCovariates().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link SimulationItem} populationParameters element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createPopulationParameters(){
    	SimulationItem el = ObjectFactory.getInstance().createSimulationItem();                                                                           
        getListOfPopulationParameters().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link SimulationItem} dosing element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createDosing(){
    	SimulationItem el = ObjectFactory.getInstance().createSimulationItem();                                                                           
        getListOfDosing().add(el);
        return el;
    }
    
    /**
     * Creates a new empty {@link SimulationItem} dosing element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createRegressor(){
    	SimulationItem el = ObjectFactory.getInstance().createSimulationItem();
        getListOfRegressors().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link ExternalFile} rawResultsFile element, adds it to the current object and returns it.
     * @return The created {@link ExternalFile} object.
     */
    public ExternalFile createRawResultsFile(){
            ExternalFile el = new ExternalFile();
            this.rawResultsFile = el;
            return el;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(rawResultsFile)
    			.addIfNotNull(listOfSimulatedProfiles)
    			.addIfNotNull(listOfIndivParameters)
    			.addIfNotNull(listOfRandomEffects)
    			.addIfNotNull(listOfCovariates)
    			.addIfNotNull(listOfRegressors)
    			.addIfNotNull(listOfPopulationParameters)
    			.addIfNotNull(listOfDosing);
    }

    /**
     * Gets the value of the rawResultsFile property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFile }
     *     
     */
    public ExternalFile getRawResultsFile() {
        return rawResultsFile;
    }

    /**
     * Sets the value of the rawResultsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFile }
     *     
     */
    public void setRawResultsFile(ExternalFile value) {
        this.rawResultsFile = value;
    }

    /**
     * Gets the value of the replicate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReplicate() {
        return replicate;
    }

    /**
     * Sets the value of the replicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReplicate(Integer value) {
        this.replicate = value;
    }

}
