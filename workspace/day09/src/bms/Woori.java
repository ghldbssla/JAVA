package bms;

//�ܾ� ��ȸ�� �ܾ� 50% ������
public class Woori extends Bank {
	public Woori(String account, String pw, String name) {
		super(account, pw, name);
		// TODO Auto-generated constructor stub
	}

	public Woori() {
		;
	}

	// @ : ������̼�
	@Override
	void show() {
		this.money = (int) this.money / 2;
		super.show();
	}

}
