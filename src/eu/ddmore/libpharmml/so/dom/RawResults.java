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

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.util.ChainedList;


/**
 * Row Results Type
 * 
 * <p>Java class for RawResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawResultsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.8/CommonTypes}PharmMLRootType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;sequence>
 *           &lt;element name="DataFile" type="{http://www.pharmml.org/pharmml/0.8/Dataset}DataSet" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="GraphicsFile" type="{http://www.pharmml.org/pharmml/0.8/Dataset}ExternalFile" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RawResultsType", propOrder = {
    "dataFileAndGraphicsFile"
})
public class RawResults
    extends PharmMLRootType
{

    @XmlElements({
        @XmlElement(name = "DataFile", type = DataSet.class),
        @XmlElement(name = "GraphicsFile", type = ExternalFile.class)
    })
    protected List<PharmMLRootType> dataFileAndGraphicsFile;

    /**
     * Gets the value of the dataFileAndGraphicsFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFileAndGraphicsFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFileAndGraphicsFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSet }
     * {@link ExternalFile }
     * 
     * 
     */
    public List<PharmMLRootType> getDataFileAndGraphicsFile() {
        if (dataFileAndGraphicsFile == null) {
            dataFileAndGraphicsFile = new ArrayList<PharmMLRootType>();
        }
        return this.dataFileAndGraphicsFile;
    }
    
    @Override
    protected List<TreeNode> listChildren() {
    	return new ChainedList<TreeNode>(super.listChildren())
    			.addIfNotNull(dataFileAndGraphicsFile);
    }
    
    public DataSet createDataFile(){
    	DataSet ds = MasterObjectFactory.DATASET_OF.createDataSetType();
    	getDataFileAndGraphicsFile().add(ds);
    	return ds;
    }
    
    public ExternalFile createGraphicsFile(){
    	ExternalFile ef = new ExternalFile();
    	getDataFileAndGraphicsFile().add(ef);
    	return ef;
    }
    
    public ExternalFile createGraphicsFile(String oid,String path,String format,String delimiter){
    	ExternalFile ef = new ExternalFile(oid, path, format, delimiter);
    	getDataFileAndGraphicsFile().add(ef);
    	return ef;
    }

}
