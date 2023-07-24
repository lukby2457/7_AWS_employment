package collection;

import java.util.ArrayList;

/*
	collection framework
	- Java에서 제공하는 자료구조들을 의미
	
	종류) ※ 아래 3타입은 모두 Interface로 작성되어 있음
	1. List	: 순서o, 중복o
	2. Set	: 순서x, 중복x
	3. Map	: key-value의 한 쌍의 구조 (key는 중복x)
	
	CRUD = Create(add), Read(get), Update(set), Delete(remove)
	
 */

public class Ex01 {
	public static void main(String[] args) {
		// List는 인터페이스이므로 이를 직접 구현한 하위 클래스를 사용한다
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// ※ 필수 암기 사항
		list.add(10);		// add(값) : 리스트 가장 뒤에 지정 데이터를 추가
		list.add(20);		// ※ 리스트는 배열처럼 크기를 지정하지 않고 동적으로 늘고 줄어든다
		list.add(30);
		list.add(10);		// 데이터의 중복도 허용한다
		
		System.out.println("list = " + list);	// ※ toString()이 오버라이드 되어있다
		
		System.out.println("list[0] = " + list.get(0));
		// get(index) : 지정 index 위치의 데이터를 반환
			
		list.set(1, 23);	// set(index, 값) : 지정 위치의 값을 반환
		System.out.println("list = " + list);
		
		list.add(1, 70);	// add(index, 값) : 지정 위치에 데이터 추가. 지정 자리의 값 이후부터는 한칸 씩 밀어버린다
		System.out.println("list = " + list);
		
		int n = list.remove(2);		// remove(index) : 지정 위치의 데이터를 제거 및 반환
		System.out.println("list = " + list);
		System.out.println("제거한 값 : " + n + "\n");
		
		
		// ※ 기타
		System.out.println("list의 크기 : " + list.size());			// size() : 요소 개수 반환
		
		System.out.println("70의 위치 : " + list.indexOf(50));		// 값의 위치 반환. 없으면 -1 반환
		
		list.clear();											// 요소 모두 제거
		System.out.println("list = " + list);
							
		System.out.println("list가 비어있는가 : " + list.isEmpty());	// 빈 리스트인지 판별
	}
}
