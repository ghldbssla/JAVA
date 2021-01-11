package day02;

public class CastingTask {
	public static void main(String[] args) {
		//(int)실수=내림
		System.out.println((int)8.43+(int)2.59);//10
		System.out.println(8.43+(int)2.59);//10.43
		System.out.println((int)8.43+2.59);//10.59
		System.out.println((int)(8.43+2.59));//11
		//우선순위 : ()괄호 << 형변환연산자 << +연산
	}
}
