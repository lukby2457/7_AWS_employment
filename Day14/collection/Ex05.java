package collection;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex05 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		String jsonStr = 
				"{" + 
					"\"person\": {" + 
						"\"name\": \"홍길동\"," + 
						"\"age\": 20" + 
					"}" + 
				"}";
		
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> jsonMap;
		jsonMap = om.readValue(jsonStr, new TypeReference<Map<String, Object>>() {});
		
		System.out.println(jsonMap);
		System.out.println(jsonMap.get("person"));
		System.out.println(((Map)jsonMap.get("person")).get("name"));
		System.out.println(((Map)jsonMap.get("person")).get("age"));
	}
}
