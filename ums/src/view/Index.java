package view;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("1. ȸ������\n2. �α���\n3. ������");
			int choice=sc.nextInt();
			
			//��Ʈ�ѷ�
			if(choice==3) {
				break;
			}
			switch(choice) {
			case 1:
				//ȸ������
				new JoinView();
				break;
			case 2:
				//�α���
				new LoginView();
				break;
			}
		}
	}
}
