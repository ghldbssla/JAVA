package view;

import java.util.Scanner;

import dao.UserDAO;

public class MyInfo {
	public MyInfo() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.println("1. ��й�ȣ ����\n2. �ڵ��� ��ȣ ����\n3. �ּ� ����\n4. �ڷΰ���\n5. ȸ��Ż��");
		int choice = sc.nextInt();
		String newData = "";
		switch (choice) {
		case 1:
			System.out.print("���ο� ��й�ȣ : ");
			newData=sc.next();
			break;
		case 2:
			System.out.print("���ο� �ڵ��� ��ȣ : ");
			newData=sc.next();
			break;
		case 3:
			sc=new Scanner(System.in);
			System.out.print("���ο� �ּ� : ");
			newData=sc.nextLine();
			break;
		case 4:
			break;
		case 5:
			//ȸ��Ż��
			System.out.print("��й�ȣ ���Է� : ");
			String userpw=sc.next();
			if(UserDAO.session.userpw.equals(userpw)) {
				udao.leaveId(UserDAO.session);
				System.out.println("ȸ��Ż�� ����!");
				UserDAO.session=null;
			}
		}
		if(choice!=4 && choice!=5) {
			udao.modify(choice,newData);
		}
	}
}








