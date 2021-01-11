package a;

import b.B;

//각 .class 파일에는 public 클래스가 한개만 존재할 수 있다
//이름은 파일명과 같아야 한다.
public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(b.data2);//public
		System.out.println(b.data3);//protected
		System.out.println(b.getData4());//private은 getter 사용
		
	
		b.data2=200;
		b.data3=300;
		b.setData4(400);//private은 setter 사용
		
	}
}









