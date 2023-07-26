package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
	보조 스트림 : 입출력을 좀 더 효율적으로 돕는 객체
	
	바이트 단위 : BufferedInputStream, BufferedOutputStream
	문자 단위 : BufferedReader, BufferedWriter
 */

public class Ex03 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("test2.txt");
		BufferedWriter bw = new BufferedWriter(fw);		// 의존성 주입
		
		bw.write("보조 스트림을 활용한 출력\n");
		bw.write("차이를 모르겠는데?");
		
		System.out.println("파일 출력 완료~");
		bw.close();
	}
}
