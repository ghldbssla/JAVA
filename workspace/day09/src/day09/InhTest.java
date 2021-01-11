package day09;

public class InhTest {
	public static void main(String[] args) {
		C c = new C(); // 부모의 필드가 먼저 생기고 밑에 자식클래스가 붙어서 c에 그 주솟값을 저장한다.
		//따라서 부모클래스의 생성자도 호출이된다.
		c.function();
	}
}
class P{
	int intData;
	String strData;
	P(){}
	void p(int data1,String data2) {
		this.intData=data1;
		this.strData=data2;
	}
	void function() {
		System.out.println("부모 클래스의 메소드");
	}
}
class C extends P{
	public C() {
		//super(10,""); 이렇게 지정을 해줄수 없어서 부모클래스에 기본생성자를 오버로딩한다.
		//super은 부모클래스의 이름을 뜻한다. P();와같음 -> 부모클래스의 생성자
		//부모클래스의 생성자가 기본 생성자라면 super();을 생략해도 된다.(자동으로 만들어줌)
	}
}