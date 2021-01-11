package zoo;

public class Rabbit extends Animal implements Runnable{

	public Rabbit(String neigh) {
		super(neigh);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		sayHo();		
	}
}
