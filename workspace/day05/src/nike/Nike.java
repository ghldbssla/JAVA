package nike;

import java.util.Scanner;

public class Nike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String basket = "";
		String product1 = "��Ƽ";
		String product2 = "����Ű �Ḷ ���丮 ������ž";
		int price1 = 20000;
		int price2 = 70000;
		int total = 0;
		//is,has �̸��� �� ������ bolleanŸ���� ���ɼ��� ����.
		boolean flag = false;
		while (true) {
			System.out.println("1. �����ϱ�\n2. ���������� \n3. ������");
			choice = sc.nextInt();
			if (choice == 3) {
				break;
			}
			switch (choice) {
			case 1:
				// �����ϱ�
				while (true) {

					System.out.println("1. ������ ��ǰ\n2. ������ ��ǰ\n 3. �ڷΰ���");
					// ������ ����
					// ���� : �޸𸮸� �������� �ʾƵ� �ȴ�.
					// ���� : �������� ��������.
					choice = sc.nextInt();
					if (choice == 3) {
						break;
					} else if (choice == 1) {
						// ������ ��ǰ
						while (true) {
							System.out.println("1. Ƽ����\n2. ����\n3. �Ź�\n4. �ڷΰ���");
							choice = sc.nextInt();
							if (choice == 1) {
								// Ƽ����
								System.out.println("1. ��Ƽ(20000)\n2. ����Ű �Ḷ ���丮 ������ž(70000)");
								choice = sc.nextInt();
								if (choice == 1) {
									basket += product1 + "\n";
									total += price1;
								} else if (choice == 2) {
									basket += product2 + "\n";
									total += price2;
								}
							} else if (choice == 2) {
								// ����
							} else if (choice == 3) {
								// �Ź�
							} else if (choice == 4) {
								// �ڷΰ���
								break;
							}
						}
					} else if (choice == 2) {
						// ������ ��ǰ
					} else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
				break;
				}
			case 2:
				// ����������
				System.out.println("1.��ٱ���\n2.�� ���� ����\n3.�ڷΰ���");
				choice = sc.nextInt();
				if (choice == 1) {
					// ��ٱ���
					while (true) {
						System.out.println("1. �� ��ٱ��� ���\n2.�����ϱ�\n3.�ڷΰ���");
						choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("===========�� ��ǰ ���===========");
							System.out.println(basket);
							System.out.println("==============================");
						} else if (choice == 2) {
							if(total<=20000) {
								//���� ���н� ���� ����
								//flag��� : ���� ���� ���θ� Ȯ�� �Ҷ� ���� ���Ǵ� ���
								//����� ������� �ȵ������ �ΰ��� ����� �ٸ��ʿ��� Ȯ�� �ϴ� ���
								flag = true;
								break;
							}else {
								//���� ������ ���� ����
								System.out.println("�� �ݾ� "+total+"�� �Դϴ�.");
								basket="";
								total=0;
							}
						}
					}
					if(flag) {
						System.out.println("������ 20000�� �ʰ��� �����մϴ�.\n���θ޴��� ���ư��ϴ�.");
						break;
					}
				} else if (choice == 2) {
					// �� ���� ����
				} else if (choice == 3) {
					// �ڷΰ���
					
					break;
				}
			}
		
		}
	}
}
