package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quiz1 {
	public static void main(String[] args) throws IOException  {
		// 1. 현재 프로젝트에 있는 person.json을 읽어온다
		FileReader fr = new FileReader("person.json");
		BufferedReader br = new BufferedReader(fr);
		String json = "";
		String line;
		
		
		// 2. 그대로 콘솔에 출력해 본다
		while((line = br.readLine()) != null) {
			json += line + "\n";
		}
		System.out.println(json);
		
		
		// 3. Map으로 변환시켜 출력한다 (※ 라이브러리 추가 까먹지 말고~)
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> jsonMap;
		jsonMap = om.readValue(json, new TypeReference<Map<String, Object>>() {});
		
		System.out.println(jsonMap);
		System.out.println(jsonMap.get("person"));
		System.out.println(((Map)jsonMap.get("person")).get("name"));
		
		br.close();
	}
}
