package cafe;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();//포인트 O
		Starbucks shinchon = new Starbucks();//포인트 X
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
				String[] arMenu = {"아메리카노","카페라떼","카푸치노"};
				return arMenu;
			}
		});
		gangnam.sell("아메리카노");
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
				String[] arMenu = {"아메리카노","카페라떼","카푸치노"};
				return arMenu;
			}
		});
		shinchon.sell("아메리카노");
	}
}









