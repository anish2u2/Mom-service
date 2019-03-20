package org.app.mom.factory;

import java.util.Queue;

import org.app.mom.contracts.activity.Activity;
import org.app.mom.contracts.excel.ExcelQueue;
import org.app.mom.contracts.text.TextQueue;
import org.app.mom.imple.excel.ExcelQueueImple;
import org.app.mom.imple.text.TextQueueImple;
import org.pattern.design.contracts.signal.Signal;

/**
 * This class is factory class for Excel Queue.
 * 
 * @author Anish Singh
 *
 */
public class QueueFactory {

	/**
	 * This method will return the instance of Excel Queue.
	 * 
	 * @param activityQueue
	 * @param signal
	 * @return
	 */
	public static ExcelQueue getExcelQueue(Queue<Activity> activityQueue, Signal signal) {
		ExcelQueueImple excelQueue = new ExcelQueueImple();
		excelQueue.setActivityQueue(activityQueue);
		excelQueue.setIndicator(signal);
		return excelQueue;
	}

	public static TextQueue getTextQueue(Queue<Activity> activities, Signal signal) {
		TextQueueImple queue = new TextQueueImple();
		queue.setActivityQueue(activities);
		queue.setIndicator(signal);
		return queue;
	}
}
