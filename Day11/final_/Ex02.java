package final_;

class Super {
	int a = 10;
	
	final void supMethod() {
		System.out.println("부모의 메서드 입니다");
	}
}

final class Sub extends Super {
/*	
	@Override
	void supMethod() {
		System.out.println("자식에 재정의 됨");
	}
	- final 메서드는 자식에서 재정의가 불가능하다
*/
}

/*
class Ssub extends Sub {
	- final 클래스는 상속을 받을 수 없다
	- 더 이상의 기능 확장을 하지 않을때 사용
}
*/

public class Ex02 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		
		sub.supMethod();
	}	
}
