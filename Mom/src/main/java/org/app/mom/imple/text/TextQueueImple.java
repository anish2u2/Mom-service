package org.app.mom.imple.text;

import java.util.Queue;

import org.app.mom.contracts.activity.Activity;
import org.app.mom.contracts.text.TextQueue;
import org.app.mom.factory.ActivityFactory;
import org.pattern.design.contracts.signal.Signal;

public class TextQueueImple implements TextQueue {

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
		this.activityQueue.add(ActivityFactory.instantiateActivity(activity.toString()));
	}

	@Override
	public void onQueue() {
		indicator.on();
	}

	@Override
	public void closeQueue() {
		indicator.off();
	}
}
