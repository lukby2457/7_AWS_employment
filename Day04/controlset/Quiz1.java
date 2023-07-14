package controlset;

import java.util.Scanner;

// 조건문 PDF 9p

/*
	1. 국영수 세과목의 성적을 입력받아 합계와 평균을 구하고 등급 컷을 출력하세요
	 90이상 A등급
	 80이상 B등급 
	 70이상 C등급 
	 60이상 D등급 
	  그 아래 F등급
*/

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;
		String grade;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg < 90 && avg >= 80) {
			grade = "B";
		}
		else if (avg < 80 && avg >= 70) {
			grade = "C";
		}
		else if (avg < 70 && avg >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		// 100점 이상이나 음수가 나오면 다시 입력하게 만들어서 다듬는 것이 좋다
		
		System.out.printf("\n국어 점수 : %d, 영어 점수 : %d , 수학 점수 : %d", kor, eng, mat);
		System.out.printf("\n성적 합계 : %d, 평균 : %.1f, %s등급입니다", sum, avg, grade);
		
		sc.close();
		
	}
}
