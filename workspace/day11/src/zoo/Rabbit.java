package zoo;

public class Rabbit extends Animal implements Mammalia{

	@Override
	public void makeSomeNoise() {
		for (int i = 0; i < 3; i++) {
			System.out.println("±øÃæ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



	
}
