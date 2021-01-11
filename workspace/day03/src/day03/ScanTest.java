package day03;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		//입력 -> 처리 -> 출력
		
		//입력
		//	정수 2개
		int num1=0,num2=0;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		//처리
		//	뒤의 수로 앞의수 나누기
		double result = (num1+0.0)/num2;
		//출력
		//	위의 결과 출력
		System.out.println(result);
	}
}
