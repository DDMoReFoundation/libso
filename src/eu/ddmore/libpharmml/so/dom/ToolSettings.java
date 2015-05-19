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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile.Delimiter;


/**
 * Tool Settings Type
 * 
 * <p>Java class for ToolSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToolSettingsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/pharmml/0.6/CommonTypes}PharmMLRootType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;sequence>
 *           &lt;element name="File" type="{http://www.pharmml.org/pharmml/0.6/Dataset}ExternalFileType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ToolSettingsType", propOrder = {
    "listOfFile"
})
public class ToolSettings
    extends PharmMLRootType
{

    @XmlElement(name = "File")
    protected List<ExternalFile> listOfFile;

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalFile}
     * 
     * 
     */
    public List<ExternalFile> getListOfFile() {
        if (listOfFile == null) {
        	listOfFile = new ArrayList<ExternalFile>();
        }
        return this.listOfFile;
    }
    
    /**
	 * Creates a new empty {@link ExternalFile} object, adds it to this
	 * {@link ToolSettings} element and returns it.
	 * @return The created {@link ExternalFile} object.
	 */
	public ExternalFile createExternalFile(){
		ExternalFile el = new ExternalFile();
		getListOfFile().add(el);
		return el;
	}
	
	/**
	 * Creates a new empty {@link ExternalFile} object, adds it to this
	 * {@link ToolSettings} element and returns it.
	 * @param path Path relative to the SO file.
	 * @param format Format of the file
	 * @param delimiter {@link Delimiter} value.
	 * @param oid Object id for reference.
	 * @return The created {@link ExternalFile} object.
	 */
	public ExternalFile createExternalFile(String path, String format, Delimiter delimiter, String oid){
		ExternalFile el = new ExternalFile();
		el.setPath(path);
		el.setFormat(format);
		el.setDelimiter(delimiter);
		el.setOid(oid);
		getListOfFile().add(el);
		return el;
	}

}
