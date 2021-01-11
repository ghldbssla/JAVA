package factory;

public class BurgerFactory {
	public static Burger makeBurger(String order) {
		Burger burger = null;
		switch(order) {
		case "���":
			burger = new BigMac();
			break;
		case "�Ұ�����":
			burger = new BulgogiBurger();
			break;
		case "ġ�����":
			burger = new CheezeBurger();
			break;
		}
		return burger;
	}
}
