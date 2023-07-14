package controlset;

import java.util.Scanner;

// 조건문 PDF 10p

/*
	3. 버스는 10 정거장 미만일 경우 각 역 평균 이동 시간이 2 분 소요되며,
	   10 정거장이 넘으면 4분의 소요시간이 걸린다. 
	       정거장 수를 입력하면 소요시간을 계산하여 출력하시오 
	   (간단하게 10 이상이면 전역 * 4, 10미만이면 전역 * 2) 
	   
	   	출력> 정거장 수 : 8 총 소요 시간은 16분 입니다.
		정거장 수 : 16 총 소요 시간은 1시간 4분 입니다

*/

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sta, time, hour, min;
		System.out.print("정거장 수 : ");
		sta = sc.nextInt();
		
		time = sta * 2;
//		if(sta >= 10) {
//			time *= 2;
//		}
		time *= (sta >= 10) ? 2 : 1;
		
		hour = time / 60;
		min = time % 60;
		
		if (hour >= 1) {
			System.out.printf("총 소요 시간은 %d시간 %d분 입니다", hour, min);
		}
		else {
			System.out.printf("총 소요 시간은  %d분 입니다", min);
		}
		
		sc.close();
		
	}
}
