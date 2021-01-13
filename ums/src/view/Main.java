package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.UserDTO;

public class Main {
	public Main() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		if (Session.get("session_id") == null) {
			System.out.println("로그인 후 이용해주세요");
		} else {
			while (true) {
				System.out.println("main창");
				System.out.println("1. 상품추가\n2. 상품수정\n3. 상품삭제\n" + "4. 상품목록\n5. 상품검색\n6. 내 정보 수정\n7.로그아웃");
				int choice = sc.nextInt();
				if (choice == 7) {
					System.out.println("로그아웃 합니다.");
					Session.put("session_id", null);
					break;
				}
				switch (choice) {
				case 1:
					// 상품추가
					new AddProductView();
					break;
				case 2:
					// 상품수정
					//DAO에 있는 메소드를 통해서 현재 로그인한 유저의 모든 상품 목록
					//포매팅 한 문자열을 돌려받는다.
					System.out.println(pdao.getList());
					
					System.out.print("수정할 상품 번호 : ");
					int prodnum = sc.nextInt();
					System.out.print("새로운 데이터 : ");
					String newData = sc.next();
					// idx가 2라는 뜻은 2번째 방을 수정하겠다는 뜻이기 때문에, 가격수정을 의미한다.
					// 가격이 아닌 다른것을 수정하고 싶다면, 마찬가지로 입력을 받고 updateProduct에
					// idx를 2 대신에 해당하는 값을 넘겨주면 된다.
					pdao.updateProduct(prodnum, 2, newData);
					break;
				case 3:
					// 상품삭제
					System.out.println(pdao.getList());
					System.out.println("삭제할 상품 번호 : ");
					prodnum = sc.nextInt();
					if (pdao.deleteProduct(prodnum)) {
						System.out.println(prodnum + "번 상품 삭제 완료!");
					}
					break;
				case 4:
					System.out.println(pdao.getList());
					break;
				case 5:
					// 상품검색( pdao.search(검색할키워드) -> conn.select(1,keyword) )
					break;
				case 6:
					new MyInfo();
					break;
				}
				if (Session.get("session_id") == null) {
					break;
				}
			}
		}
	}
}
