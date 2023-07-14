package operator;

public class Ex06 {
	public static void main(String[] args) {
		// 비교 연산자(= 관계 연산자)
		// - 데이터의 대소 관계를 비교
		// 비교 결과는 boolean 타입으로 얻어진다 (= true, false)
		
		int n = 10;
		
		System.out.println("n >  10 결과 : " + (n > 10));
		System.out.println("n >= 10 결과 : " + (n >= 10));
		System.out.println("n <  20 결과 : " + (n < 20));
		System.out.println("n <= 20 결과 : " + (n <= 20));
		System.out.println("n == 10 결과 : " + (n == 10));		// 같으면 참
		System.out.println("n != 10 결과 : " + (n != 10));		// 다르면 참
		
		
		boolean result = (n == 11);
		
		System.out.println("\nresult = " + result);
	}
}
