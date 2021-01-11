package day02;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println(10+5);	//15
		System.out.println("10"+5);	//105
	//앞의 피연산자(10)이 숫자형이면 +는 연산, 문자열이면 연결
		System.out.println(10/3); 	//3

		System.out.println("A"+5);	//A5
		//아스키코드
		//'A' : 65
		//'a' :97
		//'0' = 48
		System.out.println('A'+5);	//70
	
	}
}
