package day08;

public class ClassTest2 {
	public static void main(String[] args) {
		Car mycar = new Car("blue", 2500);
		//������ 3���� �޾ƾ���..-->�����ε��� ���� ����.
	}
}
class Car{
	String brand;
	String color;
	int price;
	void start() {
		System.out.println(brand+"�õ��ѱ�");
		//���������� �����Ƿ� this ���� ����(Ctrl Ŭ������ �˼� ����)
	}
	
	void stop() {
		System.out.println(brand+"�õ�����");
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
