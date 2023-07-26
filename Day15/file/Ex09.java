package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		// ※ 단순한 텍스트를 읽어올 땐 Scanner를 사용하면 더욱 쉽다
		File file = new File("C:\\Windows\\System32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
