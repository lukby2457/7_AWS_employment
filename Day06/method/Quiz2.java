package method;

public class Quiz2 {
	
	static int total(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	static double circle(double r) {
//		double cir = r * r * 3.14;
		return Math.PI * Math.pow(r, 2);
	}
	
	static int absolute(int n) {
		if(n < 0) {
			n = -n;
		}
		return n;
	}
	
	static int maxArr(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static boolean isPrime(int n) {
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if (n % i == 0) count++;
		}
		
		if (count == 2) return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		
		// 1. 1 ~ n까지의 합계를 반환흐는 메서드
		int sum = total(5);
		
		System.out.println("sum = " + sum);
		System.out.println("total(10) = " + total(10));
		
		// 2. 실수 전달 시 원 넓이를 반환하는 메서드
		// 실수는 반지름이고 PI는 3.14로 계산할 것
		double cir = circle(6.8);
		
		System.out.println("\ncir = " + cir);
		System.out.println("circle(8.88) = " + circle(8.88));
		
		// 3. 절대값을 반환하는 메서드
		int abs = absolute(-5);
		
		System.out.println("\nabs = " + abs);
		System.out.println("absolute(5) = " + absolute(5));
		
		// 4. 전달한 배열에서 최대값을 찾아서 반환
		int[] arr = new int[] { 70,50,80,90,60 };
		int max = maxArr(arr);
		
		System.out.println("\nmax = " + max);
		
		// 5. 소수를 판별하는 메서드
		// 소수가 맞으면 true, 아니면 false
		System.out.println("7은 소수? = " + isPrime(7));
		System.out.println("6은 소수? = " + isPrime(6));
		
		int count = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(isPrime(i)) {
				System.out.printf("%3d ",i);
				count++;
				
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
