package day07;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest2 m = new MethodTest2(); //객체화
		m.guguDan();
	}
	void printDan(int num) {
		for (int i = 1; i <=9; i++) {
			System.out.println(num+"X"+i+"="+(num*i));
		}
	}
	void guguDan() {	//소스코드 간결화를 위해 특정성을 부여
		System.out.println("구구단 출력");
		printDan(1);
		printDan(2);
		printDan(3);
		printDan(4);
		printDan(5);
		printDan(6);
		printDan(7);
		printDan(8);
		printDan(9);
		
	}
}
