package day04;

import java.util.Scanner;

public class Password {
	// ������ �ʴ� ���
	final static int KEY = 4;

	public static void main(String[] args) {

		String db_id = "";
		String db_pw = "";
		String result = "";
		String userId = "";
		String userPw = "";
		int choice = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			//�޴� ���
			System.out.println("1. ȸ������\n2. �α���\n3. �������");
			//������ �޴� �Է¹ޱ�
			choice = sc.nextInt();
			//choice�� ������ switch~case�� ����
			switch (choice) {
			case 1:
				// ȸ������
				System.out.println("���̵� : ");
				db_id = sc.next();
				System.out.println("��й�ȣ : ");
				db_pw = sc.next();
					// abcd1234 -> efgh5678 (KEY��ŭ ����)
				//��й�ȣ�� ��ȣȭ�� ������ �� �־��ֱ�	
					// ���ڿ�.length() : ���ڿ��� ����
				for (int i = 0; i < db_pw.length(); i++) {
				//�� �ڸ��� ���ڸ� �̾ƿͼ� KEY��ŭ �ڷ� �̷� ä
				//result�� ����
					result += (char) (db_pw.charAt(i) + KEY);
					// 0��°�� a�� 97�ιٲ�鼭 ����� �ǹǷ� �ٽ� ���ڷ� ����ȯ�� ����� �Ѵ�.
				}
				//db_pw�� �ٲ� ��й�ȣ�� ���� �ٲ��ش�.
				db_pw = result;
				break;
			case 2:
				// �α���
				System.out.println("���̵� : ");
				userId = sc.next();
				//�Է¹���id�� db�� �ִ� id�� ������ ��
				if (userId.equals(db_id)) {
					System.out.println("��й�ȣ : ");
					userPw = sc.next();
					//��ȣȭ �����ϱ� ���� result�� �ʱ�ȭ
					result = "";
					for (int i = 0; i < db_pw.length(); i++) {
						//db�� �ִ� pw�� ���ڸ��� �̾ƿͼ�
						//KEY��ŭ ���ܼ� result�� ����
						result += (char) (db_pw.charAt(i) - KEY);
					}
					//��ȣȭ�� ����� result�� �Է��� userPw�� ���ٸ�
					if (userPw.equals(result)) {
						// �α��� ����
						System.out.println("�α��� ����");
						System.out.println(userId + "�� �ȳ��ϼ���.");
					}
				} else {
					System.out.println("���̵� �߸� �Է��ϼ̽��ϴ�.");
				}
				break;
			case 3:
				// �������
			}
		}
	}
}
