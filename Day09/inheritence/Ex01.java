package inheritence;

/*
	상속 : 기존의 클래스의 기능을 물려 받아서 새로운 클래스를 작성하는 기법
	1. 상속을 해주는 클래스	 : 부모, 상위, 슈퍼, 기반 클래스라고 한다
	2. 상속을 받는 클래스	 : 자식, 하위, 서브, 파생 클래스라고 한다
 */

class Super {
	int a = 10;
	
	void superMethod() {
		System.out.println("부모 메서드 입니다\n");
	}
}

class Sub extends Super {
	int b = 20;
	
	void subMethod() {
		System.out.println("자식 메서드 입니다\n");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		
		System.out.println("부모 필드 = " + sup.a);
		sup.superMethod();
		
		// sup.subMethod();
		// - 부모는 자식의 멤버를 알 수 없다
		
		Sub sub = new Sub();
		
		System.out.println("부모 필드 = " + sub.a);
		sub.superMethod();
		
		System.out.println("자식 필드 = " + sub.b);
		sub.subMethod();
	}
}
