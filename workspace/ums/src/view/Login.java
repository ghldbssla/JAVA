package view;

import java.util.Scanner;

import dao.UserDAO;

public class Login {
	UserDAO udao = new UserDAO();
	public Login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userid=sc.next();
		System.out.print("비밀번호 : ");
		String userpw=sc.next();
		int result = udao.login(userid, userpw);
		if(result==-1) {
			System.out.println("아이디 오류. 아이디를 확인해 주세요");
		}else if(result==0) {
			System.out.println("비밀번호 오류. 비밀번호를 확인해 주세요");
		}else {
			System.out.println(userid+"님 안녕하세요!");
			//로그인 성공시 구현
			new MainView();
		}
	}
}











