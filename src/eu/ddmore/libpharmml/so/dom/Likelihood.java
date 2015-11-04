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
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.so.impl.SOXMLFilter;


/**
 * Type defining the likelihood.
 * 
 * <p>Java class for LikelihoodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LikelihoodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="LogLikelihood" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValueType" minOccurs="0"/&gt;
 *           &lt;element name="Deviance" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValueType" minOccurs="0"/&gt;
 *           &lt;element name="IndividualContribToLL" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/&gt;
 *           &lt;element name="InformationCriteria" type="{http://www.pharmml.org/so/0.1/StandardisedOutput}InformationCriteriaType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LikelihoodType", propOrder = {
    "content"
})
public class Likelihood
    extends PharmMLRootType
{

    @XmlElementRefs({
        @XmlElementRef(name = "Deviance", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LogLikelihood", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InformationCriteria", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IndividualContribToLL", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logLikelihoodsAndDeviancesAndIndividualContribToLLs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationCriteria }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
        	content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }
    
    /**
     * Creates a new empty {@link RealValue} logLikelihood element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createLogLikelihood(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createLikelihoodLogLikelihood(el));
    	return el;
    }
    /**
     * Creates a new {@link RealValue} logLikelihood element, adds it to the current object and returns it.
     * @param value The real value of the element.
     * @return The created {@link RealValue} object.
     */
    public RealValue createLogLikelihood(double value){
    	RealValue el = createLogLikelihood();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link RealValue} deviance element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createDeviance(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createLikelihoodDeviance(el));
    	return el;
    }
    /**
     * Creates a new empty {@link RealValue} deviance element, adds it to the current object and returns it.
     * @param value The real value of the element.
     * @return The created {@link RealValue} object.
     */
    public RealValue createDeviance(double value){
    	RealValue el = createDeviance();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link DataSet} individualContribToLL element, adds it to the current object and returns it.
     * @return The created {@link DataSet} object.
     */
    public DataSet createIndividualContribToLL(){
    	DataSet el = new DataSet();
    	getContent().add(new ObjectFactory().createLikelihoodIndividualContribToLL(el));
    	return el;
    }

    /**
     * Creates a new empty {@link InformationCriteria} informationCriteria element, adds it to the current object and returns it.
     * @return The created {@link InformationCriteria} object.
     */
    public InformationCriteria createInformationCriteria(){
    	InformationCriteria el = new InformationCriteria();
    	getContent().add(new ObjectFactory().createLikelihoodInformationCriteria(el));
    	return el;
    }

    @Override
    protected List<TreeNode> listChildren() {
    	List<TreeNode> list = new ArrayList<TreeNode>(super.listChildren());
    	for(JAXBElement<?> jaxbEl : getContent()){
    		list.add((TreeNode) jaxbEl.getValue());
    	}
    	return list;
    }

}
