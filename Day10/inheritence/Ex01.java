package inheritence;

import other.Person;

class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	@Override
	public void showInfo() {
		String msg = "%s (%d세, %d점)\n";
		System.out.printf(msg, name, age, score);
	}
	
	public void study(String sub) {
		String msg = "%s(이)가 %s(을)를 공부한다\n";
		System.out.printf(msg, name, sub);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 아래 클래스를 구현
		// 단, other.Person을 상속 받는다
		Student stu = new Student("홍길동", 15, 50);
		
		stu.eat("라면");		// 부모에게 상속받은 그대로
		stu.showInfo();		// 오버라이딩
		stu.study("Java");	// 자식에서 생성한 메서드
	}
}
