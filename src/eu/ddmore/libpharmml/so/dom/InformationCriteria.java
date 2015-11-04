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
import eu.ddmore.libpharmml.so.impl.SOXMLFilter;


/**
 * AIC, BIC and DIC measures to be defined here.
 * 
 * <p>Java class for InformationCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="AIC" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValue" minOccurs="0"/&gt;
 *           &lt;element name="BIC" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValue" minOccurs="0"/&gt;
 *           &lt;element name="DIC" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValue" minOccurs="0"/&gt;
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
@XmlType(name = "InformationCriteriaType", propOrder = {
    "content"
})
public class InformationCriteria
    extends PharmMLRootType
{

	@XmlElementRefs({
        @XmlElementRef(name = "DIC", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BIC", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AIC", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<RealValue>> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aicsAndBICSAndDICS property.
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
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * {@link JAXBElement }{@code <}{@link RealValue }{@code >}
     * 
     * 
     */
    public List<JAXBElement<RealValue>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<RealValue>>();
        }
        return this.content;
    }
    
    /**
     * Empty constructor
     */
    public InformationCriteria(){}
    
    /**
     * Creates new information criteria with the specified values. 
     * All the parameters of this constructor are nullable, so no
     * element will be created for a null criterion.
     * @param aic Akaike information criterion.
     * @param bic Bayesian information criterion.
     * @param dic Deviance information criterion.
     */
    public InformationCriteria(Double aic, Double bic, Double dic){
    	if(aic != null){
    		createAic(aic);
    	}
    	if(bic != null){
    		createBic(bic);
    	}
    	if(dic != null){
    		createDic(dic);
    	}
    }
    
    /**
     * Creates a new empty {@link RealValue} aic element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createAic(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createInformationCriteriaAIC(el));
    	return el;
    }
    /**
     * Creates a new {@link RealValue} aic element, adds it to the current object and returns it.
     * @param value The real value of the element.
     * @return The created {@link RealValue} object.
     */
    public RealValue createAic(double value){
    	RealValue el = createAic();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link RealValue} bic element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createBic(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createInformationCriteriaBIC(el));
    	return el;
    }
    /**
     * Creates a new {@link RealValue} bic element, adds it to the current object and returns it.
     * @param value The real value of the element.
     * @return The created {@link RealValue} object.
     */
    public RealValue createBic(double value){
    	RealValue el = createBic();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link RealValue} dic element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createDic(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createInformationCriteriaDIC(el));
    	return el;
    }
    /**
     * Creates a new empty {@link RealValue} dic element, adds it to the current object and returns it.
     * @param value The real value of the element.
     * @return The created {@link RealValue} object.
     */
    public RealValue createDic(double value){
    	RealValue el = createDic();
    	el.setValue(value);
    	return el;
    }

    @Override
    protected List<TreeNode> listChildren() {
    	List<TreeNode> list = new ArrayList<TreeNode>(super.listChildren());
    	for(JAXBElement<RealValue> jaxbEl : getContent()){
    		list.add(jaxbEl.getValue());
    	}
    	return list;
    }

}
