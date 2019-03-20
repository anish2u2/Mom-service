package org.app.mom.factory;

import org.app.mom.contracts.activity.Activity;
import org.app.mom.contracts.activity.HourlyActivity;

/**
 * This class will be used as a activity factory to instantiate activity data.
 * 
 * @author Anish Singh
 *
 */
public class ActivityFactory {

	/**
	 * This method will work on the data and determine the type of activity.
	 * 
	 * @param data
	 * @return
	 */
	public static Activity instantiateActivity(String data) {
		String[] activityData = data.split(";");
		if (activityData[0].contains("Activity")) {
			String[] activityType = activityData[0].split(":");
			if ("Hourly".equals(activityType[1].trim())) {
				return getHourlyActivity(activityData);
			}
		}
		return null;
	}

	private static Activity getHourlyActivity(String[] activityData) {

		HourlyActivity activity = getHourlyActivityInstance();

		for (String data : activityData) {
			String value = data.split(":")[1].trim();
			if (data.startsWith("Duration")) {
				activity.setActivityHours(Double.valueOf(value));
			} else if (data.startsWith("Value")) {
				activity.setActivity(value);
			}
		}
		return activity;
	}

	public static HourlyActivity getHourlyActivityInstance() {
		return new HourlyActivity() {
			private Double hour;
			private String activity;

			@Override
			public void setActivityHours(Double hour) {
				this.hour = hour;
			}

			@Override
			public Double getActivityHours() {

				return this.hour;
			}

			@Override
			public String getActivity() {
				return this.activity;
			}

			@Override
			public void setActivity(String activity) {
				this.activity = activity;
			}
		};

	}

}
