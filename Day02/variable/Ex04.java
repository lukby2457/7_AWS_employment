package variable;

/*
	자바의 자료형		타입		크기			비고
	-----------------------------------------------
	boolean			논리		1bit
	char			문자		2byte
	byte			정수		1byte		-128 ~ 127
	short			정수		2byte
	int				정수		4byte		정수의 기본 타입
	long			정수		8byte
	float			실수		4byte
	double			실수		8byte		실수의 기본 타입
	
	- bit 와 byte
		- bit 	: 컴퓨터 데이터의 최소 단위. 2진수의 자리수를 표현
		- byte  : 파일의 최소 단위. 1byte = 8bit = 2^8 = 256 (0 ~ 255)
		
	2의 승수는 10승까지 그냥 외운다
	승 : 0 1 2 3 4  5  6  7   8   9   10
	값 : 1 2 4 8 16 32 64 128 256 512 1024
 */

public class Ex04 {
	public static void main(String[] args) {
		boolean bo = false;
		char ch = 'A';
		byte by = 127;
		short sh = 32767;
		int it = 2000000000;
		long lo = 3000000000L;	// literal : 상수를 의미
								// - 변수에 저장하지 않고 바로 사용되는 값을 의미
								// - literal은 기본 타입으로 공간이 임시로 잡힌다
		float fl = 1.23456789012345f;
		double db = 1.23456789012345;
		
		System.out.println("bo = " + bo);
		System.out.println("ch = " + ch);
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("it = " + it);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
	}
}
