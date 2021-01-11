package day04;

import java.util.Scanner;

public class Password {
	// 변하지 않는 상수
	final static int KEY = 4;

	public static void main(String[] args) {

		String db_id = "";
		String db_pw = "";
		String result = "";
		String userId = "";
		String userPw = "";
		int choice = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			//메뉴 출력
			System.out.println("1. 회원가입\n2. 로그인\n3. 사용종료");
			//선택할 메뉴 입력받기
			choice = sc.nextInt();
			//choice의 값으로 switch~case문 열기
			switch (choice) {
			case 1:
				// 회원가입
				System.out.println("아이디 : ");
				db_id = sc.next();
				System.out.println("비밀번호 : ");
				db_pw = sc.next();
					// abcd1234 -> efgh5678 (KEY만큼 더함)
				//비밀번호는 암호화를 진행한 후 넣어주기	
					// 문자열.length() : 문자열의 길이
				for (int i = 0; i < db_pw.length(); i++) {
				//각 자리의 문자를 뽑아와서 KEY만큼 뒤로 미룬 채
				//result에 연결
					result += (char) (db_pw.charAt(i) + KEY);
					// 0번째때 a가 97로바뀌면서 계산이 되므로 다시 문자로 형변환을 해줘야 한다.
				}
				//db_pw에 바뀐 비밀번호로 값을 바꿔준다.
				db_pw = result;
				break;
			case 2:
				// 로그인
				System.out.println("아이디 : ");
				userId = sc.next();
				//입력받은id와 db에 있는 id가 같은지 비교
				if (userId.equals(db_id)) {
					System.out.println("비밀번호 : ");
					userPw = sc.next();
					//복호화 진행하기 전에 result를 초기화
					result = "";
					for (int i = 0; i < db_pw.length(); i++) {
						//db에 있는 pw를 한자리씩 뽑아와서
						//KEY만큼 땡겨서 result에 연결
						result += (char) (db_pw.charAt(i) - KEY);
					}
					//복호화된 경과인 result와 입력한 userPw가 같다면
					if (userPw.equals(result)) {
						// 로그인 성공
						System.out.println("로그인 성공");
						System.out.println(userId + "님 안녕하세요.");
					}
				} else {
					System.out.println("아이디를 잘못 입력하셨습니다.");
				}
				break;
			case 3:
				// 사용종료
			}
		}
	}
}
