package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// ※ 배열은 초기화하지 않으면 '기본값'으로 자동 초기화 된다
		// 배열과 같이 사용하면 좋은 '클래스'가 있다
		boolean[] bos = new boolean[2];
		char[] chs = new char[5];
		int[] its = new int[8];
		double[] dbs = new double[3];
		String[] sts = new String[4];
		
		System.out.println("bos = " + Arrays.toString(bos));
		// toString() : 전달한 배열의 요소를 문자열로 작성해 반환해 준다.
		
		System.out.println("chs = " + Arrays.toString(chs));
		System.out.println("its = " + Arrays.toString(its));
		System.out.println("dbs = " + Arrays.toString(dbs));
		System.out.println("sts = " + Arrays.toString(sts));
		
		// boolean - false
		// int - 0
		// double - 0.0
		// char - \0(= 0)
		// String - null
	}
}
