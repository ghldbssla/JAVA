package day04;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 또는 >> or
		// 다음중 프로그래밍 언어가 아닌것은?
		// 1.C언어
		// 2.JAVA
		// 3.망둥어
		// 4.파이썬

		// 입력
		// 정수 한개를 받는다.
		int num=0;
		Scanner sc = new Scanner(System.in);
		String result = "";
//~~이고,~~그리고,~~하고 -------and
//~~거나,~~또는             -------or
		do{
			System.out.println("다음중 프로그래밍 언어가 아닌것은?\n" + "1.C언어\n" + "2.JAVA\n" + "3.망둥어\n" + "4.파이썬\n"+"0.종료하기");
			num = sc.nextInt();
			// 처리
			// 1. 정답일때(입력한 수가 3 또는 5) "정답입니다."
			// 2. 오답일때(입력한 수가 1 또는 2 또는 4) "오답입니다."
			// 3. 둘다 아닐때(입력한 수가 1미만 또는 초과) "잘못 입력 하셨습니다."
//		result = (num==3 || num==5)?("정답입니다.")
//				:(num==1 || num==2 || num==4)?("오답입니다."):("잘못 입력 하셨습니다.");
			// ↓↓↓ if로 바꿔주기

			switch (num) {
			case 3:
				result = "정답입니다.";
				break;
			// break를 빼줌으로 다양한 값을 한번에 제어한다
			// 1일때는 case가 1->2->4순서로 들어가서 4의 동작을 수행한뒤 break가 된다.
			case 1:
			case 2:
			case 4:
				result = "오답입니다.";
				break;
			case 0:
				result = "안녕히 가세요";
				break;
			default:
				result = "잘못 입력 하셨습니다.";
			}
			// 출력
			// 결과를 출력한다.
			System.out.println(result);
		}while (num != 3 && num!= 0);
	}
}
