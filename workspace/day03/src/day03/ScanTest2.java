package day03;

import java.util.Scanner;

public class ScanTest2 {
	public static void main(String[] args) {
		String num1="",num2="";
		Scanner sc = new Scanner(System.in);
		
		num1=sc.next();
		num2=sc.next();
		//"형변환 연산자"는 기본타입에서만 가능하다.(클래스타입은제외 - String)
		//System.out.println((int)num1+(int)num2);
		//Integer.parseInt("정수로 된 문자열") == 정수로 형변환한 값
		//Double.parseDouble ...>>응용
		int realnum1=Integer.parseInt(num1);
		int realnum2=Integer.parseInt(num2);
		System.out.println(realnum1+realnum2);
	}
}
