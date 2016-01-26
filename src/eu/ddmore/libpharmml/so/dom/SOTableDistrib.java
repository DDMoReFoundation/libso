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
 * Type defining distribution of the estimation results.
 * 
 * <p>Java class for SOTableDistribType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOTableDistribType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element name="Distribution" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}DistributionType"/>
 *         &lt;element name="DataSet" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOTableDistribType", propOrder = {
    "distribution",
    "dataSet"
})
public class SOTableDistrib
    extends PharmMLRootType
{

    @XmlElement(name = "Distribution")
    protected Distribution distribution;
    @XmlElement(name = "DataSet")
    protected DataSet dataSet;

    /**
     * Gets the value of the distribution property.
     * 
     * @return
     *     possible object is
     *     {@link Distribution }
     *     
     */
    public Distribution getDistribution() {
        return distribution;
    }

    /**
     * Sets the value of the distribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distribution }
     *     
     */
    public void setDistribution(Distribution value) {
        this.distribution = value;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setDataSet(DataSet value) {
        this.dataSet = value;
    }
    
    /**
     * Creates a new empty {@link Distribution} distribution element, adds it to the current object and returns it.
     * @return The created {@link Distribution} object.
     */
    public Distribution createDistribution(){
    	Distribution el = ObjectFactory.getInstance().createDistribution();
    	this.distribution = el;
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} dataSet element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createDataSet(){
    	DataSet el = MasterObjectFactory.DATASET_OF.createDataSetType();
    	this.dataSet = el;
    	return el;
    }

    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(distribution)
    			.addIfNotNull(dataSet);
    }

}
