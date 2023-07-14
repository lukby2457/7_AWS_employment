package loop;

public class Ex07 {
	public static void main(String[] args) {
		// 지역변수 : 특정 영역 안에 포함된 변수를 의미
		// - 해당 영역에서 생성되고 그 영역이 끝나면 메모리에서 제거된다
		
		int i = 1;
		
		for (int j = 1; j <= 5; j++) {
			System.out.println(j + " : Hello World");
			i++;
		}
		
		System.out.println("반복 후 i = " + i);
//		System.out.println("반복 후 j = " + j);		
//		- j는 for문에서 생성된 지역 변수
//		- 따라서, for문이 끝나면 메모리에서 제거된다
		
	}
}
