package shop;

//DTO, VO : �ܼ��� ������ ����ִ� ��
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
