package day10;

import java.util.Scanner;

public class LoginTest {
	static User[] arUser = new User[100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = null, pw = null;
		int cnt = 0;
		while (true) {
			//duplicate() ȣ�� : ���(null,User��ü)
			//null : ��ġ�� ���̵� �������� �ʴ´�
			//User��ü : ��ġ�� ���̵� �����ϸ� �� ��ü ����
			System.out.print("���̵� : ");
			id = sc.next();
			while(duplicate(id)!=null) {
				System.out.print("���̵� : ");
				id = sc.next();
			}
			
			System.out.println("��й�ȣ : ");
			pw = sc.next();
			arUser[cnt] = new User(id, pw);
			System.out.println(arUser[cnt].id + "/" +
			arUser[cnt].pw);
			cnt++;
		}
	}
	
	static User duplicate(String id) {
		for (User user : arUser) {
			if (user == null) {
				break;
			}
			if (user.id.equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	boolean login(String id, String pw) {
		//��ġ�� ���̵� ���� �ִ� ��ü return �޾Ƽ�
		//user�� �־����
		User user = duplicate(id);
		//user�� null�̶�� ���� ��ġ�� ���̵� ���ٴ� ���̹Ƿ�
		//���̵� �������� �ʴ´ٴ� ���̴�.
		if(user == null) {
			System.out.println("�������� �ʴ� ���̵�");
			return false;
		}
		//� ��ü�� ä�����ٸ� ��ġ�� ���̵��� ��ü�� �����Ѵٴ�
		//���̹Ƿ� ��й�ȣ �� ����
		if(user.pw.equals(pw)) {
			System.out.println("�α��� ����");
			return true;
		}else {
			System.out.println("��й�ȣ�� Ȯ���ϼ���");
			return false;
		}
	}
}

class User {
	String id;
	String pw;

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}