package shop;

import java.util.Scanner;

//View
public class LoginMenu {
	public LoginMenu() { // ������
		User session = index.session;
		ProductDAO pdao = new ProductDAO(session);
		while (true) {
			System.out.println("1.��ǰ�߰�\n2.��ǰ����\n3.��ǰ����\n4.����ǰ����\n5.�α׾ƿ�");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 5) {
				// �α׾ƿ�
				System.out.println("�α׾ƿ��մϴ�.");
				// �� �ڵ忡���� session�� null�̾����
				index.session = null;
				break;
			}
			switch (choice) {
			case 1:
				// ��ǰ�߰�
				System.out.println("��ǰ�̸� : ");
				String name = sc.next();
				System.out.println("��ǰ���� : ");
				int price = sc.nextInt();
				System.out.println("��ǰ���� : ");
				int cnt = sc.nextInt();
				String userid = session.id;
				pdao.insert(name, price, cnt); // ���ȭ
				System.out.println(session.id + "�� ��ǰ" + name + "��(��) �߰��Ǿ����ϴ�.");
				break;
			case 2:
				// ��ǰ����
				System.out.println("��ǰ�̸� : ");
				name = sc.next();
				System.out.println("���ο� ���� : ");
				price = sc.nextInt();

				pdao.update(name, price);

				break;
			case 3:
				// ��ǰ����
				break;
			case 4 : 
				//����ǰ����
				pdao.show();
			}
		}
	}
}
