package day07;

public class StorageTest {
	static int s_data = 10; // �ٸ� Ŭ�������� ������ ��������. -> MethodTask
	int data = 11;

	public static void main(String[] args) {
		int[] arData = { 10, 20, 30, 40, 50 };
		// arData�� ��������, �ε����� Heap������ ����(�̸� ���� �ּҰ��� ���� ������ ����)
		System.out.println(s_data);// static�ȿ��� static�� ��밡��
	}
}
