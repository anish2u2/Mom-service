package org.app.mom.imple.excel;

import java.util.Queue;

import org.app.mom.contracts.activity.Activity;
import org.app.mom.contracts.excel.ExcelQueue;
import org.pattern.design.contracts.signal.Signal;

public class ExcelQueueImple implements ExcelQueue {

	private Queue<Activity> activityQueue;

	private Signal indicator;

	@Override
	public Activity poll() {

		return activityQueue.poll();
	}

	@Override
	public boolean isQueueClosed() {

		return indicator.getSignal();
	}

	public void setActivityQueue(Queue<Activity> activitQueue) {
		this.activityQueue = activitQueue;
	}

	public void setIndicator(Signal signal) {
		this.indicator = signal;
	}

	@Override
	public void destroy() {
		this.activityQueue = null;
		this.indicator = null;
	}

	@Override
	public void push(Object activity) {
		this.activityQueue.add((Activity) activity);
	}

	@Override
	public void onQueue() {
		indicator.on();
	}

	@Override
	public void closeQueue() {
		indicator.off();
	}

	@Override
	public boolean isEmpty() {
		return activityQueue.isEmpty();
	}
}
