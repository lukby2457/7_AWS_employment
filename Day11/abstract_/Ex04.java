package abstract_;

class PC {
	
	void connect(Keyboard key) {
		key.run();
	}
	
	void connect(Disk disk) {
		disk.run();
	}
	
	void connect(Phone phone) {
		phone.run();
	}
}

class Keyboard {
	void run() {
		System.out.println("장치 발견. 장치 드라이버를 설치합니다");
		System.out.println("키보드가 활성화 되었습니다\n");
	}
}

class Disk {
	void run() {
		System.out.println("E:\\에 연결 되었습니다");
		System.out.println("사용 가능한 용량 982GB\n");
	}
}

class Phone {
	void run() {
		System.out.println("휴대폰이 감지되었습니다");
		System.out.println("갤러리를 열까요?\n");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		Keyboard key = new Keyboard();
		Disk hdd = new Disk();
		Phone pho = new Phone();
		
		pc.connect(key);
		pc.connect(hdd);
		pc.connect(pho);
	}
}
