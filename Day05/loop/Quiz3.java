package loop;

// 반복문 PDF 15p)

public class Quiz3 {
	public static void main(String[] args) {
		int money = 1;
		int total = 0;
		
		for(int day = 1; day <= 30; day++) {
			total += money;
			
			// 디버깅
//			System.out.printf("(%d일) 예금 : %d원, 총액 : %d원\n", day, money, total);
			
			money *= 2;
			
		}
		
		System.out.println("총 금액 : " + total + "원");
		
	}
}
