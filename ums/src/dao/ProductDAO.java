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
		try {
			pstm = conn.prepareStatement(sql);
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
		/*
		 * result += datas[0]+". "+datas[1]+" - "+datas[2]+
					"��("+datas[3]+"��)\n���� : "+datas[4]+"\n";

		 * 
		 */
		String sql = "SELECT * FROM TBL_PRODUCT WHERE USERID=? ORDER BY PRODNUM";
		String userid = Session.get("session_id");
		String result = "";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			rs=pstm.executeQuery();
			while(rs.next()) {
				result+=rs.getInt(1)+". "+rs.getString(2)+" - "+rs.getInt(3)+
						"��("+rs.getInt(4)+"��)\n���� : "+rs.getString(5)+"\n"; 
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
	
//	public ArrayList<String> getAllProd(){
//		ArrayList<String> result = new ArrayList<>();
//		String userid = Session.get("session_id");
//		HashSet<String> rs = conn.select(6, userid);
//		if(rs.size()!=0 && rs!=null) {
//			for(String line : rs) {
//				result.add(line.split("\t")[0]);
//			}
//		}
//		return result;
//	}
	public void updateProduct(int prodnum,int idx,String newData) {
		String[] columns = {"","PRODNAME","PRODPRICE"};
		String sql = "UPDATE TBL_PRODUCT SET "+columns[idx]+"= ? WHERE PRODNUM=?";
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, newData);
			pstm.setInt(2, prodnum);
			pstm.executeQuery();
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				System.out.println("�� �� ���� ����");
			}
		}
		
	}
	public boolean deleteProduct(int prodnum) {
		String sql = "DELETE FROM TBL_PRODUCT WHERE PRODNUM=?";
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, prodnum);
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				System.out.println("�� �� ���� ����");
			}
		}
		return result==1;
	}
}














