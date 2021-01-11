package zoo;

public class Tiger extends Animal implements Mammalia {

	@Override
	public void makeSomeNoise() {
		for (int i = 0; i < 3; i++) {
			System.out.println("어흥");
			//1초 : 1000ms
			//흐름을 방해하면 오류  Alt Z Shift V enter
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
