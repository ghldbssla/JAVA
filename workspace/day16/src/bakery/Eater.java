package bakery;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Eater {
	public static void main(String[] args) {
		BreadMaker maker = new BreadMaker();
		Bread bread = maker.getBread();
		Thread t = new Thread(maker,"������");
		t.start();
		String[] option = {"���Ա�","������"};
		ImageIcon icon = new ImageIcon("C:\\JAVA_JHY\\resource\\��.png");
		int choice=0;
		while(true) {
		
			choice=JOptionPane.showOptionDialog(null, "", "�ĸ��ٰ�Ʈ", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, option, null);
		if(choice==1||choice==-1) {
			break;
		}else if(choice==0) {
			//���Ա�
			bread.eatBread();
		}
		
		
		}
	}
}
