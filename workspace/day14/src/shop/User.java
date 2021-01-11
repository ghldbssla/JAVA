package shop;

//DTO, VO : 단순히 정보만 담고있는 모델
public class User {
	String id;
	String pw;
	String name;
	String phone;
	int age;
	String addr;
	
	public User() {;}

	public User(String id, String pw, String name, String phone, int age, String addr) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.addr = addr;
	}

	
	
}
