package day03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//�Ǵ� >> or
		//������ ���α׷��� �� �ƴѰ���?
		//1.C���
		//2.JAVA
		//3.���վ�
		//4.���̽�
		//5.�ѱ���
		
		//�Է�
		//���� �Ѱ��� �޴´�.
		System.out.println("������ ���α׷��� �� �ƴѰ���?\n" + 
				"1.C���\n" + 
				"2.JAVA\n" + 
				"3.���վ�\n" + 
				"4.���̽�\n" + 
				"5.�ѱ���");
		Scanner sc=new Scanner(System.in);
		int num=0;
		num=sc.nextInt();
		//ó��
		// 1. �����϶�(�Է��� ���� 3 �Ǵ� 5)			"�����Դϴ�."
		// 2. �����϶�(�Է��� ���� 1 �Ǵ� 2 �Ǵ� 4)		"�����Դϴ�."
		// 3. �Ѵ� �ƴҶ�(�Է��� ���� 1�̸� �Ǵ� �ʰ�) 	"�߸� �Է� �ϼ̽��ϴ�."
		String result="";
//		result = (num==3 || num==5)?("�����Դϴ�.")
//				:(num==1 || num==2 || num==4)?("�����Դϴ�."):("�߸� �Է� �ϼ̽��ϴ�.");
		//				���� if�� �ٲ��ֱ�
		if(num==3 || num==5) {
			
			result = "�����Դϴ�.";
			
		}else if(num==1 || num==2 || num==4) {
			
			result = "�����Դϴ�.";
			
		}else {
			
			result = "�߸� �Է� �ϼ̽��ϴ�.";
			
		}
		//���
		//����� ����Ѵ�.
		System.out.println(result);
	}
}
