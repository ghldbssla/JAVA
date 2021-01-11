package atm;

public class ATM implements Runnable{
	int money;
	
	@Override
	public void run() {
		//사용할 동안은 관여가 안됨.
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
		System.out.println(Thread.currentThread().getName()+"이(가) "+money+"원 출금");
		//Thread.currentThread().getName()
		//		: 현재 진행중인 쓰레드의 이름 반환
		System.out.println("현재 잔액 : "+this.money);
	}
	
}
