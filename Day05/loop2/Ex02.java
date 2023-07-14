package loop2;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1. 구구단 2단을 단일 반복으로 출력. 단, x1 ~ x9까지 출력
		int a = 2;
		for(int i = 1; i <= 9; i++) {
			System.out.print(a + "*" + i + "=" + a*i + "\n");
		}
		
		System.out.println();
		
		// 2. 1번을 중첩반복으로 만들어서 2단을 8번 출력한다
		for(int i = 1; i <= 9; i++) {		// x1 ~ x9
			for(int j = 1; j <= 8; j++) {	// 반복 횟수
				System.out.print(a + "*" + i + "=" + a*i + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 3. 2번을 수정해서 구구단 2단에서 9단까지 출력한다
		for(int i = 1; i <= 9; i++) {		// x1 ~ x9
			for(int j = 2; j <= 9; j++) {	// 구구단 단수
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
		
		
	}
}
