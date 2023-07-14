package operator;

// 연산자 : 데이터를 가공하여 새로운 데이터를 얻는 기호들
// 종류 : 산술, 대입, 증감, 비교, 논리, 조건

public class Ex01 {
	public static void main(String[] args) {
		// 산술 연산 : 사칙 연산을 제공
		int n = 10;
		
		System.out.println(n + 5);
//		System.out.println(10 + 5);
		
		System.out.println(n);
		// 즉, 산술 연산은 그 자리에서만 연산되고 변수에 변화를 주지 않음
		
		System.out.println("n + 5 = " + n + 5);
		// 연산 순위가 동일하면 좌에서 우로 수행
		
		System.out.println("n + 5 = " + (n + 5));
		// 우선 순위를 무시하려면 ()소괄호를 사용
		
		
	}
}
