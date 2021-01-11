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
	//�޼ҵ尡 �߻�޼ҵ�ϱ� Ŭ������ �߻� Ŭ������ ������ ��.3
	abstract double getSize();
		//����Ÿ��, �Ű������� Ʋ�� �������.1
		//�־�� �� ������ �����ϱ� abstract�� �ٿ��� ��.2
	final void info() {	
		//final : �ڽ� Ŭ�������� ������ �Ұ���.5
		System.out.println("���� �����̿���.");
	} //�߻�Ŭ���� �ȿ� �Ϲ� �޼ҵ嵵 ���� ����.4
}

class Square extends Shape{
	double height;
	double width;
	
	@Override
	double getSize() {
		return height*width;
	}
	//�߻�Ŭ������ ���
//	final �޼ҵ��̱� ������ �ڽĿ��� ������ �Ұ���
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
	//�߻�Ŭ������ ���
}
