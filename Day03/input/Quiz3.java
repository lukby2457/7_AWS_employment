package input;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 1. 국영수 점수를 입력 받을 변수를 선언
		int kor, eng, mat;
		int sum;
		double avg;
		
		// 2. 1번의 변수에 업력을 받는다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;

		// 3. 아래와 같이 출력
		// 결과)
		// 성적 : 국 80, 영 66, 수 92
		// 합계 : 238 (79.3)
		System.out.printf("\n성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d (%.1f)", sum, avg);
		
		sc.close();
	}
}
