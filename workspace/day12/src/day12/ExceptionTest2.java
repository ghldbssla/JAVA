package day12;

import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {
		ExceptionTest2 e = new ExceptionTest2();
		while (true) {
			String Msg="";
			Scanner sc = new Scanner(System.in);
			System.out.println("채팅 :  ");
			Msg=sc.next();
			try {
				e.filltering(Msg);
			} catch (MyException me) {
				System.out.println("바른말 쓰기.");
				//재정의한 메소드
				System.out.println(me.getMessage());
			}
		}
	}
	//throw로 만든 예외를 throws로 모두 적어줘야함
	void filltering(String msg) throws MyException{
		String[] badWords = {"바보","멍청이"};
		for (int i = 0; i < badWords.length; i++) {
			//만약 msg가 badWords[i]를 포함하고 있을 때.
			if(msg.contains(badWords[i])) {
				//오류를 발생 시켜야함.(객체를)
				throw new MyException();
			}
		}
	}
}
class MyException extends Exception{
	
	@Override
	public String getMessage() {
		return "내가 만든 예외";
	}
}