package bms.view;

import java.util.Random;
import java.util.Scanner;

import bms.dao.BankDAO;
import bms.dto.Woori;

public class WooriView {
	public WooriView() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		BankDAO bdao = new BankDAO();
		System.out.println("�츮�����Դϴ�.");
		String account="";
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		System.out.print("�̸� : ");
		String name= sc.next();
		System.out.print("�ڵ�����ȣ : ");
		String phone = sc.next();
		account = r.nextInt(90000) + 10000 + "";
		while (bdao.duplicate(account)) {
			account = r.nextInt(90000) + 10000 + "";
		}
		Woori user = new Woori(account, pw, name, phone);
		bdao.join(2, user);
	}
}












