package shop;

import java.util.Scanner;

//View
public class LoginMenu {
	public LoginMenu() { // 생성자
		User session = index.session;
		ProductDAO pdao = new ProductDAO(session);
		while (true) {
			System.out.println("1.상품추가\n2.상품수정\n3.상품삭제\n4.내상품보기\n5.로그아웃");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 5) {
				// 로그아웃
				System.out.println("로그아웃합니다.");
				// 본 코드에서의 session이 null이어야함
				index.session = null;
				break;
			}
			switch (choice) {
			case 1:
				// 상품추가
				System.out.println("상품이름 : ");
				String name = sc.next();
				System.out.println("상품가격 : ");
				int price = sc.nextInt();
				System.out.println("상품개수 : ");
				int cnt = sc.nextInt();
				String userid = session.id;
				pdao.insert(name, price, cnt); // 모듈화
				System.out.println(session.id + "님 상품" + name + "이(가) 추가되었습니다.");
				break;
			case 2:
				// 상품수정
				System.out.println("상품이름 : ");
				name = sc.next();
				System.out.println("새로운 가격 : ");
				price = sc.nextInt();

				pdao.update(name, price);

				break;
			case 3:
				// 상품삭제
				break;
			case 4 : 
				//내상품보기
				pdao.show();
			}
		}
	}
}
