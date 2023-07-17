package oop;

class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
}

class Car {
	String model;
	int speed;
	Person driver;
	
	Car(String model) {
		this.model = model;
		speed = 0;
	}
	
	void showCar() {
		String name = (driver == null) ? "x" : driver.name;
		
		System.out.printf("%s (%d km/h, %s)\n", model, speed, name);
	}
	
	void accel(int speed) {
		if(driver == null) {
			System.out.println("\n운전자가 없습니다");
			return;
		}
		
		// speed = (driver == null) ? 0 : speed;
		
		this.speed += speed;
		System.out.printf("\n%d km/h 가속\n", speed);
		showCar();
	}
	
	void break_(int speed) {
		if(driver == null) {
			System.out.println("\n운전자가 없습니다");
			return;
		}
		
		this.speed -= speed;
		System.out.printf("\n%d km/h 감속\n", speed);
		showCar();
	}
	
	void takeOn(Person driver) {
		this.driver = driver; 
		System.out.printf("\n%s(이)가 %s에 탑승\n", driver.name, this.model);
	}
	
	void takeOff() {
		if(speed != 0) {
			System.out.println("\n정차 후 하차해 주세요!!!");
			return;
		}
		System.out.printf("\n%s(이)가 %s에서 내렸습니다\n", driver.name, model);
		driver = null;
		showCar();
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 구현
		Person hong = new Person("홍길동");	// 필드 : 이름
		Car car = new Car("모닝");			// 필드 : 모델명, 속도, 운전자(= 사람)
		
		car.showCar();		// 모닝 (0 km/h, x)
		
		car.accel(30);		// 가속 메서드
							// 단, 운전자가 없으면 동작x
		
		car.takeOn(hong);	// 자동차에 사람을 탑승 시키는 메서드
							// 홍길동(이)가 모닝에 탑승
		
		car.showCar();		// 모닝 (0 km/h, 홍길동)
		
		car.accel(30);		// 30 km/h 가속
		
		car.break_(20);		// 20 km/h 감속
							// 모닝 (10 km/h, 홍길동)
		
		car.takeOff();		// 운전자가 하차하는 메서드
							// 단, 속도가 0이 아니면 하차 불가능
		
//		car.break_(10);
//		
//		car.takeOff();
	}
}
