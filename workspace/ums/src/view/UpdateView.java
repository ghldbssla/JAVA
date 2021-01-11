package view;

import java.util.HashSet;
import java.util.Scanner;

import dao.ProductDAO;
import dao.UserDAO;
import dto.ProductDTO;

public class UpdateView {
	public UpdateView(HashSet<ProductDTO> result) {
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		
		//세션의 상품 목록 띄워주는 코드
		System.out.println("======"+UserDAO.session.userid+
				"님의 상품 목록=====");
		String resultMsg="";
		int cnt = 1;
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
		/////////////////////////////////////////////////////
		
		System.out.print("수정하실 상품 번호 입력 : ");
		int prodNum=sc.nextInt();
		System.out.println("1. 가격수정\n2. 재고수정");
		int choice = sc.nextInt();
		System.out.print("새로운 정보 : ");
		String newData =sc.next();
		cnt=1;
		//result에 담긴 상품객체 하나씩 꺼내오면서
		for(ProductDTO prod : result) {
			//내가 고른 번호와 반복문의 횟수가 같을 때가
			//수정하려고 고른 상품이 prod에 담겨있을 때이다.
			if(prodNum==cnt) {
				//그 상품객체와, 내가 수정하려는 정보(가격인지 재고인지)와, 새로운 데이터를
				//pdao에 있는 update 메소드에 넘겨준다.
				pdao.updateProd(prod, choice, newData);
			}
			cnt++;
		}
	}
}






