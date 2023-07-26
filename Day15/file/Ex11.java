package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws IOException {
		// 입력 받은 내용을 파일로 저장
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, sum;
		double avg;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.println("\n이름 : " + name);
		System.out.printf("성적 : 국 %d, 영 : %d, 수 : %d\n", kor, eng, mat);
		System.out.printf("합계 : %d (%.1f)\n", sum, avg);
		
		// 파일로 저장하기
		File path = new File("E:\\JavaSave");
		File save = new File(path, "학생점수.txt");
		
		if(path.exists() ==  false) {
			path.mkdir();
		}
		
		String context = String.format("%s %d %d %d\n", name, kor, eng, mat);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(save, true));
		// FileWriter에 true는 내용을 추가하겠다는 의미
		
		bw.write(context);
		
		
		System.out.println("학생점수.txt로 저장했습니다");
		bw.close();
		sc.close();
	}
}
