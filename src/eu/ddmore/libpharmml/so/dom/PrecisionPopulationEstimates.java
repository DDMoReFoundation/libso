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
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining the precision population estimates.
 * 
 * 
 *                         The precision of population estimates.
 *                     
 * 
 * <p>Java class for PrecisionPopulationEstimatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecisionPopulationEstimatesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="MLE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *                 &lt;sequence>
 *                   &lt;element name="FIM" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                   &lt;element name="CovarianceMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                   &lt;element name="CorrelationMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                   &lt;element name="StandardError" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="RelativeStandardError" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="AsymptoticCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="ConditionNumber" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValue" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bayesian" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *                 &lt;sequence>
 *                   &lt;element name="StandardDeviation" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="PosteriorDistribution" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
 *                   &lt;element name="PercentilesCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
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
 *                   &lt;element name="CovarianceMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                   &lt;element name="CorrelationMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *                   &lt;element name="StandardDeviation" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="StandardError" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="AsymptoticCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *                   &lt;element name="PosteriorDistribution" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
 *                   &lt;element name="PercentilesCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
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
@XmlType(name = "PrecisionPopulationEstimatesType", propOrder = {
    "mle",
    "bayesian",
    "otherMethod"
})
public class PrecisionPopulationEstimates
    extends PharmMLRootType
{

    @XmlElement(name = "MLE")
    protected PrecisionPopulationEstimates.MLE mle;
    @XmlElement(name = "Bayesian")
    protected PrecisionPopulationEstimates.Bayesian bayesian;
    @XmlElement(name = "OtherMethod")
    protected List<PrecisionPopulationEstimates.OtherMethod> otherMethod;

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
     * {@link PrecisionPopulationEstimates.OtherMethod }
     * 
     * 
     */
    public List<PrecisionPopulationEstimates.OtherMethod> getOtherMethod() {
        if (otherMethod == null) {
            otherMethod = new ArrayList<PrecisionPopulationEstimates.OtherMethod>();
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
     *         &lt;element name="StandardDeviation" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="PosteriorDistribution" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
     *         &lt;element name="PercentilesCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
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
        "posteriorDistribution",
        "percentilesCI"
    })
    public static class Bayesian
        extends PharmMLRootType
    {

        @XmlElement(name = "StandardDeviation")
        protected DataSet standardDeviation;
        @XmlElement(name = "PosteriorDistribution")
        protected SOTableDistrib posteriorDistribution;
        @XmlElement(name = "PercentilesCI")
        protected DataSet percentilesCI;
        
        @Override
        protected List<TreeNode> listChildren() {
        	return new ChainedList<TreeNode>(super.listChildren())
        			.addIfNotNull(standardDeviation)
        			.addIfNotNull(posteriorDistribution)
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
     *         &lt;element name="FIM" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *         &lt;element name="CovarianceMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *         &lt;element name="CorrelationMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *         &lt;element name="StandardError" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="RelativeStandardError" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="AsymptoticCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="ConditionNumber" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValue" minOccurs="0"/>
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
        "fim",
        "covarianceMatrix",
        "correlationMatrix",
        "standardError",
        "relativeStandardError",
        "asymptoticCI",
        "conditionNumber"
    })
    public static class MLE
        extends PharmMLRootType
    {

        @XmlElement(name = "FIM")
        protected SOMatrix fim;
        @XmlElement(name = "CovarianceMatrix")
        protected SOMatrix covarianceMatrix;
        @XmlElement(name = "CorrelationMatrix")
        protected SOMatrix correlationMatrix;
        @XmlElement(name = "StandardError")
        protected DataSet standardError;
        @XmlElement(name = "RelativeStandardError")
        protected DataSet relativeStandardError;
        @XmlElement(name = "AsymptoticCI")
        protected DataSet asymptoticCI;
        @XmlElement(name = "ConditionNumber")
        protected RealValue conditionNumber;
        
        @Override
        protected List<TreeNode> listChildren() {
        	return new ChainedList<TreeNode>(super.listChildren())
        			.addIfNotNull(fim)
        			.addIfNotNull(covarianceMatrix)
        			.addIfNotNull(correlationMatrix)
        			.addIfNotNull(standardError)
        			.addIfNotNull(relativeStandardError)
        			.addIfNotNull(asymptoticCI)
        			.addIfNotNull(conditionNumber);
        }

        /**
         * Gets the value of the fim property.
         * 
         * @return
         *     possible object is
         *     {@link SOMatrix }
         *     
         */
        public SOMatrix getFIM() {
            return fim;
        }

        /**
         * Sets the value of the fim property.
         * 
         * @param value
         *     allowed object is
         *     {@link SOMatrix }
         *     
         */
        public void setFIM(SOMatrix value) {
            this.fim = value;
        }

        /**
         * Gets the value of the covarianceMatrix property.
         * 
         * @return
         *     possible object is
         *     {@link SOMatrix }
         *     
         */
        public SOMatrix getCovarianceMatrix() {
            return covarianceMatrix;
        }

        /**
         * Sets the value of the covarianceMatrix property.
         * 
         * @param value
         *     allowed object is
         *     {@link SOMatrix }
         *     
         */
        public void setCovarianceMatrix(SOMatrix value) {
            this.covarianceMatrix = value;
        }

        /**
         * Gets the value of the correlationMatrix property.
         * 
         * @return
         *     possible object is
         *     {@link SOMatrix }
         *     
         */
        public SOMatrix getCorrelationMatrix() {
            return correlationMatrix;
        }

        /**
         * Sets the value of the correlationMatrix property.
         * 
         * @param value
         *     allowed object is
         *     {@link SOMatrix }
         *     
         */
        public void setCorrelationMatrix(SOMatrix value) {
            this.correlationMatrix = value;
        }

        /**
         * Gets the value of the standardError property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getStandardError() {
            return standardError;
        }

        /**
         * Sets the value of the standardError property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setStandardError(DataSet value) {
            this.standardError = value;
        }

        /**
         * Gets the value of the relativeStandardError property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getRelativeStandardError() {
            return relativeStandardError;
        }

        /**
         * Sets the value of the relativeStandardError property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setRelativeStandardError(DataSet value) {
            this.relativeStandardError = value;
        }

        /**
         * Gets the value of the asymptoticCI property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getAsymptoticCI() {
            return asymptoticCI;
        }

        /**
         * Sets the value of the asymptoticCI property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setAsymptoticCI(DataSet value) {
            this.asymptoticCI = value;
        }

        /**
         * Gets the value of the conditionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link RealValue }
         *     
         */
        public RealValue getConditionNumber() {
            return conditionNumber;
        }

        /**
         * Sets the value of the conditionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link RealValue }
         *     
         */
        public void setConditionNumber(RealValue value) {
            this.conditionNumber = value;
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
     *       &lt;sequence>
     *         &lt;element name="CovarianceMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *         &lt;element name="CorrelationMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
     *         &lt;element name="StandardDeviation" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="StandardError" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="AsymptoticCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
     *         &lt;element name="PosteriorDistribution" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
     *         &lt;element name="PercentilesCI" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
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
        "covarianceMatrix",
        "correlationMatrix",
        "standardDeviation",
        "standardError",
        "asymptoticCI",
        "posteriorDistribution",
        "percentilesCI"
    })
    public static class OtherMethod
        extends PharmMLRootType
    {

        @XmlElement(name = "CovarianceMatrix")
        protected SOMatrix covarianceMatrix;
        @XmlElement(name = "CorrelationMatrix")
        protected SOMatrix correlationMatrix;
        @XmlElement(name = "StandardDeviation")
        protected DataSet standardDeviation;
        @XmlElement(name = "StandardError")
        protected DataSet standardError;
        @XmlElement(name = "AsymptoticCI")
        protected DataSet asymptoticCI;
        @XmlElement(name = "PosteriorDistribution")
        protected SOTableDistrib posteriorDistribution;
        @XmlElement(name = "PercentilesCI")
        protected DataSet percentilesCI;
        @XmlAttribute(name = "method", required = true)
        protected OtherMethodName method;
        
        @Override
        protected List<TreeNode> listChildren() {
        	return new ChainedList<TreeNode>(super.listChildren())
        			.addIfNotNull(covarianceMatrix)
        			.addIfNotNull(correlationMatrix)
        			.addIfNotNull(standardDeviation)
        			.addIfNotNull(standardError)
        			.addIfNotNull(asymptoticCI)
        			.addIfNotNull(posteriorDistribution)
        			.addIfNotNull(percentilesCI);
        }

        /**
         * Gets the value of the covarianceMatrix property.
         * 
         * @return
         *     possible object is
         *     {@link SOMatrix }
         *     
         */
        public SOMatrix getCovarianceMatrix() {
            return covarianceMatrix;
        }

        /**
         * Sets the value of the covarianceMatrix property.
         * 
         * @param value
         *     allowed object is
         *     {@link SOMatrix }
         *     
         */
        public void setCovarianceMatrix(SOMatrix value) {
            this.covarianceMatrix = value;
        }

        /**
         * Gets the value of the correlationMatrix property.
         * 
         * @return
         *     possible object is
         *     {@link SOMatrix }
         *     
         */
        public SOMatrix getCorrelationMatrix() {
            return correlationMatrix;
        }

        /**
         * Sets the value of the correlationMatrix property.
         * 
         * @param value
         *     allowed object is
         *     {@link SOMatrix }
         *     
         */
        public void setCorrelationMatrix(SOMatrix value) {
            this.correlationMatrix = value;
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
         * Gets the value of the standardError property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getStandardError() {
            return standardError;
        }

        /**
         * Sets the value of the standardError property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setStandardError(DataSet value) {
            this.standardError = value;
        }

        /**
         * Gets the value of the asymptoticCI property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet }
         *     
         */
        public DataSet getAsymptoticCI() {
            return asymptoticCI;
        }

        /**
         * Sets the value of the asymptoticCI property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet }
         *     
         */
        public void setAsymptoticCI(DataSet value) {
            this.asymptoticCI = value;
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

    public OtherMethod createOtherMethod(){
    	OtherMethod om = ObjectFactory.getInstance().createPrecisionPopulationEstimatesOtherMethod();
    	getOtherMethod().add(om);
    	return om;
    }

    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(mle)
    			.addIfNotNull(bayesian)
    			.addIfNotNull(otherMethod);
    }
    
}
