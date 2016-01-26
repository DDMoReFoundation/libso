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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type for the simulation block for on ereplicate.
 * 
 * <p>Java class for OptimalDesignBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptimalDesignBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="FIM" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *         &lt;element name="CovarianceMatrix" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SOMatrixType" minOccurs="0"/>
 *         &lt;element name="ParameterPrecision" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="Criteria" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="Tests" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="SimulatedData" type="{http://www.pharmml.org/pharmml/0.8/Dataset}ExternalFile" minOccurs="0"/>
 *         &lt;element name="Design" type="{http://www.pharmml.org/pharmml/0.8/Dataset}ExternalFile" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="blockNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptimalDesignBlockType", propOrder = {
    "fim",
    "covarianceMatrix",
    "parameterPrecision",
    "criteria",
    "tests",
    "simulatedData",
    "design"
})
public class OptimalDesignBlock
    extends PharmMLRootType
{

    @XmlElement(name = "FIM")
    protected SOMatrix fim;
    @XmlElement(name = "CovarianceMatrix")
    protected SOMatrix covarianceMatrix;
    @XmlElement(name = "ParameterPrecision")
    protected DataSet parameterPrecision;
    @XmlElement(name = "Criteria")
    protected DataSet criteria;
    @XmlElement(name = "Tests")
    protected DataSet tests;
    @XmlElement(name = "SimulatedData")
    protected ExternalFile simulatedData;
    @XmlElement(name = "Design")
    protected ExternalFile design;
    @XmlAttribute(name = "blockNumber")
    protected Integer blockNumber;
    
    public OptimalDesignBlock(){}
    
    public OptimalDesignBlock(Integer blockNumber){
    	this.blockNumber = blockNumber;
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
     * Gets the value of the parameterPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getParameterPrecision() {
        return parameterPrecision;
    }

    /**
     * Sets the value of the parameterPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setParameterPrecision(DataSet value) {
        this.parameterPrecision = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setCriteria(DataSet value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setTests(DataSet value) {
        this.tests = value;
    }

    /**
     * Gets the value of the simulatedData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFile }
     *     
     */
    public ExternalFile getSimulatedData() {
        return simulatedData;
    }

    /**
     * Sets the value of the simulatedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFile }
     *     
     */
    public void setSimulatedData(ExternalFile value) {
        this.simulatedData = value;
    }

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFile }
     *     
     */
    public ExternalFile getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFile }
     *     
     */
    public void setDesign(ExternalFile value) {
        this.design = value;
    }

    /**
     * Gets the value of the blockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlockNumber() {
        return blockNumber;
    }

    /**
     * Sets the value of the blockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlockNumber(Integer value) {
        this.blockNumber = value;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(fim)
    			.addIfNotNull(covarianceMatrix)
    			.addIfNotNull(parameterPrecision)
    			.addIfNotNull(criteria)
    			.addIfNotNull(tests)
    			.addIfNotNull(simulatedData)
    			.addIfNotNull(design);
    }

}
