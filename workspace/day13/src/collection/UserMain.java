package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id="";
		String pw="";
		ArrayList<User> arUser = new ArrayList<>();
		arUser.add(new User(1, "apple", "apple", "����"));
		arUser.add(new User(2, "banana", "banana", "���ϳ�"));
		arUser.add(new User(3, "cherry", "cherry", "��ü��"));
		
		System.out.print("���̵� : ");
		id=sc.next();
		System.out.print("��й�ȣ : ");
		pw=sc.next();
		
		//�α���
//		for (int i = 0; i < arUser.size(); i++) {
//			if(arUser.get(i).getUserid().equals(id)) {
//				if(arUser.get(i).getUserpw().equals(pw)) {
//					System.out.println("�α��� ����");
//					break;
//				}
//			}
//		}
		
//		for (User user : arUser) {
//			if(user.getUserid().equals(id)) {
//				if(user.getUserpw().equals(pw)) {
//					arUser.remove(user);
//					System.out.println("ȸ��Ż�� ����");
//					break;
//				}
//			}
//		}

		//User Ŭ������ equals()�� hashCode()�� ������ �Ͽ��� ������
		//�ּҰ��� �ٸ����� userNum���� �񱳸� �ϰ�, ���� ��ü�� ó���� �Ѵ�.
//		System.out.println(
//				arUser.get(0).equals(new User(1,"apple","apple","����"))
//		);
		
		//ArrayList���� remove�� ����ϸ� hash������ ���� ��ü���� ���θ� �Ǵ��Ѵ�.
		//���� hashCode()�� equals()�� ������ ���־ ���̻� hash���� �ƴ�
		//userNum ������ ���ϰ� ����� remove�� �� �ȴ�.
		
		arUser.remove(new User(1,"apple","apple","����"));
		System.out.println(arUser);
		
	}
}






