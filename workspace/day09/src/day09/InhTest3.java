package day09;

public class InhTest3 {
	public static void main(String[] args) {
//		B obj = new B();
//		A obj2 = new B();
//		//업캐스팅(up casting)
//		//오버라이딩 된 메소드는 살아있음
//		B obj3 = new A();
//		
//		obj.function();
//		obj2.function();
//		A obj1 = new A();
//		B obj2 = new B();
//		A obj3 = new B();
//		
//		//객체 instanceof 클래스명 : 객체가 이 클래스 타입이니?
//		System.out.println(obj1 instanceof A);
//		System.out.println(obj1 instanceof B); //부모타입이 자식타입이니? 만 false
//		System.out.println(obj2 instanceof A);
//		System.out.println(obj2 instanceof B);
//		//업 캐스팅이된 객체는 자식타입과 부모타입이 둘다 되지만 자식타입의 다른 필드를 사용하지 못한다.
//		System.out.println(obj3 instanceof A);
//		System.out.println(obj3 instanceof B);

		Test obj = new Test();
		obj.function(obj);

	}
}

class A {
	void function() {
		System.out.println("부모클래스의 메소드");
	}
}

class B extends A {
	// 오버라이딩 - A의 메소드를 재정의 함.
	void function() {
//		super.function();
//		부모클래스의 function()을 호출한다.
		System.out.println("자식클래스의 메소드");
	}
}

class Test {
	// 메소드는 매개변수로 무엇을 넘길지 모르기 때문에
	// 부모클래스 타입으로 매개변수를 지정해 주는것이 좋다.

	void function(Object obj) {
		// B타입의 객체를 제대로 넘겼다면 instancsof가 true로 결과가 나오기 때문에
		if (obj instanceof B) {
			//B타입으로 다운캐스팅 후  
			B new_obj = (B) obj;
			// function()을 사용한다.
			new_obj.function();
		}
	}
}