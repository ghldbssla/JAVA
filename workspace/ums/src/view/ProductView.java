package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.UserDAO;
import dto.ProductDTO;

public class ProductView {
	public ProductView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("======��ǰ���======");
		System.out.print("��ǰ �̸� : ");
		String prodname=sc.nextLine();
		System.out.print("��ǰ ���� : ");
		int prodprice = sc.nextInt();
		System.out.print("��ǰ ���� : ");
		int prodamount = sc.nextInt();
		System.out.print("��ǰ ���� : ");
		sc.nextLine();
		String manual=sc.nextLine();
		//pdao�� �Ѱ��־�� �� ���� ���� ������ ProductDTO�� ����
		ProductDTO product = new ProductDTO(prodname, prodprice,
				prodamount, manual, UserDAO.session.userid);
		//����� product��ü �Ѱ��ֱ�
		pdao.addProd(product);
	}
}














