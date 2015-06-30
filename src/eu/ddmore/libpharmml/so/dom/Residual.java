package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;
import eu.ddmore.libpharmml.dom.dataset.DataSet;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidualType", propOrder = {
    "residualTable",
    "epsShrinkage"
})
public class Residual extends PharmMLRootType {
	
	@XmlElement(name = "ResidualTable")
	protected DataSet residualTable;
	
	@XmlElement(name = "EpsShrinkage")
	protected DataSet epsShrinkage;

	public DataSet getResidualTable() {
		return residualTable;
	}

	public void setResidualTable(DataSet residualTable) {
		this.residualTable = residualTable;
	}

	public DataSet getEpsShrinkage() {
		return epsShrinkage;
	}

	public void setEpsShrinkage(DataSet epsShrinkage) {
		this.epsShrinkage = epsShrinkage;
	}
	
	/**
	 * Creates a new empty residual table, adds it to this
	 * {@link Residual} element and returns it.
	 * @return The created {@link Dataset} object.
	 */
	public DataSet createResidualTable(){
		DataSet el = new DataSet();
		residualTable = el;
		return el;
	}
	
	/**
	 * Creates a new empty Eps Shrinkage element, adds it to this
	 * {@link Residual} element and returns it.
	 * @return The created {@link Dataset} object.
	 */
	public DataSet createEpsShrinkage(){
		DataSet el = new DataSet();
		epsShrinkage = el;
		return el;
	}

}
