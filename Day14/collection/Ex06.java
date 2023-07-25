package collection;

import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex06 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		String xmlStr = 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + 
				"<person>" + 
					"<name>홍길동</name>" + 
					"<age>20</age>" + 
				"</person>";
		
		// xml -> json
		int indent = 4;
		JSONObject jo = XML.toJSONObject(xmlStr);
		String jsonStr = jo.toString(indent);
		System.out.println(jsonStr);
		System.out.println();
		
		
		// json -> map
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> jsonMap;
		jsonMap = om.readValue(jsonStr, new TypeReference<Map<String, Object>>() {});
		
		System.out.println(jsonMap);
		System.out.println(jsonMap.get("person"));
		System.out.println(((Map)jsonMap.get("person")).get("name"));
		System.out.println(((Map)jsonMap.get("person")).get("age"));
	}
}
