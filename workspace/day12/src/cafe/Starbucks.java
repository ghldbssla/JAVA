package cafe;

public class Starbucks {
	String[] arMenu;
	int[] arPrice;
	int[] arPoint;
	void regist(Cafe c) {
		arMenu = c.getMenu();
		arPrice = c.getPrice();
		arPoint = c.getPoint(arPrice);
		System.out.println("�ڡڡڡڡڡڡڡڡ��ళ���ڡڡڡڡڡڡڡڡ�");
		System.out.println("===========�޴���===========");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(arMenu[i] + " : " + arPrice[i]);
		}
	}
	void sell(String choice) {
		int price=0;
		int point=0;
		for (int i = 0; i < arMenu.length; i++) {
			if(arMenu[i].equals(choice)) {
				price=arPrice[i];
				if(arPoint[i]!=0) {
					point=arPoint[i];
				}
			}
		}
		System.out.println(choice+"��(��) "+price+"���Դϴ�.");
		if(point!=0) {
			System.out.println("����Ʈ "+point+"�� ����");
		}
	}
}







