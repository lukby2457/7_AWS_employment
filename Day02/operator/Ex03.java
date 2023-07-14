package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 대입 연산자 : 값을 할당하는 연산
		// 1. 좌변은 공간, 우변은 결과값
		// 2. 항상 우변부터 실행
		// 3. 대입 연산의 양변의 자료형은 항상 일치 시킨다
		
		int n = 10 + 3;
		// 10 + 3 = n (x)
		// int n = 10.0; (x)
		// int n = 13;
		
		System.out.println("n = " + n);
		
		int a, b, c;
		
		a = b = c = 10;		// 가장 우변부터 수행
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
