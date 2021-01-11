package day11;

public class AbstractTest {
	public static void main(String[] args) {
		Square table = new Square();
		table.height=10.0;
		table.width=7.25;
		System.out.println(table.getSize());
		table.info();

	}
}

abstract class Shape {
	//메소드가 추상메소드니까 클래스도 추상 클래스로 만들어야 함.3
	abstract double getSize();
		//리턴타입, 매개변수를 틀로 만들어줌.1
		//있어야 할 내용이 없으니까 abstract를 붙여야 함.2
	final void info() {	
		//final : 자식 클래스에서 재정의 불가능.5
		System.out.println("저는 도형이에요.");
	} //추상클래스 안에 일반 메소드도 선언 가능.4
}

class Square extends Shape{
	double height;
	double width;
	
	@Override
	double getSize() {
		return height*width;
	}
	//추상클래스의 사용
//	final 메소드이기 때문에 자식에서 재정의 불가능
//	void info() {
//		
//	}
}

class triangle extends Shape{
	double height;
	double width;
	
	@Override
	double getSize() {
		return height*width/2;
	}
	//추상클래스의 사용
}
