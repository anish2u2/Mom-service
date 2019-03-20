package org.app.mom.adapter;

import java.io.InputStream;
import java.io.OutputStream;

import org.app.mom.contracts.file.FileAdapter;
import org.app.mom.contracts.file.FileProperty;
import org.app.mom.contracts.structure.Queue;

public class CsvFileAdapter implements FileAdapter<Queue, FileProperty> {

	@Override
	public void setFileProperty(FileProperty fileProperty) {

	}

	@Override
	public void setDataQueue(Queue queue) {

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
		// TODO Auto-generated method stub

	}

	@Override
	public Queue read(InputStream inputStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
