package org.app.mom.contracts.structure;

import org.app.mom.contracts.activity.Activity;

/**
 * This interface is a naming interface .
 * 
 * @author Anish Singh
 *
 */
public interface Queue {

	/**
	 * This method will return the first activity from the queue.
	 * 
	 * @return
	 */
	public Activity poll();

	/**
	 * This method will push the activity to the queue.
	 * 
	 * @param activity
	 */
	public void push(Object activity);

	/**
	 * This method will tell that the queue is closed or not.
	 * 
	 * @return
	 */
	public boolean isQueueClosed();

	/**
	 * This method will on the queue to available.
	 */
	public void onQueue();

	/**
	 * this method will off the queue so not available.
	 */
	public void closeQueue();

}
