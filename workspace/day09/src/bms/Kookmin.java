package bms;

//��ݽ� ������ 50%
//100���� ��� �õ��ϸ� 50���� ���
public class Kookmin extends Bank {
	
	public Kookmin() {;}

	public Kookmin(String account, String pw, String name) {
		super(account, pw, name);
		// TODO Auto-generated constructor stub
	}

	// @ : ������̼�
	@Override
	void withdraw(int money) {
//		super.withdraw(money*2);
		if(this.money>=money*2)
		this.money-=money*2;
	}
}
