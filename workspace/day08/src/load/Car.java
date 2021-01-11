package load;

class Car {
	String brand;
	String color;
	int price;
	String owner;
	boolean engine;

	void start() {
		if (!engine) {
			System.out.println(owner + "의 차" + brand + "시동켜기");
			engine = true;
		} else {
			System.out.println("이미 시동이 켜져있습니다.");
		}
	}

	void stop() {
		if (engine) {
			System.out.println(owner + "의 차" + brand + "시동끄기");
			engine = false;
		} else {
			System.out.println("이미 시동이 꺼져있습니다.");
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
