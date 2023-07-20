package abstract_;

import other.Animal;

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Animal[] anis = new Animal[] { cat, dog };
		
		for(int i = 0; i < anis.length; i++) {
			anis[i].eat("사료");	// 동일하게 실행
			
			anis[i].bark();		// 자식 클래스마다 다르게 실행
		}
	}
}
