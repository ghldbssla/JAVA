package atm;

public class ATM implements Runnable{
	int money;
	
	@Override
	public void run() {
		//����� ������ ������ �ȵ�.
		synchronized(this) {
			for (int i = 0; i < 10; i++) {
				withdraw(1000);
				try {
					Thread.sleep(1000);	
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
}

	public void withdraw(int money) {
		this.money-=money;
		System.out.println(Thread.currentThread().getName()+"��(��) "+money+"�� ���");
		//Thread.currentThread().getName()
		//		: ���� �������� �������� �̸� ��ȯ
		System.out.println("���� �ܾ� : "+this.money);
	}
	
}
