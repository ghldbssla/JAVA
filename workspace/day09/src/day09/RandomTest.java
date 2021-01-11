package day09;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		while(true) {
			//Math.Random() : 0~1 사이의 랜덤한 실수 반환
			//Math클래스는 static 메소드들로 구성되있는 클래스이므로
			//내부에 있는 메소드 사용시 객체화를 진행하지 않고, 
			//클래스 이름으로 바로 접근하여 사용한다.
//			System.out.println((int)(Math.random()*10+10));
			
			System.out.println(r.nextInt(11)+10);
			//nextInt(int n) : 0~n-1까지의 난수 발생
		}
	}
}
