package interface_;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
	private String name;
	private int kor;
	private int eng;
	private int mat;
//	private int sum;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
//		this.sum = kor + eng + mat;
	}

	public int getSum() {
		return kor + eng + mat;
	}
	
	@Override
	public String toString() {
		String msg = "%s (합계 : %d)";
		msg = String.format(msg, name, getSum());	//printf사용을 못할 때 사용하는 함수
		
		return msg;
	}

	@Override
	public int compareTo(Student o) {
		return getSum() - o.getSum();
	}

	
}

public class Quiz2 {
	public static void main(String[] args) {
		// 아래 클래스를 작성 후 성적 순으로 내림 차순으로 출력
		Student[] stus = new Student[] {
				new Student("홍길동", 70, 80, 98),
				new Student("김민지", 90, 77, 85),
				new Student("박철민", 88, 91, 70)				
		};
		
		Arrays.sort(stus);
		System.out.println("stus = " + Arrays.toString(stus));
		
		
		Comparator<Student> desc = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return -o1.getSum() - o2.getSum();
			}
		};
		Arrays.sort(stus, desc);
		System.out.println("stus = " + Arrays.toString(stus));
		
		
	}
}
