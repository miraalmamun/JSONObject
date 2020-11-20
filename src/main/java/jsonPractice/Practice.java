package jsonPractice;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice {

	public static void main(String[] args) throws Exception {

		String filePath = System.getProperty("user.dir") + "\\JSONFile\\test.json";
		File file = new File(filePath);
		FileReader reader = new FileReader(file);

		JSONParser jsonObject = new JSONParser();
		JSONObject json = (JSONObject) jsonObject.parse(reader);
		// Return Array of json according to my json class
		JSONArray jsonArray = (JSONArray) json.get("testdata");
		
		for(int i = 0; i<jsonArray.size(); i++)
		{
			JSONObject jsonObject2 = (JSONObject) jsonArray.get(i);
			
			String testName = (String) jsonObject2.get("testName");
			System.out.println("============ "+testName+" =====================");
			
			JSONArray json2 = (JSONArray) jsonObject2.get("data");
			for(int j = 0; j<json2.size(); j++)
			{
				JSONObject jsonObject3 = (JSONObject) json2.get(j);
				//String s = (String) jsonObject3.get("runmode");
				//System.out.println(s);
				
				@SuppressWarnings("unchecked")
				Set<String> keys = jsonObject3.keySet();
				
				Iterator<String> itr = keys.iterator();
				while(itr.hasNext())
				{
					String key = itr.next();
					String value = jsonObject3.get(key).toString();
					System.out.println(key+"   "+value);
				}
				
				
				
				
			}
			
		}
		

	}

}
