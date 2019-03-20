package org.app.mom.contracts.file;

import java.util.Map;

/**
 * This interface is a naming interface which allows to read or set file
 * property.
 * 
 * @author Anish Singh
 *
 */
public interface FileProperty {

	/**
	 * This method will set the properties of excel other than tab name.
	 * 
	 * @param props
	 */
	public void setProperties(Map<String, Object> props);

	/**
	 * THis method will return properties other than tabs name.
	 * 
	 * @return
	 */
	public Map<String, Object> getProperties();

}
