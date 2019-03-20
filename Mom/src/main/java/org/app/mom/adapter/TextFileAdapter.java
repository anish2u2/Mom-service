package org.app.mom.adapter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.app.mom.contracts.file.FileAdapter;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.structure.Queue;
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

		return null;
	}

	@Override
	public void write(OutputStream stream) {

	}

	@Override
	public Queue read(InputStream inputStream) {
		final Task task = getTask(inputStream, queue);
		ManagerFactory.getManager().assignStory(new Story() {

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

				return random.nextLong();
			}

			@Override
			public int getPriority() {

				return 0;
			}

			@Override
			public void closeStory() {

			}
		});
		return queue;
	}

	private Task getTask(final InputStream inputStream, final Queue queue) {
		return new Task() {
			private Logger logger = Logger.getLogger("Text-File-Writer");

			@Override
			public String getTaskName() {

				return "Text-File-Writer";
			}

			@Override
			public void executeTask() {
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
					while (true) {
						for (int counter = 0; counter < 1000; counter++) {
							String line = reader.readLine();
							if (line == null) {
								logger.info("closing queue as noting to read.");
								queue.closeQueue();
								return;
							}
							queue.push(line);
						}
						Thread.sleep(700);
					}
				} catch (Exception e) {
					logger.log(Level.SEVERE, "ERROR", e);
				}
			}
		};
	}

}
