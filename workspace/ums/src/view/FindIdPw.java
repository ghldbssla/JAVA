package view;

import java.util.Scanner;

import dao.UserDAO;

public class FindIdPw {
	public FindIdPw() {
		UserDAO udao = new UserDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ���̵� ã��\n2. ��й�ȣ ã��\n3. ������");
		int choice= sc.nextInt();
		switch(choice) {
		case 1:
			//���̵� ã��
			System.out.print("�̸� : ");
			String username = sc.next();
			System.out.print("�ڵ��� ��ȣ : ");
			String userphone = sc.next();
			String userid=udao.findId(username, userphone);
			if(userid!=null) {
				//null�� ���ϵ��� �ʾҴٸ� ���̵� ã�Ҵٴ� ���̹Ƿ� �״�� ���
				System.out.println("ȸ������ ���̵�� "+userid +"�Դϴ�.");
			}else {
				//null�� ���ϵǾ��ٸ� ã�� ���ߴٴ� ���̹Ƿ� �����޼��� ���
				System.out.println("�Է��Ͻ� ������ ��ġ���� �ʽ��ϴ�.");
			}
			break;
		case 2:
			//��й�ȣ ã��
			System.out.print("���̵� : ");
			userid = sc.next();
			System.out.print("�̸� : ");
			username = sc.next();
			System.out.print("�ڵ��� ��ȣ : ");
			userphone = sc.next();
			String userpw=udao.findPw(userid,username,userphone);
			if(userpw!=null) {
				System.out.println("ȸ������ ��й�ȣ�� "+userpw +"�Դϴ�.");
			}else {
				System.out.println("�Է��Ͻ� ������ ��ġ���� �ʽ��ϴ�.");
			}
			break;
		case 3:
			//������
			break;
		}
	}
}








