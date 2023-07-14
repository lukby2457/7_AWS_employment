package loop;

// 반복문 PDF 14p)

public class Quiz2 {
	public static void main(String[] args) {
		//1 ~ 1000까지의 합을 구하시오
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += i;
			
			// 디버깅
//			System.out.printf("i = %d, total = %d\n", i, sum);
		}
		System.out.println("1 ~ 1000의 합 : " + sum);
		
		System.out.println();
		
		// 1 ~ 1000까지의 합을 구하시오 (3의 배수 제외)
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 != 0) {
				sum += i;
//				System.out.printf("i = %d, total = %d\n", i, sum);
			}
		}
		System.out.println("1 ~ 1000의 합(3의 배수 제외) : " + sum);
		
		System.out.println();
		
		// 1 ~ 1000까지의 합을 구하시오 (3의 배수 제외)
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 != 0 || i % 5 == 0) {
				sum += i;
//				System.out.printf("i = %d, total = %d\n", i, sum);
			}
			
		}
		System.out.println("1 ~ 1000의 합(3의 배수 제외, 3의 배수이면서 5의 배수 포함) : " + sum);
		
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				
			}
			else if (i % 3 == 0) {
				continue;
			}
			
			sum += i;
		}
		System.out.println("1 ~ 1000의 합(3의 배수 제외, 3의 배수이면서 5의 배수 포함) : " + sum);
		
		System.out.println();
		
		// factorial
		long fac = 1L;
		for(int i = 1; i <= 5; i++) {
			fac *= i;
		}
		System.out.println("fac = " + fac);
	}
}
