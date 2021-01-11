package shop;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class index {
	public static User session = null;
	public static HashMap<User,Product> DB = new HashMap<>();
	public static void main(String[] args) {
		System.out.println("어서오세요 JDS Mall 입니다.");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.회원가입 \n2.로그인\n3.나가기");
			int choice = sc.nextInt();
			if (choice == 3) {
				System.out.println("안녕히 가세요");

			}
			if (choice == 1) {
				//회원가입
				System.out.println("아이디 : ");
				String id = sc.next();
				System.out.println("비밀번호 : ");
				String pw = sc.next();
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("핸드폰 : ");
				String phone = sc.next();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("주소 : ");
				String addr = sc.nextLine();
				User user = new User(id, pw, name, phone, age, addr);
				DB.put(user, null);
			} else if (choice == 2) {
				//로그인
				System.out.println("아이디 : ");
				String id = sc.next();
				System.out.println("비밀번호 : ");
				String pw = sc.next();
				Set<User> users = DB.keySet();
				for(User user : users) {
					if(user.id.equals(id)) {
						if(user.pw.equals(pw)) {
							System.out.println(user.id+"님 환영합니다.");
							session=user;
							break;
						}
					}
				}
				if(session!=null) {
					//생성자 호출
					new LoginMenu();
				}
			}
		}
	}
}
