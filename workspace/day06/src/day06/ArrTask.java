package day06;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		int[][] money = new int[3][5];
		int[] sum = new int[3];
		int total = 0;
		// 101È£:
		// 102È£:
		// ...
		// 305È£:
		// -----Ãâ·ÂºÎºÐ-----------
		// 1Ãþ ÃÑÇÕ:
		// 2Ãþ ÃÑÇÕ:
		// 3Ãþ ÃÑÇÕ:
		// ÃÑÇÕ:
		System.out.println("È£,¼ö¿¡ ¾Ë¸Â°Ô ¿ù¼¼¸¦ ÀÔ·ÂÇÏ¼¼¿ä.(´ÜÀ§:¸¸¿ø)");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < money.length; i++) {
			for (int j = 1; j <= money[0].length; j++) {
				System.out.print((i+1)+"0"+ j + "È£ : ");
				sum[i] += sc.nextInt();
			}
		}
		for (int i =0 ; i < sum.length; i++) {
			System.out.println((i+1) + "Ãþ ÃÑÇÕ : " + sum[i] + "¸¸¿ø");
			total += sum[i];
		}
		System.out.println("ÃÑÇÕ : " + total + "¸¸¿ø");
	}
}
