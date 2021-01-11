package day16;

public class MultiThread {
	public static void main(String[] args) {
		//���1
//		MThread t1 = new MThread("ù��° Thread");
//		MThread t2 = new MThread("�ι�° Thread");
//		t1.start();
		// �ӵ��� �ʹ� ���� 1���� ����� �ȵ�
		// ���� Sleep�� ���
//		t2.start();
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		//���2
		MThread2 t1 = new MThread2("ù��° Thread");
		MThread2 t2 = new MThread2("�ι�° Thread");
	
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			//�帧���ط� ���� try-catch�� ���
		} catch (InterruptedException e) {;}
		//���������� �켱������ �ִ� ���� �ƴϰ�
		//��, �� �� �׳� ���� �Ұ͵��� ������.

		System.out.println("���α׷� ����");
		//���� ���� ����
//		Main Thread���� Tread�� 3�����ư��� ���̴�.
		//�ʹ� �ӵ��� ������ ������ ������ ���� ����Ǵ��� ��.
		//MainThread�� �켱������ �ʿ��ϴ�!
	}
}
//���1
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
//���2
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