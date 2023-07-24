package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Ex05 {
	public static void main(String[] args) {
		// Vector는 자바 초기 버전에서 사용하던 컬렉션
		// - 지금은 잘 사용되지 않고, 하위 자바 버전과 호환성을 위해서 남겨둠
		
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		
		System.out.println("vec = " + vec);
		
		// Enumeration은 iterator의 이전 버전
		Enumeration<Integer> en = vec.elements();
		
		while (en.hasMoreElements()) {		// == hasNext()
			int n = en.nextElement();		// == next()
			System.out.println("n = " + n);
		}
	}
}
