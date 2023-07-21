package api;

import java.util.Arrays;

public class Ex03 {
	// main의 파라미터인 args는 프로그램(.class) 실행시 전달되는 값을 받아서 저장ㅎ나다
	// 1. cmd에서 쓰는법
	// - 해당 클래스가 있는 곳으로 cmd를 연다. ex) Day12/src/bin
	// - java 명령으로 실행하며 띄어쓰기로 값을 전달. ex) java api.Ex03 인자1 인자2
	
	// 2. eclipse에서 쓰는법
	// - 상단 메뉴에서 Run -> Run Configurations
	// - 열린 화면의 탭에서 Arguments에 인자값을 작성 후 저장 & 실행
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
	}
}
