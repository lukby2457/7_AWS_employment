package inheritence;

import other.Person;

class Airplane {
	private int n = 10;
	private Person[] sits = new Person[n];
	
//	private static int count = 0;
	
	public Airplane() {
		
	}
	
//	public void rideOn(Person per) {
//		count++;
//		if(count > n) {
//			System.out.println("좌석이 부족하여 탑승하실 수 없습니다\n");
//			return;
//		}
//		sits[count - 1] = per;
//		String msg = "%s(이)가 비행기에 탑승\n";
//		System.out.printf(msg, per.getName());
//	}
	
	// 강사 풀이
	public void rideOn(Person per) {
		for(int i = 0; i < n; i++) {
			if(sits[i] == null) {
				System.out.println(per.getName() + "님 탑승");
				sits[i] = per;
				return;
			}	
		}
		System.out.println("좌석이 부족합니다");
	}
	
//	public void list() {
//		int i = 0;
//		String list = "탑승객 목록 : ";
//		for(i = 0; i < sits.length - 1; i++) {
//			list += sits[i].getName() + ", ";
//		}
//		list += sits[i].getName() + "\n";
//		System.out.println(list);
//	}
	
	void list() {
		System.out.println("\n승객 목록)");
		for(int i = 0; i < n; i++) {
			System.out.print(i + 1 + "번 좌석 : ");
			if(sits[i] != null) {
				sits[i].showInfo();				
			}
			else {
				System.out.println("-- 빈좌석 --");
			}
		}
	}
	
	void emergency(Person per) {
		System.out.println("\n긴급 상황. 기내에서 의사를 찾습니다");
		for(int i = 0; i < n; i++) {
			if(sits[i] instanceof Doctor) {
				Doctor doc1 = (Doctor) sits[i];
				doc1.cure(per);
				return;
			}
		}
		System.out.println("비행기 승객 중 의사가 없습니다");
	}
	
}

public class Quiz2 {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 19, 93);
		Police pol = new Police("이민철", 26, "경장");
		Doctor doc = new Doctor("이국종", 43, "내과");
		Person per = new Person("박수진", 30);
		Person test = new Person("김수진", 30);
		
		Airplane air = new Airplane();
		
		air.rideOn(stu);	// 비행기에 '사람'이 탑승하는 메서드
		air.rideOn(pol);	// 좌석이 부족하면 탑승 불가능
		air.rideOn(doc);
		air.rideOn(per);
		air.rideOn(test);	// 좌석 부족 출력
		
		air.list();			// 탑승객 목록을 출력
		
		air.emergency(stu);	// 긴급상황 메서드
							// 기내에서 의사를 찾아서 전달된 사람을 치료
		
	}
}
