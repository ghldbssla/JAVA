package bms;

public class Bank {
	String account;
	String pw;
	String name;
	int money;

	public Bank(String account, String pw, String name) {
		super();
		this.account = account;
		this.pw = pw;
		this.name = name;
	}

//{;} : �Ϻη� ������� ��� ��
	public Bank() {
		;
	}

	// ���� ��ȸ
	void show() {
		System.out.println(name + "�� �ܾ����� �Դϴ�. \n�����ܾ� : " + money + "��");
	}

	// �Ա�
	void deposit(int money) {
		this.money += money;
	}

	// ���
	void withdraw(int money) {
		if (this.money >= money) {
			this.money -= money;
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

	// ��ü
	void transfer() {

	}
}
