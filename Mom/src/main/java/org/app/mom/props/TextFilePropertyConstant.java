package org.app.mom.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:activity-config/text-file-config.config")
public class TextFilePropertyConstant {

	@Value("${text.file.activity.header}")
	private String activityHeader;

	@Value("${text.file.value.header}")
	private String valueHeader;

	@Value("${text.file.duration.header}")
	private String durationHeader;

	@Value("${text.file.hourly.header}")
	private String hourlyHeader;

	public String getActivityHeader() {
		return activityHeader;
	}

	public void setActivityHeader(String activityHeader) {
		this.activityHeader = activityHeader;
	}

	public String getValueHeader() {
		return valueHeader;
	}

	public void setValueHeader(String valueHeader) {
		this.valueHeader = valueHeader;
	}

	public String getDurationHeader() {
		return durationHeader;
	}

	public void setDurationHeader(String durationHeader) {
		this.durationHeader = durationHeader;
	}

	public String getHourlyHeader() {
		return hourlyHeader;
	}

	public void setHourlyHeader(String hourlyHeader) {
		this.hourlyHeader = hourlyHeader;
	}

}
