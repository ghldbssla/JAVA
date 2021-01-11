package load;

class Car {
	String brand;
	String color;
	int price;
	String owner;
	boolean engine;

	void start() {
		if (!engine) {
			System.out.println(owner + "�� ��" + brand + "�õ��ѱ�");
			engine = true;
		} else {
			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
		}
	}

	void stop() {
		if (engine) {
			System.out.println(owner + "�� ��" + brand + "�õ�����");
			engine = false;
		} else {
			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
		}

	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public Car(String color, int price) {
		super();
		this.color = color;
		this.price = price;
		this.engine = false;
	}

	public Car(String owner, String brand) {
		this.owner = owner;
		this.brand = brand;
	}
}
