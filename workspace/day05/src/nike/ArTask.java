package nike;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//�迭�� 1~10���� �ְ� ���
//		int[] arData = new int[10];
//		for (int i = 0; i <arData.length; i++) {
//			arData[i]=i+1;
//			System.out.println(arData[i]);
//		}
		//�迭�� 10~1���� �ְ� ���
//		int[] arData = new int[10];
//		for (int i = 0; i <arData.length; i++) {
//			arData[i]=10-i;
//			System.out.println(arData[i]);
//		}
		//����,����,����,����,�ѱ��� ���� �Է� �� ����, ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		String[] subjects= {"����","����","����", "����","�ѱ���"};
		int total=0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(subjects[i]+" : ");
			score[i]=sc.nextInt();
			total+=score[i];
		}
		System.out.println("���� : "+total);
		System.out.println("��� : "+(float)total/score.length);

	}
}