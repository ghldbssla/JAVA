package view;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ��� UMS ���α׷� �Դϴ�.");
		while(true) {
			System.out.println("1. ȸ������\n2. �α���\n3. ���̵�/��й�ȣ ã��\n4. ������");
			int choice=sc.nextInt();
			if(choice==4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			//��Ʈ�ѷ� ����(�˸��� View �����ڷ� ȣ��)
			switch(choice) {
			case 1:
				//ȸ������
				new Join();
				break;
			case 2:
				//�α���
//				new Login();
				new LoginWindow();
				break;
			case 3:
				//���̵�/��й�ȣ ã��
				new FindIdPw();
				break;
			}
		}
		
	}
}


