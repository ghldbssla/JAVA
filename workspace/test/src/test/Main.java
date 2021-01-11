package test;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 =0;
		int num2 =0;
		double mi =0;
		
		num1 =sc.nextDouble();
		double real =num1;
		
		num2=sc.nextInt();
		double[] money = new double[num2];
		
		for (int i = 0; i < num2; i++) {
			money[i]=sc.nextInt();
		}
		for (int i = 0; i < money.length; i++) {
			mi=real/100*money[i];
			real+=mi;
		}
		if(10000-(float)real>0) {
		System.out.printf("%.0f",(float)real-10000);
		System.out.println("\nbad");
		}else {
			System.out.printf("%.0f",(float)real-10000);
			System.out.println("\ngood");
		}
	}
}
