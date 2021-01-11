package day02;

public class PrintTest {

	public static void main(String[] args) {
		System.out.printf("%d\n",10);
		System.out.printf("%d + %d = %d\n",10,20,10+20 );
		System.out.print("안녕하세요"+"정회윤입니다.\n");//+는 연결의 의미
		System.out.print(10+"+"+20+"="+(10+20)+"\n");
		//마지막의 "="+10+20는 연결의 +가 10과 먼저 만나기때문에 1020이 출력됨
		//따라서 연산을 먼저 해주라는 의미로 ()안에 연산을 넣는다.
//		printf의 f는 format문자(서식 문자)

	}

}
