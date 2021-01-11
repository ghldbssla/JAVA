package bms.view;

import java.util.Scanner;

public class BankChoiceView {
	public BankChoiceView() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 국민은행\n2. 우리은행\n3. 신한은행\n4. 로그인\n5. 뒤로가기");
			int choice = sc.nextInt();
			if(choice==5) { break; }
			//각 은행에 맞는 은행View단을 띄워주어야 하므로 컨트롤러가 필요하다
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
