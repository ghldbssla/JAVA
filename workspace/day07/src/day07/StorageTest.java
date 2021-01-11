package day07;

public class StorageTest {
	static int s_data = 10; // 다른 클래스에서 접근이 가능해짐. -> MethodTask
	int data = 11;

	public static void main(String[] args) {
		int[] arData = { 10, 20, 30, 40, 50 };
		// arData는 지역변수, 인덱스는 Heap영역에 있음(이름 없이 주소값과 값만 가지고 있음)
		System.out.println(s_data);// static안에는 static만 사용가능
	}
}
