package bms;

//�Աݽ� �Աݾ��� ���� ������
//100���� �Ա��ϸ� 50������ �Ա�
public class Shinhan extends Bank {

	public Shinhan() {
		;
	}

	public Shinhan(String account, String pw, String name) {
		super(account, pw, name);
		// TODO Auto-generated constructor stub
	}

	// @ : ������̼�
	@Override
	void deposit(int money) {
		this.money += (int) (money / 2);
	}
}