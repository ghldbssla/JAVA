package day08;

public class ClassTest {
	public static void main(String[] args) {
		// Ŭ�����̸�() :�⺻ ������
		Car mycar = new Car("benz", "black", 10000);// �迭ó�� �ּҰ��� mycar���� ����.heap���� new Car();�� �ּҰ��� ����
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
//	String brand;// Ư��ȭ�� ��Ű�� �ȵ�.
//	String color;
//	int price;
//
//	Car(String brand, String color, int price) {
//		// brand=brand;//����ȣ��� ������������ �켱�� ��
//		this.brand = brand;
//		// ������ ��ü�� �ּҸ� ���� ���� this(��ü��� ���� �ּҰ��� ����.)
//		// �� ��ü�� �����Ǽ� ���� �� this�� ����.
//		this.color = color;
//		this.price = price;
//
////		System.out.println("Car Ŭ������ ������ ȣ��!");
//		// ������ �ּҸ� �����ϱ� ������ ����Ÿ���� ����.
//		// ������ �⺻ �����ڰ� �ڵ����� ����.
//	}
//	Car(String color, int price) {
//		//�����ε�
//		this.color = color;
//		this.price = price;
//	}
//
//	void start() {
//		System.out.println(this.brand+"�õ� �ѱ�");
//	}
//
//	void stop() {
//		System.out.println(this.brand+"�õ� ����");
//	}
//}
