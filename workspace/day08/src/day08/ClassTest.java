package day08;

public class ClassTest {
	public static void main(String[] args) {
		// 클래스이름() :기본 생성자
		Car mycar = new Car("benz", "black", 10000);// 배열처럼 주소값을 mycar에다 넣음.heap영역 new Car();은 주소값을 가짐
		System.out.println(mycar.brand);
		Car momcar = new Car("Ferrari", "white", 35000);
		System.out.println(momcar.brand);

		// Car momcar = new Car();

//		mycar.brand="benz";
//		mycar.color="black";
//		mycar.price=10000;

	}
}

//class Car {
//	String brand;// 특정화를 시키면 안됨.
//	String color;
//	int price;
//
//	Car(String brand, String color, int price) {
//		// brand=brand;//변수호출시 그지역변수가 우선시 됨
//		this.brand = brand;
//		// 접근한 객체의 주소를 갖는 변수 this(객체명과 같이 주소값을 가짐.)
//		// 각 객체가 구별되서 사용될 때 this를 쓴다.
//		this.color = color;
//		this.price = price;
//
////		System.out.println("Car 클래스의 생성자 호출!");
//		// 무조건 주소를 리턴하기 때문에 리턴타입이 없음.
//		// 없으면 기본 생성자가 자동으로 생김.
//	}
//	Car(String color, int price) {
//		//오버로딩
//		this.color = color;
//		this.price = price;
//	}
//
//	void start() {
//		System.out.println(this.brand+"시동 켜기");
//	}
//
//	void stop() {
//		System.out.println(this.brand+"시동 끄기");
//	}
//}
