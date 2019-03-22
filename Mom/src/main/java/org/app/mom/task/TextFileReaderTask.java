package org.app.mom.task;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.app.mom.contracts.structure.Queue;
import org.workers.contracts.Task;

public class TextFileReaderTask implements Task {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	private Queue queue;

	private InputStream inputStream;

	public TextFileReaderTask(Queue queue, InputStream inputStream) {
		this.inputStream = inputStream;
		this.queue = queue;
	}

	@Override
	public void executeTask() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			while (true) {
				for (int counter = 0; counter < 1000; counter++) {
					String line = reader.readLine();
					if (line == null) {
						logger.info("closing queue as nothing to read.");
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

	@Override
	public String getTaskName() {

		return this.getClass().getName();
	}

}
