package factory;

import java.util.Scanner;

public class Mcdonald {
	public static void main(String[] args) {
		String order = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("주문하실 메뉴 선택 : ");
		order = sc.next();//빅맥, 불고기버거, 치즈버거
		Burger burger = null;
		burger=BurgerFactory.makeBurger(order);
		System.out.println(burger.cheeze);
		//burger 객체 사용
		
	}
}






