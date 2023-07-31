package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class QuizClient {
	Socket socket;
	
	PrintWriter output;
	Scanner sc;
	
	Scanner input;
	
	public QuizClient() {
		try {
			socket = new Socket("localhost", 30000); 
			System.out.println("서버에 연결됨");
			
			output = new PrintWriter(socket.getOutputStream(), true);
			sc = new Scanner(System.in);
			
			input = new Scanner(socket.getInputStream());
			
			ReadThread rt = new ReadThread();
			Thread t1 = new Thread(rt);
			t1.start();
			
			while(true) {
				System.out.print("입력 : ");
				String msg = sc.nextLine();
				
				if("0".equals(msg)) {break;}
				
				output.println(msg);
			}
			sc.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class ReadThread implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					if(input.hasNextLine()) {
						System.out.println("입력 받은 데이터 : " + input.nextLine());
					}
				} catch (Exception e) {
					System.err.println("키보드 에러 발생 : " + e.getMessage());
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new QuizClient();
		
		System.out.println("연결 종료");
		
	}
}
