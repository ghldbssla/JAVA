package multi_interitance;

public class D extends C implements A {
	@Override
	public void intro() {
		//A.super.intro();�� ���� A.intro()�� ����
		A.super.intro();
	}

	public static void main(String[] args) {
		D d = new D();
		d.intro();
	}
}
