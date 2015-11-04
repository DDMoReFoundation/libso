//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.20 at 11:14:40 AM GMT 
//


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
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.so.impl.SOXMLFilter;


/**
 * Type for diagnostic pLots for the structural model
 * 
 * <p>Java class for DiagnosticPlotsStructuralModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticPlotsStructuralModelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="IndivFits" type="{http://www.pharmml.org/so/0.1/StandardisedOutput}IndivFits" minOccurs="0"/&gt;
 *           &lt;element name="IndivPredictionVsObserv" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/&gt;
 *           &lt;element name="VPC" type="{http://www.pharmml.org/pharmml/0.6/Dataset}DataSetType" minOccurs="0"/&gt;
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
@XmlType(name = "DiagnosticPlotsStructuralModelType", propOrder = {
    "indivFitsAndIndivPredictionVsObservsAndVPCS"
})
public class DiagnosticPlotsStructuralModel
    extends PharmMLRootType
{

    @XmlElementRefs({
        @XmlElementRef(name = "IndivPredictionVsObserv", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VPC", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IndivFits", namespace = SOXMLFilter.NS_SO, type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends PharmMLRootType>> indivFitsAndIndivPredictionVsObservsAndVPCS;

    /**
     * Gets the value of the indivFitsAndIndivPredictionVsObservsAndVPCS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indivFitsAndIndivPredictionVsObservsAndVPCS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndivFitsAndIndivPredictionVsObservsAndVPCS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * {@link JAXBElement }{@code <}{@link IndivFits }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PharmMLRootType>> getIndivFitsAndIndivPredictionVsObservsAndVPCS() {
        if (indivFitsAndIndivPredictionVsObservsAndVPCS == null) {
            indivFitsAndIndivPredictionVsObservsAndVPCS = new ArrayList<JAXBElement<? extends PharmMLRootType>>();
        }
        return this.indivFitsAndIndivPredictionVsObservsAndVPCS;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	List<TreeNode> list = new ArrayList<TreeNode>(super.listChildren());
    	for(JAXBElement<? extends PharmMLRootType> jaxbEl : getIndivFitsAndIndivPredictionVsObservsAndVPCS()){
    		list.add(jaxbEl.getValue());
    	}
    	return list;
    }

}
