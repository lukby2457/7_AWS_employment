package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 10,20,30,40,50 };
		// List<Integer> list = Arrays.asList(arr);		
		// 인스턴스 생성 없이 바로 받으면 리스트 내부 수정이 불가능하다
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		list.add(60);
		
		System.out.println("list = " + list + "\n");
		
		// List의 반복
		// 1. 일반 for문
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("list[%d] = %d\n", i, list.get(i));
		}
		System.out.println();
		
		// 2. for-each문 : 앞의 요소를 하나씩 변수에 대입하며 반복
		// - index가 없는 구조를 순환할때 사용할 수 있다
		for(int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		// 3. iterator : 순환자, 반복자
		// - 요소를 가리키고 잇는 커서(cursor) 개념
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {		// hasNext() : 커서는 이동하지 않고, 다음 요소가 있으면 true
			int num = it.next();	// next() : 커서를 이동 후, 그 위치의 요소를 반환
			System.out.println("num = " + num);
		}
		
		// ※ 반복이 끝난다고 iterator는 재위치로 돌아가지 않음
		System.out.println("it 다음? " + it.hasNext());
		
		// 다시 순환하려면 collection으로 부터 다시 받는다
		it = list.iterator();
		System.out.println("it 다음? " + it.hasNext());
	}
}
