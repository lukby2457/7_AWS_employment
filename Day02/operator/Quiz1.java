package operator;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 국영수 점수를 저장할 변수를 선언
		// 단, 정수형으로 선언
		int kor, eng, mat;
		int sum;
		double avg;
		
		// 2. 1변의 변수에 데이터를 채운다
		kor = 70;
		eng = 80;
		mat = 98;
		
		// 3. 출력 결과는 아래와 같다 (소수점 제어는 하지 않아도 된다)
		// 결과)
		// 성적 : 국 70, 영 80, 수 98
		// 합계 : 248
		// 평균 : 82.67
		
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d\n", (kor + eng + mat));
		System.out.printf("평균 : %.2f\n", ((kor + eng + mat)/(double)3));
		System.out.println();
		
		sum = kor + eng + mat;
		avg = sum / (double)3;
		
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		// Math : 수학 관련 함수(= 기능)을 가진 클래스
		// round() 함수 : 전달한 실수를 반올림 한다
		avg = Math.round(avg * 100) / 100.0;
		
		System.out.println("avg = " + avg);
	}
}
