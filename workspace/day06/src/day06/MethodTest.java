package day06;

public class MethodTest {
	public static void main(String[] args) {
	//f(x)=2x+1 ����	
		System.out.println(f(3));//f(3)�� ��ä�� ���ϰ����� �ٲ��.
	}
	//f(x)=2x+1 �����
	public static int f(int x) {
		return x*2+1;	//���ϰ��� int�� public static int f(int x)
						//void �ڸ��� ���ϰ��� �ڷ������� ����.
	}
}
