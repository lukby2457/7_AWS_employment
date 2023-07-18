package other;

public class Funcs {
	public static int abs(int i) {
		if(i < 0) {
			i *= -1;
		}
		return i;
	}
	
	public static String toString(int[] arr) {
		int i = 0;
		String msg = "[";
		for(i = 0; i < arr.length - 1; i++) {
			msg += arr[i] + ", ";
		}
		msg += arr[i] + "]";	// 마지막에 ,가 붙으면 안 되므로 length-1까지 반복 후 arr[i]값을 마지막에 추가
		return msg;
	}
	
	public static int arrTotal(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int arrMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static boolean isPrime(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}
	
}
