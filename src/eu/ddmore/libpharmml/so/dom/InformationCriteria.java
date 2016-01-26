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
import eu.ddmore.libpharmml.dom.commontypes.RealValue;


/**
 * AIC, BIC and DIC measures to be defined here.
 * 
 * <p>Java class for InformationCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationCriteriaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;sequence>
 *           &lt;element name="AIC" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValueType" minOccurs="0"/>
 *           &lt;element name="BIC" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValueType" minOccurs="0"/>
 *           &lt;element name="DIC" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValueType" minOccurs="0"/>
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
@XmlType(name = "InformationCriteriaType", propOrder = {
    "content"
})
public class InformationCriteria
    extends PharmMLRootType
{

    @XmlElementRefs({
        @XmlElementRef(name = "AIC", namespace = "http://www.pharmml.org/so/0.3/StandardisedOutput", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BIC", namespace = "http://www.pharmml.org/so/0.3/StandardisedOutput", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DIC", namespace = "http://www.pharmml.org/so/0.3/StandardisedOutput", type = JAXBElement.class, required = false)
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
     * Creates a new empty {@link RealValue} aic element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createAic(){
    	RealValue el = new RealValue();
    	getContent().add(ObjectFactory.getInstance().createInformationCriteriaAIC(el));
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
    	getContent().add(ObjectFactory.getInstance().createInformationCriteriaBIC(el));
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
    	getContent().add(ObjectFactory.getInstance().createInformationCriteriaDIC(el));
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
