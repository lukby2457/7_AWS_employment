package array;

// 배열 PDF 9p, 10p)

public class Quiz2 {
	public static void main(String[] args) {
		// 9p
		int n = 8, count = 1;
		int[][] arr = new int[n][n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i * 8) + (j + 1);
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = count++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		
		// 10p
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) + (j * 8);
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
