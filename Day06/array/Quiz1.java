package array;

import java.util.Arrays;
import java.util.Scanner;

// 배열 PDF 6p)

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 학생 5명의 점수를 저장할 수 있는 배열을 생성
		int n = 5;
		int[] arr = new int[n];
		
		// 2. 해당 배열에 점수를 입력
		for(int i = 0; i < n; i++) {
			System.out.printf("%d번 학생 점수 입력 : ", (i + 1));
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		// 3. 입력 받은 배열의 내용을 일렬로 출력
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println("점수 목록 : " + Arrays.toString(arr));
		
		// 4. 학생들 점수의 합계와 평균을 출력
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / n;
		System.out.printf("학생들 점수 합계 : %d, 평균 : %.1f", sum, avg);
		System.out.println();
		
		// 5. 가장 높은 점수와 가장 낮은 점수를 출력
		int max = arr[0];
		int min = arr[0];
		boolean tf = false;
		
		for(int i = 0; i < n; i++) {
			tf = max < arr[i];
			if(tf == true) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			tf = min > arr[i];
			if(tf == true) {
				min = arr[i];
			}
		}
		
		System.out.printf("가장 높은 점수 : %d, 가장 낮은 점수 : %d\n", max, min);
		
		// 6. 낮은 순에서 높은 순의 점수로 정렬 (= 오름차순 정렬)
		int a = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i] < arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
		// 선택 정렬(강사 풀이)
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] < arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		
//		System.out.printf("가장 높은 점수 : %d, 가장 낮은 점수 : %d\n", arr[n - 1], arr[0]);
		
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
		sc.close();
	}
}
