package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int num = 0;
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			//����ó���� �� �ȸԴ� ��찡 �����Ƿ� while�ȿ��� �Լ� �������ش�.
//			try {
//				num = sc.nextInt();
//				System.out.println(num);
//				
//			} catch (InputMismatchException ime) {
//				System.out.println("���ڸ� �Է��ϼ���.");
//			}
//		}
		while (true) {
			int num1=0, num2=0;
			Scanner sc = new Scanner(System.in);
			//Alt + Shift + z + ù��°�� + enter
			try {
				System.out.println("ù��° ���� : ");
				num1 = sc.nextInt();
				System.out.println("�ι�° ���� : ");
				num2 = sc.nextInt();
				System.out.println("num1/num2 = "+num1/(num2+0.0));
			}catch (InputMismatchException ime) {
				//Exception�� �θ�Ŭ�����̹Ƿ� ��밡��(��ĳ����)
				System.out.println("������ �Է��ϼ���.");
			}
//			 catch(Exception e) {
//				System.out.println(e.getClass());
//				System.out.println("���� �߻�");
//			}
			//�̷��� ������ ã�� (if�� ���� ������ �����ϸ鼭 �ϳ��ϳ� �� ã���� ����)
		}
	}
}
