package singleton;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//积己磊狼 开且 : 鞘靛积己(按眉积己)
			Display display = Display.getInstance();
			display.show();
			System.out.println(display);
		}

	}
}





