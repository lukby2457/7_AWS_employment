package static_;

/*
	클래스의 멤버는 두 가지의 상태를 가진다
	1. 일반 멤버 : 인스턴스 멤버
	- 인스턴스마다 고유하게 생성되는 멤버
	
	2. 정적 멤버 : 클래스 멤버
	- 클래스 자체가 가지는 멤버
	- 인스턴스가 공유해서 사용하는 멤버
 */

class Person {
	// 일반 멤버
	String name;
	int age;
	
	// 정적 멤버
	static int eyes = 2;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		String msg = "%s (%d세, 눈 %d개)\n";
		System.out.printf(msg, name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("김민지", 25);
		Person p3 = new Person("박철수", 28);
		
		// p1.eyes = 3;		
		Person.eyes = 3;
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}
}
