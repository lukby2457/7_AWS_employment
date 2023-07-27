package quiz;

/*
	Seller 클래스와 Customer 클래스의 부모 역할을 하는 상위 클래스 입니다.
	Controller의 list를 id순으로 정렬을 위하여 Comparable 인터페이스를 상속 받았습니다
	equals()는 id중복 체크를 위하여 만들었습니다
 */

public class Member implements Comparable<Member>{
	@SuppressWarnings("unused")
	private String id, password, name;
	
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	@Override
	public int compareTo(Member m1) {
		return id.compareTo(m1.id);
	}
	
	@Override
	public String toString() {
		return String.format("아이디 : %s, 이름 : %s", id, name);
	}
}
