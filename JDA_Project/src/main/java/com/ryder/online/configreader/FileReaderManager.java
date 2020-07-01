package com.ryder.online.configreader;

/**
 * @author Madhu Golla
 *
 *02/01/2K19
 *
 */

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static PropertyFileReader configFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public PropertyFileReader getConfigReader() {
		return (configFileReader == null) ? new PropertyFileReader() : configFileReader;
	}
}
