package view;

import java.util.Scanner;

import dao.Session;
import dao.UserDAO;
import dto.UserDTO;

public class LoginView {
	public LoginView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.print("아이디 : ");
		String userid = sc.next();
		System.out.print("비밀번호 : ");
		String userpw = sc.next();
		UserDTO session = udao.login(userid,userpw);
		if(session==null) {
			System.out.println("로그인 실패 / 다시 시도해주세요.");
		}else {
			Session.put("session_id", session.getUserid());
			//현재 로그인 성공한 객체인 session을 계속 넘겨주고 받는 형식으로
			//구현을 하려면 귀찮고 불편하다. 따라서 Session 클래스에 세팅하는
			//식으로 구현을 하는것이 좋다.
			new Main(session);
		}
	}
}





