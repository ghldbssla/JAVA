package zoo;

public class Monkey extends Animal implements Runnable {

	
	public Monkey(String neigh) {
		super(neigh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		sayHo();		
	}
}
