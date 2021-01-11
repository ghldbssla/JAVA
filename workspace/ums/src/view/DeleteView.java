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
		//���⼭����
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
		//��ǰ ����ϴ� �κ� ��
		System.out.print("�����Ͻ� ��ǰ ��ȣ �Է� : ");
		int num = sc.nextInt();
		cnt = 1;
		//result���� ���� �Է��� ��ȣ�� �ö����� �ݺ�
		//index�� ���� ���� for�� ����Ͽ��� ������ Ƚ���� ������ �ܺκ��� cnt�� �ʿ��ϴ�.
		for (ProductDTO product : result) {
			//Ƚ���� ���� �Է��� ��ǰ��ȣ(���°����)�� ������
			if(cnt==num) {
				//�� �ݺ��� ���� product�� ������ ��ǰ�̴�
				pdao.deleteProd(product.toString());
			}
			cnt++;
		}
	}
}








