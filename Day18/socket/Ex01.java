package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 단방향
// - 클라이언트 -> 서버
public class Ex01 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSk = new ServerSocket(10000);
		System.out.println("서버 On. 연결 대기중 ...");
		
		Socket clientSk =  serverSk.accept();
		System.out.println("클라이언트 연결 되었습니다");
		
		Scanner sc = new Scanner(clientSk.getInputStream());
		// - 클라이언트의 입력을 읽을 Scanner
		// - 클라이언트가 연결을 끊으면 제거됨
		
		while(sc.hasNextLine()) {
			System.out.println("받은 데이터 : " + sc.nextLine());
		}
		
		serverSk.close();
		clientSk.close();
		System.out.println("\n연결이 종료 되었습니다");
	}
}
