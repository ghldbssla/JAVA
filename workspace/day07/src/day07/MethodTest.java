package day07;

public class MethodTest {
	public static void main(String[] args) {
		//System.out.println();// { }가 없기때문에 메소드 사용
		MethodTest mt = new MethodTest();
		mt.f(1);
	}

	int add(int num1, int num2) {
		System.out.println("두 정수의 덧셈 메소드 입니다.");
		System.out.println("첫번째 정수 : " + num1);
		System.out.println("두번째 정수 : " + num2);
//		System.out.println(num1+num2); 메소드 내부에서 결과 출력까지 마무리.
		return num1 + num2;
	}

	void f(int num) {	//return뒤에 값이 따로 없으므로 메소드의 리턴타입은 void이다.
		if (num == 10) {
			return;		// 메소드를 끝내버림.
		}
		System.out.println("num는 10이 아닌 정수입니다.");
		//return; void가붙으면 return;을 생략해도 컴파일러가 만들어줌.
	}
}
