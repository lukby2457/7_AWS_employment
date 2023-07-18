package inheritence;

import other.Person;

// ※ 자식 생성자는 부모 생성자를 꼭 호출해야 한다

class Student extends Person {
	private int score;
	
	Student(String name, int age, int score) {
		super(name, age);	// 기본 생성자가 없으면 super()의 값을 직접 지정해주어야 한다
		this.score = score;	// super() : 부모 생성자 호출
	}

	// 메서드 오버라이드(= Override)
	// - 부모에서 상속 받은 메서드를 '재정의'하는 것
	@Override
	public void showInfo() {
		// super.showInfo();	// super.메서드() : 부모 메서드 호출
		String msg = "%s (%d세, %d점)\n";
		System.out.printf(msg, name, age, score);
	}
	
	void study(String sub) {
		String msg = "%s(이)가 %s(을)를 공부합니다\n";
		System.out.printf(msg, name, sub);
	}

}

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 30);
		
		per.eat("라면");
		per.showInfo();
		System.out.println();
		
		Student stu = new Student("박수진", 17, 88);
		
		stu.eat("싸이버거");	// 1. 그대로 물려 받은 메서드
		stu.showInfo();		// 2. 재정의한 메서드
		stu.study("Java");	// 3. 자식에서 생성된 메서드 (= 새 기능)
	}
}
