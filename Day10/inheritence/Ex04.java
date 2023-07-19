package inheritence;

import other.Person;

public class Ex04 {
	public static void main(String[] args) {
		// 다운 캐스팅을 잘못하면 에러가 발생한다
		// - 이를 탐지하기 위한 키워드가 존재한다
		
		Person p1 = new Student("홍길동", 19, 93);
		Person p2 = new Police("이민철", 26, "경장");
		
		System.out.println(p1 instanceof Student);
		// - p1은 Student의 인스턴스가 맞습니까? true
		System.out.println(p1 instanceof Police);
		// - p1은 Police의 인스턴스가 맞습니까? false
		
		System.out.println(p2 instanceof Student);
		// - p2은 Student의 인스턴스가 맞습니까? false
		System.out.println(p2 instanceof Police);
		// - p2은 Police의 인스턴스가 맞습니까? true
	}
}
