package bms.view;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ��� JDS bms ���α׷� �Դϴ�.");
		while(true) {
			
			System.out.println("1. ���༱��\n2. ������");
			int choice=sc.nextInt();

			//��Ʈ�ѷ� ����
			//Index class�� View���ε� ��Ʈ�ѷ��� �� �ȿ� �����Ƿ� MVC 1��
			if(choice==1) {
				//���༱���� �������Ƿ� ���ο� View���� �����־�� �ϰ�
				//BankChoiceView ������ ȣ��� ������ ������ ���´�.
				new BankChoiceView();
			}else if(choice==2) {
				System.out.println("�ȳ���������");
				break;
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}		
}
