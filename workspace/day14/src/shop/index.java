package shop;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class index {
	public static User session = null;
	public static HashMap<User,Product> DB = new HashMap<>();
	public static void main(String[] args) {
		System.out.println("������� JDS Mall �Դϴ�.");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.ȸ������ \n2.�α���\n3.������");
			int choice = sc.nextInt();
			if (choice == 3) {
				System.out.println("�ȳ��� ������");

			}
			if (choice == 1) {
				//ȸ������
				System.out.println("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ : ");
				String pw = sc.next();
				System.out.println("�̸� : ");
				String name = sc.next();
				System.out.println("�ڵ��� : ");
				String phone = sc.next();
				System.out.println("���� : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("�ּ� : ");
				String addr = sc.nextLine();
				User user = new User(id, pw, name, phone, age, addr);
				DB.put(user, null);
			} else if (choice == 2) {
				//�α���
				System.out.println("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ : ");
				String pw = sc.next();
				Set<User> users = DB.keySet();
				for(User user : users) {
					if(user.id.equals(id)) {
						if(user.pw.equals(pw)) {
							System.out.println(user.id+"�� ȯ���մϴ�.");
							session=user;
							break;
						}
					}
				}
				if(session!=null) {
					//������ ȣ��
					new LoginMenu();
				}
			}
		}
	}
}
