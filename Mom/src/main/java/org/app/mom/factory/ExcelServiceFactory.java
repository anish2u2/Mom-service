package org.app.mom.factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.app.mom.contracts.activity.Activity;
import org.app.mom.contracts.excel.ExcelQueue;
import org.app.mom.contracts.service.ExcelService;
import org.pattern.design.impl.siganl.SignalFactory;

/**
 * This factory class create a service instance for handling service request.
 * 
 * @author Anish Singh
 *
 */
public class ExcelServiceFactory {

	private List<ExcelQueue> listOfExcelQueue;

	private static ExcelServiceFactory factoryInstance;

	private ExcelServiceFactory() {
		listOfExcelQueue = new LinkedList<ExcelQueue>();
	}

	public static ExcelService getSrevice() {
		if (factoryInstance == null) {
			factoryInstance = new ExcelServiceFactory();
		}
		ExcelQueue queue = ExcelQueueFactory.getExcelQueue(factoryInstance.createQueue(),
				SignalFactory.getSignalInstance());
		factoryInstance.addExcelQueue(queue);
		org.app.mom.service.ExcelService excelService = new org.app.mom.service.ExcelService();
		excelService.setExcelQueue(queue);
		return excelService;
	}

	public Queue<Activity> createQueue() {
		return new LinkedList<Activity>();
	}

	public void addExcelQueue(ExcelQueue excelQueue) {
		this.listOfExcelQueue.add(excelQueue);
	}

}
