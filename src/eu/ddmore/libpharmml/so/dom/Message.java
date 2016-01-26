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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.IntValue;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.StringValue;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Basic messages type.
 * 
 * <p>Java class for MessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="Toolname" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}StringValue"/>
 *         &lt;element name="Name" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}StringValue"/>
 *         &lt;element name="Content" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}StringValue"/>
 *         &lt;element name="Severity" type="{http://www.pharmml.org/pharmml/0.8/CommonTypes}IntValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ERROR"/>
 *             &lt;enumeration value="WARNING"/>
 *             &lt;enumeration value="TERMINATION"/>
 *             &lt;enumeration value="INFORMATION"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", propOrder = {
    "toolname",
    "name",
    "content",
    "severity"
})
public class Message
    extends PharmMLRootType
{

    @XmlElement(name = "Toolname", required = true)
    protected StringValue toolname;
    @XmlElement(name = "Name", required = true)
    protected StringValue name;
    @XmlElement(name = "Content", required = true)
    protected StringValue content;
    @XmlElement(name = "Severity", required = true)
    protected IntValue severity;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    
    public Message(){}
    
    public Message(String toolName, String name, String content, Integer severity, String type){
    	this.toolname = new StringValue(toolName);
    	this.name = new StringValue(name);
    	this.content = new StringValue(content);
    	this.severity = new IntValue(severity);
    	this.type = type;
    }

    /**
     * Gets the value of the toolname property.
     * 
     * @return
     *     possible object is
     *     {@link StringValue }
     *     
     */
    public StringValue getToolname() {
        return toolname;
    }

    /**
     * Sets the value of the toolname property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValue }
     *     
     */
    public void setToolname(StringValue value) {
        this.toolname = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StringValue }
     *     
     */
    public StringValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValue }
     *     
     */
    public void setName(StringValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link StringValue }
     *     
     */
    public StringValue getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValue }
     *     
     */
    public void setContent(StringValue value) {
        this.content = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link IntValue }
     *     
     */
    public IntValue getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntValue }
     *     
     */
    public void setSeverity(IntValue value) {
        this.severity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }
    
    /**
     * Creates a new {@link StringValue} toolname element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createToolname(String value){
    	StringValue el = new StringValue(value);
    	this.toolname = el;
    	return el;
    }

    /**
     * Creates a new {@link StringValue} name element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createName(String value){
    	StringValue el = new StringValue(value);
    	this.name = el;
    	return el;
    }

    /**
     * Creates a new {@link StringValue} content element, adds it to the current object and returns it.
     * @return The created {@link StringValue} object.
     */
    public StringValue createContent(String value){
    	StringValue el = new StringValue(value);
    	this.content = el;
    	return el;
    }

    /**
     * Creates a new severity element, adds it to the current object and returns it.
     * @return The created {@link IntValue} object.
     */
    public IntValue createSeverity(Integer value){
    	IntValue el = new IntValue(value);
    	this.severity = el;
    	return el;
    }

    
    @Override
    public String toString() {
    	return String.format("%s [%s]/%s/%s/%s/%d", super.toString(), type, toolname, name, content, severity);
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(toolname)
    			.addIfNotNull(name)
    			.addIfNotNull(content)
    			.addIfNotNull(severity);
    }

}
