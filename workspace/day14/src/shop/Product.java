package shop;

//DTO, VO : 단순히 정보만 담고있는 모델
public class Product {
	public static int seq;
	int productNum;
	String name;
	int price;
	int cnt;
	String userid;
	
	public Product() {;}

	public Product( String name, int price, int cnt, String userid) {
		super();
		this.productNum = ++seq;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		this.userid = userid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "/"+price+"원"+cnt+"개";
	}
	
}
