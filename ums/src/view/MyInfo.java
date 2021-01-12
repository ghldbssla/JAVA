package view;

import java.util.ArrayList;
import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dao.UserDAO;

public class MyInfo {
	public MyInfo() {
		UserDAO udao = new UserDAO();
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����\n1. ��й�ȣ\n2. �ּ�\n3. ȸ��Ż��");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			//��й�ȣ ����
			System.out.print("���ο� ���� : ");
			String newData = sc.next();
			udao.modify(0,udao.encrypt(newData));
			break;
		case 2:
			//�ּ� ����
			sc = new Scanner(System.in);
			System.out.print("���ο� ���� : ");
			newData = sc.nextLine();
			udao.modify(1,newData);
			break;
		case 3:
			//ȸ��Ż��
			System.out.print("��й�ȣ �� �Է� : ");
			String userpw = sc.next();
			if(udao.leaveId(userpw)) {
				System.out.println("�̿��� �ּż� �����մϴ�.");
				ArrayList<String> arNum = pdao.getAllProd();
				for(String prodnum : arNum) {
					pdao.deleteProduct(prodnum);
				}
				Session.put("session_id", null);
			}else {
				System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�. �ٽ� �õ��� �ּ���.");
			}
		}
	}
}






