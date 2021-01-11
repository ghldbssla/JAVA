package day06;

public class MethodTest {
	public static void main(String[] args) {
	//f(x)=2x+1 사용부	
		System.out.println(f(3));//f(3)이 통채로 리턴값으로 바뀐다.
	}
	//f(x)=2x+1 선언부
	public static int f(int x) {
		return x*2+1;	//리턴값이 int라서 public static int f(int x)
						//void 자리를 리턴값의 자료형으로 쓴다.
	}
}
