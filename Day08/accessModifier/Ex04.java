package accessModifier;

class Student {
	private String name;
	private int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void showInfo() {
		System.out.printf("%s (%d점)\n", name, score);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		// 클래스도 배열로 작성 가능
		
		Student stu = new Student("홍길동", 88);
		
		Student[] stus = new Student[] { 
			stu, 						// 요소는 이미 만들어진 인스턴스의 참조변수로 지정하거나
			new Student("박민수", 75),	// 바로 이 자리에서 인스턴스를 작성해도 된다
			new Student("김수진", 85)
		};
		
		stus[1].showInfo();
		stus[2].showInfo();
		System.out.println();
		
		for(int i = 0; i < stus.length; i++) {
			System.out.print("stus[" + i + "] = ");
			stus[i].showInfo();
		}
	}
}
