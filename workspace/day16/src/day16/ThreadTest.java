package day16;

import java.util.Scanner;

public class ThreadTest {
	public static void main(String[] args) {
		//MyThread1�� Thread Ŭ������ ��ӹ޾ұ� ������
		//.start(), .run() �Ѵ� ��� �޾Ұ�, run()�� ����������
		//.start()�� �����층 ����		
		//������ : ��ǻ�Ϳ��� Thread�� �����Ͽ� ��ȹ�� ¥�� ��
		MyThread1 t1 = new MyThread1();
		t1.start();
//		MyThread2�� ThreadŬ������ �ȹް� , Runnable�������̽��� ��� �޾ұ� ������
		//.run()�� ���� �Ѵ�. ���� run()�� ������ �� �� �����층�� �Ұ���
		//run() : ���
		//������ �� ���� run()�� Thread��ü�� �Ѱܼ� �����ٸ� �ϴ� ������� �����ؾ� �Ѵ�.
		//Thread��ü�� ���� ���� �� �����ڿ� MyThread2��ü�� �Ѱ��ش�.
		MyThread2 t2 = new MyThread2();
		Thread thread2 = new Thread(t2);
		thread2.start();
	}
}
//��� 1 : Thread Ŭ���� ���
class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread");
		}
	}
}
//��� 2 : Runnable �������̽� ������ Thread Ŭ������ �Ѱ��ִ� ���
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread1");
		}
	}
}
//���2�� ���1 ���� ���� ����.
//�ڹٿ����� ����� �ϳ��ۿ� �����ֱ� ������ �� �߿��� Ŭ������ ��ӽ����־�� �Ѵٸ�
//ThreadŬ������ ��ӽ����� �� ���� �ȴ�. ���� Runnable�� ���������ִ� �����
//�� ���� ����ϰ� �ȴ�.
