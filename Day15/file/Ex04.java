package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("test2.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("\n읽어오기 완료~");
		br.close();
	}
}
