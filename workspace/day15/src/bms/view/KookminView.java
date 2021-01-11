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
		System.out.println("���������Դϴ�.");
		String account="";
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		System.out.print("�̸� : ");
		String name= sc.next();
		System.out.print("�ڵ�����ȣ : ");
		String phone = sc.next();
		account = r.nextInt(90000) + 10000 + "";
		//���°� �ߺ��Ǵ��� ���θ� �˻��ؾ� �Ѵ�. DB�� View�ܿ� �����ϴ°��� �ƴϰ�
		//�ܺο� �����ϹǷ� DB�� �����ϴ� �ڵ尡 �ʿ��ϴ�.
		//���� BankDAO ��ü�� �ʿ��ϰ� �װ��� �ߺ��˻��ϴ� �޼ҵ带 ����� ���´�.
		while (bdao.duplicate(account)) {
			account = r.nextInt(90000) + 10000 + "";
		}
		Kookmin user = new Kookmin(account, pw, name, phone);
		//���������� ������ user�� �ٽ� DB�� �߰��ϴ� ������ ��ġ�� �ȴ�.
		
		bdao.join(1, user);
		System.out.println("���� ��ȣ : "+account);
		System.out.println("�̸� : "+ name);
		System.out.println("�ڵ��� ��ȣ : "+phone);
	}
}












