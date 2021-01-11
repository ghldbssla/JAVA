package factory;

public class BurgerFactory {
	public static Burger makeBurger(String order) {
		Burger burger = null;
		switch(order) {
		case "빅맥":
			burger = new BigMac();
			break;
		case "불고기버거":
			burger = new BulgogiBurger();
			break;
		case "치즈버거":
			burger = new CheezeBurger();
			break;
		}
		return burger;
	}
}
