package day03;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		//�Է� -> ó�� -> ���
		
		//�Է�
		//	���� 2��
		int num1=0,num2=0;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		//ó��
		//	���� ���� ���Ǽ� ������
		double result = (num1+0.0)/num2;
		//���
		//	���� ��� ���
		System.out.println(result);
	}
}
