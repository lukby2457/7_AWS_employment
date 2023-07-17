package accessModifier;

class People {
	// 필드는 가급적 private로 처리
	private String name;
	private int age;
	
	// 메서드는 클래스의 지시자를 따라서
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
	
	// ※ 외부에서 private 멤버가 필요할 때가 생길 수 있다
	// 이때 간접적으로 접근하게 제공하는 메서드를 Access Method라고 한다
	
	// 1. setter : 필드의 값을 변경하는 메서드
	void setName(String name) {
		this.name = name;
	}
	
	// 2. getter : 필드의 값을 반환하는 메서드
	String getName() {
		return name;
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		People per = new People("이수진", 24);
		
		per.showInfo();
		
		per.setName("이민수");
		// per.name = "이민수";
		
		System.out.println("per의 이름 : " + per.getName());
		// System.out.println("per의 이름 : " + per.name);
	}
}

// white list : 일단 다 막고 필요한 것만 들어오고 나가게 만드는 방식
// black list : 다 풀어놓고 차단할 것만 차단하는 방식