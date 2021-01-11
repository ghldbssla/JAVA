package dto;

public class ProductDTO {
	public String prodname;
	public int prodprice;
	public int prodamount;
	public String manual;
	public String userid;
	public ProductDTO() {;}
	public ProductDTO(String prodname, int prodprice, int prodamount, String manual, String userid) {
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodamount = prodamount;
		this.manual = manual;
		this.userid = userid;
	}
	@Override
	public String toString() {
		return prodname+";"+prodprice+";"+prodamount
				+";"+manual+";"+userid;
	}
	
}
