package day07;

public class MethodTest {
	public static void main(String[] args) {
		//System.out.println();// { }�� ���⶧���� �޼ҵ� ���
		MethodTest mt = new MethodTest();
		mt.f(1);
	}

	int add(int num1, int num2) {
		System.out.println("�� ������ ���� �޼ҵ� �Դϴ�.");
		System.out.println("ù��° ���� : " + num1);
		System.out.println("�ι�° ���� : " + num2);
//		System.out.println(num1+num2); �޼ҵ� ���ο��� ��� ��±��� ������.
		return num1 + num2;
	}

	void f(int num) {	//return�ڿ� ���� ���� �����Ƿ� �޼ҵ��� ����Ÿ���� void�̴�.
		if (num == 10) {
			return;		// �޼ҵ带 ��������.
		}
		System.out.println("num�� 10�� �ƴ� �����Դϴ�.");
		//return; void�������� return;�� �����ص� �����Ϸ��� �������.
	}
}
