package view;

import java.util.Scanner;

import dao.Session;
import dao.UserDAO;
import dto.UserDTO;

public class LoginView {
	public LoginView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.print("���̵� : ");
		String userid = sc.next();
		System.out.print("��й�ȣ : ");
		String userpw = sc.next();
		UserDTO session = udao.login(userid,userpw);
		if(session==null) {
			System.out.println("�α��� ���� / �ٽ� �õ����ּ���.");
		}else {
			Session.put("session_id", session.getUserid());
			//���� �α��� ������ ��ü�� session�� ��� �Ѱ��ְ� �޴� ��������
			//������ �Ϸ��� ������ �����ϴ�. ���� Session Ŭ������ �����ϴ�
			//������ ������ �ϴ°��� ����.
			new Main(session);
		}
	}
}





