package day09;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		while(true) {
			//Math.Random() : 0~1 ������ ������ �Ǽ� ��ȯ
			//MathŬ������ static �޼ҵ��� �������ִ� Ŭ�����̹Ƿ�
			//���ο� �ִ� �޼ҵ� ���� ��üȭ�� �������� �ʰ�, 
			//Ŭ���� �̸����� �ٷ� �����Ͽ� ����Ѵ�.
//			System.out.println((int)(Math.random()*10+10));
			
			System.out.println(r.nextInt(11)+10);
			//nextInt(int n) : 0~n-1������ ���� �߻�
		}
	}
}
