package load;

import java.util.Scanner;

public class Load {
	public static void main(String[] args) {
		// 1. �����ϱ�
		// >������ ���� �־�߸� �õ��� ������ ����
		// 2. �����ϱ�
		// >������ ���� �־�߸� �õ��� ������ ����

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Car[] garage = { new Car("��", "Benz"), new Car("����", "BMW"), new Car("�ƺ�", "Ferrari") };
		while (true) {
			Car car = null;
			for (int i = 0; i < garage.length; i++) {
				System.out.println((i + 1) + "��: " + garage[i].owner + "�� ��");
			}
			choice = sc.nextInt();
			car = garage[choice - 1];
			while (car != null) {
				System.out.println("1. �����ϱ�\n2. �����ϱ�\n3. ����� ���ư���");
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
