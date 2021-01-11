package zoo;

public class Dolphin extends Animal implements Runnable {

	public Dolphin(String neigh) {
		super(neigh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		sayHo();
	}
}
