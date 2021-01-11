package day06;

import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		int  n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 칸수: ");
		n=sc.nextInt();
		int[] arData = new int[n];
		for (int i = 0; i < arData.length; i++) {
			arData[i]=sc.nextInt();
		}
		
		//arData의 0번방 : 10
		//arData의 1번방 : 20
		//forEach문을 못씀(인덱스 번호가 필요)
		
		//인덱스가 필요하지않은, 0번부터 끝가지의 값을 나오게 하는
		//단순히 순서대로 값을 가져올 때 => forEach문
		for(int data : arData) {
			//첫번째 반복때 data == arData[0]
			//두번째 반복때 data == arData[1]
			System.out.println(data);
		}
	}
}
