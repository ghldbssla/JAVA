package day09;

public class InhTest2 {
	public static void main(String[] args) {
		Animal cat = new Animal(5, "남자", "생선", "키티");
		cat.eat();
//		cat.speak();  부모클래스에서 자식클래스의 필드를 사용하지 못 함
//		Human stu1 = new Human(10, "남자", "최고급 꽃등심", "정다솔", "한국어");
//		stu1.eat();
//		stu1.speak();
		Human mom = new Human();
		Human dad = new Human();
		Human child = new Human();
		Animal dog = new Animal();
		Animal[] array = { mom, dad, child, dog };
		array[0].sleep();
//		array[0].speak();
		Human human = (Human)array[0];
		human.speak();
	}
}

class Animal {
	int age;
	String gender;
	String food;
	String name;

	public Animal(int age, String gender, String food, String name) {
		super(); // object 클래스로 모든 클래스는 object 클래스를 상속 받는다.
		this.age = age;
		this.gender = gender;
		this.food = food;
		this.name = name;
	}

	public Animal() {
		System.out.println("부모클래스 기본생성자 호출!");
	}

	void eat() {
		System.out.println(name + "는(은) " + food + " 냠냠 맛있게 먹는중~");
	}

	void sleep() {
		System.out.println(name + "는(은) 쿨쿨 잠자는 중...");
	}
}

class Human extends Animal {
// 자식 클래스의 필드가 없기 때문에 생성자 만들시 Alt+Shift+s > o  로 생성하려 하면 
	// 되지 않는다. 따라서 부모 클래스에 있는 생성자를 그대로 가져오는
	// Alt+Shift+s > C
	String lang;

	public Human() {
		// 이곳은 부모필드 전 코드임으로 코딩이 불가함
		super();
		System.out.println("자식클래스 생성자 호출!");
	}

	public Human(String lang) {
		super();
		this.lang = lang;
	}

	// 단축키로 기본생성자를 만듦
	public Human(int age, String gender, String food, String name, String lang) {
		super(age, gender, food, name);
		this.lang = lang;
	}

//	자식클래스에서의 매개변수 추가
//	public Human(int age, String gender, String food, String name, String lang) {
//		super(age, gender, food, name);
//		this.lang=lang;
//	}
	public Human(int age, String gender, String food, String name) {
		super(age, gender, food, name);
	}

	void speak() {
		System.out.println(lang + " 구사");
	}

//	public Human(int age, String gender, String food, String name) {
//		super(age, gender, food, name);
//		// TODO Auto-generated constructor stub
//	}	//부모클래스의 생성자
	// 부모에 기본 생성자를 만들어 줘야한다.

}