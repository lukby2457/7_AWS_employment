package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss E요일");
		
		System.out.println("date = " + date);	//toString이 이미 오버라이드 되어 있다
		
		String time = sdf.format(date);
		System.out.println("time = " + time);
		
	}
}
