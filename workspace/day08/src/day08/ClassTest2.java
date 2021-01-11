package day08;

public class ClassTest2 {
	public static void main(String[] args) {
		Car mycar = new Car("blue", 2500);
		//무조건 3개를 받아야함..-->오버로딩을 통해 수정.
	}
}
class Car{
	String brand;
	String color;
	int price;
	void start() {
		System.out.println(brand+"시동켜기");
		//지역변수가 없으므로 this 생략 가능(Ctrl 클릭으로 알수 있음)
	}
	
	void stop() {
		System.out.println(brand+"시동끄기");
	}
	//Alt+Shift+s+o(Gnerater constructor using fields)
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public Car(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
}
