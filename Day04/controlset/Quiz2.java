package controlset;

import java.util.Scanner;

// 조건문 PDF 10p

/*
	2. USB 한 개에 5000원 한다. 
	       그런데 한번에 10개 이상을 구매하면 전체의 10%를 할인해 준다.
	   100개 이상은 전체의 12%를 할인해준다. 
	   N개의 USB를 사려면 얼마가 있어야 하는가

*/

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int usb = 5000;
		int count, price;
		System.out.print("USB개수 입력 : ");
		count = sc.nextInt();
		
		price = usb * count;
		
		if (count >= 100) {
			// price = (int)(price * 0.88);
			
			price *= 0.88;
			// 복합 대입 연산은 좌변의 자료형으로 맞춰 계산된다
		}
		else if (count >= 10) {
			price *= 0.9;
		}
		
		System.out.printf("\n총 가격 : %d", price);
		
		
		sc.close();
		
	}
}
