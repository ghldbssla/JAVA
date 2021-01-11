package day04;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("안녕하세요~~\n그만하려면  0입력");
			int num = new Scanner(System.in).nextInt();
			//원래 sc로 만들어서 사용하던것을 한번만 쓸거라서 이렇게 씀
			//   ==>   sc.nextInt();와 같음
			if (num == 0) {
				//if문을 탈출하는것이 아니라, 그if문을 감싸고 있는
				//반복문을 탈출한다.
				System.out.println("안녕..");
				break;
			}
		}
	}
}
