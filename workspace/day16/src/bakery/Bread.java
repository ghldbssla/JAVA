package bakery;

public class Bread {
	int breadCnt;
	int eatCnt;
	synchronized void makeBread() {
		if(breadCnt>9) {
			System.out.println("���� ���� á���ϴ�.");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		breadCnt++;
		System.out.println("���� 1�� ��������ϴ�. ��"+breadCnt+"��");
	}
	synchronized void eatBread() {
		if(eatCnt==20) {
			System.out.println("���� �� ���������ϴ�.");
			
		}else if(breadCnt<1) {
			System.out.println("���� ����� ���Դϴ�. ��ٷ� �ּ���.");
		}else {
			breadCnt--;
			eatCnt++;
			System.out.println("���� �Ѱ� �Ծ����ϴ�. �� "+breadCnt+"��");
			
		}
		notify();
	}
}
