//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.16 at 04:24:00 PM BST 
//


package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSetType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractContinuousMultivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractContinuousUnivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.BetaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.CauchyDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ChiSquareDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ContinuousMultivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.ContinuousUnivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.DiracDeltaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.DirichletDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ExponentialDistribution;
import eu.ddmore.libpharmml.dom.uncertml.FDistribution;
import eu.ddmore.libpharmml.dom.uncertml.GammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.InverseGammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LaplaceDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LogNormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LogisticDistribution;
import eu.ddmore.libpharmml.dom.uncertml.MultivariateNormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.MultivariateStudentTDistribution;
import eu.ddmore.libpharmml.dom.uncertml.NormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.NormalInverseGammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ParetoDistribution;
import eu.ddmore.libpharmml.dom.uncertml.StudentTDistribution;
import eu.ddmore.libpharmml.dom.uncertml.UniformDistribution;
import eu.ddmore.libpharmml.dom.uncertml.WeibullDistribution;


/**
 * Type defining distribution of the estimation results.
 * 
 * <p>Java class for SOTableDistribType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOTableDistribType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.uncertml.org/3.0}AbstractContinuousUnivariateDistribution"/>
 *         &lt;element ref="{http://www.uncertml.org/3.0}AbstractContinuousMultivariateDistribution"/>
 *         &lt;element name="DataSet" type="{http://www.pharmml.org/2013/08/Dataset}DataSetType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOTableDistribType", propOrder = {
    "jaxb_abstractContinuousUnivariateDistribution",
    "jaxb_abstractContinuousMultivariateDistribution",
    "dataSet"
})
@XmlJavaTypeAdapter(SOTableDistrib.Adapter.class)
public class SOTableDistrib
    extends PharmMLRootType
{

    @XmlElementRef(name = "AbstractContinuousUnivariateDistribution", namespace = "http://www.uncertml.org/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractContinuousUnivariateDistributionType> jaxb_abstractContinuousUnivariateDistribution;
    @XmlElementRef(name = "AbstractContinuousMultivariateDistribution", namespace = "http://www.uncertml.org/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractContinuousMultivariateDistributionType> jaxb_abstractContinuousMultivariateDistribution;
    @XmlElement(name = "DataSet")
    protected DataSetType dataSet;
    
    @XmlTransient
    protected AbstractDistributionType distribution;
    
    protected static class Adapter extends XmlAdapter<SOTableDistrib, SOTableDistrib>{

		@Override
		public SOTableDistrib unmarshal(SOTableDistrib v) throws Exception {
			if(v.jaxb_abstractContinuousUnivariateDistribution != null){
				v.distribution = v.jaxb_abstractContinuousUnivariateDistribution.getValue();
			} else if(v.jaxb_abstractContinuousMultivariateDistribution != null){
				v.distribution = v.jaxb_abstractContinuousMultivariateDistribution.getValue();
			}
			return v;
		}

		@Override
		public SOTableDistrib marshal(SOTableDistrib v) throws Exception {
			if(v != null){
				if(v.distribution != null){
					if(v.distribution instanceof AbstractContinuousUnivariateDistributionType){
						v.jaxb_abstractContinuousUnivariateDistribution = 
								SOObjectFactory.createContinuousUnivariateDistribution((AbstractContinuousUnivariateDistributionType) v.distribution);
						v.jaxb_abstractContinuousMultivariateDistribution = null;
					} else if(v.distribution instanceof AbstractContinuousMultivariateDistributionType){
						v.jaxb_abstractContinuousUnivariateDistribution = null;
						v.jaxb_abstractContinuousMultivariateDistribution = 
								SOObjectFactory.createContinuousMultivariateDistributionType((AbstractContinuousMultivariateDistributionType) v.distribution);
					}
				}
			}
			return v;
		}
    	
    }

    /**
     * 
     *                                 A continuous univariate probability distribution, defined by UncertML. 
     *                             
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiracDeltaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExponentialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParetoDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaplaceDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link InverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BetaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link UniformDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChiSquareDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeibullDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogisticDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CauchyDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link FDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link GammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudentTDistribution }{@code >}
     *     
     */
//    public JAXBElement<? extends AbstractContinuousUnivariateDistributionType> getAbstractContinuousUnivariateDistribution() {
//        return abstractContinuousUnivariateDistribution;
//    }

    /**
     * Sets the value of the abstractContinuousUnivariateDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiracDeltaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExponentialDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParetoDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link LaplaceDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link InverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link BetaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link UniformDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChiSquareDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeibullDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousUnivariateDistributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogisticDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link CauchyDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link FDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousUnivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link GammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudentTDistribution }{@code >}
     *     
     */
//    public void setAbstractContinuousUnivariateDistribution(JAXBElement<? extends AbstractContinuousUnivariateDistributionType> value) {
//        this.abstractContinuousUnivariateDistribution = value;
//    }

    /**
     * 
     *                                 A continuous multivariate probability distribution, defined by UncertML. 
     *                             
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NormalInverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateStudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirichletDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousMultivariateDistributionType }{@code >}
     *     
     */
//    public JAXBElement<? extends AbstractContinuousMultivariateDistributionType> getAbstractContinuousMultivariateDistribution() {
//        return abstractContinuousMultivariateDistribution;
//    }

    /**
     * Sets the value of the abstractContinuousMultivariateDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NormalInverseGammaDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateStudentTDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContinuousMultivariateMixtureModel }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirichletDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultivariateNormalDistribution }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousMultivariateDistributionType }{@code >}
     *     
     */
//    public void setAbstractContinuousMultivariateDistribution(JAXBElement<? extends AbstractContinuousMultivariateDistributionType> value) {
//        this.abstractContinuousMultivariateDistribution = value;
//    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetType }
     *     
     */
    public DataSetType getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetType }
     *     
     */
    public void setDataSet(DataSetType value) {
        this.dataSet = value;
    }
    
    /**
     * 
     * @return
     *     possible object is
     *     {@link DiracDeltaDistribution }
     *     {@link ExponentialDistribution }
     *     {@link ParetoDistribution }
     *     {@link LogNormalDistribution }
     *     {@link LaplaceDistribution }
     *     {@link InverseGammaDistribution }
     *     {@link BetaDistribution }
     *     {@link UniformDistribution }
     *     {@link NormalDistribution }
     *     {@link ChiSquareDistribution }
     *     {@link WeibullDistribution }
     *     {@link LogisticDistribution }
     *     {@link CauchyDistribution }
     *     {@link FDistribution }
     *     {@link ContinuousUnivariateMixtureModel }
     *     {@link GammaDistribution }
     *     {@link StudentTDistribution }
     *     {@link NormalInverseGammaDistribution }
     *     {@link MultivariateStudentTDistribution }
     *     {@link ContinuousMultivariateMixtureModel }
     *     {@link DirichletDistribution }
     *     {@link MultivariateNormalDistribution }
     */
    public AbstractDistributionType getDistribution(){
    	return distribution;
    }
    public void setDistribution(StudentTDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(WeibullDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(DiracDeltaDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(FDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(ContinuousUnivariateMixtureModel distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(LaplaceDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(UniformDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(CauchyDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(ChiSquareDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(NormalDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(InverseGammaDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(LogNormalDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(BetaDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(ParetoDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(ExponentialDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(LogisticDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(GammaDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(NormalInverseGammaDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(ContinuousMultivariateMixtureModel distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(MultivariateNormalDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(MultivariateStudentTDistribution distribution){
    	this.distribution = distribution;
    }
    public void setDistribution(DirichletDistribution distribution){
    	this.distribution = distribution;
    }
    
    /**
    * Creates a new {@link DiracDeltaDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                      
    */                                                                                                   
    public DiracDeltaDistribution createDiracDeltaDistribution(){                                        
        DiracDeltaDistribution distrib = new DiracDeltaDistribution();                                   
        setDistribution(distrib);                                                                        
        return distrib;                                                                                  
    }                                                                                                    

    /**
    * Creates a new {@link ExponentialDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                       
    */                                                                                                    
    public ExponentialDistribution createExponentialDistribution(){                                       
        ExponentialDistribution distrib = new ExponentialDistribution();                                  
        setDistribution(distrib);                                                                         
        return distrib;                                                                                   
    }                                                                                                     

    /**
    * Creates a new {@link ParetoDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                  
    */                                                                                               
    public ParetoDistribution createParetoDistribution(){                                            
        ParetoDistribution distrib = new ParetoDistribution();                                       
        setDistribution(distrib);                                                                    
        return distrib;                                                                              
    }                                                                                                

    /**
    * Creates a new {@link LogNormalDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                     
    */                                                                                                  
    public LogNormalDistribution createLogNormalDistribution(){                                         
        LogNormalDistribution distrib = new LogNormalDistribution();                                    
        setDistribution(distrib);                                                                       
        return distrib;                                                                                 
    }                                                                                                   

    /**
    * Creates a new {@link LaplaceDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                   
    */                                                                                                
    public LaplaceDistribution createLaplaceDistribution(){                                           
        LaplaceDistribution distrib = new LaplaceDistribution();                                      
        setDistribution(distrib);                                                                     
        return distrib;                                                                               
    }                                                                                                 

    /**
    * Creates a new {@link InverseGammaDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                        
    */                                                                                                     
    public InverseGammaDistribution createInverseGammaDistribution(){                                      
        InverseGammaDistribution distrib = new InverseGammaDistribution();                                 
        setDistribution(distrib);                                                                          
        return distrib;                                                                                    
    }                                                                                                      

    /**
    * Creates a new {@link BetaDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                
    */                                                                                             
    public BetaDistribution createBetaDistribution(){                                              
        BetaDistribution distrib = new BetaDistribution();                                         
        setDistribution(distrib);                                                                  
        return distrib;                                                                            
    }                                                                                              

    /**
    * Creates a new {@link UniformDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                   
    */                                                                                                
    public UniformDistribution createUniformDistribution(){                                           
        UniformDistribution distrib = new UniformDistribution();                                      
        setDistribution(distrib);                                                                     
        return distrib;                                                                               
    }                                                                                                 

    /**
    * Creates a new {@link NormalDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                  
    */                                                                                               
    public NormalDistribution createNormalDistribution(){                                            
        NormalDistribution distrib = new NormalDistribution();                                       
        setDistribution(distrib);                                                                    
        return distrib;                                                                              
    }                                                                                                

    /**
    * Creates a new {@link ChiSquareDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                     
    */                                                                                                  
    public ChiSquareDistribution createChiSquareDistribution(){                                         
        ChiSquareDistribution distrib = new ChiSquareDistribution();                                    
        setDistribution(distrib);                                                                       
        return distrib;                                                                                 
    }                                                                                                   

    /**
    * Creates a new {@link WeibullDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                   
    */                                                                                                
    public WeibullDistribution createWeibullDistribution(){                                           
        WeibullDistribution distrib = new WeibullDistribution();                                      
        setDistribution(distrib);                                                                     
        return distrib;                                                                               
    }                                                                                                 

    /**
    * Creates a new {@link LogisticDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                    
    */                                                                                                 
    public LogisticDistribution createLogisticDistribution(){                                          
        LogisticDistribution distrib = new LogisticDistribution();                                     
        setDistribution(distrib);                                                                      
        return distrib;                                                                                
    }                                                                                                  

    /**
    * Creates a new {@link CauchyDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                  
    */                                                                                               
    public CauchyDistribution createCauchyDistribution(){                                            
        CauchyDistribution distrib = new CauchyDistribution();                                       
        setDistribution(distrib);                                                                    
        return distrib;                                                                              
    }                                                                                                

    /**
    * Creates a new {@link FDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                             
    */                                                                                          
    public FDistribution createFDistribution(){                                                 
        FDistribution distrib = new FDistribution();                                            
        setDistribution(distrib);                                                               
        return distrib;                                                                         
    }                                                                                           

    /**
    * Creates a new {@link ContinuousUnivariateMixtureModel} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                                
    */                                                                                                             
    public ContinuousUnivariateMixtureModel createContinuousUnivariateMixtureModel(){                              
        ContinuousUnivariateMixtureModel distrib = new ContinuousUnivariateMixtureModel();                         
        setDistribution(distrib);                                                                                  
        return distrib;                                                                                            
    }                                                                                                              

    /**
    * Creates a new {@link GammaDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                 
    */                                                                                              
    public GammaDistribution createGammaDistribution(){                                             
        GammaDistribution distrib = new GammaDistribution();                                        
        setDistribution(distrib);                                                                   
        return distrib;                                                                             
    }                                                                                               

    /**
    * Creates a new {@link StudentTDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.                                                                    
    */                                                                                                 
    public StudentTDistribution createStudentTDistribution(){                                          
        StudentTDistribution distrib = new StudentTDistribution();                                     
        setDistribution(distrib);                                                                      
        return distrib;                                                                                
    }                                                                                                  

    /**
    * Creates a new {@link NormalInverseGammaDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.
    */
    public NormalInverseGammaDistribution createNormalInverseGammaDistribution(){
        NormalInverseGammaDistribution distrib = new NormalInverseGammaDistribution();
        setDistribution(distrib);
        return distrib;
    }

    /**
    * Creates a new {@link MultivariateStudentTDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.
    */
    public MultivariateStudentTDistribution createMultivariateStudentTDistribution(){
        MultivariateStudentTDistribution distrib = new MultivariateStudentTDistribution();
        setDistribution(distrib);
        return distrib;
    }

    /**
    * Creates a new {@link ContinuousMultivariateMixtureModel} element, adds it to the current object and returns it.
    * @return The new distribution.
    */
    public ContinuousMultivariateMixtureModel createContinuousMultivariateMixtureModel(){
        ContinuousMultivariateMixtureModel distrib = new ContinuousMultivariateMixtureModel();
        setDistribution(distrib);
        return distrib;
    }

    /**
    * Creates a new {@link DirichletDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.
    */
    public DirichletDistribution createDirichletDistribution(){
        DirichletDistribution distrib = new DirichletDistribution();
        setDistribution(distrib);
        return distrib;
    }

    /**
    * Creates a new {@link MultivariateNormalDistribution} element, adds it to the current object and returns it.
    * @return The new distribution.
    */
    public MultivariateNormalDistribution createMultivariateNormalDistribution(){
        MultivariateNormalDistribution distrib = new MultivariateNormalDistribution();
        setDistribution(distrib);
        return distrib;
    }


}
