package bms.view;

import java.util.Scanner;

import bms.dao.BankDAO;

public class LoginView {
	public LoginView() {
		Scanner sc= new Scanner(System.in);
		BankDAO bdao = new BankDAO();
		System.out.print("���¹�ȣ : ");
		String account = sc.next();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		//View�ܿ��� ��� ������ ���� �����Ƿ�  BankDAO�� login�̶��
		//�޼ҵ�� ��� ������ �س��� View�ܿ����� ȣ���ϴ� �����θ� ����Ѵ�.
		if(bdao.login(account, pw)) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
	}
}
