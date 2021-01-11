package zoo;

public class Animal {
	String neigh;

	public Animal(String neigh) {
		this.neigh = neigh;
	}

	void sayHo() {
		for (int i = 0; i < 10; i++) {
			System.out.println(neigh);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}