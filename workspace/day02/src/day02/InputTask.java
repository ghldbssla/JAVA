package day02;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		System.out.println("정수 두개를 입력해보세요");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("입력하신 두 정수의 합은"+(num1+num2)+"입니다.");
	}
}
