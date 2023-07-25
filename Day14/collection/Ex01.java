package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex01 {
	public static void main(String[] args) {
		// TreeSet
		// - Tree라는 자로구조 기반으로 만들어진 Set
		// - 출력 시 오름차순으로 출력된다
		
		Random ran = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			int n = ran.nextInt(100) + 1;
			hs.add(n);
		}
		System.out.println("hs = " + hs);
		
		// TreeSet은 기본 Comparable을 가지고 정렬한다
		TreeSet<Integer> ts1 = new TreeSet<Integer>(hs);
		System.out.println("ts1 = " + ts1);
		
		// 다른 비교 기준을 사용하려면 생성자에 Comparator를 구현해서 넘긴다
		Comparator<Integer> desc;
		
		desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(desc);
		ts2.addAll(ts1);
		
		// 람다식
		TreeSet<Integer> ts3 = new TreeSet<Integer>((Integer o1, Integer o2) -> o2 - o1);
		ts3.addAll(ts1);
		
		System.out.println("ts2 = " + ts2);
		System.out.println("ts3 = " + ts3);
	}
}
