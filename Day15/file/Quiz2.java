package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quiz2 {
	public static void main(String[] args) throws IOException {
		// xml read
		FileReader fr = new FileReader("person.xml");
		BufferedReader br = new BufferedReader(fr);
		String xml = "";
		String line;
		
		while((line = br.readLine()) != null) {
			xml += line + "\n";
		}
		System.out.println(xml);
		
		
		// xml -> json
		int indent = 4;
		JSONObject jo = XML.toJSONObject(xml);
		String jsonStr = jo.toString(indent);
		System.out.println(jsonStr + "\n");
		
		
		// json -> map
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> jsonMap;
		jsonMap = om.readValue(jsonStr, new TypeReference<Map<String, Object>>() {});
		
		System.out.println(jsonMap);
		System.out.println(jsonMap.get("person"));
		System.out.println(((Map)jsonMap.get("person")).get("name"));
		
		br.close();
	}
}
