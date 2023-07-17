package accessModifier;

import other.Person;

// import other.Unit;
// - package 클래스는 외부로 가져올 수 없음

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person("박민수", 15, 165.3);
//		other.Person per = new other.Person("박민수", 15, 165.3); import를 사용하지 않을 시
		
		per.showInfo();
	}
}
