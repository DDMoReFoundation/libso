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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;


/**
 * Type defining the precision individual estimates.
 * 
 * <p>Java class for PrecisionIndividualEstimatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecisionIndividualEstimatesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence>
 *         &lt;element name="PosteriorDistributionIndividualEstimates" type="{http://www.pharmml.org/2013/03/StandardisedOutput}SOTableDistribType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecisionIndividualEstimatesType", propOrder = {
    "posteriorDistributionIndividualEstimates"
})
public class PrecisionIndividualEstimates
    extends PharmMLRootType
{

    @XmlElement(name = "PosteriorDistributionIndividualEstimates")
    protected SOTableDistrib posteriorDistributionIndividualEstimates;

    /**
     * Gets the value of the posteriorDistributionIndividualEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link SOTableDistrib }
     *     
     */
    public SOTableDistrib getPosteriorDistributionIndividualEstimates() {
        return posteriorDistributionIndividualEstimates;
    }

    /**
     * Sets the value of the posteriorDistributionIndividualEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOTableDistrib }
     *     
     */
    public void setPosteriorDistributionIndividualEstimates(SOTableDistrib value) {
        this.posteriorDistributionIndividualEstimates = value;
    }
    
    /**
     * Creates a new empty {@link SOTableDistrib} posteriorDistributionIndividualEstimates element, adds it to the current object and returns it.
     * @return The created {@link SOTableDistrib} object.
     */
    public SOTableDistrib createPosteriorDistributionIndividualEstimates(){
    	SOTableDistrib el = new SOTableDistrib();
    	this.posteriorDistributionIndividualEstimates = el;
    	return el;
    }


}
