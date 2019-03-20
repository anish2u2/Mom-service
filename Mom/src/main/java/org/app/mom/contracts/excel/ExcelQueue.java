package org.app.mom.contracts.excel;

import org.app.mom.contracts.activity.Activity;
import org.workers.contracts.Destroy;

/**
 * This interface will allows method which will allows method to check the data
 * is available and fetch activity stored in this queue.
 * 
 * @author Anish Singh
 *
 */
public interface ExcelQueue extends Destroy {

	/**
	 * This method will return the first activity from the queue.
	 * 
	 * @return
	 */
	public Activity poll();

	/**
	 * This method will tell that the queue is closed or not.
	 * 
	 * @return
	 */
	public boolean isQueueClosed();

}
