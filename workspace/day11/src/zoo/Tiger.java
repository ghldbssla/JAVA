package zoo;

public class Tiger extends Animal implements Mammalia {

	@Override
	public void makeSomeNoise() {
		for (int i = 0; i < 3; i++) {
			System.out.println("����");
			//1�� : 1000ms
			//�帧�� �����ϸ� ����  Alt Z Shift V enter
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
