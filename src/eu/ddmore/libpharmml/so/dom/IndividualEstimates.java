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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.util.ChainedList;
import static eu.ddmore.libpharmml.so.impl.SOXMLFilter.NS_SO;


/**
 * Type defining the individual estimates.
 * 
 * <p>Java class for IndividualEstimatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualEstimatesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="Estimates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;sequence>
 *                     &lt;element name="Mean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *                     &lt;element name="Median" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *                     &lt;element name="Mode" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RandomEffects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;sequence>
 *                     &lt;element name="EffectMean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *                     &lt;element name="EffectMedian" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *                     &lt;element name="EffectMode" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EtaShrinkage" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualEstimatesType", propOrder = {
    "estimates",
    "randomEffects",
    "etaShrinkage"
})
public class IndividualEstimates
    extends PharmMLRootType
{

    @XmlElement(name = "Estimates")
    protected IndividualEstimates.Estimates estimates;
    @XmlElement(name = "RandomEffects")
    protected IndividualEstimates.RandomEffects randomEffects;
    @XmlElement(name = "EtaShrinkage")
    protected DataSet etaShrinkage;

    /**
     * Gets the value of the estimates property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualEstimates.Estimates }
     *     
     */
    public IndividualEstimates.Estimates getEstimates() {
        return estimates;
    }

    /**
     * Sets the value of the estimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualEstimates.Estimates }
     *     
     */
    public void setEstimates(IndividualEstimates.Estimates value) {
        this.estimates = value;
    }

    /**
     * Gets the value of the randomEffects property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualEstimates.RandomEffects }
     *     
     */
    public IndividualEstimates.RandomEffects getRandomEffects() {
        return randomEffects;
    }

    /**
     * Sets the value of the randomEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualEstimates.RandomEffects }
     *     
     */
    public void setRandomEffects(IndividualEstimates.RandomEffects value) {
        this.randomEffects = value;
    }

    /**
     * Gets the value of the etaShrinkage property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getEtaShrinkage() {
        return etaShrinkage;
    }

    /**
     * Sets the value of the etaShrinkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setEtaShrinkage(DataSet value) {
        this.etaShrinkage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;sequence>
     *           &lt;element name="Mean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
     *           &lt;element name="Median" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
     *           &lt;element name="Mode" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Estimates
        extends PharmMLRootType
    {

        @XmlElementRefs({
            @XmlElementRef(name = "Median", namespace = NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "Mean", namespace = NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "Mode", namespace = NS_SO, type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<DataSet>> content;
        
        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the meenAndMedienAndModes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * 
         * 
         */
        public List<JAXBElement<DataSet>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<DataSet>>();
            }
            return this.content;
        }
        
        public DataSet createMode(){
        	DataSet mode = new DataSet();
        	getContent().add(ObjectFactory.getInstance().createIndividualEstimatesEstimatesMode(mode));
        	return mode;
        }
        
        public DataSet createMedian(){
        	DataSet median = new DataSet();
        	getContent().add(ObjectFactory.getInstance().createIndividualEstimatesEstimatesMedian(median));
        	return median;
        }

        public DataSet createMean(){
        	DataSet mean = new DataSet();
        	getContent().add(ObjectFactory.getInstance().createIndividualEstimatesEstimatesMean(mean));
        	return mean;
        }

        @Override
        protected List<TreeNode> listChildren() {
        	List<TreeNode> list = new ArrayList<TreeNode>(super.listChildren());
        	for(JAXBElement<DataSet> jaxbEl : getContent()){
        		list.add(jaxbEl.getValue());
        	}
        	return list;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;sequence>
     *           &lt;element name="EffectMean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
     *           &lt;element name="EffectMedian" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
     *           &lt;element name="EffectMode" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class RandomEffects
        extends PharmMLRootType
    {

        @XmlElementRefs({
            @XmlElementRef(name = "EffectMode", namespace = NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "EffectMedian", namespace = NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "EffectMean", namespace = NS_SO, type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<DataSet>> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the effectMeenAndEffectMedienAndEffectModes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * 
         * 
         */
        public List<JAXBElement<DataSet>> getContent() {
            if (content == null) {
            	content = new ArrayList<JAXBElement<DataSet>>();
            }
            return this.content;
        }
        
        /**
         * Creates a new empty {@link DataSet} effectMean element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createEffectMean(){
        	DataSet el = new DataSet();
        	getContent().add(ObjectFactory.getInstance().createIndividualEstimatesRandomEffectsEffectMean(el));
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} effectMedian element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createEffectMedian(){
        	DataSet el = new DataSet();
        	getContent().add(ObjectFactory.getInstance().createIndividualEstimatesRandomEffectsEffectMedian(el));
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} effectMode element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createEffectMode(){
        	DataSet el = new DataSet();
        	getContent().add(ObjectFactory.getInstance().createIndividualEstimatesRandomEffectsEffectMode(el));
        	return el;
        }
        
        @Override
        protected List<TreeNode> listChildren() {
        	List<TreeNode> list = new ArrayList<TreeNode>(super.listChildren());
        	for(JAXBElement<DataSet> jaxbEl : getContent()){
        		list.add(jaxbEl.getValue());
        	}
        	return list;
        }

    }

    /**
     * Creates a new empty {@link IndividualEstimates.Estimates} estimates element, adds it to the current object and returns it.
     * @return The created {@link IndividualEstimates.Estimates} object.
     */
    public IndividualEstimates.Estimates createEstimates(){
    	IndividualEstimates.Estimates el = new IndividualEstimates.Estimates();
    	this.estimates = el;
    	return el;
    }

    /**
     * Creates a new empty {@link IndividualEstimates.RandomEffects} randomEffects element, adds it to the current object and returns it.
     * @return The created {@link IndividualEstimates.RandomEffects} object.
     */
    public IndividualEstimates.RandomEffects createRandomEffects(){
    	IndividualEstimates.RandomEffects el = new IndividualEstimates.RandomEffects();
    	this.randomEffects = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} etaShrinkage element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createEtaShrinkage(){
    	DataSet el = new DataSet();
    	this.etaShrinkage = el;
    	return el;
    }

    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(estimates)
    			.addIfNotNull(randomEffects)
    			.addIfNotNull(etaShrinkage);
    }
    
}
