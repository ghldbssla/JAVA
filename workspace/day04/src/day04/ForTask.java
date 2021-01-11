package day04;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 1~10출력
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i);
//		}

		// 10~1출력
		// 1
//		for (int i = 10; i >=1; i--) {
//			System.out.println(i);
//		}

		// 2
//		for (int i = 0; i <=10; i++) {
//		System.out.println(10-i);
//		}

		// 1~n(입력박은 수) 출력
//		Scanner sc= new Scanner(System.in);
//		int n=0;
//		System.out.println("정수를 입력하세요");
//		n=sc.nextInt();
//		for (int i = 1; i <=n; i++) {
//			System.out.println(i);
//		}

		// 1~10 합 출력
//		int sum=0;
//		for (int i = 1; i <=10; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);

		// 1~100 짝수만 출력
		// 1
//		for (int i = 2; i <= 100; i += 2) {
//			System.out.println(i);
//		}
//		
		// 2
//		for (int i = 2; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		// A~F출력 A:65 F:70
//		//1
//		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		for (int i = 1; i <=6; i++) {
//			System.out.print(msg.charAt(i));
//		}
//		//2
//		for(int i=65; i<=70; i++) {
//			System.out.print((char)i);
//		}
//		//3
//		for (int i = 0; i <6; i++) {
//			System.out.print((char)('A'+i));
//		}

		// AbCdEfGh...z출력
		//1
//		int num=0;
//		for(int i=0; i<26; i++) {
//			if(i%2==0) {
//				num=65+i;
//			}else if(i%2==1){
//				num=97+i;
//			}
//			System.out.print((char)num);
//		}
		//2
//		for (int i = 0; i < 26; i++) {
//			if (i % 2 == 0) {
//				System.out.print((char)('A' + i));
//			} else if (i % 2 == 1) {
//				System.out.print((char)('a' + i));
//			}
//		}
	}
}
