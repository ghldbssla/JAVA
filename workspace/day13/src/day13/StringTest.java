package day13;

public class StringTest {
	public static void main(String[] args) {
		
		//동위 객체
		Test t1 = new Test(1);
		Test t2 = new Test(1);
		
		
		String msg1 = "Hello";
		String msg2 = "Hello";
		
//		System.out.println(msg1.hashCode()==msg2.hashCode());
//		System.out.println(t1.hashCode()==t2.hashCode());
		
		User user1 = new User(1, "정다솔");
		User user2 = new User(1, "정다솔");
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
		//obj 라는 객체는 모든 타입의 객체가 담길 수 있는 Object 클래스의 객체이다
		//따라서 어떤 객체가 들어오든 업캐스팅 된 채 담길 수 있다.

		//우리가 User 객체를 넘겼더라도 업캐스팅 된 채 넘어왔기 때문에
		//User 타입인지를 먼저 물어보고
		if(obj instanceof User) {
			//user라는 객체에 다운캐스팅을 해준다.
			User user = (User)obj;
			//그 후 현재 비교하는 대상과, 비교되는 대상 둘 다 userNum을 갖고 있기 때문에
			//그 값으로 비교를 해준다.
			return this.userNum == user.userNum;
		}
		//만약 User타입이 아니라면 서로 같은 객체일리가 없으므로 무조건 false
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







