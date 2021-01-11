package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.UserDAO;
import dto.ProductDTO;

public class ProductView {
	public ProductView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("======상품등록======");
		System.out.print("상품 이름 : ");
		String prodname=sc.nextLine();
		System.out.print("상품 가격 : ");
		int prodprice = sc.nextInt();
		System.out.print("상품 수량 : ");
		int prodamount = sc.nextInt();
		System.out.print("상품 설명 : ");
		sc.nextLine();
		String manual=sc.nextLine();
		//pdao에 넘겨주어야 할 값이 많기 때문에 ProductDTO로 포장
		ProductDTO product = new ProductDTO(prodname, prodprice,
				prodamount, manual, UserDAO.session.userid);
		//포장된 product객체 넘겨주기
		pdao.addProd(product);
	}
}














