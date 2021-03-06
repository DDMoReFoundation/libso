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
import eu.ddmore.libpharmml.dom.commontypes.StringValue;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.so.impl.SOXMLFilter;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type defining the target tool messages.
 * 
 * <p>Java class for TargetToolMessagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetToolMessagesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Termination" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}StringValueType" minOccurs="0"/&gt;
 *           &lt;element name="Warnings" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}StringValueType" minOccurs="0"/&gt;
 *           &lt;element name="Errors" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}StringValueType" minOccurs="0"/&gt;
 *           &lt;element name="ElapsedTime" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValueType" minOccurs="0"/&gt;
 *           &lt;element name="OutputFilePath" type="{http://www.pharmml.org/pharmml/0.6/Dataset}ExternalFileType" minOccurs="0"/&gt;
 *           &lt;element name="ChainsNumber" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValueType" minOccurs="0"/&gt;
 *           &lt;element name="IterationNumber" type="{http://www.pharmml.org/pharmml/0.6/CommonTypes}RealValueType" minOccurs="0"/&gt;
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
@XmlType(name = "TargetToolMessagesType", propOrder = {
    "content"
})
public class TargetToolMessages
    extends PharmMLRootType
{

	@XmlElementRefs({
        @XmlElementRef(name = "IterationNumber", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ElapsedTime", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OutputFilePath", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Errors", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Warnings", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ChainsNumber", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Termination", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
	
	@Override
	protected List<TreeNode> listChildren() {
		List<TreeNode> list = new ChainedList<TreeNode>(super.listChildren());
		for(JAXBElement<?> jaxbEl : getContent()){
			list.add((TreeNode) jaxbEl.getValue());
		}
		return list;
	}

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationsAndWarningsAndErrors property.
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
     * {@link JAXBElement }{@code <}{@link ExternalFile }{@code >}
     * {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     * {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     * {@link JAXBElement }{@code <}{@link StringValue }{@code >}
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
     * Creates a new empty {@link StringValue} termination element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createTermination(){
    	StringValue el = new StringValue();
    	getContent().add(new ObjectFactory().createTargetToolMessagesTermination(el));
    	return el;
    }
    /**
     * Creates a new {@link StringValue} termination element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createTermination(String value){
    	StringValue el = createTermination();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link StringValue} warnings element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createWarnings(){
    	StringValue el = new StringValue();
    	getContent().add(new ObjectFactory().createTargetToolMessagesWarnings(el));
    	return el;
    }
    /**
     * Creates a new {@link StringValue} warnings element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createWarnings(String value){
    	StringValue el = createWarnings();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link StringValue} errors element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createErrors(){
    	StringValue el = new StringValue();
    	getContent().add(new ObjectFactory().createTargetToolMessagesErrors(el));
    	return el;
    }
    /**
     * Creates a new {@link StringValue} errors element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createErrors(String value){
    	StringValue el = createErrors();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link RealValue} elapsedTime element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createElapsedTime(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createTargetToolMessagesElapsedTime(el));
    	return el;
    }
    /**
     * Creates a new {@link RealValue} elapsedTime element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createElapsedTime(double value){
    	RealValue el = createElapsedTime();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link ExternalFile} outputFilePath element, adds it to the current object and returns it.
     * @return The created {@link ExternalFile} object.
     */
    public ExternalFile createOutputFilePath(){
    	ExternalFile el = new ExternalFile();
    	getContent().add(new ObjectFactory().createTargetToolMessagesOutputFilePath(el));
    	return el;
    }

    /**
     * Creates a new {@link RealValue} chainsNumber element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createChainsNumber(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createTargetToolMessagesChainsNumber(el));
    	return el;
    }
    /**
     * Creates a new {@link RealValue} chainsNumber element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createChainsNumber(double value){
    	RealValue el = createChainsNumber();
    	el.setValue(value);
    	return el;
    }

    /**
     * Creates a new empty {@link RealValue} iterationNumber element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createIterationNumber(){
    	RealValue el = new RealValue();
    	getContent().add(new ObjectFactory().createTargetToolMessagesIterationNumber(el));
    	return el;
    }
    /**
     * Creates a new {@link RealValue} iterationNumber element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createIterationNumber(double value){
    	RealValue el = createIterationNumber();
    	el.setValue(value);
    	return el;
    }

}
