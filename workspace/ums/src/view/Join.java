package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class Join {
	UserDAO udao = new UserDAO();
	public Join() {
		//회원가입 View단 시작
		Scanner sc = new Scanner(System.in);
		System.out.println("======회원가입======");
		System.out.print("아이디 : ");
		String userid=sc.next();
		System.out.print("비밀번호 : ");
		String userpw=sc.next();
		System.out.print("이름 : ");
		String username=sc.next();
		System.out.print("핸드폰번호 : ");
		String userphone=sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String useraddr=sc.nextLine();
		//전체 정보들을 DB에 입력하기 위해 넘겨주어야 하는데 개수가 많다. 따라서 DTO로 포장(user)
		UserDTO user = new UserDTO(userid, userpw, username, userphone, useraddr);
		//기능 구현은 DAO에 해야하고, 그곳에 넘겨줄 정보는 위에서 포장된 user객체
		//파일에 쓰기(DB에 저장)를 성공했으면 true가 리턴됐을 것이므로
		if(udao.join(user)) {
			//성공시 문자열 출력
			System.out.println(userid+"님 회원가입 완료!");
		}else {
			//실패시 오는 구역
			System.out.println("알수없는 오류. 다시 시도해 주세요.");
		}
	}
}








