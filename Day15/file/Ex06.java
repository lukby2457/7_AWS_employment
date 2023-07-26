package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("Ex05.class");
		byte[] buf = new byte[2048];
		
		fis.read(buf);
		System.out.println(Arrays.toString(buf));
		
		// ※ 바이트 배열 -> 문자열은 무자열 생성자로 손쉽게 처리가능
		String str = new String(buf, "UTF-8");
		System.out.println(str);
		
		System.out.println("파일 입력 완료~");
		fis.close();
	}
}
