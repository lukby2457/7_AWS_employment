package quiz;

/*
	Member클래스를 상속 받는 자식 클래스 입니다.
	toString을 부모로부터 오버라이드하여 Controller의 list의 객체를 출력하기 위하여 만들었습니다.
*/

public class Customer extends Member {
	private String address;
	
	public Customer(String id, String password, String name, String address) {
		super(id, password, name);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return String.format("아이디 : %s, 이름 : %s, 배송지 주소 : %s", getId(), getName(), address);
	}
	
}
