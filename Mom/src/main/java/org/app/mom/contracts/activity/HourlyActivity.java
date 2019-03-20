package org.app.mom.contracts.activity;

/**
 * This interface will method to set or get Hourly activity.
 * 
 * @author Anish Singh
 *
 */
public interface HourlyActivity extends Activity{

	/**
	 * Returns activity hours.
	 * 
	 * @return
	 */
	public Double getActivityHours();

	/**
	 * This method will set the activity hour.
	 * 
	 * @param hour
	 */
	public void setActivityHours(Double hour);

}
