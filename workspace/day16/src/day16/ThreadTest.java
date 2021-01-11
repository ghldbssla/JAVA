package day16;

import java.util.Scanner;

public class ThreadTest {
	public static void main(String[] args) {
		//MyThread1은 Thread 클래스를 상속받았기 때문에
		//.start(), .run() 둘다 상속 받았고, run()을 재정의한후
		//.start()로 스케쥴링 가능		
		//스케쥴 : 컴퓨터에서 Thread를 구분하여 계획을 짜는 것
		MyThread1 t1 = new MyThread1();
		t1.start();
//		MyThread2는 Thread클래스는 안받고 , Runnable인터페이스만 상속 받았기 때문에
		//.run()만 존재 한다. 따라서 run()을 재정의 한 후 스케쥴링이 불가능
		//run() : 재료
		//재정의 해 놓은 run()을 Thread객체에 넘겨서 스케줄링 하는 방식으로 시작해야 한다.
		//Thread객체를 새로 만들 때 생성자에 MyThread2객체를 넘겨준다.
		MyThread2 t2 = new MyThread2();
		Thread thread2 = new Thread(t2);
		thread2.start();
	}
}
//방법 1 : Thread 클래스 상속
class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread");
		}
	}
}
//방법 2 : Runnable 인터페이스 지정후 Thread 클래스에 넘겨주는 방법
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread1");
		}
	}
}
//방법2를 방법1 보다 많이 쓴다.
//자바에서는 상속을 하나밖에 못해주기 때문에 더 중요한 클래스를 상속시켜주어야 한다면
//Thread클래스를 상속시켜줄 수 없게 된다. 따라서 Runnable을 지정시켜주는 방식을
//더 많이 사용하게 된다.
