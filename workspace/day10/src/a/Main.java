package a;

import b.B;

//�� .class ���Ͽ��� public Ŭ������ �Ѱ��� ������ �� �ִ�
//�̸��� ���ϸ�� ���ƾ� �Ѵ�.
public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(b.data2);//public
		System.out.println(b.data3);//protected
		System.out.println(b.getData4());//private�� getter ���
		
	
		b.data2=200;
		b.data3=300;
		b.setData4(400);//private�� setter ���
		
	}
}









