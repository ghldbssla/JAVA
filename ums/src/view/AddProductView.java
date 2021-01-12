package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.ProductDTO;
import dto.UserDTO;

public class AddProductView {
	public AddProductView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String prodname = sc.next();
		System.out.print("상품가격 : ");
		int prodprice = sc.nextInt();
		System.out.print("상품재고 : ");
		int prodamount = sc.nextInt();
		System.out.print("상품설명 : ");
		sc.nextLine();
		String prodinfo = sc.nextLine();
		//로그인 성공시 키값을 "session_id"로 세팅하고 value는
		//로그인 성공한 유저의 아이디로 설정을 해놓았기 때문에
		//이용하는 곳에서는 그 키값을 이용해서 세팅된 값을 가져올 수 있다.
		String userid=Session.get("session_id");
		ProductDTO newProd = new ProductDTO(pdao.getCnt()+1,prodname,
				prodprice, prodamount, prodinfo,0,userid);
		pdao.addProduct(newProd);
	}
}
