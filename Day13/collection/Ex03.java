package collection;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		// ArrayList LinkedList
		// 1. ArrayList		: 속도 빠름, 변화에 취약 (오버헤드가 발생), 수정이 없으면 유리
		// 2. LinkedList	: ArrayList보단 느림, 변화에 상관없음, 수정이 빈번하면 유리
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("C/C++");
		list.add("Python");
		list.add("Go");
		list.add("Java");
		
		System.out.println("list = " + list);
		
		list.sort(null);
		System.out.println("list = " + list);
		
		list.sort((String o1, String o2) -> o2.compareTo(o1));
		System.out.println("list = " + list);
	}
}	
