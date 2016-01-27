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

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.probonto.DistributionName;
import eu.ddmore.libpharmml.dom.probonto.ProbOnto;
import eu.ddmore.libpharmml.util.ChainedList;

/**
 * Type defining a distribution using ProbOnto.
 * 
 * <p>Java class for DistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.pharmml.org/probonto/ProbOnto}ProbOnto"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionType", propOrder = {
    "probOnto"
})
public class Distribution
    extends PharmMLRootType
{

    @XmlElement(name = "ProbOnto", namespace = NS_DEFAULT_PROBONTO)
    protected ProbOnto probOnto;

    /**
     * Gets the value of the probOnto property.
     * 
     * @return
     *     possible object is
     *     {@link ProbOnto }
     *     
     */
    public ProbOnto getProbOnto() {
        return probOnto;
    }

    /**
     * Sets the value of the probOnto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbOnto }
     *     
     */
    public void setProbOnto(ProbOnto value) {
        this.probOnto = value;
    }
    
    public ProbOnto createProbOnto(){
    	ProbOnto po = new ProbOnto();
    	this.probOnto = po;
    	return po;
    }
    
    public ProbOnto createProbOnto(DistributionName name){
    	ProbOnto po = new ProbOnto();
    	po.setName(name);
    	this.probOnto = po;
    	return po;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(probOnto);
    }

}
