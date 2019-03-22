package org.app.mom.factory;

import org.app.mom.contracts.service.Service;
import org.app.mom.helper.FileType;

/**
 * This factory class create a service instance for handling service request.
 * 
 * @author Anish Singh
 *
 */
public class ServiceFactory {

	private static ServiceFactory factoryInstance;

	private ServiceFactory() {

	}

	/**
	 * This method will return the instance of ExcelService and it will add all the
	 * necessary behaviour.
	 * 
	 * @return
	 */
	public static Service getSrevice(FileType fileType) {
		if (factoryInstance == null) {
			factoryInstance = new ServiceFactory();
		}

		org.app.mom.service.Service service = new org.app.mom.service.Service();
		service.setFileService(FileServiceFactory.getInstance(fileType));
		return service;
	}

}
