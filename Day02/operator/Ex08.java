package operator;

/*
	단항 연산자 : 증감, !(not)		ex) a++, !true
	이항 연산자 : 산술, 대입, 비교 등		ex) a + b, a = 10, a > b
	삼항 연산자 : 조건				ex) (조건식) ? 참 : 거짓
 */

public class Ex08 {
	public static void main(String[] args) {
		// 조건 연산자
		// - 조건에 따라서 값을 선택하는 연산자
		
		int n = -10;
		
		String isPos = (n >= 0) ? "양수" : "음수";
// 		String isPos = "양수";	(n = 10일때)
// 		String isPos = "음수";	(n = -10일때)
		
		System.out.println(n + "(은)는 " + isPos);
	}
}
