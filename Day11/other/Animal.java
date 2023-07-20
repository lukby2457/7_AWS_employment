package other;

public abstract class Animal {
	public void eat(String food) {
		System.out.println(food + "(을)를 먹는다");
	}
	
	public abstract void bark();
}
