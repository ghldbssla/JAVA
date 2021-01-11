package day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="";
		String address="";
		
		System.out.print("이름 : ");
		name = sc.next(); //값
		
		sc.nextLine();//앞의 입력에서 마지막에 친 Enter를 먹어주는 역할
		
		System.out.print("주소 : ");
		address = sc.nextLine();
		
		System.out.println(name+"님 안녕하세요");
		System.out.print("주소 : "+address);
	}
}
