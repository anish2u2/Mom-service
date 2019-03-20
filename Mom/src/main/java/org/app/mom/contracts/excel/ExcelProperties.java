package org.app.mom.contracts.excel;

import java.util.List;

import org.app.mom.contracts.file.FileProperty;

/**
 * This interface allows method to get set excel properties.
 * 
 * @author Anish Singh
 *
 */
public interface ExcelProperties extends FileProperty {

	/**
	 * This method will set the tab list.
	 * 
	 * @param tabList
	 */
	public void setTabNames(List<String> tabList);

	/**
	 * This method will return list of tab names.
	 * 
	 * @return
	 */
	public List<String> getTabNames();

}
