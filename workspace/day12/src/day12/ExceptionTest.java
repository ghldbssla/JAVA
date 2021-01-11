package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int num = 0;
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			//예외처리가 잘 안먹는 경우가 있으므로 while안에서 게속 선언해준다.
//			try {
//				num = sc.nextInt();
//				System.out.println(num);
//				
//			} catch (InputMismatchException ime) {
//				System.out.println("숫자만 입력하세요.");
//			}
//		}
		while (true) {
			int num1=0, num2=0;
			Scanner sc = new Scanner(System.in);
			//Alt + Shift + z + 첫번째꺼 + enter
			try {
				System.out.println("첫번째 정수 : ");
				num1 = sc.nextInt();
				System.out.println("두번째 정수 : ");
				num2 = sc.nextInt();
				System.out.println("num1/num2 = "+num1/(num2+0.0));
			}catch (InputMismatchException ime) {
				//Exception이 부모클래스이므로 사용가능(업캐스팅)
				System.out.println("정수만 입력하세요.");
			}
//			 catch(Exception e) {
//				System.out.println(e.getClass());
//				System.out.println("예외 발생");
//			}
			//이렇게 에러를 찾음 (if와 같은 구조라서 수정하면서 하나하나 다 찾을수 있음)
		}
	}
}
