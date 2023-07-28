package socket;

import java.io.IOException;
import java.net.Socket;

public class Ex01Client {
	public static void main(String[] args) throws IOException, IOException {
		Socket socket = new Socket("localhost", 10000);		// 루프백 (localhost = 127.0.0.1)
		
		System.out.println("서버에 연결 됨!!!");
		
		socket.close();
		System.out.println("\n연결이 종료 되었습니다");
	}
}
