package factory;

import java.util.Scanner;

public class Mcdonald {
	public static void main(String[] args) {
		String order = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹ��Ͻ� �޴� ���� : ");
		order = sc.next();//���, �Ұ�����, ġ�����
		Burger burger = null;
		burger=BurgerFactory.makeBurger(order);
		System.out.println(burger.cheeze);
		//burger ��ü ���
		
	}
}






