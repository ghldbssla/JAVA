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
		
		//������ ��ǰ ��� ����ִ� �ڵ�
		System.out.println("======"+UserDAO.session.userid+
				"���� ��ǰ ���=====");
		String resultMsg="";
		int cnt = 1;
		for(ProductDTO prod : result) {
			//���찳 / 1000��(5��)
			resultMsg+=cnt+". "+prod.prodname+" / "+prod.prodprice+"��("+prod.prodamount
					+"��)\n";
			cnt++;
		}
		if(resultMsg.equals("") || resultMsg==null) {
			System.out.println("��ǰ�� �����ϴ�.");
		}else {
			System.out.print(resultMsg);
		}
		System.out.println("==========================");
		/////////////////////////////////////////////////////
		
		System.out.print("�����Ͻ� ��ǰ ��ȣ �Է� : ");
		int prodNum=sc.nextInt();
		System.out.println("1. ���ݼ���\n2. ������");
		int choice = sc.nextInt();
		System.out.print("���ο� ���� : ");
		String newData =sc.next();
		cnt=1;
		//result�� ��� ��ǰ��ü �ϳ��� �������鼭
		for(ProductDTO prod : result) {
			//���� �� ��ȣ�� �ݺ����� Ƚ���� ���� ����
			//�����Ϸ��� �� ��ǰ�� prod�� ������� ���̴�.
			if(prodNum==cnt) {
				//�� ��ǰ��ü��, ���� �����Ϸ��� ����(�������� �������)��, ���ο� �����͸�
				//pdao�� �ִ� update �޼ҵ忡 �Ѱ��ش�.
				pdao.updateProd(prod, choice, newData);
			}
			cnt++;
		}
	}
}






