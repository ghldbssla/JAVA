package day06;

import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		int  n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 ĭ��: ");
		n=sc.nextInt();
		int[] arData = new int[n];
		for (int i = 0; i < arData.length; i++) {
			arData[i]=sc.nextInt();
		}
		
		//arData�� 0���� : 10
		//arData�� 1���� : 20
		//forEach���� ����(�ε��� ��ȣ�� �ʿ�)
		
		//�ε����� �ʿ���������, 0������ �������� ���� ������ �ϴ�
		//�ܼ��� ������� ���� ������ �� => forEach��
		for(int data : arData) {
			//ù��° �ݺ��� data == arData[0]
			//�ι�° �ݺ��� data == arData[1]
			System.out.println(data);
		}
	}
}
