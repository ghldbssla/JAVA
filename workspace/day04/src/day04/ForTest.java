package day04;

public class ForTest {
	public static void main(String[] args) {
//		System.out.println(4+" x "+1+" = "+(4*1));
//		System.out.println(4+" x "+2+" = "+(4*2));
//		System.out.println(4+" x "+3+" = "+(4*3));
//		System.out.println(4+" x "+4+" = "+(4*4));
//		System.out.println(4+" x "+5+" = "+(4*5));
//		System.out.println(4+" x "+6+" = "+(4*6));
//		System.out.println(4+" x "+7+" = "+(4*7));
//		System.out.println(4+" x "+8+" = "+(4*8));
//		System.out.println(4+" x "+9+" = "+(4*9));

//		for (int i = 1; i <= 9; i=i+1) {
//			System.out.println(4+" x "+i+" = "+(4*i));
//		}
		
//		1���� 10���� ����ϴ� while��
//		int cnt = 1;
//		while (cnt <= 10) {
//			System.out.println(cnt);
//			cnt = cnt + 1;
//		}
		
//		1���� 10���� ����ϴ� while��		
//		for (int i = 1; i <= 10; i = i + 1) {
//			System.out.println(i);
//		}
//���ϴ� ���� ����Ҷ��� while�� ���� for���� ����.
		
		//������ : ó���� �����ϰ� ������ ���ش�
		int num=10;
		System.out.println(num++);	//10
		System.out.println(num);	//11
		//������ : ������ �����ϰ� ó���� ���ش�
		num=10;
		System.out.println(++num);	//11
		System.out.println(num);	//11
	}
}
