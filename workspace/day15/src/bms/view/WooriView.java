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
		System.out.println("우리은행입니다.");
		String account="";
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name= sc.next();
		System.out.print("핸드폰번호 : ");
		String phone = sc.next();
		account = r.nextInt(90000) + 10000 + "";
		while (bdao.duplicate(account)) {
			account = r.nextInt(90000) + 10000 + "";
		}
		Woori user = new Woori(account, pw, name, phone);
		bdao.join(2, user);
	}
}












