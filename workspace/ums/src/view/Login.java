package view;

import java.util.Scanner;

import dao.UserDAO;

public class Login {
	UserDAO udao = new UserDAO();
	public Login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String userid=sc.next();
		System.out.print("��й�ȣ : ");
		String userpw=sc.next();
		int result = udao.login(userid, userpw);
		if(result==-1) {
			System.out.println("���̵� ����. ���̵� Ȯ���� �ּ���");
		}else if(result==0) {
			System.out.println("��й�ȣ ����. ��й�ȣ�� Ȯ���� �ּ���");
		}else {
			System.out.println(userid+"�� �ȳ��ϼ���!");
			//�α��� ������ ����
			new MainView();
		}
	}
}











