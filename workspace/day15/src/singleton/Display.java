package singleton;

public class Display {
	private static Display display = null;
	int data;
	private Display() {
	}
	public static Display getInstance() {
		if(display==null) {
			display=new Display();
		}
		return display;
	}
	void show() {
		System.out.println("제대로 출력이 잘 됩니다.");
	}
}
