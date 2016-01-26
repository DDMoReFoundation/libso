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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.Block;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * A type defining the SO block.
 * 
 * <p>Java class for SOBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="ToolSettings" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}ToolSettingsType" minOccurs="0"/>
 *         &lt;element name="RawResults" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}RawResultsType" minOccurs="0"/>
 *         &lt;element name="TaskInformation" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}TaskInformationType" minOccurs="0"/>
 *         &lt;element name="Estimation" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}EstimationType" minOccurs="0"/>
 *         &lt;element name="ModelDiagnostic" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}ModelDiagnosticType" minOccurs="0"/>
 *         &lt;element name="Simulation" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}SimulationType" minOccurs="0"/>
 *         &lt;element name="OptimalDesign" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}OptimalDesignType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.pharmml.org/pharmml/0.8/CommonTypes}BlockDefnGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOBlockType", propOrder = {
    "toolSettings",
    "rawResults",
    "taskInformation",
    "estimation",
    "modelDiagnostic",
    "simulation",
    "optimalDesign"
})
public class SOBlock
    extends PharmMLRootType implements Block
{

    @XmlElement(name = "ToolSettings")
    protected ToolSettings toolSettings;
    @XmlElement(name = "RawResults")
    protected RawResults rawResults;
    @XmlElement(name = "TaskInformation")
    protected TaskInformation taskInformation;
    @XmlElement(name = "Estimation")
    protected Estimation estimation;
    @XmlElement(name = "ModelDiagnostic")
    protected ModelDiagnostic modelDiagnostic;
    @XmlElement(name = "Simulation")
    protected Simulation simulation;
    @XmlElement(name = "OptimalDesign")
    protected OptimalDesign optimalDesign;
    @XmlAttribute(name = "blkId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String blkId;
    
    public SOBlock(){}
    
    public SOBlock(String blkId){
    	this.blkId = blkId;
    }

    /**
     * Gets the value of the toolSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ToolSettings }
     *     
     */
    public ToolSettings getToolSettings() {
        return toolSettings;
    }

    /**
     * Sets the value of the toolSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolSettings }
     *     
     */
    public void setToolSettings(ToolSettings value) {
        this.toolSettings = value;
    }

    /**
     * Gets the value of the rawResults property.
     * 
     * @return
     *     possible object is
     *     {@link RawResults }
     *     
     */
    public RawResults getRawResults() {
        return rawResults;
    }

    /**
     * Sets the value of the rawResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link RawResults }
     *     
     */
    public void setRawResults(RawResults value) {
        this.rawResults = value;
    }

    /**
     * Gets the value of the taskInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInformation }
     *     
     */
    public TaskInformation getTaskInformation() {
        return taskInformation;
    }

    /**
     * Sets the value of the taskInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInformation }
     *     
     */
    public void setTaskInformation(TaskInformation value) {
        this.taskInformation = value;
    }

    /**
     * Gets the value of the estimation property.
     * 
     * @return
     *     possible object is
     *     {@link Estimation }
     *     
     */
    public Estimation getEstimation() {
        return estimation;
    }

    /**
     * Sets the value of the estimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Estimation }
     *     
     */
    public void setEstimation(Estimation value) {
        this.estimation = value;
    }

    /**
     * Gets the value of the modelDiagnostic property.
     * 
     * @return
     *     possible object is
     *     {@link ModelDiagnostic }
     *     
     */
    public ModelDiagnostic getModelDiagnostic() {
        return modelDiagnostic;
    }

    /**
     * Sets the value of the modelDiagnostic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelDiagnostic }
     *     
     */
    public void setModelDiagnostic(ModelDiagnostic value) {
        this.modelDiagnostic = value;
    }

    /**
     * Gets the value of the simulation property.
     * 
     * @return
     *     possible object is
     *     {@link Simulation }
     *     
     */
    public Simulation getSimulation() {
        return simulation;
    }

    /**
     * Sets the value of the simulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Simulation }
     *     
     */
    public void setSimulation(Simulation value) {
        this.simulation = value;
    }

    /**
     * Gets the value of the optimalDesign property.
     * 
     * @return
     *     possible object is
     *     {@link OptimalDesign }
     *     
     */
    public OptimalDesign getOptimalDesign() {
        return optimalDesign;
    }

    /**
     * Sets the value of the optimalDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimalDesign }
     *     
     */
    public void setOptimalDesign(OptimalDesign value) {
        this.optimalDesign = value;
    }

    /**
     * Gets the value of the blkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlkId() {
        return blkId;
    }

    /**
     * Sets the value of the blkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlkId(String value) {
        this.blkId = value;
    }
    
    /**
     * Creates a new empty {@link ToolSettings} toolSettings element, adds it to the current object and returns it.
     * @return The created {@link ToolSettings} object.
     */
    public ToolSettings createToolSettings(){
    	ToolSettings el = new ToolSettings();
    	this.toolSettings = el;
    	return el;
    }

    /**
     * Creates a new empty {@link RawResults} rawResults element, adds it to the current object and returns it.
     * @return The created {@link RawResults} object.
     */
    public RawResults createRawResults(){
    	RawResults el = new RawResults();
    	this.rawResults = el;
    	return el;
    }

    /**
     * Creates a new empty {@link Estimation} estimation element, adds it to the current object and returns it.
     * @return The created {@link Estimation} object.
     */
    public Estimation createEstimation(){
    	Estimation el = new Estimation();
    	this.estimation = el;
    	return el;
    }
    
    /**
     * Creates a new empty {@link TaskInformation} taskInformation element, adds it to the current object and returns it.
     * @return The created {@link TaskInformation} object.
     */
    public TaskInformation createTaskInformation(){
            TaskInformation el = new TaskInformation();
            this.taskInformation = el;
            return el;
    }

    /**
     * Creates a new empty {@link ModelDiagnostic} modelDiagnostic element, adds it to the current object and returns it.
     * @return The created {@link ModelDiagnostic} object.
     */
    public ModelDiagnostic createModelDiagnostic(){
            ModelDiagnostic el = new ModelDiagnostic();
            this.modelDiagnostic = el;
            return el;
    }

    /**
     * Creates a new empty {@link Simulation} simulation element, adds it to the current object and returns it.
     * @return The created {@link Simulation} object.
     */
    public Simulation createSimulation(){
            Simulation el = new Simulation();
            this.simulation = el;
            return el;
    }
    
    /**
     * Creates a new empty optimal design, adds it to the current object and returns it.
     * @return The created {@link OptimalDesign} object.
     */
    public OptimalDesign createOptimalDesign(){
    	OptimalDesign od = new OptimalDesign();
    	this.optimalDesign = od;
    	return od;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(toolSettings)
    			.addIfNotNull(rawResults)
    			.addIfNotNull(taskInformation)
    			.addIfNotNull(estimation)
    			.addIfNotNull(modelDiagnostic)
    			.addIfNotNull(simulation)
    			.addIfNotNull(optimalDesign);
    }


}
