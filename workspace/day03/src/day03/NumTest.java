package day03;

import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		//�Է�
		//	�� ���� �Է¹ޱ�
		int num1=0,num2=0;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		//ó��
		//	�� �� ��
		String result=num1>num2?"num1>num2 �Դϴ�.":
			(num1==num2?"�� ���� �����ϴ�.":"num1<num2 �Դϴ�.");
		//		1. num1�� num2���� ū ��� : "num1>num2 �Դϴ�."
		//		2. num1�� num2���� ���� ��� : "num1<num2 �Դϴ�."
		//���
		//	���� ����� ��Ÿ���� ���ڿ� ���
		System.out.println(result);
//		System.out.println("num1>num2 �Դϴ�.");//(num1>num2) true
//		System.out.println("num1<num2 �Դϴ�.");//(num1<num2) true
//		System.out.println("num1==num2 �Դϴ�.");//(num1==num2) true
//		System.out.println(   (10>3)?("10�� 3���� Ů�ϴ�."):3   );
//		String result=(10>3)?("10�� 3���� Ů�ϴ�."):"3";
		
		
	}
}
