package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class Join {
	UserDAO udao = new UserDAO();
	public Join() {
		//ȸ������ View�� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("======ȸ������======");
		System.out.print("���̵� : ");
		String userid=sc.next();
		System.out.print("��й�ȣ : ");
		String userpw=sc.next();
		System.out.print("�̸� : ");
		String username=sc.next();
		System.out.print("�ڵ�����ȣ : ");
		String userphone=sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();
		String useraddr=sc.nextLine();
		//��ü �������� DB�� �Է��ϱ� ���� �Ѱ��־�� �ϴµ� ������ ����. ���� DTO�� ����(user)
		UserDTO user = new UserDTO(userid, userpw, username, userphone, useraddr);
		//��� ������ DAO�� �ؾ��ϰ�, �װ��� �Ѱ��� ������ ������ ����� user��ü
		//���Ͽ� ����(DB�� ����)�� ���������� true�� ���ϵ��� ���̹Ƿ�
		if(udao.join(user)) {
			//������ ���ڿ� ���
			System.out.println(userid+"�� ȸ������ �Ϸ�!");
		}else {
			//���н� ���� ����
			System.out.println("�˼����� ����. �ٽ� �õ��� �ּ���.");
		}
	}
}








