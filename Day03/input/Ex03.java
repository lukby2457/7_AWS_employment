package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		System.out.print("boolean 입력 : ");
		bo = scan.nextBoolean();
		
		System.out.println("bo = " + bo);
		
		System.out.print("byte 입력 : ");
		by = scan.nextByte();
		
		System.out.println("by = " + by);
		
		System.out.print("short 입력 : ");
		sh = scan.nextShort();
		
		System.out.println("sh = " + sh);
		
		System.out.print("int 입력 : ");
		it = scan.nextInt();
		
		System.out.println("it = " + it);
		
		System.out.print("long 입력 : ");
		lo = scan.nextLong();
		
		System.out.println("lo = " + lo);
		
		System.out.print("float 입력 : ");
		fl = scan.nextFloat();
		
		System.out.println("fl = " + fl);
		
		System.out.print("double 입력 : ");
		db = scan.nextDouble();
		
		System.out.println("db = " + db);
		
		scan.close();
	}
}
