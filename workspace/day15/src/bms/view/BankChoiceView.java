package bms.view;

import java.util.Scanner;

public class BankChoiceView {
	public BankChoiceView() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ��������\n2. �츮����\n3. ��������\n4. �α���\n5. �ڷΰ���");
			int choice = sc.nextInt();
			if(choice==5) { break; }
			//�� ���࿡ �´� ����View���� ����־�� �ϹǷ� ��Ʈ�ѷ��� �ʿ��ϴ�
			switch (choice) {
			case 1:
				new KookminView();
				break;
			case 2:
				new WooriView();
				break;
			case 3:
				new ShinhanView();
				break;
			case 4:
				new LoginView();
				break;
			}
		}
	}
}
