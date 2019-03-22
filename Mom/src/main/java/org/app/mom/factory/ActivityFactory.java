package org.app.mom.factory;

import org.app.mom.contracts.activity.Activity;
import org.app.mom.contracts.activity.HourlyActivity;
import org.app.mom.props.TextFilePropertyConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class will be used as a activity factory to instantiate activity data.
 * 
 * @author Anish Singh
 *
 */
@Component
public class ActivityFactory {

	@Autowired
	private TextFilePropertyConstant textFileConstant;

	/**
	 * This method will work on the data and determine the type of activity.
	 * 
	 * @param data
	 * @return
	 */
	public Activity instantiateActivity(String data) {
		System.out.println(data);
		String[] activityData = data.split(";");
		if (activityData[0].contains(textFileConstant.getActivityHeader())) {
			String[] activityType = activityData[0].split(":");
			System.out.println(activityType[1]);
			if (textFileConstant.getHourlyHeader().equals(activityType[1].trim())) {
				return getHourlyActivity(activityData);
			}
		}
		return null;
	}

	private Activity getHourlyActivity(String[] activityData) {

		HourlyActivity activity = getHourlyActivityInstance();

		for (String data : activityData) {
			String value = data.split(":")[1].trim();
			System.out.println(value);
			if (data.startsWith(textFileConstant.getDurationHeader())) {
				activity.setActivityHours(Double.valueOf(value));
			} else if (data.startsWith(textFileConstant.getValueHeader())) {
				activity.setActivity(value);
			}
		}
		return activity;
	}

	public HourlyActivity getHourlyActivityInstance() {
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
