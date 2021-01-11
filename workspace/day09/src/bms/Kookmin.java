package bms;

//출금시 수수료 50%
//100만원 출금 시도하면 50만원 출금
public class Kookmin extends Bank {
	
	public Kookmin() {;}

	public Kookmin(String account, String pw, String name) {
		super(account, pw, name);
		// TODO Auto-generated constructor stub
	}

	// @ : 어노테이션
	@Override
	void withdraw(int money) {
//		super.withdraw(money*2);
		if(this.money>=money*2)
		this.money-=money*2;
	}
}
