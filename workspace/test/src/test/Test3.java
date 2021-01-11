package test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("시 를 입력해주세요");
		a=sc.nextInt();
		System.out.println("분 을 입력해주세요");
		b=sc.nextInt();
		if(a==1) {
			c=a+11;
		}else {
			c=a-1;
		}
		if(b<20) {
			d=b+40;
			c--;
		}else {
			d=b-20;
		}
		System.out.println("입력받은 시간은"+a+"시"+b+"분 입니다.");
		System.out.println("1시간 20분 전 시간은 "+c+"시"+d+"분 입니다.");
	}
}
