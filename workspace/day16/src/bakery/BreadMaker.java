package bakery;

public class BreadMaker implements Runnable {
	Bread bread = new Bread();

	public Bread getBread() {
		return bread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			bread.makeBread();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		System.out.println("��ᰡ �� ���������ϴ�. ���� �ٽ� ������.");
	}
}
