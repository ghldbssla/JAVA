package day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="";
		String address="";
		
		System.out.print("�̸� : ");
		name = sc.next(); //��
		
		sc.nextLine();//���� �Է¿��� �������� ģ Enter�� �Ծ��ִ� ����
		
		System.out.print("�ּ� : ");
		address = sc.nextLine();
		
		System.out.println(name+"�� �ȳ��ϼ���");
		System.out.print("�ּ� : "+address);
	}
}
