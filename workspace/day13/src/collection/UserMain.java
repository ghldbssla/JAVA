package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id="";
		String pw="";
		ArrayList<User> arUser = new ArrayList<>();
		arUser.add(new User(1, "apple", "apple", "김사과"));
		arUser.add(new User(2, "banana", "banana", "반하나"));
		arUser.add(new User(3, "cherry", "cherry", "이체리"));
		
		System.out.print("아이디 : ");
		id=sc.next();
		System.out.print("비밀번호 : ");
		pw=sc.next();
		
		//로그인
//		for (int i = 0; i < arUser.size(); i++) {
//			if(arUser.get(i).getUserid().equals(id)) {
//				if(arUser.get(i).getUserpw().equals(pw)) {
//					System.out.println("로그인 성공");
//					break;
//				}
//			}
//		}
		
//		for (User user : arUser) {
//			if(user.getUserid().equals(id)) {
//				if(user.getUserpw().equals(pw)) {
//					arUser.remove(user);
//					System.out.println("회원탈퇴 성공");
//					break;
//				}
//			}
//		}

		//User 클래스의 equals()와 hashCode()를 재정의 하였기 때문에
		//주소값은 다르더라도 userNum으로 비교를 하고, 같은 객체로 처리를 한다.
//		System.out.println(
//				arUser.get(0).equals(new User(1,"apple","apple","김사과"))
//		);
		
		//ArrayList에서 remove를 사용하면 hash값으로 같은 객체인지 여부를 판단한다.
		//따라서 hashCode()와 equals()를 재정의 해주어서 더이상 hash값이 아닌
		//userNum 값으로 비교하게 만들면 remove시 잘 된다.
		
		arUser.remove(new User(1,"apple","apple","김사과"));
		System.out.println(arUser);
		
	}
}






