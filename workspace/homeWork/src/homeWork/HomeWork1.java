package homeWork;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		System.out.println("�ΰ��� ������ �Է��ϼ���(������ Enter��)");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("�ι�° ��/ù��° ��");
		System.out.println("�� = "+num2/num1+", ������ = "+num2%num1);
	}
}
