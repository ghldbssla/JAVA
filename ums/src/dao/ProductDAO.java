package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import dto.ProductDTO;
import dto.UserDTO;

public class ProductDAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	public ProductDAO() {
		conn = DBConnection.getConnection();
	}
	public void addProduct(ProductDTO newProd) {
		String sql = "INSERT INTO TBL_PRODUCT VALUES(?,?,?,?,?,?,?)";
		System.out.println(newProd.toString());
		try {
			pstm = conn.prepareStatement(sql);
			System.out.println(getCnt());
			pstm.setInt(1, newProd.getProdnum());
			pstm.setString(2, newProd.getProdname());
			pstm.setInt(3, newProd.getProdprice());
			pstm.setInt(4,newProd.getProdamount());
			pstm.setString(5, newProd.getProdinfo());
			pstm.setInt(6, newProd.getLikeCnt());
			pstm.setString(7, newProd.getUserid());
			pstm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("��ǰ �߰� ����");
			System.out.println(e);
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				System.out.println("�� �� ���� ����");
			}
		}
	}
	public int getCnt() {
		String sql = "SELECT PRODNUM FROM TBL_PRODUCT ORDER BY PRODNUM";
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
			} catch (SQLException e) {
				System.out.println("�� �� ���� ����");
			}
		}
		return result;
	}
	public String getList() {
		String userid = Session.get("session_id");
		HashSet<String> rs = conn.select(6, userid);
		String result="";
		for(String line : rs) {
			String[] datas = line.split("\t");
			result += datas[0]+". "+datas[1]+" - "+datas[2]+
					"��("+datas[3]+"��)\n���� : "+datas[4]+"\n";
		}
		return result;
	}
	public ArrayList<String> getAllProd(){
		ArrayList<String> result = new ArrayList<>();
		String userid = Session.get("session_id");
		HashSet<String> rs = conn.select(6, userid);
		if(rs.size()!=0 && rs!=null) {
			for(String line : rs) {
				result.add(line.split("\t")[0]);
			}
		}
		return result;
	}
	public void updateProduct(String prodnum,int idx,String newData) {
		conn.update(prodnum, idx, newData);
	}
	public boolean deleteProduct(String prodnum) {
		return conn.delete(prodnum);		
	}
}







