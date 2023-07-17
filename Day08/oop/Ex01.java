package oop;

class Unit {
	String name;
	int atk, hp;
	
	Unit(String name, int atk, int hp) {
		this.name = name;
		this.atk = atk;
		this.hp = hp;
	}

	void showInfo() {
		System.out.printf("%s (atk %d, hp %d)\n", name, atk, hp);
	}
	
	void attack(Unit tar) {
		tar.hp -= atk;
		
		System.out.printf("\n%s(이)가 %s(을)를 공격!!!\n", name, tar.name);
		System.out.println(atk + "만큼 피해를 줬다\n");
		showInfo();
		tar.showInfo();
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Unit war = new Unit("전사", 10, 100);
		Unit wiz = new Unit("마법사", 15, 70);
		
		war.showInfo();		// 전사 (atk 10, hp 100)
		wiz.showInfo();		// 마법사 (atk 15, hp 70)
		
		// 상호작용 : 객체 간에 발생하는 동작/행위를 의미
		war.attack(wiz);	// Unit 간에 공격이라는 상호작용을 구성
		wiz.attack(war);
		
	}
}
