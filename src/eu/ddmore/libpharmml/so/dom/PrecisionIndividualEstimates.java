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

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type for precision individual estimates
 * 
 * <p>Java class for PrecisionIndividualEstimatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecisionIndividualEstimatesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="StandardDeviation" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="EstimatesDistribution" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
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
@XmlType(name = "PrecisionIndividualEstimatesType", propOrder = {
    "standardDeviation",
    "estimatesDistribution",
    "percentilesCI"
})
public class PrecisionIndividualEstimates
    extends PharmMLRootType
{

    @XmlElement(name = "StandardDeviation")
    protected DataSet standardDeviation;
    @XmlElement(name = "EstimatesDistribution")
    protected SOTableDistrib estimatesDistribution;
    @XmlElement(name = "PercentilesCI")
    protected DataSet percentilesCI;

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
     * Gets the value of the estimatesDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link SOTableDistrib }
     *     
     */
    public SOTableDistrib getEstimatesDistribution() {
        return estimatesDistribution;
    }

    /**
     * Sets the value of the estimatesDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOTableDistrib }
     *     
     */
    public void setEstimatesDistribution(SOTableDistrib value) {
        this.estimatesDistribution = value;
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
    	DataSet el = MasterObjectFactory.DATASET_OF.createDataSetType();
    	this.standardDeviation = el;
    	return el;
    }

    /**
     * Creates a new empty {@link SOTableDistrib} estimatesDistribution element, adds it to the current object and returns it.
     * @return The created {@link SOTableDistrib} object.
     */
    public SOTableDistrib createEstimatesDistribution(){
    	SOTableDistrib el = ObjectFactory.getInstance().createSOTableDistrib();
    	this.estimatesDistribution = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} percentilesCI element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createPercentilesCI(){
    	DataSet el = MasterObjectFactory.DATASET_OF.createDataSetType();
    	this.percentilesCI = el;
    	return el;
    }

    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(standardDeviation)
    			.addIfNotNull(estimatesDistribution)
    			.addIfNotNull(percentilesCI);
    }

}
