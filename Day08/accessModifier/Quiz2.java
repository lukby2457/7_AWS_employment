package accessModifier;

class Human {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Car {
	private String model;
	private int speed;
	
	private int n = 4;	// 좌석수
	private Human[] sits = new Human[n];	// 좌석 (0번이 운전자)
	
	public Car(String model) {
		this.model = model;
	}
	
	public void rideOn(Human hu, int seat) {
		if(sits[seat] != null) {
			System.out.println("\n이미 탑승하고 있는 사람이 있습니다\n");
			return;
		}
		this.sits[seat] = hu;
	}
	
	public void showCar() {
		String msg = "%s (%d km/h) ";
		System.out.printf(msg, model, speed);
		for(int i = 0; i < sits.length; i++) {
			String seat = (sits[i] == null) ? "x" : sits[i].getName();
			System.out.print(seat + " ");
		}
		System.out.println();
	}
	
	public void accel(int speed) {
		System.out.println();
		if (sits[0] == null) {
			System.out.println("\n운전자가 존재하지 않습니다!!!\n");
			return;
		}
		this.speed += speed;
		showCar();
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Car car = new Car("쏘나타");
		
		Human h1 = new Human("홍길동");
		Human h2 = new Human("이춘향");
		Human h3 = new Human("김진우");
		Human h4 = new Human("김점례");
		
		car.rideOn(h1, 0);	// 자동차에 사람이 탑승
							// 지정한 자리(0)에 탑승 시킨다
							// 이미 사람이 있다면 경고문 출력
		
		car.showCar();		// 모델명 속도 탑승자들을 출력
		
		car.rideOn(h2, 0);
		car.rideOn(h2, 1);
		car.rideOn(h3, 2);
		car.rideOn(h4, 3);
		
		car.showCar();
		
		car.accel(30);		// 가속 메서드
							// 운전자가 없으면 가속 불가
	}
}
