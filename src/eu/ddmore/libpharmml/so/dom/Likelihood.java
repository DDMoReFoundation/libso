//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.17 at 04:00:02 PM BST 
//


package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.commontypes.RealValueType;
import eu.ddmore.libpharmml.dom.dataset.DataSetType;


/**
 * Type defining the likelihood.
 * 
 * <p>Java class for LikelihoodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LikelihoodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="LogLikelihood" type="{http://www.pharmml.org/2013/03/CommonTypes}RealValueType" minOccurs="0"/>
 *         &lt;element name="Deviance" type="{http://www.pharmml.org/2013/03/CommonTypes}RealValueType" minOccurs="0"/>
 *         &lt;element name="OFV" type="{http://www.pharmml.org/2013/03/CommonTypes}RealValueType" minOccurs="0"/>
 *         &lt;element name="IndividualContribToLL" type="{http://www.pharmml.org/2013/08/Dataset}DataSetType" minOccurs="0"/>
 *         &lt;element name="InformationCriteria" type="{http://www.pharmml.org/2013/03/StandardisedOutput}InformationCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LikelihoodType", propOrder = {
    "logLikelihood",
    "deviance",
    "individualContribToLL",
    "informationCriteria"
})
public class Likelihood
    extends PharmMLRootType
{

    @XmlElement(name = "LogLikelihood")
    protected RealValueType logLikelihood;
    @XmlElement(name = "Deviance")
    protected RealValueType deviance;
    @XmlElement(name = "IndividualContribToLL")
    protected DataSetType individualContribToLL;
    @XmlElement(name = "InformationCriteria")
    protected InformationCriteria informationCriteria;

    /**
     * Gets the value of the logLikelihood property.
     * 
     * @return
     *     possible object is
     *     {@link RealValueType }
     *     
     */
    public RealValueType getLogLikelihood() {
        return logLikelihood;
    }

    /**
     * Sets the value of the logLikelihood property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealValueType }
     *     
     */
    public void setLogLikelihood(RealValueType value) {
        this.logLikelihood = value;
    }

    /**
     * Gets the value of the deviance property.
     * 
     * @return
     *     possible object is
     *     {@link RealValueType }
     *     
     */
    public RealValueType getDeviance() {
        return deviance;
    }

    /**
     * Sets the value of the deviance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealValueType }
     *     
     */
    public void setDeviance(RealValueType value) {
        this.deviance = value;
    }

    /**
     * Gets the value of the individualContribToLL property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetType }
     *     
     */
    public DataSetType getIndividualContribToLL() {
        return individualContribToLL;
    }

    /**
     * Sets the value of the individualContribToLL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetType }
     *     
     */
    public void setIndividualContribToLL(DataSetType value) {
        this.individualContribToLL = value;
    }

    /**
     * Gets the value of the informationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link InformationCriteriaType }
     *     
     */
    public InformationCriteria getInformationCriteria() {
        return informationCriteria;
    }

    /**
     * Sets the value of the informationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationCriteriaType }
     *     
     */
    public void setInformationCriteria(InformationCriteria value) {
        this.informationCriteria = value;
    }

}
