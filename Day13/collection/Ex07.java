package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		// Set을 활용한 중복 제거
		Random ran = new Random();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			int n = (ran.nextInt(5) + 1) * 10;
			list.add(n);
		}
		
		System.out.println("list = " + list);

		// 1. 생성자를 활용
		HashSet<Integer> set = new HashSet<Integer>(list);
		System.out.println("set = " + set);
		
		// 2. 제공되는 메서드를 활용
		list.clear();		// 기존 요소 모두 제거
		list.addAll(set);	// 중복이 걸러진 set의 요소를 전부 추가
		list.sort(null);								// set은 정렬이 불가능하고
		
		System.out.println("\nlist = " +  list);
		System.out.println("list[1] = " + list.get(1));	// indexing도 불가능하다
	}
}
