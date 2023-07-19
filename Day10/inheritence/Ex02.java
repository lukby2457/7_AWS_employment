package inheritence;

import other.Person;

class Police extends Person {
	private String rank;
	
	public Police(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}
	
	@Override
	public void showInfo() {
		String msg = "%s (%d세, %s)\n";
		System.out.printf(msg, name, age, rank);
	}
	
	void patrol(String area) {
		String msg = "%s %s(이)가 %s(을)를 순찰합니다\n";
		System.out.printf(msg, rank, name, area);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Police pol = new Police("김수빈", 30, "순경");
		
		pol.eat("빵");
		pol.showInfo();
		pol.patrol("센텀시티");
	}
}
