package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) throws IOException {
		// 저장한 내용 불러오기
		File save = new File("E:\\JavaSave\\학생점수.txt");
		Scanner sc = new Scanner(save);
		String name;
		int kor, eng, mat, sum;
		double avg;
		
		System.out.println("불러오기 성공!!!");
		
		while(sc.hasNext()) {
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
			
			sum = kor + eng + mat;
			avg = sum / 3.0;
			
			System.out.println("\n이름 : " + name);
			System.out.printf("성적 : 국 : %d, 영 : %d, 수 : %d\n", kor, eng, mat);
			System.out.printf("합계 : %d (%.1f)\n", sum, avg);
		}
		
		sc.close();
	}
}
