package day04;

public class ForTest {
	public static void main(String[] args) {
//		System.out.println(4+" x "+1+" = "+(4*1));
//		System.out.println(4+" x "+2+" = "+(4*2));
//		System.out.println(4+" x "+3+" = "+(4*3));
//		System.out.println(4+" x "+4+" = "+(4*4));
//		System.out.println(4+" x "+5+" = "+(4*5));
//		System.out.println(4+" x "+6+" = "+(4*6));
//		System.out.println(4+" x "+7+" = "+(4*7));
//		System.out.println(4+" x "+8+" = "+(4*8));
//		System.out.println(4+" x "+9+" = "+(4*9));

//		for (int i = 1; i <= 9; i=i+1) {
//			System.out.println(4+" x "+i+" = "+(4*i));
//		}
		
//		1부터 10까지 출력하는 while문
//		int cnt = 1;
//		while (cnt <= 10) {
//			System.out.println(cnt);
//			cnt = cnt + 1;
//		}
		
//		1부터 10까지 출력하는 while문		
//		for (int i = 1; i <= 10; i = i + 1) {
//			System.out.println(i);
//		}
//변하는 값을 사용할때는 while문 보다 for문이 좋다.
		
		//후위형 : 처리를 먼저하고 증감을 해준다
		int num=10;
		System.out.println(num++);	//10
		System.out.println(num);	//11
		//전위형 : 증감을 먼저하고 처리를 해준다
		num=10;
		System.out.println(++num);	//11
		System.out.println(num);	//11
	}
}
