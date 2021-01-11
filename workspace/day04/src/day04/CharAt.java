package day04;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;
		a=sc.next();
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='0') {
				break;
			}
			System.out.println(a.charAt(i));
		}
	}
}
