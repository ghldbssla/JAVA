package day03;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg1="",msg2="";
		msg1="Apple1234";
		msg2=sc.next();
		//문자열은 ==으로 비교하는 것이 아니고,
		//비교할문자열.equals(새로운 문자열)
		//을 이용한다.
		//equals는 ()로 메소드인것을 알수 있고, 비교할문자열.으로 String클래스 안에 있는 메소드인걸 알 수 있다.
		if(msg1.equals(msg2)) {
			//입력한 문자열과 "Apple1234"가 같은 경우
			System.out.println("같은 문자열");
		}else {
			//입력한 문자열과 "Apple1234"가 다른 경우
			System.out.println("다른 문자열");			
		}
	}
}
