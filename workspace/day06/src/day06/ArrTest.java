package day06;

import java.util.Scanner;

public class ArrTest {
	public static void main(String[] args) {
		int[] score_stu1 = { 100, 90, 80, 70, 60 };
		int[] score_stu2 = { 90, 90, 90, 90, 90 };
		int[] score_stu3 = { 10, 10, 10, 10, 10 };
		int[][] student = new int[3][5];
		int[] sum = new int[3];
		double[] avg = new double[3];
		String[] subjects = { "����", "����", "����", "����", "�ѱ���" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < student.length; i++) {
			System.out.println((i+1)+"��° �л��� ���� �Է�");
			for (int j = 0; j < subjects.length; j++) {
				System.out.println(subjects[j] + "���� : ");
				student[i][j] = sc.nextInt();
				sum[i] += student[i][j];
			}
			avg[i] = sum[i] / 5.0;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "��° �л��� ����");
			for (int j = 0; j < 5; j++) {
				System.out.print(subjects[j] + "���� : " + student[i][j]);

			}
//			System.out.print(subjects[0]+"���� : "+student[i][0]);
//			System.out.print(subjects[1]+"���� : "+student[i][1]);
//			System.out.print(subjects[2]+"���� : "+student[i][2]);
//			System.out.print(subjects[3]+"���� : "+student[i][3]);
//			System.out.print(subjects[4]+"���� : "+student[i][4]);
			System.out.println("���� : " + sum[i]);
			System.out.println("��� : " + avg[i]);
			System.out.println("=========================================");
		}

	}
}
