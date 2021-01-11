package bms.view;

import java.util.Scanner;

import bms.dao.BankDAO;

public class LoginView {
	public LoginView() {
		Scanner sc= new Scanner(System.in);
		BankDAO bdao = new BankDAO();
		System.out.print("계좌번호 : ");
		String account = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		//View단에는 기능 구현을 하지 않으므로  BankDAO에 login이라는
		//메소드로 기능 구현을 해놓고 View단에서는 호출하는 식으로만 사용한다.
		if(bdao.login(account, pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}
}
