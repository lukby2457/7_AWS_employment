package beans;

public class Toy {
	private Battery bat;	// 필드는 자동으로 기본값으로 초기화 (지역변수는 자동으로 초기화 x)
	
	public void run() {
		if(bat == null) {
			System.out.println("배터리가 없습니다.");
			return;
		}
		
		System.out.println("장난감이 움직입니다.");
	}

	public void setBat(Battery bat) {
		this.bat = bat;
	}
	
}
