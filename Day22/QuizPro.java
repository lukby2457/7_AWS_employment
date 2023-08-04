package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class QuizPro  {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSk = new ServerSocket(12000);
		System.out.println("서버 On. 연결 대기중...");
		
		Socket clientSk = serverSk.accept();
		System.out.println("클라이언트 연결됨");
		
		// 1. 클라이언트로 출력(writer), 클라이언트로 부터 입력(scanner)
		PrintWriter output = new PrintWriter(clientSk.getOutputStream(), true);
		Scanner input = new Scanner(clientSk.getInputStream());
		
		// 2. 내 콘솔창에서 입력(scanner)
		Scanner sc = new Scanner(System.in);
		String msg;
		
		// 3. 입력 쓰레드 생성
		Thread receive = new Thread(() -> {
			try {
				while(input.hasNextLine()) {
					System.out.println("입력 받은 데이터 : " + input.nextLine());
				}
				
				System.out.println("접속 종료");
				clientSk.close();
				
			} catch(IOException e) {}
		});
		
		receive.start();
		
		// 4. 출력 코드
		while(true) {
			System.out.println("\n입력 (0 :  종료) : ");
			msg = sc.nextLine();
			
			if("0".equals(msg)) {break;}
			
			output.println(msg);
		}
		
		// 5. 자원 해제
		serverSk.close();
		sc.close();
		System.out.println("\n연결이 종료 되었습니다");
	}
}
