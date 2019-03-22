package org.app.mom.story;

import org.workers.contracts.Story;
import org.workers.contracts.Task;

public class TextFileStory implements Story {

	private Task task;
	private Long storyId;

	public TextFileStory(Task task, Long storyId) {
		this.task = task;
		this.storyId = storyId;
	}

	@Override
	public int progressReport() {

		return 0;
	}

	@Override
	public Task getTask() {

		return task;
	}

	@Override
	public String getStoryName() {

		return "Text-File-Handler";
	}

	@Override
	public Long getStoryId() {

		return storyId;
	}

	@Override
	public int getPriority() {

		return 0;
	}

	@Override
	public void closeStory() {

	}

	@Override
	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}

}
