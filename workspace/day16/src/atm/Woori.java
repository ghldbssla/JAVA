package atm;

public class Woori {
	public static void main(String[] args) {
		ATM account = new ATM();
		account.money=20000;
		Thread mom = new Thread(account,"����");
		//account�� ���, ������ thread�̸�
		Thread son = new Thread(account,"�Ƶ�");
		
		mom.start();
		son.start();
	}
	
}
