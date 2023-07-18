package other;

public class Person {
	// protected : 자식까지 접근 가능
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat(String food) {
		String msg = "%s(이)가 %s(을)를 먹는다\n";
		System.out.printf(msg, name, food);
	}
	
	public void showInfo() {
		String msg = "%s (%d세)\n";
		System.out.printf(msg, name, age);
	}
}
