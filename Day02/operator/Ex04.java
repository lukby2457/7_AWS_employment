package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 복합 대입 연산자 : 산술 + 대입		+=(o) =+(x)
		
		int n = 10;
		
		n += 3;		// n = n + 3;
		System.out.println("n = " + n);
		
		n -= 5;
		System.out.println("n = " + n);
		
		n *= 4;
		System.out.println("n = " + n);

		n /= 6;
		System.out.println("n = " + n);

		n %= 3;
		System.out.println("n = " + n + "\n");
		
		
		int a = 5, b = 2, c = 4;
		
		a += b -= c /= 2;		// 우에서 좌로 연산
		
		System.out.println("a = " + a);		// 5
		System.out.println("b = " + b);		// 0
		System.out.println("c = " + c);		// 2
	}
}
