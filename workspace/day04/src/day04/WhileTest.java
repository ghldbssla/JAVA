package day04;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("�ȳ��ϼ���~~\n�׸��Ϸ���  0�Է�");
			int num = new Scanner(System.in).nextInt();
			//���� sc�� ���� ����ϴ����� �ѹ��� ���Ŷ� �̷��� ��
			//   ==>   sc.nextInt();�� ����
			if (num == 0) {
				//if���� Ż���ϴ°��� �ƴ϶�, ��if���� ���ΰ� �ִ�
				//�ݺ����� Ż���Ѵ�.
				System.out.println("�ȳ�..");
				break;
			}
		}
	}
}
