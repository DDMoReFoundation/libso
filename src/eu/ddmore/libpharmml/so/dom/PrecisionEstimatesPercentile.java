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
 * Combined type for other population estimates
 * 
 * <p>Java class for PrecisionEstimatesPercentileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecisionEstimatesPercentileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="PrecisionEstimates" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType"/>
 *         &lt;element name="Percentiles" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType"/>
 *         &lt;element name="PosteriorDistribution" type="{http://www.pharmml.org/so/0.2/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecisionEstimatesPercentileType", propOrder = {
    "precisionEstimates",
    "percentiles",
    "posteriorDistribution"
})
public class PrecisionEstimatesPercentile
    extends PharmMLRootType
{

    @XmlElement(name = "PrecisionEstimates", required = true)
    protected DataSet precisionEstimates;
    @XmlElement(name = "Percentiles", required = true)
    protected DataSet percentiles;
    @XmlElement(name = "PosteriorDistribution")
    protected SOTableDistrib posteriorDistribution;

    /**
     * Gets the value of the precisionEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getPrecisionEstimates() {
        return precisionEstimates;
    }

    /**
     * Sets the value of the precisionEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setPrecisionEstimates(DataSet value) {
        this.precisionEstimates = value;
    }

    /**
     * Gets the value of the percentiles property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getPercentiles() {
        return percentiles;
    }

    /**
     * Sets the value of the percentiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setPercentiles(DataSet value) {
        this.percentiles = value;
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
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(precisionEstimates)
    			.addIfNotNull(percentiles)
    			.addIfNotNull(posteriorDistribution);
    }

}
