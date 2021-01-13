package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dto.UserDTO;

public class Main {
	public Main() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		if (Session.get("session_id") == null) {
			System.out.println("�α��� �� �̿����ּ���");
		} else {
			while (true) {
				System.out.println("mainâ");
				System.out.println("1. ��ǰ�߰�\n2. ��ǰ����\n3. ��ǰ����\n" + "4. ��ǰ���\n5. ��ǰ�˻�\n6. �� ���� ����\n7.�α׾ƿ�");
				int choice = sc.nextInt();
				if (choice == 7) {
					System.out.println("�α׾ƿ� �մϴ�.");
					Session.put("session_id", null);
					break;
				}
				switch (choice) {
				case 1:
					// ��ǰ�߰�
					new AddProductView();
					break;
				case 2:
					// ��ǰ����
					//DAO�� �ִ� �޼ҵ带 ���ؼ� ���� �α����� ������ ��� ��ǰ ���
					//������ �� ���ڿ��� �����޴´�.
					System.out.println(pdao.getList());
					
					System.out.print("������ ��ǰ ��ȣ : ");
					int prodnum = sc.nextInt();
					System.out.print("���ο� ������ : ");
					String newData = sc.next();
					// idx�� 2��� ���� 2��° ���� �����ϰڴٴ� ���̱� ������, ���ݼ����� �ǹ��Ѵ�.
					// ������ �ƴ� �ٸ����� �����ϰ� �ʹٸ�, ���������� �Է��� �ް� updateProduct��
					// idx�� 2 ��ſ� �ش��ϴ� ���� �Ѱ��ָ� �ȴ�.
					pdao.updateProduct(prodnum, 2, newData);
					break;
				case 3:
					// ��ǰ����
					System.out.println(pdao.getList());
					System.out.println("������ ��ǰ ��ȣ : ");
					prodnum = sc.nextInt();
					if (pdao.deleteProduct(prodnum)) {
						System.out.println(prodnum + "�� ��ǰ ���� �Ϸ�!");
					}
					break;
				case 4:
					System.out.println(pdao.getList());
					break;
				case 5:
					// ��ǰ�˻�( pdao.search(�˻���Ű����) -> conn.select(1,keyword) )
					break;
				case 6:
					new MyInfo();
					break;
				}
				if (Session.get("session_id") == null) {
					break;
				}
			}
		}
	}
}
