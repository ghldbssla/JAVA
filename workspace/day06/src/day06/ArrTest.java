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
		String[] subjects = { "국어", "수학", "영어", "과학", "한국사" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < student.length; i++) {
			System.out.println((i+1)+"번째 학생의 점수 입력");
			for (int j = 0; j < subjects.length; j++) {
				System.out.println(subjects[j] + "점수 : ");
				student[i][j] = sc.nextInt();
				sum[i] += student[i][j];
			}
			avg[i] = sum[i] / 5.0;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 학생의 점수");
			for (int j = 0; j < 5; j++) {
				System.out.print(subjects[j] + "점수 : " + student[i][j]);

			}
//			System.out.print(subjects[0]+"점수 : "+student[i][0]);
//			System.out.print(subjects[1]+"점수 : "+student[i][1]);
//			System.out.print(subjects[2]+"점수 : "+student[i][2]);
//			System.out.print(subjects[3]+"점수 : "+student[i][3]);
//			System.out.print(subjects[4]+"점수 : "+student[i][4]);
			System.out.println("총점 : " + sum[i]);
			System.out.println("평균 : " + avg[i]);
			System.out.println("=========================================");
		}

	}
}
