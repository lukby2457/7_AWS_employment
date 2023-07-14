package operator;

public class Quiz2 {
	public static void main(String[] args) {
		// 1. 절대값을 출력
		int a = 10;
		
		int abs = (a > 0) ? a : -a;
//		abs = Math.abs(a);
		
		System.out.println("|a| = " + abs);
		
		// 2. 두 수 중 큰 수를 출력
		int b = 15;
		int c = 9;
		
		int max = (b > c) ? b : c;
//		
		
		System.out.println("b와 c중 큰 수는 " + max + "입니다");
		
		// 3. 짝수인지 판별
		int d = 11;
		
		String even = (d % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("d는(은) " + even + "입니다");
		
		// 4. 3과 5의 공배수인지 판별  -(배수관계일때는 곱한 값 사용 불가능)-
		int e = 15;
		
		boolean mul = (e % 3 == 0) && (e % 5 == 0);
		String cmul = mul ? "공배수 입니다" : "공배수가 아닙니다";
		
		System.out.println("e는(은) 3과 5의 " + cmul);
		
	}
}
