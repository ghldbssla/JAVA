package view;

import java.util.HashSet;
import java.util.Scanner;

import dao.ProductDAO;
import dao.UserDAO;
import dto.ProductDTO;

public class DeleteView {
	public DeleteView(HashSet<ProductDTO> result) {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		//여기서부터
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
		//상품 출력하는 부분 끝
		System.out.print("삭제하실 상품 번호 입력 : ");
		int num = sc.nextInt();
		cnt = 1;
		//result에서 내가 입력한 번호가 올때까지 반복
		//index가 없는 빠른 for문 사용하였기 때문에 횟수를 세어줄 외부변수 cnt가 필요하다.
		for (ProductDTO product : result) {
			//횟수가 내가 입력한 상품번호(몇번째인지)랑 같으면
			if(cnt==num) {
				//그 반복일 때의 product가 삭제할 상품이다
				pdao.deleteProd(product.toString());
			}
			cnt++;
		}
	}
}








