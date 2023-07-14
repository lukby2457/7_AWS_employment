package method;

// 메서드는 크게 2가지로 분류된다
// 1. 반환값이 없는 메서드 : void타입. 종속문을 실행만 할 뿐 결과값을 주지 않는다
// 2. 반환값이 있는 메서드 : 자료형타입. 종속문 실행 후 지정한 자료형의 결과값을 준다 

// ※ 반환값 (= return value)
// - 메서드 실행 후 얻어지는 결과값을 의미

public class Ex05 {
	
	// void형
	static void adder1(int n1, int n2) {
		int sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n", n1, n2, sum);
	}
	
	// int형
	static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		adder1(5, 6);					// void형은 실행만 하기 때문에 이름만 작성해서 사용
		
		int n = adder2(5, 6);			// 반환형 메서드는 결과값을 돌려주기 때문에
//		int n = 11;						// 1. 변수에 저장 받거나
		
		System.out.println("n = " + n);
		
		System.out.println("adder2(3, 1) = " + adder2(3, 1));	// 2. 다른 메서드의 전달값으로 바로 사용한다
//		System.out.println("adder2(3, 1) = " + 4);
		
		
		// 연습) 아래 코드를 해석해 보세요
		int result = adder2(adder2(7, 1), adder2(3, 8));
//		int result = adder2(8, 11);
//		int result = 19;
		
		System.out.println("result = " + result);		// 19
	}
}
