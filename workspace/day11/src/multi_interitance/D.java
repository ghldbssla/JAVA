package multi_interitance;

public class D extends C implements A {
	@Override
	public void intro() {
		//A.super.intro();를 쓰면 A.intro()가 실행
		A.super.intro();
	}

	public static void main(String[] args) {
		D d = new D();
		d.intro();
	}
}
