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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Type for the model diagnostic
 * 
 * <p>Java class for ModelDiagnosticType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelDiagnosticType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;sequence>
 *           &lt;element name="DiagnosticStructuralModel" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}DiagnosticStructuralModelType" minOccurs="0"/>
 *           &lt;element name="DiagnosticIndividualParams" type="{http://www.pharmml.org/so/0.3/StandardisedOutput}DiagnosticIndividualParamsType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelDiagnosticType", propOrder = {
    "diagnosticStructuralModelAndDiagnosticIndividualParams"
})
public class ModelDiagnostic
    extends PharmMLRootType
{

    @XmlElements({
        @XmlElement(name = "DiagnosticStructuralModel", type = DiagnosticStructuralModel.class),
        @XmlElement(name = "DiagnosticIndividualParams", type = DiagnosticIndividualParams.class)
    })
    protected List<PharmMLRootType> diagnosticStructuralModelAndDiagnosticIndividualParams;

    /**
     * Gets the value of the diagnosticStructuralModelAndDiagnosticIndividualParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticStructuralModelAndDiagnosticIndividualParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticStructuralModelAndDiagnosticIndividualParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticStructuralModel }
     * {@link DiagnosticIndividualParams }
     * 
     * 
     */
    public List<PharmMLRootType> getDiagnosticStructuralModelAndDiagnosticIndividualParams() {
        if (diagnosticStructuralModelAndDiagnosticIndividualParams == null) {
            diagnosticStructuralModelAndDiagnosticIndividualParams = new ArrayList<PharmMLRootType>();
        }
        return this.diagnosticStructuralModelAndDiagnosticIndividualParams;
    }
    
    public DiagnosticStructuralModel createDiagnosticStructuralModel(){
    	DiagnosticStructuralModel dsm = ObjectFactory.getInstance().createDiagnosticStructuralModel();
    	getDiagnosticStructuralModelAndDiagnosticIndividualParams().add(dsm);
    	return dsm;
    }
    
    public DiagnosticIndividualParams createDiagnosticIndividualParams(){
    	DiagnosticIndividualParams dip = ObjectFactory.getInstance().createDiagnosticIndividualParams();
    	getDiagnosticStructuralModelAndDiagnosticIndividualParams().add(dip);
    	return dip;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(diagnosticStructuralModelAndDiagnosticIndividualParams);
    }

}
