package method;

public class Ex02 {
	
	// 매개변수 (parameter) : 전달된 값을 저장하는 변수. 종속문에서 활용 가능
	static void hello(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i + " : Hello World");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(3);	// 전달인자(arguments) : 메서드 호출시 전달하는 값
		
		hello(1);
		
		hello(8);
		
		// ※ 전달인자와 매개변수는 개수 및 자료형을 일치시킨다!!!
		// hello(3.0);		타입 불일치
		// hello();			전달인자 부족
		// hello(3, 5);		매개변수 부족
		
	}
}
