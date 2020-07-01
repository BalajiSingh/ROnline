package com.ryder.online.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.ryder.online.utility.JsonFileReader;
public class JsonFileWriter {
	
	JsonFileReader jfr = new JsonFileReader(); 
	@SuppressWarnings("unchecked")
	public void updateJsonFileforKey(String JsonPathToKey, String inputThisValueInFile, File filePath) throws IOException, ParseException {
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(filePath));
		//parsing the JSON string inside the file that we created earlier.

		JSONObject jsonObject = (JSONObject) obj;
		
		String keyValue = JsonFileReader.jsonFileReadSpecificKey(JsonPathToKey,filePath);
		if (keyValue!=inputThisValueInFile) {
				
	//	JSONObject obj = new JSONObject();
		
		jsonObject.remove(JsonPathToKey);
		
		jsonObject.put(JsonPathToKey,inputThisValueInFile);
		System.out.println(jsonObject);
		System.out.println(jsonObject.toJSONString());
		try  {
			FileWriter file = new FileWriter(filePath);
			
			//readValue(new File("json_file"), JSONObject.class
			file.write(jsonObject.toJSONString());
			
			//write function is use to write in file,
			//here we write the Json object in the file
			file.flush();
			file.close();

		
		} catch (FileNotFoundException e) 
		{
		e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	}

}
