package abstract_;

import other.Animal;
import other.FlyAble;

/*
	Java는 클래스의 다중 상속이 불가능
	- 기능을 여럿 물려 받아서 강력한 상속이다
	- 하지만 충돌을 많이 내기 때문에 안정성을 해친다
	
	클래스 상속		: 기능을 물려 받아서 '확장'에 중점
	인터페이스의 상속	: 특정 기능을 '구현'에 집중
 */

class Bird extends Animal implements FlyAble {
	@Override
	public void bark() {
		System.out.println("짹짹");
	}
	
	@Override
	public void fly() {
		System.out.println(type + "으로 날아간다");
	}
}

class Airplane implements FlyAble {
	@Override
	public void fly() {
		System.out.println("엔진의 가속으로 날아간다");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		Airplane air = new Airplane();
		
		// 동물 친구들 모여라 = 업캐스팅
		Animal[] anis = new Animal[] { cat, dog, bird };
		
		for(int i = 0; i < anis.length; i++) {
			anis[i].bark();		
		}
		System.out.println();
		
		// 날 수 있는 친구들 모여라
		FlyAble[] flies = new FlyAble[] { bird, air };
		
		for(int i = 0; i < flies.length; i++) {
			flies[i].fly();
		}
		
		// ※ 여기서 bird를 살펴보자
		// - Animal을 상속 받아서 Animal로도 업캐스팅이 가능학
		// - FlyAble을 상속 받아서 FlyAble로도 업캐스팅이 가능하다
		
	}
}
