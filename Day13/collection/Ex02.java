package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		// 인터페이스는 인스턴스를 생성할 수 없기 때문에 자식 클래스를 만들어 사용한다
		// - 사용 방식에는 차이가 없다
		List<Double> list = new ArrayList<Double>();
		
		list.add(1.2);
		list.add(5.88);
		list.add(3.141592);
		
		System.out.println("list = " + list);
		
		list.sort(null);	// null을 전달하면 Comparable을 사용한다
		System.out.println("list = " + list);
		
		// 람다식으로 Comparator의 메서드 구현
		Comparator<Double> desc = (Double o1, Double o2) -> {
			return o2.compareTo(o1);		// o2 - o1
		};
		
		list.sort(desc);
		System.out.println("list = " + list);
		
		// 한 줄에 한번에 작성시
		list.sort((Double o1, Double o2) -> o2.compareTo(o1));
		System.out.println("list = " + list);
	}
}
