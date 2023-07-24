package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String name;
	private int kor, eng, mat;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d)", name, getSum());
	}
	
	int getSum() {
		return kor + eng + mat;
	}

	@Override
	public int compareTo(Student o) {
		return o.getSum() - getSum();
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// 1. 학생 정보를 입력을 받는다
		// - 3명 정도 입력 받고, 이름 국영수를 입력 받는다
		String name;
		int n;
		int kor, eng, mat;
		
		// 2. 입력 받은 정보로 Student 인스턴스를 생성 및 리스트에 추가
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		
		System.out.print("학생수? ");
		n = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println((i+1) + "번째 학생");
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("국어 점수 입력 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			mat = sc.nextInt();
			System.out.println();
			
			list.add(new Student(name, kor, eng, mat));
		}
		sc.close();
		
//		System.out.println(list);
		
		// 3. 성적순으로 출력
		list.sort(null);
		System.out.println(list);
	}
}	
