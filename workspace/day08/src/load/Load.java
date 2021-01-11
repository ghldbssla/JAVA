package load;

import java.util.Scanner;

public class Load {
	public static void main(String[] args) {
		// 1. 주행하기
		// >엔진이 꺼져 있어야만 시동이 켜지게 구현
		// 2. 주차하기
		// >엔진이 켜져 있어야만 시동이 꺼지게 구현

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Car[] garage = { new Car("나", "Benz"), new Car("엄마", "BMW"), new Car("아빠", "Ferrari") };
		while (true) {
			Car car = null;
			for (int i = 0; i < garage.length; i++) {
				System.out.println((i + 1) + "번: " + garage[i].owner + "의 차");
			}
			choice = sc.nextInt();
			car = garage[choice - 1];
			while (car != null) {
				System.out.println("1. 주행하기\n2. 주차하기\n3. 차고로 돌아가기");
				choice = sc.nextInt();
				if (choice == 1) {
					car.start();
				} else if (choice == 2) {
					car.stop();
				} else if (choice == 3) {
					car.engine = false;
					break;
				}

			}
		}
	}
}
