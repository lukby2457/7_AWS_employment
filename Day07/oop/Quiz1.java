package oop;

class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void showCar() {
		System.out.printf("%s (%d km/h)\n\n", model, speed);
	}
	
	void accel(int speed) {
		this.speed += speed;
		
		System.out.println(speed + "km/h 가속");
		showCar();		// this.showCar();
	}
	
	void break_(int speed) {
		this.speed -= speed;
		
		System.out.println(speed + "km/h 감속");
		showCar();
	}
	
}

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 실행되게 클래스를 작성한다
		Car car = new Car("모닝");		// 필드 : 모델명, 속도
		
		car.showCar();		// 모닝 (0 km/h)
		
		car.accel(30);		// 30km/h 가속
							// 모닝 (30 km/h)
		
		car.accel(20);		// 20 km/h 가속
							// 모닝 (50 km/h)
		
		car.break_(15);		// 15 km/h 감속
							// 모닝 (35km/h)
		
	}
}
