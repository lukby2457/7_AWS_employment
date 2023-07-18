package static_;

class Student {
	private String name;
	private int score;
	
	private static int count;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
		
		count++;
	}
	
	static int getCount() {
		return count;
	}
	
	void showInfo() {
		String msg = "%s (%d점) - %d명\n";
		System.out.printf(msg, name, score, count);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 동작되게 클래스를 구현
		Student stu1 = new Student("홍길동", 80);		
		stu1.showInfo();		// 홍길동 (80점) - 1명
		
		Student stu2 = new Student("김수진", 77);
		stu2.showInfo();		// 김수진 (77점) - 2명
		
		Student stu3 = new Student("이진호", 93);
		stu3.showInfo();		// 이진호 (93점) - 3명
		
		System.out.println("\n현재 학급 인원? " + Student.getCount() + "명\n");
		
		stu1.showInfo();		// 홍길동 (80점) - 3명
		stu2.showInfo();		// 김수진 (77점) - 3명
		stu3.showInfo();		// 이진호 (93점) - 3명
	}
}
