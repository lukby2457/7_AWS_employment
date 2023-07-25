package collection;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Ex04 {
	public static void main(String[] args) {
		// TreeMap : key순으로 정렬된다
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		
		map.put("name", "홍길동");
		map.put("age", 25);
		map.put("address", "부산 광역시 해운대구");
		
		System.out.println("map = " + map + "\n");
		
		
		// ※ 아래는 참고용
		BiConsumer<String, Object> bc = (String k, Object v) -> {
			System.out.println(k + " : " + v);
		};
		
		map.forEach(bc);
		map.forEach((String k, Object v) -> System.out.println(k + " : " + v));
	}
}
