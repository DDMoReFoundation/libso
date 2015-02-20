package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;

@XmlTransient
public abstract class AbstractSOBlock extends PharmMLRootType {
	
	@XmlElement(name = "ToolSettings")
    protected ExternalFile toolSettings;
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
    
    /**
     * Gets the value of the toolSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFile }
     *     
     */
    public ExternalFile getToolSettings() {
        return toolSettings;
    }

    /**
     * Sets the value of the toolSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFile }
     *     
     */
    public void setToolSettings(ExternalFile value) {
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
     *     {@link EstimationType }
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
     * Creates a new empty {@link ExternalFile} toolSettings element, adds it to the current object and returns it.
     * @return The created {@link ExternalFile} object.
     */
    public ExternalFile createToolSettings(){
    	ExternalFile el = new ExternalFile();
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

}
