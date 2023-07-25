package collection;

import java.net.URL;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex07 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		ObjectMapper om = new ObjectMapper();
		
		URL url = new URL("http://data.ex.co.kr/openapi/restinfo/restWeatherList?key=9033396397&type=json&sdate=20230724&stdHour=12");
		
		Map<String, Object> jsonMap;
		jsonMap = om.readValue(url, new TypeReference<Map<String, Object>>() {});
		
		// System.out.println(jsonMap);
		// - 1. 한 줄로 모두 출력되니 보기 힘들다 -> 반복으로 간다
		
		// jsonMap.forEach((String k, Object v) -> System.out.println(k + " : " + v));
		// - 2. 받은 결과인 Map의 Key들을 확인해보자
		
		// System.out.println(jsonMap.get("list").getClass());
		// - 3. list라는 key에 여러 종보가 담겨 있다
		// - 4. 자료형을 확인해보자 -> List
		
		List<Map<String, Object>> list = (List<Map<String, Object>>) jsonMap.get("list");
		
		for(Map<String, Object> map : list) {
			// System.out.println(map);
			System.out.println(map.get("unitName") + " : " + map.get("weatherContents"));
		}
		
		// 공공데이터포털
		// 자바는 여기까지 목표로 공부하는 것이 좋다
		
	}
}
