package method;

// 메서드 오버로딩 (= method oerloading)
// - 같은 이름의 메서드를 여려개 작성하는 방식
// - 단, 매개변수의 형태가 달라야 한다
// - 반환형이 다르다고 오버로딩에 영향을 주지 않는다

public class Ex01 {
	
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static int adder(int n) {
		return n + 100;
	}
	
	static double adder(double n) {
		return n + 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("adder(5, 3) = " + adder(5, 3));
		System.out.println("adder(5) = " + adder(5));
		System.out.println("adder(5.0) = " + adder(5.0));
	}
}
