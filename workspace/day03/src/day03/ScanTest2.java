package day03;

import java.util.Scanner;

public class ScanTest2 {
	public static void main(String[] args) {
		String num1="",num2="";
		Scanner sc = new Scanner(System.in);
		
		num1=sc.next();
		num2=sc.next();
		//"����ȯ ������"�� �⺻Ÿ�Կ����� �����ϴ�.(Ŭ����Ÿ�������� - String)
		//System.out.println((int)num1+(int)num2);
		//Integer.parseInt("������ �� ���ڿ�") == ������ ����ȯ�� ��
		//Double.parseDouble ...>>����
		int realnum1=Integer.parseInt(num1);
		int realnum2=Integer.parseInt(num2);
		System.out.println(realnum1+realnum2);
	}
}
