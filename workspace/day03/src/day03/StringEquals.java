package day03;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg1="",msg2="";
		msg1="Apple1234";
		msg2=sc.next();
		//���ڿ��� ==���� ���ϴ� ���� �ƴϰ�,
		//���ҹ��ڿ�.equals(���ο� ���ڿ�)
		//�� �̿��Ѵ�.
		//equals�� ()�� �޼ҵ��ΰ��� �˼� �ְ�, ���ҹ��ڿ�.���� StringŬ���� �ȿ� �ִ� �޼ҵ��ΰ� �� �� �ִ�.
		if(msg1.equals(msg2)) {
			//�Է��� ���ڿ��� "Apple1234"�� ���� ���
			System.out.println("���� ���ڿ�");
		}else {
			//�Է��� ���ڿ��� "Apple1234"�� �ٸ� ���
			System.out.println("�ٸ� ���ڿ�");			
		}
	}
}
