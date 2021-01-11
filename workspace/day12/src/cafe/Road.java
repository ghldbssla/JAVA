package cafe;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();//����Ʈ O
		Starbucks shinchon = new Starbucks();//����Ʈ X
		gangnam.regist(new Cafe() {
			@Override
			public int[] getPoint(int[] arPrice) {
				int[] arPoint=new int[arPrice.length];
				for (int i = 0; i < arPrice.length; i++) {
					arPoint[i] = (int)(arPrice[i]*0.1);
				}
				return arPoint;
			}
			@Override
			public int[] getPrice() {
				int[] arPrice = {3500,4000,4500};
				return arPrice;
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�Ƹ޸�ī��","ī���","īǪġ��"};
				return arMenu;
			}
		});
		gangnam.sell("�Ƹ޸�ī��");
		shinchon.regist(new Cafe() {
			@Override
			public int[] getPoint(int[] arPrice) {
				int[] arPoint=new int[arPrice.length];
				return arPoint;
			}
			
			@Override
			public int[] getPrice() {
				int[] arPrice = {3500,4000,4500};
				return arPrice;
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�Ƹ޸�ī��","ī���","īǪġ��"};
				return arMenu;
			}
		});
		shinchon.sell("�Ƹ޸�ī��");
	}
}









