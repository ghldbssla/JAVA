package dto;

import dao.ProductDAO;

public class ProductDTO {
	private int prodnum;
	private String prodname;
	private int prodprice;
	private int prodamount;
	private String prodinfo;
	private int likeCnt;
	private String userid;
	
	public ProductDTO() {;}
	
	public ProductDTO(int prodnum, String prodname, int prodprice, int prodamount, String prodinfo, int likeCnt,
			String userid) {
		this.prodnum = prodnum;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodamount = prodamount;
		this.prodinfo = prodinfo;
		this.likeCnt = likeCnt;
		this.userid = userid;
	}

	public ProductDTO(String prodname, int prodprice, int prodamount, String prodinfo, String userid) {
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodamount = prodamount;
		this.prodinfo = prodinfo;
		this.userid = userid;
		this.likeCnt=0;
	}

	public String getProdname() {
		return prodname;
	}
	
	public int getProdnum() {
		return prodnum;
	}

	public void setProdnum(int prodnum) {
		this.prodnum = prodnum;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getProdprice() {
		return prodprice;
	}
	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}
	public int getProdamount() {
		return prodamount;
	}
	public void setProdamount(int prodamount) {
		this.prodamount = prodamount;
	}
	public String getProdinfo() {
		return prodinfo;
	}
	public void setProdinfo(String prodinfo) {
		this.prodinfo = prodinfo;
	}
	public int getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ProductDTO) {
			ProductDTO target = (ProductDTO)obj;
			if(target.prodnum==this.prodnum) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return prodnum+"\t"+prodname+"\t"+prodprice+"\t"+prodamount+"\t"
				+prodinfo+"\t"+likeCnt+"\t"+userid;
	}
}





