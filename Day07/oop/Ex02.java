package oop;

class Person {
	// 1. 필드 : 객체의 속성
	String name;
	int age;
	double height;
	
	// 2. 메서드 : 객체의 기능 (= 행위)
	// - void run(Person this)
	void run() {	
		System.out.println(name + "(이)가 달린다");
		System.out.println(this.name + "(이)가 달린다\n");
		// - this는 지역변수와 이름이 겹치지 않으면 생략 가능
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		// ※ 작성한 클래스는 새로운 자료형이 된다
		Person per = new Person();
		
		System.out.println("per = " + per);
		
		per.name = "홍길동";		// 객체의 멤버에 접근시 .(dot)연산자를 사용
		per.age = 24;
		per.height = 168.9;
		
		System.out.println("per의 이름 : " + per.name);
		System.out.println("per의 나이 : " + per.age);
		System.out.println("per의 신장 : " + per.height + "\n");
		
		per.run();	// run(per);
		
	}
}
