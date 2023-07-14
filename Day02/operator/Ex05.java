package operator;

public class Ex05 {
	public static void main(String[] args) {
		// 증감 연산자
		// - 값을 1증가 혹은 1감소
		
		int n = 10;
		
		++n;		// 전치 : 연산자가 앞에 배치
		System.out.println("n = " + n);
		
		--n;
		System.out.println("n = " + n);
		
		n++;		// 후치 : 연산자가 뒤에 배치
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n + "\n");
		
		// 전치와 후치는 기본적으로 차이가 없는데
		// 다른 연산과 같이 사용시 차이가 발생
		int n1 = 10, n2, n3;
		
		n2 = ++n1;		// 전치 : 증감 후 다른 연산
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
		n1 = 10;
		
		n3 = n1++;		// 후치 : 다른 연산 후 증감
		System.out.printf("n1 = %d, n3 = %d\n\n", n1, n3);
		
		
		int a = 3, b = 4, c = 2, d;
		
		d = ++a + b-- + c--;				//? = 4+4+2
		
		System.out.println("a = " + a);		//4
		System.out.println("b = " + b);		//3
		System.out.println("c = " + c);		//1
		System.out.println("d = " + d);		//10
		
	}
}
