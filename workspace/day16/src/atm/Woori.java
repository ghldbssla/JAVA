package atm;

public class Woori {
	public static void main(String[] args) {
		ATM account = new ATM();
		account.money=20000;
		Thread mom = new Thread(account,"엄마");
		//account는 재료, 엄마는 thread이름
		Thread son = new Thread(account,"아들");
		
		mom.start();
		son.start();
	}
	
}
