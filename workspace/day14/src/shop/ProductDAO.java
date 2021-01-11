package shop;

public class ProductDAO {
	public static User session = null;

	public ProductDAO(User user) {
		session = user;
	}

	void insert(String name, int price, int cnt) {
		Product product = new Product(name, price, cnt, session.id);
		index.DB.put(session, product);
	}

	void update(String name, int price) {
		Product prod = index.DB.get(session);
		if (prod.name.equals(name)) {
			prod.price = price;
		}
	}
	void show() {
		System.out.println(index.DB.values());
	}
}
