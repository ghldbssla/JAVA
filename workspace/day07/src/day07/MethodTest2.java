package day07;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest2 m = new MethodTest2(); //��üȭ
		m.guguDan();
	}
	void printDan(int num) {
		for (int i = 1; i <=9; i++) {
			System.out.println(num+"X"+i+"="+(num*i));
		}
	}
	void guguDan() {	//�ҽ��ڵ� ����ȭ�� ���� Ư������ �ο�
		System.out.println("������ ���");
		printDan(1);
		printDan(2);
		printDan(3);
		printDan(4);
		printDan(5);
		printDan(6);
		printDan(7);
		printDan(8);
		printDan(9);
		
	}
}
