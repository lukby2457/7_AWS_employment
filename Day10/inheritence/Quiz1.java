package inheritence;

import other.Person;

class Doctor extends Person {
	private String major;
	
	public Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void showInfo() {
		String msg = "%s (%d세, %s의)\n";
		System.out.printf(msg, name, age, major);
	}
	
	public void cure(Person per) {
		String msg = "%s의 %s(이)가 %s(을)를 치료합니다\n";
		// System.out.printf(msg, major, name, per.name());	
		// - per를 외부의 객체로 인식(protected여도 인식 불가)
		System.out.printf(msg, major, name, per.getName());
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 19, 93);
		Police pol = new Police("이민철", 26, "경장");
		
		// 아래 클래스는 Person을 상속 받아서 구현
		Doctor doc = new Doctor("이국종", 43, "내과");
		
		doc.showInfo();		// 이국종 (43세, 내과의)
		
		doc.cure(stu);		// 의사가 '사람'을 치료하는 메서드
							// - 내과의 이국종이 홍길동을 치료합니다
							// ※ Person에 필요하면 access 메서드를 만든다
		
		doc.cure(pol);		// 내과의 이국종이 이민철을 치료합니다
	}
}
