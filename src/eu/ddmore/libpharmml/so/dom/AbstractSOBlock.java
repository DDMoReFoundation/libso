package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;

@XmlTransient
public abstract class AbstractSOBlock extends PharmMLRootType {
	
	// Mapped attributes
	// Be sure to add the attributes to the propOrder in the inheriting class
	
//	@XmlElement(name = "ToolSettings")
//    protected ExternalFile deprec_toolSettings;
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

}
