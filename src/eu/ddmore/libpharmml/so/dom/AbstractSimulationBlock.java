package eu.ddmore.libpharmml.so.dom;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;

@XmlTransient
public abstract class AbstractSimulationBlock extends PharmMLRootType {

    @XmlElement(name = "RawResultsFile")
    protected ExternalFile rawResultsFile;
    
    @XmlElement(name = "SimulatedProfiles")
    protected List<SimulationItem> listOfSimulatedProfiles;
    @XmlElement(name = "IndivParameters")
    protected List<SimulationItem> listOfIndivParameters;
    @XmlElement(name = "RandomEffects")
    protected List<SimulationItem> listOfRandomEffects;
    @XmlElement(name = "Covariates")
    protected List<SimulationItem> listOfCovariates;
    @XmlElement(name = "PopulationParameters")
    protected List<SimulationItem> listOfPopulationParameters;
    @XmlElement(name = "Dosing")
    protected List<SimulationItem> listOfDosing;
    
    /**
     * Gets the value of the rawResultsFile property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFile }
     *     
     */
    public ExternalFile getRawResultsFile() {
        return rawResultsFile;
    }

    /**
     * Sets the value of the rawResultsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFile }
     *     
     */
    public void setRawResultsFile(ExternalFile value) {
        this.rawResultsFile = value;
    }
    
    /**
     * Gets the value of the simulatedProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simulatedProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimulatedProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfSimulatedProfiles() {
        if (listOfSimulatedProfiles == null) {
        	listOfSimulatedProfiles = new ArrayList<SimulationItem>();
        }
        return this.listOfSimulatedProfiles;
    }
    
    /**
     * Gets the value of the indivParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indivParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndivParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfIndivParameters() {
        if (listOfIndivParameters == null) {
        	listOfIndivParameters = new ArrayList<SimulationItem>();
        }
        return this.listOfIndivParameters;
    }

    /**
     * Gets the value of the randomEffects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the randomEffects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRandomEffects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfRandomEffects() {
        if (listOfRandomEffects == null) {
        	listOfRandomEffects = new ArrayList<SimulationItem>();
        }
        return this.listOfRandomEffects;
    }

    /**
     * Gets the value of the covariates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the covariates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCovariates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfCovariates() {
        if (listOfCovariates == null) {
        	listOfCovariates = new ArrayList<SimulationItem>();
        }
        return this.listOfCovariates;
    }

    /**
     * Gets the value of the populationParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the populationParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopulationParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfPopulationParameters() {
        if (listOfPopulationParameters == null) {
        	listOfPopulationParameters = new ArrayList<SimulationItem>();
        }
        return this.listOfPopulationParameters;
    }

    /**
     * Gets the value of the dosing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimulationItem }
     * 
     * 
     */
    public List<SimulationItem> getListOfDosing() {
        if (listOfDosing == null) {
        	listOfDosing = new ArrayList<SimulationItem>();
        }
        return this.listOfDosing;
    }
    
    /**                                                              
     * Creates a new empty {@link SimulationItem} simulatedProfiles element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.                                                                 
     */                                                                                                            
    public SimulationItem createSimulatedProfiles(){                                                                      
    	SimulationItem el = new SimulationItem();                                                                            
        getListOfSimulatedProfiles().add(el);                                                                          
        return el;                                                                                             
    }                                                                                                              

    /**
     * Creates a new empty {@link SimulationItem} indivParameters element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.                                                               
     */                                                                                                          
    public SimulationItem createIndivParameters(){                                                                      
    	SimulationItem el = new SimulationItem();                                                                          
        getListOfIndivParameters().add(el);                                                                           
        return el;                                                                                           
    }

    /**
     * Creates a new empty {@link SimulationItem} randomEffects element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createRandomEffects(){
    	SimulationItem el = new SimulationItem();
        getListOfRandomEffects().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link SimulationItem} covariates element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createCovariates(){
    	SimulationItem el = new SimulationItem();
        getListOfCovariates().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link SimulationItem} populationParameters element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createPopulationParameters(){
    	SimulationItem el = new SimulationItem();
        getListOfPopulationParameters().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link SimulationItem} dosing element, adds it to the current object and returns it.
     * @return The created {@link SimulationItem} object.
     */
    public SimulationItem createDosing(){
    	SimulationItem el = new SimulationItem();
        getListOfDosing().add(el);
        return el;
    }

    /**
     * Creates a new empty {@link ExternalFile} rawResultsFile element, adds it to the current object and returns it.
     * @return The created {@link ExternalFile} object.
     */
    public ExternalFile createRawResultsFile(){
            ExternalFile el = new ExternalFile();
            this.rawResultsFile = el;
            return el;
    }
    
}
