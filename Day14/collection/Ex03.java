package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		// ※ Map의 key는 String이, Value는 Object가 가장 자주 사용된다
		// 1. key는 문자열로 접근이 가장 수월
		// 2. value는 모든 데이터를 받기 위해서
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "홍길동");
		map.put("age", 25);
		map.put("address", "부산 광역시 해운대구");
		
		System.out.println("map = " + map + "\n");
		
		
		// ※ Map은 순환이 불가능한 구조
		Set<String> keys = map.keySet();
		
		for (String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println();
		
		
		// 연습) iterator로 출력
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String n = it.next();
			Object v = map.get(n);
			System.out.println(n + " : " + v);
			// System.out.println(it.next() + " : " + map.get(it.next()));
			// next()를 만나면 커서가 다음으로 무조건 이동한다
		}
		System.out.println();
	}
}
