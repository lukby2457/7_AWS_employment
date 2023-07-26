package file;

import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("test1.txt");	// 읽기는 파일이 없으면 파일미존재 에러 발생
		char[] buf = new char[100];		// 크기가 아무리 커도 속도제한때문에 제한이 걸린다
		
		fr.read(buf);
		
		System.out.println(buf);
		
		System.out.println("파일 읽기 완료~");
		fr.close();
	}
}
