package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class QuizProClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 12000);
		System.out.println("서버에 연결됨");
		
		// 1. 서버로 출력(writer), 서버로 부터 입력(scaner)
		PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
		Scanner input = new Scanner(socket.getInputStream());
		
		// 2. 내 콘솔창에서 입력(scanner)
		Scanner sc = new Scanner(System.in);
		String msg;
		
		// 3. 입력 쓰레드 생성
		Thread receive = new Thread(() -> {
			while (input.hasNextLine()) {
				System.out.println("입력 받은 데이터 : " + input.nextLine());
			}
		});
		
		receive.start();
		
		// 4. 출력 코드
		while (true) {
			System.out.print("\n입력 (0 : 종료) ");
			msg = sc.nextLine();
			
			if ("0".equals(msg)) { break; }
			
			output.println(msg);
		}
		
		// 5. 자원 해제
		sc.close();
		socket.close();
		System.out.println("서버와 연결이 종료 되었습니다");
	}
}

