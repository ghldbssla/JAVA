package test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("�� �� �Է����ּ���");
		a=sc.nextInt();
		System.out.println("�� �� �Է����ּ���");
		b=sc.nextInt();
		if(a==1) {
			c=a+11;
		}else {
			c=a-1;
		}
		if(b<20) {
			d=b+40;
			c--;
		}else {
			d=b-20;
		}
		System.out.println("�Է¹��� �ð���"+a+"��"+b+"�� �Դϴ�.");
		System.out.println("1�ð� 20�� �� �ð��� "+c+"��"+d+"�� �Դϴ�.");
	}
}
