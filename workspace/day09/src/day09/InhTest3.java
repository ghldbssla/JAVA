package day09;

public class InhTest3 {
	public static void main(String[] args) {
//		B obj = new B();
//		A obj2 = new B();
//		//��ĳ����(up casting)
//		//�������̵� �� �޼ҵ�� �������
//		B obj3 = new A();
//		
//		obj.function();
//		obj2.function();
//		A obj1 = new A();
//		B obj2 = new B();
//		A obj3 = new B();
//		
//		//��ü instanceof Ŭ������ : ��ü�� �� Ŭ���� Ÿ���̴�?
//		System.out.println(obj1 instanceof A);
//		System.out.println(obj1 instanceof B); //�θ�Ÿ���� �ڽ�Ÿ���̴�? �� false
//		System.out.println(obj2 instanceof A);
//		System.out.println(obj2 instanceof B);
//		//�� ĳ�����̵� ��ü�� �ڽ�Ÿ�԰� �θ�Ÿ���� �Ѵ� ������ �ڽ�Ÿ���� �ٸ� �ʵ带 ������� ���Ѵ�.
//		System.out.println(obj3 instanceof A);
//		System.out.println(obj3 instanceof B);

		Test obj = new Test();
		obj.function(obj);

	}
}

class A {
	void function() {
		System.out.println("�θ�Ŭ������ �޼ҵ�");
	}
}

class B extends A {
	// �������̵� - A�� �޼ҵ带 ������ ��.
	void function() {
//		super.function();
//		�θ�Ŭ������ function()�� ȣ���Ѵ�.
		System.out.println("�ڽ�Ŭ������ �޼ҵ�");
	}
}

class Test {
	// �޼ҵ�� �Ű������� ������ �ѱ��� �𸣱� ������
	// �θ�Ŭ���� Ÿ������ �Ű������� ������ �ִ°��� ����.

	void function(Object obj) {
		// BŸ���� ��ü�� ����� �Ѱ�ٸ� instancsof�� true�� ����� ������ ������
		if (obj instanceof B) {
			//BŸ������ �ٿ�ĳ���� ��  
			B new_obj = (B) obj;
			// function()�� ����Ѵ�.
			new_obj.function();
		}
	}
}