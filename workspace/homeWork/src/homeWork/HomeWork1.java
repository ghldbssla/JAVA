package homeWork;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		System.out.println("두개의 정수를 입력하세요(구분은 Enter로)");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("두번째 수/첫번째 수");
		System.out.println("몫 = "+num2/num1+", 나머지 = "+num2%num1);
	}
}
