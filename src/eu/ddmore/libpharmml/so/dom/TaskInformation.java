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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.IntValue;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type specifying task information.
 * 
 * <p>Java class for TaskInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OutputFilePath" type="{http://www.pharmml.org/pharmml/0.8/Dataset}ExternalFile" minOccurs="0"/>
 *         &lt;element name="RunTime" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}RealValue" minOccurs="0"/>
 *         &lt;element name="NumberChains" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}IntValue" minOccurs="0"/>
 *         &lt;element name="NumberIterations" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}IntValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInformationType", propOrder = {
    "messages",
    "outputFilePath",
    "runTime",
    "numberChains",
    "numberIterations"
})
public class TaskInformation
    extends PharmMLRootType
{

    @XmlElement(name = "Message")
    protected List<Message> messages;
    @XmlElement(name = "OutputFilePath")
    protected ExternalFile outputFilePath;
    @XmlElement(name = "RunTime")
    protected RealValue runTime;
    @XmlElement(name = "NumberChains")
    protected IntValue numberChains;
    @XmlElement(name = "NumberIterations")
    protected IntValue numberIterations;

	@Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(messages)
    			.addIfNotNull(outputFilePath)
    			.addIfNotNull(runTime)
    			.addIfNotNull(numberChains)
    			.addIfNotNull(numberIterations);
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getListOfMessages() {
        if (messages == null) {
        	messages = new ArrayList<Message>();
        }
        return this.messages;
    }
    
    /**
     * @deprecated Use {@link #getListOfMessages()}.
     */
    @Deprecated
    public List<Message> getMessages() {
        return getListOfMessages();
    }

    /**
     * Gets the value of the outputFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFile }
     *     
     */
    public ExternalFile getOutputFilePath() {
        return outputFilePath;
    }

    /**
     * Sets the value of the outputFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFile }
     *     
     */
    public void setOutputFilePath(ExternalFile value) {
        this.outputFilePath = value;
    }

    /**
     * Gets the value of the runTime property.
     * 
     * @return
     *     possible object is
     *     {@link RealValue }
     *     
     */
    public RealValue getRunTime() {
        return runTime;
    }

    /**
     * Sets the value of the runTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealValue }
     *     
     */
    public void setRunTime(RealValue value) {
        this.runTime = value;
    }

    /**
     * Gets the value of the numberChains property.
     * 
     * @return
     *     possible object is
     *     {@link IntValue }
     *     
     */
    public IntValue getNumberChains() {
        return numberChains;
    }

    /**
     * Sets the value of the numberChains property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntValue }
     *     
     */
    public void setNumberChains(IntValue value) {
        this.numberChains = value;
    }

    /**
     * Gets the value of the numberIterations property.
     * 
     * @return
     *     possible object is
     *     {@link IntValue }
     *     
     */
    public IntValue getNumberIterations() {
        return numberIterations;
    }

    /**
     * Sets the value of the numberIterations property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntValue }
     *     
     */
    public void setNumberIterations(IntValue value) {
        this.numberIterations = value;
    }
    
    /**
     * Creates a new empty {@link Message} element, adds it to the current object and returns it.
     * @return The created {@link Message} object.
     */
    public Message createMessage(){
    	Message el = ObjectFactory.getInstance().createMessage();
    	getListOfMessages().add(el);
    	return el;
    }
    
    public Message createMessage(String toolName, String name, String content, Integer severity, String type){
    	Message el = new Message(toolName, name, content, severity, type);
    	getListOfMessages().add(el);
    	return el;
    }

    /**
     * Creates a new empty {@link ExternalFile} outputFilePath element, adds it to the current object and returns it.
     * @return The created {@link ExternalFile} object.
     */
    public ExternalFile createOutputFilePath(){
    	ExternalFile el = new ExternalFile();
    	this.outputFilePath = el;
    	return el;
    }

    /**
     * Creates a new empty {@link RealValue} runTime element, adds it to the current object and returns it.
     * @return The created {@link RealValue} object.
     */
    public RealValue createRunTime(Double value){
    	RealValue el = new RealValue(value);
    	this.runTime = el;
    	return el;
    }

    /**
     * Creates a new empty {@link IntValue} numberChains element, adds it to the current object and returns it.
     * @return The created {@link IntValue} object.
     */
    public IntValue createNumberChains(Integer value){
    	IntValue el = new IntValue(value);
    	this.numberChains = el;
    	return el;
    }

    /**
     * Creates a new empty {@link IntValue} numberIterations element, adds it to the current object and returns it.
     * @return The created {@link IntValue} object.
     */
    public IntValue createNumberIterations(Integer value){
    	IntValue el = new IntValue(value);
    	this.numberIterations = el;
    	return el;
    }


}
