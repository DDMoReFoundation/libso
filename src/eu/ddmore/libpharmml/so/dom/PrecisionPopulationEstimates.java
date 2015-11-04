/*******************************************************************************
 * Copyright (c) 2014,2015 European Molecular Biology Laboratory,
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
import eu.ddmore.libpharmml.so.impl.SOXMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining the precision population estimates.
 * 
 * 
 *                         First level of the precision of population estimates.
 *                     
 * 
 * <p>Java class for PrecisionPopulationEstimatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecisionPopulationEstimatesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="MLE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;sequence>
 *                     &lt;element name="FIM" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                     &lt;element name="CovarianceMatrix" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                     &lt;element name="CorrelationMatrix" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                     &lt;element name="StandardError" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
 *                     &lt;element name="RelativeStandardError" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
 *                     &lt;element name="AsymptoticCI" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
 *                     &lt;element name="ConditionNumber" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}Rhs" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bayesian" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType">
 *                 &lt;sequence>
 *                   &lt;element name="StandardDeviationPosterior" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
 *                   &lt;element name="PosteriorDistribution" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
 *                   &lt;element name="PercentilesCI" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bootstrap" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}PrecisionEstimatesPercentileType" minOccurs="0"/>
 *         &lt;element name="LLP" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}PrecisionEstimatesPercentileType" minOccurs="0"/>
 *         &lt;element name="SIR" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}PrecisionEstimatesPercentileType" minOccurs="0"/>
 *         &lt;element name="MultiDimLLP" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}PrecisionEstimatesPercentileType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecisionPopulationEstimatesType", propOrder = {
    "mle",
    "bayesian",
    "bootstrap",
    "llp",
    "sir",
    "multiDimLLP"
})
public class PrecisionPopulationEstimates
    extends PharmMLRootType
{

    @XmlElement(name = "MLE")
    protected PrecisionPopulationEstimates.MLE mle;
    @XmlElement(name = "Bayesian")
    protected PrecisionPopulationEstimates.Bayesian bayesian;
    @XmlElement(name = "Bootstrap")
    protected PrecisionEstimatesPercentile bootstrap;
    @XmlElement(name = "LLP")
    protected PrecisionEstimatesPercentile llp;
    @XmlElement(name = "SIR")
    protected PrecisionEstimatesPercentile sir;
    @XmlElement(name = "MultiDimLLP")
    protected PrecisionEstimatesPercentile multiDimLLP;

    /**
     * Gets the value of the mle property.
     * 
     * @return
     *     possible object is
     *     {@link PrecisionPopulationEstimates.MLE }
     *     
     */
    public PrecisionPopulationEstimates.MLE getMLE() {
        return mle;
    }

    /**
     * Sets the value of the mle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecisionPopulationEstimates.MLE }
     *     
     */
    public void setMLE(PrecisionPopulationEstimates.MLE value) {
        this.mle = value;
    }

    /**
     * Gets the value of the bayesian property.
     * 
     * @return
     *     possible object is
     *     {@link PrecisionPopulationEstimates.Bayesian }
     *     
     */
    public PrecisionPopulationEstimates.Bayesian getBayesian() {
        return bayesian;
    }

    /**
     * Sets the value of the bayesian property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecisionPopulationEstimates.Bayesian }
     *     
     */
    public void setBayesian(PrecisionPopulationEstimates.Bayesian value) {
        this.bayesian = value;
    }

    /**
     * Gets the value of the bootstrap property.
     * 
     * @return
     *     possible object is
     *     {@link PrecisionEstimatesPercentile }
     *     
     */
    public PrecisionEstimatesPercentile getBootstrap() {
        return bootstrap;
    }

    /**
     * Sets the value of the bootstrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecisionPopulationEstimates.Bootstrap }
     *     
     */
    public void setBootstrap(PrecisionEstimatesPercentile value) {
        this.bootstrap = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
     *       &lt;sequence>
     *         &lt;element name="StandardDeviationPosterior" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="PosteriorDistribution" type="{http://www.pharmml.org/2013/03/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
     *         &lt;element name="QuantilesCI" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
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
        "standardDeviationPosterior",
        "posteriorDistribution",
        "percentilesCI"
    })
    public static class Bayesian
        extends PharmMLRootType
    {

        @XmlElement(name = "StandardDeviationPosterior")
        protected DataSet standardDeviationPosterior;
        @XmlElement(name = "PosteriorDistribution")
        protected SOTableDistrib posteriorDistribution;
        @XmlElement(name = "PercentilesCI")
        protected DataSet percentilesCI;
        
        @Override
        protected List<TreeNode> listChildren() {
        	return new ChainedList<TreeNode>(super.listChildren())
        			.addIfNotNull(standardDeviationPosterior)
        			.addIfNotNull(posteriorDistribution)
        			.addIfNotNull(percentilesCI);
        }

        /**
         * Gets the value of the standardDeviationPosterior property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getStandardDeviationPosterior() {
            return standardDeviationPosterior;
        }

        /**
         * Sets the value of the standardDeviationPosterior property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setStandardDeviationPosterior(DataSet value) {
            this.standardDeviationPosterior = value;
        }

        /**
         * Gets the value of the posteriorDistribution property.
         * 
         * @return
         *     possible object is
         *     {@link SOTableDistrib }
         *     
         */
        public SOTableDistrib getPosteriorDistribution() {
            return posteriorDistribution;
        }

        /**
         * Sets the value of the posteriorDistribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link SOTableDistrib }
         *     
         */
        public void setPosteriorDistribution(SOTableDistrib value) {
            this.posteriorDistribution = value;
        }

        /**
         * Gets the value of the percentilesCI property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getPercentilesCI() {
            return percentilesCI;
        }

        /**
         * Sets the value of the percentilesCI property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setPercentilesCI(DataSet value) {
            this.percentilesCI = value;
        }
        
        /**
         * Creates a new empty {@link DataSet} standardDeviationPosterior element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createStandardDeviationPosterior(){
        	DataSet el = new DataSet();
        	this.standardDeviationPosterior = el;
        	return el;
        }

        /**
         * Creates a new empty {@link SOTableDistrib} posteriorDistribution element, adds it to the current object and returns it.
         * @return The created {@link SOTableDistrib} object.
         */
        public SOTableDistrib createPosteriorDistribution(){
        	SOTableDistrib el = new SOTableDistrib();
        	this.posteriorDistribution = el;
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} percentilesCI element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createPercentilesCI(){
        	DataSet el = new DataSet();
        	this.percentilesCI = el;
        	return el;
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
     *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
     *       &lt;sequence>
     *         &lt;element name="StandardDeviation" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="ParameterDistribution" type="{http://www.pharmml.org/2013/03/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
     *         &lt;element name="PercentilesCI" type="{http://www.pharmml.org/2013/08/Dataset}DataSet" minOccurs="0"/>
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
        "standardDeviation",
        "parameterDistribution",
        "percentilesCI"
    })
    @Deprecated
    public static class Bootstrap
        extends PharmMLRootType
    {

        @XmlElement(name = "StandardDeviation")
        protected DataSet standardDeviation;
        @XmlElement(name = "ParameterDistribution")
        protected SOTableDistrib parameterDistribution;
        @XmlElement(name = "PercentilesCI")
        protected DataSet percentilesCI;
        
        @Override
        protected List<TreeNode> listChildren() {
        	return new ChainedList<TreeNode>(super.listChildren())
        			.addIfNotNull(standardDeviation)
        			.addIfNotNull(parameterDistribution)
        			.addIfNotNull(percentilesCI);
        }

        /**
         * Gets the value of the standardDeviation property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getStandardDeviation() {
            return standardDeviation;
        }

        /**
         * Sets the value of the standardDeviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setStandardDeviation(DataSet value) {
            this.standardDeviation = value;
        }

        /**
         * Gets the value of the parameterDistribution property.
         * 
         * @return
         *     possible object is
         *     {@link SOTableDistrib }
         *     
         */
        public SOTableDistrib getParameterDistribution() {
            return parameterDistribution;
        }

        /**
         * Sets the value of the parameterDistribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link SOTableDistrib }
         *     
         */
        public void setParameterDistribution(SOTableDistrib value) {
            this.parameterDistribution = value;
        }

        /**
         * Gets the value of the percentilesCI property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getPercentilesCI() {
            return percentilesCI;
        }

        /**
         * Sets the value of the percentilesCI property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setPercentilesCI(DataSet value) {
            this.percentilesCI = value;
        }
        
        /**
         * Creates a new empty {@link DataSet} standardDeviation element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createStandardDeviation(){
        	DataSet el = new DataSet();
        	this.standardDeviation = el;
        	return el;
        }

        /**
         * Creates a new empty {@link SOTableDistrib} parameterDistribution element, adds it to the current object and returns it.
         * @return The created {@link SOTableDistrib} object.
         */
        public SOTableDistrib createParameterDistribution(){
        	SOTableDistrib el = new SOTableDistrib();
        	this.parameterDistribution = el;
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} percentilesCI element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createPercentilesCI(){
        	DataSet el = new DataSet();
        	this.percentilesCI = el;
        	return el;
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
     *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;sequence>
     *           &lt;element name="FIM" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *           &lt;element name="CovarianceMatrix" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *           &lt;element name="CorrelationMatrix" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *           &lt;element name="StandardError" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
     *           &lt;element name="RelativeStandardError" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
     *           &lt;element name="AsymptoticCI" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/>
     *           &lt;element name="ConditionNumber" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}Rhs" minOccurs="0"/>
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
    public static class MLE
        extends PharmMLRootType
    {

//        @XmlElement(name = "FIM")
//        protected SOMatrix fim;
//        @XmlElement(name = "CovarianceMatrix")
//        protected SOMatrix covarianceMatrix;
//        @XmlElement(name = "CorrelationMatrix")
//        protected SOMatrix correlationMatrix;
//        @XmlElement(name = "StandardError")
//        protected DataSet standardError;
//        @XmlElement(name = "RelativeStandardError")
//        protected DataSet relativeStandardError;
//        @XmlElement(name = "AsymptoticCI")
//        protected DataSet asymptoticCI;
        
        @XmlElementRefs({
            @XmlElementRef(name = "CovarianceMatrix", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CorrelationMatrix", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RelativeStandardError", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FIM", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AsymptoticCI", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "StandardError", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ConditionNumber", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<? extends PharmMLRootType>> content;
        
        @Override
        protected List<TreeNode> listChildren() {
        	List<TreeNode> list = new ArrayList<TreeNode>(super.listChildren());
        	for(JAXBElement<? extends PharmMLRootType> jaxbEl : getContent()){
        		list.add(jaxbEl.getValue());
        	}
        	return list;
        }

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fimsAndCovarianceMatrixesAndCorrelationMatrixes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * <p>
         * One should use the creators instead of this list to add a new element to avoid dealing
         * with {@link JAXBElement} objects ({@link #createAsymptoticCI()}, {@link #createCorrelationMatrix()},
         * {@link #createCovarianceMatrix()}, {@link #createFim()}, {@link #createRelativeStandardError()},
         * {@link #createStandardError()}).
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link SOMatrix }{@code >}
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * {@link JAXBElement }{@code <}{@link SOMatrix }{@code >}
         * {@link JAXBElement }{@code <}{@link SOMatrix }{@code >}
         * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
         * 
         * @since SO 0.1
         */
        public List<JAXBElement<? extends PharmMLRootType>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<? extends PharmMLRootType>>();
            }
            return this.content;
        }
        
        /**
         * Creates a new empty {@link SOMatrix} fim element, adds it to the current object and returns it.
         * @return The created {@link SOMatrix} object.
         */
        public SOMatrix createFim(){
        	SOMatrix el = new SOMatrix();
        	getContent().add(
        			new ObjectFactory().createPrecisionPopulationEstimatesMLEFIM(el));
        	return el;
        }

        /**
         * Creates a new empty {@link SOMatrix} covarianceMatrix element, adds it to the current object and returns it.
         * @return The created {@link SOMatrix} object.
         */
        public SOMatrix createCovarianceMatrix(){
        	SOMatrix el = new SOMatrix();
        	getContent().add(
        			new ObjectFactory().createPrecisionPopulationEstimatesMLECovarianceMatrix(el));
        	return el;
        }

        /**
         * Creates a new empty {@link SOMatrix} correlationMatrix element, adds it to the current object and returns it.
         * @return The created {@link SOMatrix} object.
         */
        public SOMatrix createCorrelationMatrix(){
        	SOMatrix el = new SOMatrix();
        	getContent().add(
        			new ObjectFactory().createPrecisionPopulationEstimatesMLECorrelationMatrix(el));
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} standardError element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createStandardError(){
        	DataSet el = new DataSet();
        	getContent().add(
        			new ObjectFactory().createPrecisionPopulationEstimatesMLEStandardError(el));
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} relativeStandardError element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createRelativeStandardError(){
        	DataSet el = new DataSet();
        	getContent().add(
        			new ObjectFactory().createPrecisionPopulationEstimatesMLERelativeStandardError(el));
        	return el;
        }

        /**
         * Creates a new empty {@link DataSet} asymptoticCI element, adds it to the current object and returns it.
         * @return The created {@link DataSet} object.
         */
        public DataSet createAsymptoticCI(){
        	DataSet el = new DataSet();
        	getContent().add(
        			new ObjectFactory().createPrecisionPopulationEstimatesMLEAsymptoticCI(el));
        	return el;
        }


    }
    
    /**
     * Creates a new empty {@link PrecisionPopulationEstimates.MLE} mle element, adds it to the current object and returns it.
     * @return The created {@link PrecisionPopulationEstimates.MLE} object.
     */
    public PrecisionPopulationEstimates.MLE createMle(){
    	PrecisionPopulationEstimates.MLE el = new PrecisionPopulationEstimates.MLE();
    	this.mle = el;
    	return el;
    }

    /**
     * Creates a new empty {@link PrecisionPopulationEstimates.Bayesian} bayesian element, adds it to the current object and returns it.
     * @return The created {@link PrecisionPopulationEstimates.Bayesian} object.
     */
    public PrecisionPopulationEstimates.Bayesian createBayesian(){
    	PrecisionPopulationEstimates.Bayesian el = new PrecisionPopulationEstimates.Bayesian();
    	this.bayesian = el;
    	return el;
    }

    /**
     * Creates a new empty {@link PrecisionEstimatesPercentile} bootstrap element, adds it to the current object and returns it.
     * @return The created {@link PrecisionEstimatesPercentile} object.
     */
    public PrecisionEstimatesPercentile createBootstrap(){
    	PrecisionEstimatesPercentile el = new PrecisionEstimatesPercentile();
    	this.bootstrap = el;
    	return el;
    }

    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(mle)
    			.addIfNotNull(bayesian)
    			.addIfNotNull(bootstrap)
    			.addIfNotNull(llp)
    			.addIfNotNull(sir)
    			.addIfNotNull(multiDimLLP);
    }
    
}
