package test;

import java.util.Scanner;

public class sqrt {
	public static void main(String[] args) {
		sqrt s = new sqrt();
		s.sqrts();
	}

	void sqrts() {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		long num2 = 0;
		long result = 1;
		num1 = sc.nextInt();
		num2 = sc.nextLong();
		for (long i = 0; i < num2; i++) {
			result *= num1;
		}
		System.out.println(result);
	}
}
