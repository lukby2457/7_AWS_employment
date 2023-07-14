package method;

/*
	피보나치 수열
	- 앞의 두 수를 더해서 현재 수를 구현하는 수열
	- 즉, f(n) = f(n-1) + f(n-2)
	- 단, f(1) = f(2) = 1
	
	ex)
	1 1 2 3 5 8 13 21 34 55 89 ...
 */
// 하노이 타워

public class Quiz2 {
	
	static int fibo(int n) {
		if(n <= 2) {
			return 1;
		}
		
		return fibo(n - 1) + fibo(n - 2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("3번째 fibo = " + fibo(3));
		
		System.out.println("9번째 fibo = " + fibo(9));
		
		System.out.println("40번째 fibo = " + fibo(45));
		
	}
}
