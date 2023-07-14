package method;

public class Ex03 {
	
	static int total(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + total(n - 1);
//		return 3 + total(2)
//				   return 2 + total(1)
//							     1
//					  3
//		   6
	}
	
	static int fac(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n * fac(n - 1);
	}
	
	static int pow(int n1, int n2) {
		if(n2 == 0) {
			return 1;
		}
		
		return n1 * pow(n1, (n2 - 1));
	}
	
	public static void main(String[] args) {
		
		System.out.println("total(3) = " + total(3));
		System.out.println("total(10) = " + total(10));
		
		// 연습1)
		System.out.println("fac(5) = " + fac(5));
		
		// 연습2)
		System.out.println("pow(2, 10) = " + pow(2, 10));
		
	}
}
