package com.ryder.online.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonFileReader {

	/*public void readJsonFile(String json) throws IOException {
		FileInputStream fin = new FileInputStream(
				new File(System.getProperty("user.dir") + "/src/main/resources/exceldata/" + json));
		InputStreamReader in = new InputStreamReader(fin);
		BufferedReader bufferedReader = new BufferedReader(in);
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			sb.append(line);
		}

		String json1 = sb.toString();
		System.out.println(json1);
		Gson gson = new Gson();

		// System.out.println(employee.getFirstName());
		JsonParser parser = new JsonParser();
		JsonObject myobject = (JsonObject) parser.parse(json1);
		// Accessing the value of "desc"
		System.out.println(myobject.get("index"));
		// Deserializing the value into JSONObject
		JsonObject descValue = (JsonObject) myobject.get("type");
		// Printing the someKey value using JsonObject
		System.out.println("SomeKey Value--" + descValue.get("sum"));
		// Retrieving the JSON Element -- JsonElement can represent a string,
		// array or other data types
		JsonElement someElement = descValue.get("someKey");
		// Printing a value again
		System.out.println("SomeKey Value--" + someElement.getAsString());

	}

	protected JsonObject getDataFile(String dataFileName) {
		String dataFilePath = System.getProperty("user.dir") + "/src/main/resources/exceldata/";
		JsonObject testObject = null;

		try {
			FileReader reader = new FileReader(dataFilePath + dataFileName);
			JsonParser jsonParser = new JsonParser();
			JsonObject jsonObject = (JsonObject) jsonParser.parse(reader);
			testObject = (JsonObject) jsonObject;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return testObject;
	}*/
	public static String generateStringFromResource(String path) throws IOException {
 System.out.println("inside the method to look for the file");
		 String filename="createShipmentData.json";
		    Path pathToFile = Paths.get(filename);
		    System.out.println(pathToFile.toAbsolutePath());
		
	    return new String(Files.readAllBytes(Paths.get(filename)));
	    
	    

	}
	
	
	public static String jsonFileReadSpecificKey(String jsonXpath, File filePath) {
		String value = null;
		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(filePath));
			//parsing the JSON string inside the file that we created earlier.

			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);
			//Json string has been converted into JSONObject

			value = (String) jsonObject.get(jsonXpath);
			System.out.println(value);

//			long year = (long) jsonObject.get("year");
//			System.out.println(year);
			//Displaying values from JSON OBject by using Keys

			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return value;
	}


	public static void jsonFileReadArrayWithKey(String ArrayKey, File filePath) {
		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(filePath));
			//parsing the JSON string inside the file that we created earlier.

			JSONObject jsonObject = (JSONObject) obj;
		

			JSONArray arrayKey = (JSONArray) jsonObject.get(ArrayKey);
			//converting the JSONObject into JSONArray as remark was an array.
			@SuppressWarnings("unchecked")
			Iterator<String> iterator = arrayKey.iterator();
			//Iterator is used to access the each element in the list 
			//loop will continue as long as there are elements in the array.
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				//accessing each elemnt by using next function.
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	
	
	
	public static Object[][] getdata(String JSON_path, String typeData, int totalDataRow, int totalColumnEntry)
			throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObj = jsonParser.parse(new FileReader(JSON_path)).getAsJsonObject();
		JsonArray array = (JsonArray) jsonObj.get(typeData);
		return searchJsonElement(array, totalDataRow, totalColumnEntry);
	}

	
	
	
	public static Object[][] searchJsonElement(JsonArray jsonArray, int totalDataRow, int totalColumnEntry)
			throws NullPointerException {
		Object[][] matrix = new Object[totalDataRow][totalColumnEntry];
		int i = 0;
		int j = 0;
		for (JsonElement jsonElement : jsonArray) {
			for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
				matrix[i][j] = entry.getValue().toString().replace("\"", "");
				j++;
			}
			i++;
			j = 0;
		}
		return matrix;
	}
	
	public static Object readshipmentJsonFile(String JsonPath) throws Exception {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(JsonPath);
        try 
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            System.out.println(obj);
//            JSONArray jsonArray = (JSONArray) obj;
//            System.out.println(jsonArray);
//             
            //Iterate over employee array
       //     employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 return obj;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return jsonParser.parse(reader);
		
		
    }
	
	
}
