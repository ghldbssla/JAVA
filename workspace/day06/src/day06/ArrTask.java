package day06;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		int[][] money = new int[3][5];
		int[] sum = new int[3];
		int total = 0;
		// 101ȣ:
		// 102ȣ:
		// ...
		// 305ȣ:
		// -----��ºκ�-----------
		// 1�� ����:
		// 2�� ����:
		// 3�� ����:
		// ����:
		System.out.println("ȣ,���� �˸°� ������ �Է��ϼ���.(����:����)");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < money.length; i++) {
			for (int j = 1; j <= money[0].length; j++) {
				System.out.print((i+1)+"0"+ j + "ȣ : ");
				sum[i] += sc.nextInt();
			}
		}
		for (int i =0 ; i < sum.length; i++) {
			System.out.println((i+1) + "�� ���� : " + sum[i] + "����");
			total += sum[i];
		}
		System.out.println("���� : " + total + "����");
	}
}
