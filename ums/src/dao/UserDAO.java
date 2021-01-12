package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import dto.UserDTO;

public class UserDAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	
	private static int KEY = 4;
	public UserDAO() {
		conn=DBConnection.getConnection();
	}
	public int join(UserDTO newUser) {
		String sql = "INSERT INTO TBL_USER VALUES(?,?,?,?,?,?,?,?)";
		int check = 0;
		if(newUser.getUserpw().length()<8) {
			return -1;
		}else {
			//가입 가능한 상태
			//암호화
			String en_pw = encrypt(newUser.getUserpw());
			newUser.setUserpw(en_pw);
			//회원가입은 데이터 추가에 해당하므로 insert()메소드를 통해서 추가해준다.
			try {
				pstm=conn.prepareStatement(sql);
				pstm.setString(1, newUser.getUserid());
				pstm.setString(2, newUser.getUserpw());
				pstm.setString(3, newUser.getUsername());
				pstm.setInt(4, newUser.getUserage());
				pstm.setString(5, newUser.getUserphone());
				pstm.setString(6, newUser.getUseraddr());
				pstm.setInt(7, newUser.getLikeCnt());
				pstm.setInt(8, newUser.getTradeCnt());
				check = pstm.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				try {
					pstm.close();
				} catch (SQLException e) {
					System.out.println("알 수 없는 오류");
				}
			}
		}
		return check;
	}
	public boolean checkDup(String userid) {
		String sql = "SELECT COUNT(*) FROM TBL_USER WHERE USERID=?";
		int result=0;
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, userid);
			rs=pstm.executeQuery();
			if(rs.next()) {
				result=rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
			} catch (SQLException e) {
				System.out.println("알 수 없는 오류");
			}
		}
		return result==0;
	}
	
	public String encrypt(String userpw) {
		String en_pw="";
		
		for (int i = 0; i < userpw.length(); i++) {
			en_pw+=(char)(userpw.charAt(i)+KEY);
		}
		return en_pw;
	}
	
	public String decrypt(String en_pw) {
		String de_pw="";
		
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw+=(char)(en_pw.charAt(i)-KEY);
		}
		return de_pw;
	}
	
	public UserDTO login(String userid, String userpw) {
		String sql = "SELECT * FROM TBL_USER WHERE USERID=? AND USERPW=?";
		UserDTO user =null;
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, userid);
			pstm.setString(2,encrypt(userpw));
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				user = new UserDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),
				rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
			} catch (SQLException e) {
				System.out.println("알 수 없는 오류");
			}
		}
		return user;
	}
	public void modify(int idx, String newData) {
		//UPDATE TBL_USER SET USERPW=? WHERE USERID=?;
		//UPDATE TBL_USER SET USERADDR = ? WHERE USERID=?;
		String[] columns = {"USERPW","USERADDR"};
		String sql = "UPDATE TBL_USER SET "+columns[idx]
				+" = ? WHERE USERID=?";
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, newData);
			pstm.setString(2, Session.get("session_id"));
			pstm.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				System.out.println("알 수 없는 오류");
			}
		}
		
		
	}
	public boolean leaveId(String userpw) {
		String sql = "DELETE FROM TBL_USER WHERE USERID=?";
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, Session.get("session_id"));
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
				System.out.println("알 수 없는 오류");
			}
		}
		return result==1;
	}
}










