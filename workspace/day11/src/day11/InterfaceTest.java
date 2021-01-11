package day11;

public class InterfaceTest {
	public static void main(String[] args) {
		GgobukChip ggobuk = new GgobukChip();
		Snack snack1 = new Snack() {
			
			@Override
			public void pack() {
				System.out.println("??");
			}
		};
		ggobuk.pack();
		snack1.pack();
	}
}
