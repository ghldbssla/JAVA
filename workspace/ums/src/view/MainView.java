package view;

import java.util.HashSet;
import java.util.Scanner;

import dao.ProductDAO;
import dao.UserDAO;
import dto.ProductDTO;

public class MainView {
	public MainView() {
		// 로그인 성공시 띄워줄 창 구현
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		while (true) {
			System.out.println("1. 회원정보 수정\n2. 상품 등록\n" + 
		"3. 상품 수정\n4. 상품 삭제\n5. 상품 목록\n6. 로그아웃");
			int choice = sc.nextInt();
			if (choice == 6) {
				UserDAO.session=null;
				break;
			}
			//현재 세션으로 로그인 되어있는 유저의 아이디를 넘겨준다.
			//그러면 그 id로 올린 모든 상품들의 줄이 ProductDTO로 포장된 후 HashSet에 추가된 채
			//리턴된다. 그 결과를 result에 담아놓고 아래의 수정, 삭제, 목록보기에서 사용한다.
			HashSet<ProductDTO> result = pdao.showAll(UserDAO.session.userid);
			switch(choice) {
			case 1:
				//회원정보 수정
				new MyInfo();
				break;
			case 2:
				//상품 등록
				new ProductView();
				break;
			case 3:
				//상품 수정
				//위에서 세션이 올린 모든 상품이 추가된 결과를 생성자에 그대로 넘겨준다
				//왜? View단 옮긴 후 다시 불러오는 작업이 무의미하기 때문에
				new UpdateView(result);
				break;
			case 4:
				//상품 삭제
				//위에서 세션이 올린 모든 상품이 추가된 결과를 생성자에 그대로 넘겨준다
				new DeleteView(result);
				break;
			case 5:
				//상품 목록
				System.out.println("======"+UserDAO.session.userid+
						"님의 상품 목록=====");
				String resultMsg="";
				int cnt = 1;
				//위에서 세팅된 result 그대로 사용(현재 세션이 올린 모든 상품이 담겨있는 hashset)
				for(ProductDTO prod : result) {
					//지우개 / 1000원(5개)
					resultMsg+=cnt+". "+prod.prodname+" / "+prod.prodprice+"원("+prod.prodamount
							+"개)\n";
					cnt++;
				}
				if(resultMsg.equals("") || resultMsg==null) {
					System.out.println("상품이 없습니다.");
				}else {
					System.out.print(resultMsg);
				}
				System.out.println("==========================");
				break;
			}
			if(UserDAO.session==null) {
				break;
			}
		}
	}
}







