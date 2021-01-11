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

//{;} : 일부러 비워놨다 라는 뜻
	public Bank() {
		;
	}

	// 계좌 조회
	void show() {
		System.out.println(name + "님 잔액조희 입니다. \n현재잔액 : " + money + "원");
	}

	// 입금
	void deposit(int money) {
		this.money += money;
	}

	// 출금
	void withdraw(int money) {
		if (this.money >= money) {
			this.money -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	// 이체
	void transfer() {

	}
}
