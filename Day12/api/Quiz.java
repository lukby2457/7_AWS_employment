package api;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) throws InterruptedException {
		// Up/Down 게임 구현
		// 1. 정답이 될 숫자를 랜덤으로 뽑아둔다
		// 2. 사용자에게 값을 입력 받아서 정답과 맞는지 검사
		// - 맞으면 정답 후 입력 횟수를 출력
		// - 정답보다 작으면 UP을 출력 후 다시 입력 받는다
		// - 정답보다 크면 Down을 출력 후 다시 입력 받는다
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int n, wn, count = 0;
		long start, end;
		
		System.out.println("정수 생성중...(1 ~ 100)");
		n = ran.nextInt(100) + 1;
		Thread.sleep(2000);
		
		System.out.println("생성이 완료 되었습니다.");
		System.out.println("이제부터 타이머가 시작됩니다.");
		start = System.currentTimeMillis();
		
		while(true) {
			System.out.print("1에서 100 사이의 정수 입력 : ");
//			System.out.print(n);
			wn = sc.nextInt();
			count++;
			
			if(wn < 0 || wn > 100) {
				System.out.println("입력범위 초과 입니다");
				count--;
				continue;
			}
			else {
				if(wn == n) {
					System.out.println("\n정답 입니다.");
					System.out.printf("횟수 : %d\n", count);
					end = System.currentTimeMillis();
					break;
				}
				else if(wn < n) {
					System.out.println("UP\n");
					continue;
				}
				else {
					System.out.println("Down\n");
					continue;
				}
			}
		}
		
		System.out.printf("걸린 시간 : %.1f초", (end - start)/1000.0);
		
		sc.close();
		
	}
}
