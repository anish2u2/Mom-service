package org.app.mom.contracts.activity;

import java.util.Date;

/**
 * This interface allows method to get/set day activity.
 * 
 * @author Anish Singh
 *
 */
public interface DayActivity extends Activity {

	/**
	 * This method will return Date for the day activity.
	 * 
	 * @return
	 */
	public Date getDate();

	/**
	 * This method will return the day name for the day activity.
	 * 
	 * @return
	 */
	public String getDay();

	/**
	 * This method will set the data.
	 * 
	 * @param date
	 */
	public void setDate(Date date);

	/**
	 * This method will set the day for the day activity.
	 * 
	 * @param day
	 */
	public void setDay(String day);

}
