package bms;

//입금시 입금액의 절반 수수료
//100만원 입금하면 50만원만 입금
public class Shinhan extends Bank {

	public Shinhan() {
		;
	}

	public Shinhan(String account, String pw, String name) {
		super(account, pw, name);
		// TODO Auto-generated constructor stub
	}

	// @ : 어노테이션
	@Override
	void deposit(int money) {
		this.money += (int) (money / 2);
	}
}