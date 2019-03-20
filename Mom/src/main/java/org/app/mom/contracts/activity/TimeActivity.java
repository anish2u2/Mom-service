package org.app.mom.contracts.activity;

import java.util.Date;

/**
 * 
 * This interface allows you method for getting and setting Activity and
 * Timestamp.
 * 
 * @author Anish Singh
 *
 */
public interface TimeActivity {

	/**
	 * This method will return date time fo activity.
	 * 
	 * @return
	 */
	public Date getActivityTime();

	/**
	 * This method will return Activity.
	 * 
	 * @return
	 */
	public Activity getActivity();

	/**
	 * This method will set the activity.
	 * 
	 * @param activity
	 */
	public void setActivity(Activity activity);

	/**
	 * This method will set the Activity time.
	 * 
	 * @param time
	 */
	public void setActivityTime(Date time);

	/**
	 * This method will set the activity duration, till how much hour the activity
	 * will be alive.
	 * 
	 * @param duration
	 */
	public void setActivityDuration(Long duration);

	/**
	 * This method will return the duration of the activity.
	 * 
	 * @return
	 */
	public Long getDuration();
}
