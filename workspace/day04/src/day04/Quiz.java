package day04;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// �Ǵ� >> or
		// ������ ���α׷��� �� �ƴѰ���?
		// 1.C���
		// 2.JAVA
		// 3.���վ�
		// 4.���̽�

		// �Է�
		// ���� �Ѱ��� �޴´�.
		int num=0;
		Scanner sc = new Scanner(System.in);
		String result = "";
//~~�̰�,~~�׸���,~~�ϰ� -------and
//~~�ų�,~~�Ǵ�             -------or
		do{
			System.out.println("������ ���α׷��� �� �ƴѰ���?\n" + "1.C���\n" + "2.JAVA\n" + "3.���վ�\n" + "4.���̽�\n"+"0.�����ϱ�");
			num = sc.nextInt();
			// ó��
			// 1. �����϶�(�Է��� ���� 3 �Ǵ� 5) "�����Դϴ�."
			// 2. �����϶�(�Է��� ���� 1 �Ǵ� 2 �Ǵ� 4) "�����Դϴ�."
			// 3. �Ѵ� �ƴҶ�(�Է��� ���� 1�̸� �Ǵ� �ʰ�) "�߸� �Է� �ϼ̽��ϴ�."
//		result = (num==3 || num==5)?("�����Դϴ�.")
//				:(num==1 || num==2 || num==4)?("�����Դϴ�."):("�߸� �Է� �ϼ̽��ϴ�.");
			// ���� if�� �ٲ��ֱ�

			switch (num) {
			case 3:
				result = "�����Դϴ�.";
				break;
			// break�� �������� �پ��� ���� �ѹ��� �����Ѵ�
			// 1�϶��� case�� 1->2->4������ ���� 4�� ������ �����ѵ� break�� �ȴ�.
			case 1:
			case 2:
			case 4:
				result = "�����Դϴ�.";
				break;
			case 0:
				result = "�ȳ��� ������";
				break;
			default:
				result = "�߸� �Է� �ϼ̽��ϴ�.";
			}
			// ���
			// ����� ����Ѵ�.
			System.out.println(result);
		}while (num != 3 && num!= 0);
	}
}
