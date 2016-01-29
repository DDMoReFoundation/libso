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

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.util.ChainedList;
import static eu.ddmore.libpharmml.so.impl.SOXMLFilter.NS_SO;


/**
 * Type defining the likelihood.
 * 
 * <p>Java class for OFMeasuresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFMeasuresType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;sequence>
 *           &lt;element name="Likelihood" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValueType" minOccurs="0"/>
 *           &lt;element name="LogLikelihood" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValueType" minOccurs="0"/>
 *           &lt;element name="Deviance" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValueType" minOccurs="0"/>
 *           &lt;element name="ToolObjFunction" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}ToolObjFunctionType" minOccurs="0"/>
 *           &lt;element name="IndividualContribToLL" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSetType" minOccurs="0"/>
 *           &lt;element name="InformationCriteria" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}InformationCriteriaType" minOccurs="0"/>
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
@XmlType(name = "OFMeasuresType", propOrder = {
    "content"
})
public class OFMeasures
    extends PharmMLRootType
{

    @XmlElementRefs({
        @XmlElementRef(name = "InformationCriteria", namespace = NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ToolObjFunction", namespace = NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Deviance", namespace = NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IndividualContribToLL", namespace = NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Likelihood", namespace = NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LogLikelihood", namespace = NS_SO, type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the value of the likelihoodAndLogLikelihoodAndDeviance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the likelihoodAndLogLikelihoodAndDeviance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLikelihoodAndLogLikelihoodAndDeviance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationCriteria }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolObjFunction }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
        	content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }
    
    public InformationCriteria createInformationCriteria(){
    	InformationCriteria ic = ObjectFactory.getInstance().createInformationCriteria();
    	getContent().add(ObjectFactory.getInstance().createOFMeasuresInformationCriteria(ic));
    	return ic;
    }
    
    public ToolObjFunction createToolObjFunction(){
    	ToolObjFunction tof = ObjectFactory.getInstance().createToolObjFunction();
    	getContent().add(ObjectFactory.getInstance().createOFMeasuresToolObjFunction(tof));
    	return tof;
    }
    
    public RealValue createDeviance(Double value){
    	RealValue deviance = new RealValue(value);
    	getContent().add(ObjectFactory.getInstance().createOFMeasuresDeviance(deviance));
    	return deviance;
    }
    
    public DataSet createIndividualContribToLL(){
    	DataSet ds = MasterObjectFactory.DATASET_OF.createDataSetType();
    	getContent().add(ObjectFactory.getInstance().createOFMeasuresIndividualContribToLL(ds));
    	return ds;
    }
    
    public RealValue createLikelihood(Double value){
    	RealValue rvalue = new RealValue(value);
    	getContent().add(ObjectFactory.getInstance().createOFMeasuresLikelihood(rvalue));
    	return rvalue;
    }
    
    public RealValue createLogLikelihood(Double value){
    	RealValue rvalue = new RealValue(value);
    	getContent().add(ObjectFactory.getInstance().createOFMeasuresLogLikelihood(rvalue));
    	return rvalue;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	List<TreeNode> list = new ChainedList<TreeNode>(super.listChildren());
    	for(JAXBElement<?> jaxbElement :getContent()){
    		list.add((TreeNode) jaxbElement.getValue());
    	}
    	return list;
    }

}
