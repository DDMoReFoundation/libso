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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.util.ChainedList;
import static eu.ddmore.libpharmml.so.impl.SOXMLFilter.NS_SO;

/**
 * Type for diagnostic for individual parameters
 * 
 * <p>Java class for DiagnosticIndividualParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticIndividualParamsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;sequence>
 *           &lt;element name="RandomEffects" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *           &lt;element name="IndivParamsCovariates" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *           &lt;element name="DistributionIndivParams" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
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
@XmlType(name = "DiagnosticIndividualParamsType", propOrder = {
    "randomEffectsAndIndivParamsCovariatesAndDistributionIndivParams"
})
public class DiagnosticIndividualParams
    extends PharmMLRootType
{

    @XmlElementRefs({
        @XmlElementRef(name = "RandomEffects", namespace = NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IndivParamsCovariates", namespace = NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistributionIndivParams", namespace = NS_SO, type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<DataSet>> randomEffectsAndIndivParamsCovariatesAndDistributionIndivParams;

    /**
     * Gets the value of the randomEffectsAndIndivParamsCovariatesAndDistributionIndivParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the randomEffectsAndIndivParamsCovariatesAndDistributionIndivParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRandomEffectsAndIndivParamsCovariatesAndDistributionIndivParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * 
     * 
     */
    public List<JAXBElement<DataSet>> getRandomEffectsAndIndivParamsCovariatesAndDistributionIndivParams() {
        if (randomEffectsAndIndivParamsCovariatesAndDistributionIndivParams == null) {
            randomEffectsAndIndivParamsCovariatesAndDistributionIndivParams = new ArrayList<JAXBElement<DataSet>>();
        }
        return this.randomEffectsAndIndivParamsCovariatesAndDistributionIndivParams;
    }
    
    public DataSet createRandomEffects(){
    	DataSet ds = new DataSet();
    	getRandomEffectsAndIndivParamsCovariatesAndDistributionIndivParams().add(
    			ObjectFactory.getInstance().createDiagnosticIndividualParamsRandomEffects(ds));
    	return ds;
    }
    
    public DataSet createIndivParamsCovariates(){
    	DataSet ds = new DataSet();
    	getRandomEffectsAndIndivParamsCovariatesAndDistributionIndivParams().add(
    			ObjectFactory.getInstance().createDiagnosticIndividualParamsIndivParamsCovariates(ds));
    	return ds;
    }
    
    public DataSet createDistributionIndivParams(){
    	DataSet ds = new DataSet();
    	getRandomEffectsAndIndivParamsCovariatesAndDistributionIndivParams().add(
    			ObjectFactory.getInstance().createDiagnosticIndividualParamsDistributionIndivParams(ds));
    	return ds;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	List<TreeNode> list = new ChainedList<TreeNode>(super.listChildren());
    	for(JAXBElement<DataSet> jaxbElement :getRandomEffectsAndIndivParamsCovariatesAndDistributionIndivParams()){
    		list.add(jaxbElement.getValue());
    	}
    	return list;
    }

}
