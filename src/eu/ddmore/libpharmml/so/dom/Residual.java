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
 * Type for residuals
 * 
 * <p>Java class for ResidualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidualType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="ResidualTable" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *         &lt;element name="EpsShrinkage" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidualType", propOrder = {
    "residualTable",
    "epsShrinkage"
})
public class Residual extends PharmMLRootType {
	
	@XmlElement(name = "ResidualTable")
	protected DataSet residualTable;
	@XmlElement(name = "EpsShrinkage")
	protected DataSet epsShrinkage;
	
	@Override
	protected List<TreeNode> listChildren() {
		return new ChainedList<TreeNode>(super.listChildren())
				.addIfNotNull(residualTable)
				.addIfNotNull(epsShrinkage);
	}

    /**
     * Gets the value of the residualTable property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getResidualTable() {
        return residualTable;
    }

    /**
     * Sets the value of the residualTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setResidualTable(DataSet value) {
        this.residualTable = value;
    }

    /**
     * Gets the value of the epsShrinkage property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getEpsShrinkage() {
        return epsShrinkage;
    }

    /**
     * Sets the value of the epsShrinkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setEpsShrinkage(DataSet value) {
        this.epsShrinkage = value;
    }

	/**
	 * Creates a new empty residual table, adds it to this
	 * {@link Residual} element and returns it.
	 * @return The created {@link DataSet} object.
	 */
	public DataSet createResidualTable(){
		DataSet el = MasterObjectFactory.DATASET_OF.createDataSetType();
		residualTable = el;
		return el;
	}
	
	/**
	 * Creates a new empty Eps Shrinkage element, adds it to this
	 * {@link Residual} element and returns it.
	 * @return The created {@link DataSet} object.
	 */
	public DataSet createEpsShrinkage(){
		DataSet el = MasterObjectFactory.DATASET_OF.createDataSetType();
		epsShrinkage = el;
		return el;
	}

}
