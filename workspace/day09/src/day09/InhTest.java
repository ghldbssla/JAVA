package day09;

public class InhTest {
	public static void main(String[] args) {
		C c = new C(); // �θ��� �ʵ尡 ���� ����� �ؿ� �ڽ�Ŭ������ �پ c�� �� �ּڰ��� �����Ѵ�.
		//���� �θ�Ŭ������ �����ڵ� ȣ���̵ȴ�.
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
		System.out.println("�θ� Ŭ������ �޼ҵ�");
	}
}
class C extends P{
	public C() {
		//super(10,""); �̷��� ������ ���ټ� ��� �θ�Ŭ������ �⺻�����ڸ� �����ε��Ѵ�.
		//super�� �θ�Ŭ������ �̸��� ���Ѵ�. P();�Ͱ��� -> �θ�Ŭ������ ������
		//�θ�Ŭ������ �����ڰ� �⺻ �����ڶ�� super();�� �����ص� �ȴ�.(�ڵ����� �������)
	}
}