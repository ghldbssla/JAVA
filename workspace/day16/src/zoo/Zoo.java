package zoo;

public class Zoo {
	public static void main(String[] args) {
		// ������ 3���� ���ÿ� ���
		Dolphin dolphin = new Dolphin("��������");
		Monkey monkey = new Monkey("�쳢����");
		Rabbit rabbit = new Rabbit("�ߟ�ߟ�");

		Thread t1 = new Thread(dolphin);
		Thread t2 = new Thread(monkey);
		Thread t3 = new Thread(rabbit);

		System.out.println("========������========");

		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
		}
		System.out.println("====================");
	}
}
