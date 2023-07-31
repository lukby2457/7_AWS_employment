package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// Ex02의 양방향 (= 반이중) 코드를 참고해서
// 멀티쓰레드를 활용해서 전이중 통신을 구현
public class Quiz {
	ServerSocket serverSk;
	Socket clientSk;
	Scanner input;
	
	PrintWriter output;
	Scanner sc;
	
	public Quiz() {
		try {
			serverSk = new ServerSocket(30000);
			System.out.println("서버 On. 연결 대기중...");
			
			clientSk = serverSk.accept();
			System.out.println("클라이언트 연결됨");
			
			input = new Scanner(clientSk.getInputStream());
			
			sc = new Scanner(System.in);
			output = new PrintWriter(clientSk.getOutputStream(), true);
			
			WriteThread wt = new WriteThread();
			Thread t1 = new Thread(wt);
			t1.start();
			
			while(true) {
				String msg = "";
				if(input.hasNextLine()) {
					msg = input.nextLine();
					System.out.println("입력 받은 데이터 : " + msg);
				}
				if(msg.equals("0")) {
					break;
				}
			}
			serverSk.close();
			clientSk.close();
			
			
		} catch (IOException e) {
			System.err.println("소켓 에러 발생 : " + e.getMessage());
		}
	}
	
	class WriteThread implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					System.out.print("입력 : ");
					String msg = sc.nextLine();
					
					if("0".equals(msg)) {break;}
					
					output.println(msg);
				} catch (Exception e) {
					System.err.println("키보드 에러 발생 : " + e.getMessage());
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		new Quiz();
		
		System.out.println("연결 종료");
		
	}
}
