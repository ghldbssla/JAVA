package view;

import java.util.Scanner;

import dao.UserDAO;

public class FindIdPw {
	public FindIdPw() {
		UserDAO udao = new UserDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 아이디 찾기\n2. 비밀번호 찾기\n3. 나가기");
		int choice= sc.nextInt();
		switch(choice) {
		case 1:
			//아이디 찾기
			System.out.print("이름 : ");
			String username = sc.next();
			System.out.print("핸드폰 번호 : ");
			String userphone = sc.next();
			String userid=udao.findId(username, userphone);
			if(userid!=null) {
				//null이 리턴되지 않았다면 아이디를 찾았다는 뜻이므로 그대로 출력
				System.out.println("회원님의 아이디는 "+userid +"입니다.");
			}else {
				//null이 리턴되었다면 찾지 못했다는 뜻이므로 오류메세지 출력
				System.out.println("입력하신 정보가 일치하지 않습니다.");
			}
			break;
		case 2:
			//비밀번호 찾기
			System.out.print("아이디 : ");
			userid = sc.next();
			System.out.print("이름 : ");
			username = sc.next();
			System.out.print("핸드폰 번호 : ");
			userphone = sc.next();
			String userpw=udao.findPw(userid,username,userphone);
			if(userpw!=null) {
				System.out.println("회원님의 비밀번호는 "+userpw +"입니다.");
			}else {
				System.out.println("입력하신 정보가 일치하지 않습니다.");
			}
			break;
		case 3:
			//나가기
			break;
		}
	}
}








