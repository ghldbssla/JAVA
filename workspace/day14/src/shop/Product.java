package shop;

//DTO, VO : �ܼ��� ������ ����ִ� ��
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
		return name + "/"+price+"��"+cnt+"��";
	}
	
}
