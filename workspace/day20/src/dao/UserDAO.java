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
		//TBL_USER ���̺��� ��� ���� �ܾ��! ��� USERID�� ? �̰� USERPW�� ?�� �ֵ鸸
		String query = "SELECT * FROM TBL_USER WHERE USERID=? AND USERPW=?";
		PreparedStatement pstm=null;
		UserDTO user = null;
		try {
			//������ ��� conn���� ������ ���� �غ�
			pstm=conn.prepareStatement(query);
			//���� �������� �ִ� ? ���ٰ� ���� �������ش�.
			//ù��° ����ǥ�� userid�� �Ѱܹ��� ���ڿ� ����
			pstm.setString(1, userid);
			//�ι�° ����ǥ�� userpw�� �Ѱܹ��� ���ڿ� ����
			pstm.setString(2, userpw);
			
			//executeQuery() : ������ ����!
			//SELECT�� �ܾ���� ����̹Ƿ� ����� �����Ѵ�. �� ����� ResultSet�� ����ش�
			ResultSet rs=pstm.executeQuery();
			//rs�� �������� �ִٸ�(���� ������ �ִٸ�, ���� ���� �ִٸ�)
			if(rs.next()) {
				//rs���� ù��° �÷����� ���ڿ��� �޾ƿ���. �޾ƿ� ������ UserDTO�� ����
				user = new UserDTO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5));
			}
			
			if(user==null) {
				//�α��� ����
				return -1;
			}else {
				//�α��� ����
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
