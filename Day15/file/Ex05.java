package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test3.exe");
		String output = "Hello World!!!";
		
		fos.write(output.getBytes());
		
		System.out.println(Arrays.toString(output.getBytes()));
		System.out.println("파일 출력 완료~");
		fos.close();
	}
}
