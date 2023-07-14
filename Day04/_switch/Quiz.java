package _switch;

import java.util.Scanner;

// 조건문  PDF 9p를 switch로 풀어보세요

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;
		String grade;
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		int tmp = (int)(avg/10);
		
		switch(tmp) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		
		System.out.printf("\n국어 점수 : %d, 영어 점수 : %d , 수학 점수 : %d", kor, eng, mat);
		System.out.printf("\n성적 합계 : %d, 평균 : %.1f, %s등급입니다", sum, avg, grade);
		
		sc.close();
	}
}
