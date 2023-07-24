package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		// Set : 순서x, 중복x
		// - 구현한 클래스는 HashSet, TreeSet 등이 있다
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		
		set.add(10);	// 중복된 데이터는 무시된다
		
		System.out.println("set = " + set);
		
		// System.out.println("set[0] = " + set.get(0));
		// - index가 없어 indexing이 불가능
		
		set.remove(20);
		System.out.println("set = " + set);
		
		System.out.println("set의 길이 : " + set.size());
		
		
		Integer[] arr = new Integer[] { 50,60,70,80,90 };
		
		set.addAll(Arrays.asList(arr));		// 배열을 list, set에 한번에 추가
		System.out.println("set = " + set + "\n");
		
		for (int n : set) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println("n = " + n);
		}
		
		// list -> set -> list : 중복을 걸러내고 list정렬
		
	}
}
