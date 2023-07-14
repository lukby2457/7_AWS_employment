package loop;

public class Ex06 {
	public static void main(String[] args) {
		// 반복문 for
		// - 초기값, 조건식, 증감식이 한 곳에 모여있는 구문
		// - 횟수 파악이 용이하기 때문에, 지정 횟수 반복에 자주 사용되며
		// - 뒤에 배울 배열 혹은 컬렉션의 반복에 자주 사용된다
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World");
		}
		
		// for문 동작 순서)
		// 초기값 -> 조건식 -> 종속문 -> 증감식 -> 조건식 -> 종속문 -> 증감식 ...
		
	}
}
