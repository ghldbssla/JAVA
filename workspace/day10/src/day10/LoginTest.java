package day10;

import java.util.Scanner;

public class LoginTest {
	static User[] arUser = new User[100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = null, pw = null;
		int cnt = 0;
		while (true) {
			//duplicate() 호출 : 결과(null,User객체)
			//null : 겹치는 아이디가 존재하지 않는다
			//User객체 : 겹치는 아이디가 존재하며 그 객체 리턴
			System.out.print("아이디 : ");
			id = sc.next();
			while(duplicate(id)!=null) {
				System.out.print("아이디 : ");
				id = sc.next();
			}
			
			System.out.println("비밀번호 : ");
			pw = sc.next();
			arUser[cnt] = new User(id, pw);
			System.out.println(arUser[cnt].id + "/" +
			arUser[cnt].pw);
			cnt++;
		}
	}
	
	static User duplicate(String id) {
		for (User user : arUser) {
			if (user == null) {
				break;
			}
			if (user.id.equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	boolean login(String id, String pw) {
		//겹치는 아이디를 갖고 있는 객체 return 받아서
		//user에 넣어놓고
		User user = duplicate(id);
		//user가 null이라는 뜻은 겹치는 아이디가 없다는 뜻이므로
		//아이디가 존재하지 않는다는 뜻이다.
		if(user == null) {
			System.out.println("존재하지 않는 아이디");
			return false;
		}
		//어떤 객체가 채워졌다면 겹치는 아이디의 객체가 존재한다는
		//뜻이므로 비밀번호 비교 가능
		if(user.pw.equals(pw)) {
			System.out.println("로그인 성공");
			return true;
		}else {
			System.out.println("비밀번호를 확인하세요");
			return false;
		}
	}
}

class User {
	String id;
	String pw;

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}