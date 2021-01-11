package bms.view;

import java.util.Random;
import java.util.Scanner;

import bms.dao.BankDAO;
import bms.dto.Kookmin;

public class KookminView {
	public KookminView() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		BankDAO bdao = new BankDAO();
		System.out.println("국민은행입니다.");
		String account="";
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name= sc.next();
		System.out.print("핸드폰번호 : ");
		String phone = sc.next();
		account = r.nextInt(90000) + 10000 + "";
		//계좌가 중복되는지 여부를 검사해야 한다. DB는 View단에 존재하는것이 아니고
		//외부에 존재하므로 DB에 접근하는 코드가 필요하다.
		//따라서 BankDAO 객체가 필요하고 그곳에 중복검사하는 메소드를 만들어 놓는다.
		while (bdao.duplicate(account)) {
			account = r.nextInt(90000) + 10000 + "";
		}
		Kookmin user = new Kookmin(account, pw, name, phone);
		//마지막으로 생성된 user를 다시 DB에 추가하는 과정을 거치면 된다.
		
		bdao.join(1, user);
		System.out.println("계좌 번호 : "+account);
		System.out.println("이름 : "+ name);
		System.out.println("핸드폰 번호 : "+phone);
	}
}












