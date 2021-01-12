package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class JoinView {
	public JoinView() {
		// ���̵� ��й�ȣ �̸� ���� �ڵ�����ȣ �ּ� ��õ�� �ŷ���
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.print("���̵� : ");
		String userid = sc.next();
		//���̵� üũ��°��� ��� �̹Ƿ� dao���ٰ� ������ �س���
		//View�ܿ����� �ܼ��ϰ� ȣ���Ͽ� ����ϱ⸸ �Ѵ�.
		if (!udao.checkDup(userid)) {
			System.out.println("�ߺ��� ���̵� �ֽ��ϴ�. �ٽ� �õ��� �ּ���.");
		} else {
			System.out.print("��й�ȣ : ");
			String userpw = sc.next();
			System.out.print("�̸� : ");
			String username = sc.next();
			System.out.print("���� : ");
			int userage = sc.nextInt();
			System.out.print("�ڵ��� ��ȣ : ");
			String userphone = sc.next();
			System.out.print("�ּ� : ");
			sc.nextLine();
			String useraddr = sc.nextLine();
			//������ 6���� �Ǳ� ������ join�̶�� �޼ҵ忡 �Ѱ��ַ��� �Ű�������
			//6���� �ʿ��ϴ�. ���� �ʹ� �����͸� �ѱ�� ����� ������
			//UserDTO�� �������ش�.
			UserDTO newUser = new UserDTO(userid, userpw, username, userage, userphone, useraddr);
			int result = udao.join(newUser);
			if (result == -1) {
				// ��й�ȣ ����
				System.out.println("��й�ȣ�� 8�ڸ� �̻��̾�� �մϴ�. �ٽ� �õ��� �ּ���.");
			} else {
				System.out.println("ȸ������ ����!");
				System.out.println(userid + "�� ������ ȯ���մϴ�.");
			}
		}

	}
}
