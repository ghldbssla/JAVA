package singleton;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//�������� ���� : �ʵ����(��ü����)
			Display display = Display.getInstance();
			display.show();
			System.out.println(display);
		}

	}
}





