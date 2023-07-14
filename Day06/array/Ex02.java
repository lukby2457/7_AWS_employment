package array;

public class Ex02 {
	public static void main(String[] args) {
		int arr[][] = new int[3][4];	// [행][열]
		
		System.out.println("arr의 크기 : " + arr.length);
		System.out.println("arr[0]의 크기 : " + arr[0].length + "\n");
		
		arr[0][2] = 14;
		arr[2][1] = 132;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
