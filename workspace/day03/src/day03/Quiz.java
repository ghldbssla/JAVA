package day03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//또는 >> or
		//다음중 프로그래밍 언어가 아닌것은?
		//1.C언어
		//2.JAVA
		//3.망둥어
		//4.파이썬
		//5.한국어
		
		//입력
		//정수 한개를 받는다.
		System.out.println("다음중 프로그래밍 언어가 아닌것은?\n" + 
				"1.C언어\n" + 
				"2.JAVA\n" + 
				"3.망둥어\n" + 
				"4.파이썬\n" + 
				"5.한국어");
		Scanner sc=new Scanner(System.in);
		int num=0;
		num=sc.nextInt();
		//처리
		// 1. 정답일때(입력한 수가 3 또는 5)			"정답입니다."
		// 2. 오답일때(입력한 수가 1 또는 2 또는 4)		"오답입니다."
		// 3. 둘다 아닐때(입력한 수가 1미만 또는 초과) 	"잘못 입력 하셨습니다."
		String result="";
//		result = (num==3 || num==5)?("정답입니다.")
//				:(num==1 || num==2 || num==4)?("오답입니다."):("잘못 입력 하셨습니다.");
		//				↓↓↓ if로 바꿔주기
		if(num==3 || num==5) {
			
			result = "정답입니다.";
			
		}else if(num==1 || num==2 || num==4) {
			
			result = "오답입니다.";
			
		}else {
			
			result = "잘못 입력 하셨습니다.";
			
		}
		//출력
		//결과를 출력한다.
		System.out.println(result);
	}
}
