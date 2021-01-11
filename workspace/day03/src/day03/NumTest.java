package day03;

import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		//입력
		//	두 정수 입력받기
		int num1=0,num2=0;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		//처리
		//	두 수 비교
		String result=num1>num2?"num1>num2 입니다.":
			(num1==num2?"두 수는 같습니다.":"num1<num2 입니다.");
		//		1. num1이 num2보다 큰 경우 : "num1>num2 입니다."
		//		2. num1이 num2보다 작은 경우 : "num1<num2 입니다."
		//출력
		//	위의 결과를 나타내는 문자열 출력
		System.out.println(result);
//		System.out.println("num1>num2 입니다.");//(num1>num2) true
//		System.out.println("num1<num2 입니다.");//(num1<num2) true
//		System.out.println("num1==num2 입니다.");//(num1==num2) true
//		System.out.println(   (10>3)?("10은 3보다 큽니다."):3   );
//		String result=(10>3)?("10은 3보다 큽니다."):"3";
		
		
	}
}
