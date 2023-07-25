package collection;

import java.util.Comparator;
import java.util.TreeSet;

//1. Person 클래스를 작성
// - 필드는 이름, 나이만
class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d세)", name, age);
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
	// return 0는 객체를 하나로 인식함
	
	int getAge() {
		return age;
	}

}

public class Quiz1 {
	public static void main(String[] args) {
		// 2. TreeSet에 Person 3개 정도 저장후 출력
		// - 이름 순으로 오름차순 되게
		Person p1 = new Person("허진우", 24);
		Person p2 = new Person("김진우", 28);
		Person p3 = new Person("유은애", 23);
		
		TreeSet<Person> ts1 = new TreeSet<Person>();
		
		ts1.add(p1);
		ts1.add(p2);
		ts1.add(p3);
		System.out.println("ts1 = " + ts1);
		
		
		// 3. Comparator를 사용해서 나이 순으로 내림차순 후 출력
		Comparator<Person> ageDesc;
		
		ageDesc = (Person o1, Person o2) -> {
			return o2.getAge() - o1.getAge();
		};
		
		TreeSet<Person> ts2 = new TreeSet<Person>(ageDesc);
		
		ts2.addAll(ts1);
		System.out.println("ts2 = " + ts2);
	}
}
