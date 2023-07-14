package oop;

// 메서드에 왜 this라는게 생략되어 있을까?
// - 메서드를 호출하는 인스턴스를 '구분'하기 위해서

// class Person {
//		클래스는 같은 패키지에서 공유된다
// }

public class Ex03 {
	public static void main(String[] args) {
		// 클래스가 정의 되어있으면 인스턴스는 몇개든 생성할 수 있다
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p2.name = "김민수";
		
		p1.run();	// run(p1);
		p2.run();	// run(p2);
		
	}
}
