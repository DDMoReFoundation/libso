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
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining the population estimates.
 * 
 * <p>Java class for PopulationEstimatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopulationEstimatesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="MLE" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="Bayesian" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *                 &lt;sequence>
 *                   &lt;element name="PosteriorMean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="PosteriorMedian" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="PosteriorMode" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherMethod" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *                 &lt;sequence>
 *                   &lt;element name="Mean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="Median" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="method" use="required" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}OtherMethodName" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopulationEstimatesType", propOrder = {
    "mle",
    "bayesian",
    "otherMethod"
})
public class PopulationEstimates
    extends PharmMLRootType
{

    @XmlElement(name = "MLE")
    protected DataSet mle;
    @XmlElement(name = "Bayesian")
    protected PopulationEstimates.Bayesian bayesian;
    @XmlElement(name = "OtherMethod")
    protected List<PopulationEstimates.OtherMethod> otherMethod;

    /**
     * Gets the value of the mle property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getMLE() {
        return mle;
    }

    /**
     * Sets the value of the mle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setMLE(DataSet value) {
        this.mle = value;
    }

    /**
     * Gets the value of the bayesian property.
     * 
     * @return
     *     possible object is
     *     {@link PopulationEstimates.Bayesian }
     *     
     */
    public PopulationEstimates.Bayesian getBayesian() {
        return bayesian;
    }

    /**
     * Sets the value of the bayesian property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopulationEstimates.Bayesian }
     *     
     */
    public void setBayesian(PopulationEstimates.Bayesian value) {
        this.bayesian = value;
    }

    /**
     * Gets the value of the otherMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PopulationEstimates.OtherMethod }
     * 
     * 
     */
    public List<PopulationEstimates.OtherMethod> getOtherMethod() {
        if (otherMethod == null) {
            otherMethod = new ArrayList<PopulationEstimates.OtherMethod>();
        }
        return this.otherMethod;
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
     *       &lt;sequence>
     *         &lt;element name="PosteriorMean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="PosteriorMedian" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="PosteriorMode" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "posteriorMean",
        "posteriorMedian",
        "posteriorMode"
    })
    public static class Bayesian
        extends PharmMLRootType
    {

        @XmlElement(name = "PosteriorMean")
        protected DataSet posteriorMean;
        @XmlElement(name = "PosteriorMedian")
        protected DataSet posteriorMedian;
        @XmlElement(name = "PosteriorMode")
        protected DataSet posteriorMode;

        /**
         * Gets the value of the posteriorMean property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getPosteriorMean() {
            return posteriorMean;
        }

        /**
         * Sets the value of the posteriorMean property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setPosteriorMean(DataSet value) {
            this.posteriorMean = value;
        }

        /**
         * Gets the value of the posteriorMedian property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getPosteriorMedian() {
            return posteriorMedian;
        }

        /**
         * Sets the value of the posteriorMedian property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setPosteriorMedian(DataSet value) {
            this.posteriorMedian = value;
        }

        /**
         * Gets the value of the posteriorMode property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getPosteriorMode() {
            return posteriorMode;
        }

        /**
         * Sets the value of the posteriorMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setPosteriorMode(DataSet value) {
            this.posteriorMode = value;
        }
        
        /**
         * Creates a new empty {@link DataSet} posteriorMean element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createPosteriorMean(){
        	DataSet el = new DataSet();
        	this.posteriorMean = el;
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} posteriorMedian element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createPosteriorMedian(){
        	DataSet el = new DataSet();
        	this.posteriorMedian = el;
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} posteriorMode element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createPosteriorMode(){
        	DataSet el = new DataSet();
        	this.posteriorMode = el;
        	return el;
        }

        @Override
        protected List<TreeNode> listChildren() {
        	return new ChainedList<TreeNode>(super.listChildren())
        			.addIfNotNull(posteriorMean)
        			.addIfNotNull(posteriorMedian)
        			.addIfNotNull(posteriorMode);
        }

    }
    
    /**
     * Creates a new empty {@link DataSet} mle element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createMle(){
    	DataSet el = new DataSet();
    	this.mle = el;
    	return el;
    }

    /**
     * Creates a new empty {@link PopulationEstimates.Bayesian} bayesian element, adds it to the current object and returns it.
     * @return The created {@link PopulationEstimates.Bayesian} object.
     */
    public PopulationEstimates.Bayesian createBayesian(){
    	PopulationEstimates.Bayesian el = new PopulationEstimates.Bayesian();
    	this.bayesian = el;
    	return el;
    }
    
    public PopulationEstimates.OtherMethod createOtherMethod(){
    	PopulationEstimates.OtherMethod el = new PopulationEstimates.OtherMethod();
    	getOtherMethod().add(el);
    	return el;
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
     *       &lt;sequence>
     *         &lt;element name="Mean" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="Median" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="method" use="required" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}OtherMethodName" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mean",
        "median"
    })
    public static class OtherMethod
        extends PharmMLRootType
    {

        @XmlElement(name = "Mean")
        protected DataSet mean;
        @XmlElement(name = "Median")
        protected DataSet median;
        @XmlAttribute(name = "method", required = true)
        protected OtherMethodName method;

        /**
         * Gets the value of the mean property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getMean() {
            return mean;
        }

        /**
         * Sets the value of the mean property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setMean(DataSet value) {
            this.mean = value;
        }

        /**
         * Gets the value of the median property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getMedian() {
            return median;
        }

        /**
         * Sets the value of the median property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setMedian(DataSet value) {
            this.median = value;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link OtherMethodName }
         *     
         */
        public OtherMethodName getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherMethodName }
         *     
         */
        public void setMethod(OtherMethodName value) {
            this.method = value;
        }

        @Override
        protected List<TreeNode> listChildren() {
        	return new ChainedList<TreeNode>(super.listChildren())
        			.addIfNotNull(mean)
        			.addIfNotNull(median);
        }

    }

    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(mle)
    			.addIfNotNull(bayesian)
    			.addIfNotNull(otherMethod);
    }

}
