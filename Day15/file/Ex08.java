package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		// buffer 사용시
		// 1. 크기를 내가 맞출 필요 없음
		// 2. 속도 개선
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("eclipse.exe"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.exe"));
		
		System.out.println("읽고 쓰기 시작");
		long start = System.currentTimeMillis();
		int i;
		
		while((i = bis.read()) != -1) {
			bos.write(i);
		}
		long finish = System.currentTimeMillis();
		
		System.out.println("복사 완료~");
		System.out.println("걸린 시간 : " + ((finish - start)/1000.0));
		bis.close();
		bos.close();
	}
}
// 27