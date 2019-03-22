package org.app.mom.adapter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

import org.app.mom.contracts.file.FileAdapter;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.structure.Queue;
import org.app.mom.story.TextFileStory;
import org.app.mom.task.TextFileReaderTask;
import org.workers.contracts.Story;
import org.workers.contracts.Task;
import org.workers.factory.ManagerFactory;

public class TextFileAdapter implements FileAdapter<Queue, FileProperty> {

	private FileProperty fileProperties;

	private FileAdapter<Queue, FileProperty> fileAdapter;

	private Queue queue;

	private static final Random random = new Random();

	@Override
	public void setFileProperty(FileProperty fileProperty) {
		this.fileProperties = fileProperty;
	}

	@Override
	public void setDataQueue(Queue queue) {
		this.queue = queue;
	}

	@Override
	public void writeToFile(String file) {

	}

	@Override
	public Queue readFile(String file) {
		try {
			FileInputStream inputStream = new FileInputStream(file);
			queue.onQueue();
			return read(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void write(OutputStream stream) {

	}

	@Override
	public Queue read(InputStream inputStream) {
		Story story = new TextFileStory(getTask(inputStream, queue), random.nextLong());
		ManagerFactory.getManager().assignStory(story);
		return queue;
	}

	private Task getTask(final InputStream inputStream, final Queue queue) {
		return new TextFileReaderTask(queue, inputStream);
	}

}
