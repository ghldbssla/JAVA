package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class JoinView {
	public JoinView() {
		// 아이디 비밀번호 이름 나이 핸드폰번호 주소 추천수 거래수
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.print("아이디 : ");
		String userid = sc.next();
		//아이디 체크라는것은 기능 이므로 dao에다가 구현을 해놓고
		//View단에서는 단순하게 호출하여 사용하기만 한다.
		if (!udao.checkDup(userid)) {
			System.out.println("중복된 아이디가 있습니다. 다시 시도해 주세요.");
		} else {
			System.out.print("비밀번호 : ");
			String userpw = sc.next();
			System.out.print("이름 : ");
			String username = sc.next();
			System.out.print("나이 : ");
			int userage = sc.nextInt();
			System.out.print("핸드폰 번호 : ");
			String userphone = sc.next();
			System.out.print("주소 : ");
			sc.nextLine();
			String useraddr = sc.nextLine();
			//정보가 6개나 되기 때문에 join이라는 메소드에 넘겨주려면 매개변수가
			//6개가 필요하다. 따라서 너무 데이터를 넘기기 힘들기 때문에
			//UserDTO로 포장해준다.
			UserDTO newUser = new UserDTO(userid, userpw, username, userage, userphone, useraddr);
			int result = udao.join(newUser);
			if (result == -1) {
				// 비밀번호 문제
				System.out.println("비밀번호는 8자리 이상이어야 합니다. 다시 시도해 주세요.");
			} else {
				System.out.println("회원가입 성공!");
				System.out.println(userid + "님 가입을 환영합니다.");
			}
		}

	}
}
