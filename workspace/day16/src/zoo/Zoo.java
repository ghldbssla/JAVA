package zoo;

public class Zoo {
	public static void main(String[] args) {
		// µ¿¹°µé 3¸¶¸® µ¿½Ã¿¡ ¿ï±â
		Dolphin dolphin = new Dolphin("³¢ÀÌÀÌÀÍ");
		Monkey monkey = new Monkey("¿ì³¢³¢³¢");
		Rabbit rabbit = new Rabbit("»ßŸå»ßŸå");

		Thread t1 = new Thread(dolphin);
		Thread t2 = new Thread(monkey);
		Thread t3 = new Thread(rabbit);

		System.out.println("========µ¿¹°¿ø========");

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
