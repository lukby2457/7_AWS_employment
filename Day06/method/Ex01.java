package method;

// 함수 (function) : 일정 길이의 코드를 저장하고 재사용하는 방식
// 메서드(method) : 클래스 안에 작성된 함수 (= 멤버 함수). 객체 지향의 개념이 추가된 함수

// ※ 자바에서 함수는 모두 클래스 안에서만 작성 가능. 즉, 자바의 함수는 모두 메서드다

public class Ex01 {
	
	// 메서드 선언 : 실행할 코드를 저장한 곳
	static void hello() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		hello();	// 메서드 호출 : 선언 해놓은 메서드를 사용하는 것
		
		hello();	// 메서드의 재사용성 : 한번 선언한 메서드는 몇번이건 사용가능
		
		hello();
		
		// 메서드 실행 순서)
		// 1. 메서드를 호출하면 현재 위치(= 줄)을 기억하고 메서드로 이동
		// 2. 메서드로 이동 후 종속문을 순차적으로 처리
		// 3. 메서드 종료 후 1번에서 기억한 위치로 되돌아가 남은 코드를 이어 수행한다
	}
}
