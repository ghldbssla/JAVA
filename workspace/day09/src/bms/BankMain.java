package bms;

import java.util.Random;
import javax.swing.JOptionPane;

public class BankMain {
	static Bank[][] arUser = new Bank[3][100];

	public static void main(String[] args) {
		//session : �α��ν� �̿�� ���� �α��ε� ���� ���� ����
		Bank session = null;
		//������ ���¹�ȣ ������ ���� ��ü
		Random r = new Random();
		//�ൿ���� �޴��� ���� �迭
		String[] arBankMenu = { "��������", "�츮����", "��������", "������" };
		String[] arDoMenu = { "���°���", "�α���" ,"�ڷΰ���"};
		String[] arLoginMenu = { "�Ա��ϱ�", "����ϱ�", "������ȸ", "�α׾ƿ�" };
		//�� ���ະ ȸ������ ���� �迭
		//bankChoice : ���� ���� ������ ���� ��ȣ�� ���� ���� (�������� =0 �츮���� =1 �������� =2)
		int[] arcnt = { 0, 0, 0 };
		String helloMsg = "===�ȳ��ϼ��� BMS ���α׷� �Դϴ�.===";
		String title = "BMS";
		int doChoice = 0;
		int loginChoice = 0;
		JOptionPane.showMessageDialog(null, helloMsg);
		while (true) {
//			JOptionPane.showOptionDialog(): �迭�� �Ѱ��ָ� �״�� ��ư�� ������ �ش�.ù��°��ư 0��
			//�ݱ��ư(x)���� �� -1 return
			int bankChoice = JOptionPane.showOptionDialog(null, "������ �����ϼ���", title, JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, arBankMenu, arBankMenu[0]);
			//�������ư 3, �ݱ�-1�� ���ý� break�� while�� Ż��
			if (bankChoice == 3 || loginChoice == JOptionPane.CLOSED_OPTION) {
				break;
			}
			//�׿� ������ ���༱���̹Ƿ� bankChoice�� ���� ��ȣ�� ������� ���̰�, �״�� �Ʒ� while������ ����.
			while (true) {
				doChoice = JOptionPane.showOptionDialog(null, arBankMenu[bankChoice], title, JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, arDoMenu, arDoMenu[0]);
				if (doChoice == 0) {
					// ���°���
					String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
					String pw = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");
					String account = "";
					//acount�� �ʱ� ���� ��ȣ �ϳ� �̸� �־����
					account = r.nextInt(90000) + 10000 + "";
					//�Ʒ��� ������ duplicate() �޼ҵ带 ���� �ߺ��� true�� ���Ϲް�
					//false�� ���ö� ���� �ݺ��Ͽ� ������ �߻��Ͽ� �ߺ����� �ʴ� ���� ��ȣ�� ���ö� ���� �ݺ��Ѵ�.
					while (duplicate(account)) {
						account = r.nextInt(90000) + 10000 + "";
					}
					//�̺κб��� �Դٸ� account�� �ߺ����� �ʴ� ���¹�ȣ�� ��
					//arMake�� �����࿡ �´� ��ü�� �������ֱ����� �迭
					Bank[] arMake = { new Kookmin(account, pw, name), new Woori(account, pw, name),
							new Shinhan(account, pw, name) };
					//arUser�� BankŸ���� 2���� �迭������ , �ڽ� ��ü���� ��ĳ���� ��ä�� �� �� ����.
					//arUser���� : �������� user���� ��� 1���� �迭
					//arUser�ǿ� : arCnt�� �����Ͽ� �������� ȸ������ Ȯ���ϰ�, ���� ȸ���� ���� ���θ��� ��ü�� �ִ´�.
					arUser[bankChoice][arcnt[bankChoice]] = arMake[bankChoice];
					JOptionPane.showMessageDialog(null, name+"�� \n���¹�ȣ : "+account);
					//�ش��ϴ� ���ष�� arCnt�� �ϳ�����
					arcnt[bankChoice]++;
				} else if (doChoice==1) {
					// �α���
					String account = JOptionPane.showInputDialog("���¹�ȣ �Է�");
					String pw = JOptionPane.showInputDialog("��й�ȣ �Է�");
					//arUser�� bankChoice ���� ���� ���� ������ ���࿡ �ش��ϴ� ��
					//user�� �׾ȿ� ��ü �ϳ��� ��������
					for (Bank user : arUser[bankChoice]) {
						if (user != null) {
							//�� ������ user�� null�� �ƴ϶��
							if (user.account.equals(account)) {
								if (user.pw.equals(pw)) {
									// �α��� ������ ���� ���� : session�� �α��� ������ �� user��ü�� �־��ش�.
									session = user;
									break;
								}
							}
						}
					}
					//������ session�� user��ü�� �־������� �ұ��ϰ� null�� �����ִٸ� if���� ���� ���ߴٴ� �Ҹ���
					//�α��� ���ж�� ���̴�.
					if (session == null) {
						// �α��� ����
						JOptionPane.showMessageDialog(null, "�α��� �����Դϴ�.");
					} else {
						// �α��� ����
						while (true) {
							//�α��ν� ����� �޴�
							loginChoice = JOptionPane.showOptionDialog(null, arBankMenu[bankChoice], title,
									JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, arLoginMenu,
									arLoginMenu[0]);
							//�α��� ������ ��ü�� session�� ��ĳ���� �� ä�� ��������Ƿ� �Ʒ������� session�� ����Ѵ�.
							// �Ա��ϱ�
							if (loginChoice == 0) {
								session.deposit(Integer.parseInt(JOptionPane.showInputDialog("�Է��Ͻ� �ݾ��� �Է��ϼ���")));

								// ����ϱ�
							} else if (loginChoice == 1) {
								session.withdraw(Integer.parseInt(JOptionPane.showInputDialog("����Ͻ� �ݾ��� �Է��ϼ���")));

								// �ܾ���ȸ
							} else if (loginChoice == 2) {
								session.show();

								// �α׾ƿ�
							} else if (loginChoice == 3) {
								session = null;
								break;
							} else if (loginChoice == JOptionPane.CLOSED_OPTION) {
								session = null;
								return;
							}
						}
					}
				} else if (doChoice == -1) {
					return;
				}else if(doChoice==2) {
					break;
				}
			}
		}
	}

	// ���� �ߺ� �˻� �޼ҵ�
	static boolean duplicate(String account) {
		for (Bank[] bank : arUser) {
			//��ü arUser �迭���� ���྿ �������� (bank�� ������)
			for (Bank user : bank) {
				//�� ������ �࿡�� BankŸ���� ��ü �ϳ��� �������� (User�� ������)
				if (user != null) {
					//user�� null�� �ƴҶ��� ��ü�� �ִٴ� ���̹Ƿ� �׶��� ���¹�ȣ ��
					if (user.account.equals(account)) {
						//true
						return true;
					}
				}
			}
		}
		return false;
		//�׿ܿ��� ��� false
	}
}
