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
		System.out.print("��ǰ�� : ");
		String prodname = sc.next();
		System.out.print("��ǰ���� : ");
		int prodprice = sc.nextInt();
		System.out.print("��ǰ��� : ");
		int prodamount = sc.nextInt();
		System.out.print("��ǰ���� : ");
		sc.nextLine();
		String prodinfo = sc.nextLine();
		//�α��� ������ Ű���� "session_id"�� �����ϰ� value��
		//�α��� ������ ������ ���̵�� ������ �س��ұ� ������
		//�̿��ϴ� �������� �� Ű���� �̿��ؼ� ���õ� ���� ������ �� �ִ�.
		String userid=Session.get("session_id");
		ProductDTO newProd = new ProductDTO(pdao.getCnt()+1,prodname,
				prodprice, prodamount, prodinfo,0,userid);
		pdao.addProduct(newProd);
	}
}
