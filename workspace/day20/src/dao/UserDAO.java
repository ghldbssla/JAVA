package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.UserDTO;

public class UserDAO {
	Connection conn = null;
	public static UserDTO session=null;
	public UserDAO() {
		conn=DBConnection.getConnection();
	}
	public int login(String userid,String userpw) {
		//TBL_USER 테이블에서 모든 정보 긁어와! 대신 USERID가 ? 이고 USERPW가 ?인 애들만
		String query = "SELECT * FROM TBL_USER WHERE USERID=? AND USERPW=?";
		PreparedStatement pstm=null;
		UserDTO user = null;
		try {
			//열어준 통로 conn에서 쿼리문 실행 준비
			pstm=conn.prepareStatement(query);
			//현재 쿼리문에 있는 ? 에다가 값을 세팅해준다.
			//첫번째 물음표에 userid로 넘겨받은 문자열 세팅
			pstm.setString(1, userid);
			//두번째 물음표에 userpw로 넘겨받은 문자열 세팅
			pstm.setString(2, userpw);
			
			//executeQuery() : 쿼리문 실행!
			//SELECT는 긁어오는 명령이므로 결과가 존재한다. 그 결과를 ResultSet에 담아준다
			ResultSet rs=pstm.executeQuery();
			//rs에 다음값이 있다면(다음 정보가 있다면, 다음 행이 있다면)
			if(rs.next()) {
				//rs에서 첫번째 컬럼부터 문자열로 받아오기. 받아온 정보들 UserDTO로 포장
				user = new UserDTO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5));
			}
			
			if(user==null) {
				//로그인 실패
				return -1;
			}else {
				//로그인 성공
				session=user;
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
