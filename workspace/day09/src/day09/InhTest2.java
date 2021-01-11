package day09;

public class InhTest2 {
	public static void main(String[] args) {
		Animal cat = new Animal(5, "����", "����", "ŰƼ");
		cat.eat();
//		cat.speak();  �θ�Ŭ�������� �ڽ�Ŭ������ �ʵ带 ������� �� ��
//		Human stu1 = new Human(10, "����", "�ְ�� �ɵ��", "���ټ�", "�ѱ���");
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
		super(); // object Ŭ������ ��� Ŭ������ object Ŭ������ ��� �޴´�.
		this.age = age;
		this.gender = gender;
		this.food = food;
		this.name = name;
	}

	public Animal() {
		System.out.println("�θ�Ŭ���� �⺻������ ȣ��!");
	}

	void eat() {
		System.out.println(name + "��(��) " + food + " �ȳ� ���ְ� �Դ���~");
	}

	void sleep() {
		System.out.println(name + "��(��) ���� ���ڴ� ��...");
	}
}

class Human extends Animal {
// �ڽ� Ŭ������ �ʵ尡 ���� ������ ������ ����� Alt+Shift+s > o  �� �����Ϸ� �ϸ� 
	// ���� �ʴ´�. ���� �θ� Ŭ������ �ִ� �����ڸ� �״�� ��������
	// Alt+Shift+s > C
	String lang;

	public Human() {
		// �̰��� �θ��ʵ� �� �ڵ������� �ڵ��� �Ұ���
		super();
		System.out.println("�ڽ�Ŭ���� ������ ȣ��!");
	}

	public Human(String lang) {
		super();
		this.lang = lang;
	}

	// ����Ű�� �⺻�����ڸ� ����
	public Human(int age, String gender, String food, String name, String lang) {
		super(age, gender, food, name);
		this.lang = lang;
	}

//	�ڽ�Ŭ���������� �Ű����� �߰�
//	public Human(int age, String gender, String food, String name, String lang) {
//		super(age, gender, food, name);
//		this.lang=lang;
//	}
	public Human(int age, String gender, String food, String name) {
		super(age, gender, food, name);
	}

	void speak() {
		System.out.println(lang + " ����");
	}

//	public Human(int age, String gender, String food, String name) {
//		super(age, gender, food, name);
//		// TODO Auto-generated constructor stub
//	}	//�θ�Ŭ������ ������
	// �θ� �⺻ �����ڸ� ����� ����Ѵ�.

}