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
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type for the simulation section of the SO.
 * 
 * <p>Java class for OptimalDesignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptimalDesignType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element name="OptimalDesignBlock" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}OptimalDesignBlockType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="type" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}DesignTypeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptimalDesignType", propOrder = {
    "optimalDesignBlock"
})
public class OptimalDesign
    extends PharmMLRootType
{

    @XmlElement(name = "OptimalDesignBlock")
    protected List<OptimalDesignBlock> optimalDesignBlock;
    @XmlAttribute(name = "type")
    protected DesignType type;

    /**
     * Gets the value of the optimalDesignBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optimalDesignBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptimalDesignBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptimalDesignBlock }
     * 
     * 
     */
    public List<OptimalDesignBlock> getListOfOptimalDesignBlock() {
        if (optimalDesignBlock == null) {
            optimalDesignBlock = new ArrayList<OptimalDesignBlock>();
        }
        return this.optimalDesignBlock;
    }
    
    /**
     * @deprecated Use {@link #getListOfOptimalDesignBlock()}.
     */
    @Deprecated
    public List<OptimalDesignBlock> getOptimalDesignBlock() {
        return getListOfOptimalDesignBlock();
    }
    
    public OptimalDesignBlock createOptimalDesignBlock(){
    	OptimalDesignBlock odb = ObjectFactory.getInstance().createOptimalDesignBlock();
    	getListOfOptimalDesignBlock().add(odb);
    	return odb;
    }
    
    public OptimalDesignBlock createOptimalDesignBlock(Integer blockNumber){
    	OptimalDesignBlock odb = ObjectFactory.getInstance().createOptimalDesignBlock();
    	odb.setBlockNumber(blockNumber);
    	getListOfOptimalDesignBlock().add(odb);
    	return odb;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DesignType }
     *     
     */
    public DesignType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignType }
     *     
     */
    public void setType(DesignType value) {
        this.type = value;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(optimalDesignBlock);
    }

}
