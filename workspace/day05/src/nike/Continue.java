package nike;

public class Continue {
	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
////break�� ��ġ�� ���� �����ϴ� �ڵ尡 �޶��� �� �ִ�.
////			if(i==4) {break;}	(1~3���)
//			System.out.println(i);
////			if(i==4) {break;}	(1~4���)
//
//		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 4) {
				// continue;
				// ���� �ݺ�����(���� �ݺ��Ǵ� �ڵ��� ���� ���������� �̵�)
				//continue�� �Ʒ��� �ǳʶ۸��� �ǹ��ִ� ������ ���� �� ���
				continue;
			}
		}
	}
}
