package com.ryder.online.utility;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.ryder.online.configreader.FileReaderManager;
import com.ryder.online.json.model.RegistrationData;

public class JsonDataHelper {
	
	private final String registrationFilePath = FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath() + FileReaderManager.getInstance().getConfigReader();
	private List<RegistrationData> registrationDataList;
	
	public JsonDataHelper() {
		registrationDataList = getRegistrationData();
	}

	private List<RegistrationData> getRegistrationData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(registrationFilePath));
			RegistrationData[] customers = gson.fromJson(bufferReader, RegistrationData[].class);
			return Arrays.asList(customers);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + registrationFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public final RegistrationData getRegistrationData(String email) {
		for (RegistrationData reg : registrationDataList) {
			if (reg.email.equalsIgnoreCase(email))
				return reg;
		}
		return null;
	}

}
