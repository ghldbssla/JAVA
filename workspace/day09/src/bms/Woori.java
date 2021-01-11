package bms;

//잔액 조회시 잔액 50% 수수료
public class Woori extends Bank {
	public Woori(String account, String pw, String name) {
		super(account, pw, name);
		// TODO Auto-generated constructor stub
	}

	public Woori() {
		;
	}

	// @ : 어노테이션
	@Override
	void show() {
		this.money = (int) this.money / 2;
		super.show();
	}

}
