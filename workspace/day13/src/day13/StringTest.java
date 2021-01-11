package day13;

public class StringTest {
	public static void main(String[] args) {
		
		//���� ��ü
		Test t1 = new Test(1);
		Test t2 = new Test(1);
		
		
		String msg1 = "Hello";
		String msg2 = "Hello";
		
//		System.out.println(msg1.hashCode()==msg2.hashCode());
//		System.out.println(t1.hashCode()==t2.hashCode());
		
		User user1 = new User(1, "���ټ�");
		User user2 = new User(1, "���ټ�");
		System.out.println(user1.equals(user2));
	}
}
class User{
	int userNum;
	String name;
	
	public User(int userNum, String name) {
		this.userNum = userNum;
		this.name = name;
	}
		
	@Override
	public boolean equals(Object obj) {
		//obj ��� ��ü�� ��� Ÿ���� ��ü�� ��� �� �ִ� Object Ŭ������ ��ü�̴�
		//���� � ��ü�� ������ ��ĳ���� �� ä ��� �� �ִ�.

		//�츮�� User ��ü�� �Ѱ���� ��ĳ���� �� ä �Ѿ�Ա� ������
		//User Ÿ�������� ���� �����
		if(obj instanceof User) {
			//user��� ��ü�� �ٿ�ĳ������ ���ش�.
			User user = (User)obj;
			//�� �� ���� ���ϴ� ����, �񱳵Ǵ� ��� �� �� userNum�� ���� �ֱ� ������
			//�� ������ �񱳸� ���ش�.
			return this.userNum == user.userNum;
		}
		//���� UserŸ���� �ƴ϶�� ���� ���� ��ü�ϸ��� �����Ƿ� ������ false
		return false;
	}
	@Override
	public int hashCode() {
		return this.userNum;
	}
}


class Test{
	int num;
	public Test(int num) {
		super();
		this.num = num;
	}
	@Override
	public int hashCode() {
		return num;
	}
}







