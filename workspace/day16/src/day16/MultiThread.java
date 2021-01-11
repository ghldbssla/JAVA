package day16;

public class MultiThread {
	public static void main(String[] args) {
		//방법1
//		MThread t1 = new MThread("첫번째 Thread");
//		MThread t2 = new MThread("두번째 Thread");
//		t1.start();
		// 속도가 너무 빨라서 1개씩 출력이 안됨
		// 따라서 Sleep을 사용
//		t2.start();
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		//방법2
		MThread2 t1 = new MThread2("첫번째 Thread");
		MThread2 t2 = new MThread2("두번째 Thread");
	
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			//흐름방해로 인한 try-catch문 사용
		} catch (InterruptedException e) {;}
		//직접적으로 우선순위를 주는 것이 아니고
		//상, 하 로 그냥 먼저 할것들을 구분함.

		System.out.println("프로그램 종료");
		//가장 먼저 나옴
//		Main Thread까지 Tread가 3개돌아가는 중이다.
		//너무 속도가 빠르기 때문에 무엇이 먼저 실행되는지 모름.
		//MainThread의 우선순위가 필요하다!
	}
}
//방법1
class MThread extends Thread {
	String msg;

	public MThread(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(msg);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				;
			}
		}
	}
}
//방법2
class MThread2 implements Runnable {

	String msg;

	public MThread2(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(msg);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				;
			}
		}
	}
}