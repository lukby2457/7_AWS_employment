package other;

public class Person {
	// ※ 지시자가 없으면 package 속성
	public String name;
	int age;
	private double height;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("%s (%d세, %.1fcm)\n", name, age, height);
	}
}

