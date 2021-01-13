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
		conn = DBConnection.getConnection();
	}

	public int join(UserDTO newUser) {
		//�Էµ� �������� newUser�� ����� ä ����� ����
		//sql�� �ۼ�(INSERT�� ���)
		String sql = "INSERT INTO TBL_USER VALUES(?,?,?,?,?,?,?,?)";
		int check = 0;
		if (newUser.getUserpw().length() < 8) {
			return -1;
		} else {
			// ���� ������ ����
			// ��ȣȭ
			String en_pw = encrypt(newUser.getUserpw());
			newUser.setUserpw(en_pw);
			try {
				//������ ����� ������ ���� pstm��ü ����
				pstm = conn.prepareStatement(sql);
				//���� �������� �ִ� ? �鿡 �� ���� �����͵��� ������ �־�� �Ѵ�.
				pstm.setString(1, newUser.getUserid());
				pstm.setString(2, newUser.getUserpw());
				pstm.setString(3, newUser.getUsername());
				pstm.setInt(4, newUser.getUserage());
				pstm.setString(5, newUser.getUserphone());
				pstm.setString(6, newUser.getUseraddr());
				pstm.setInt(7, newUser.getLikeCnt());
				pstm.setInt(8, newUser.getTradeCnt());
				//������ ����(ó���� �� ���� ����)
				check = pstm.executeUpdate();
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
		return check;
	}

	public boolean checkDup(String userid) {
		//sql��(SELECT�� ���)
		String sql = "SELECT COUNT(*) FROM TBL_USER WHERE USERID=?";
		int result = 0;
		try {
			//pstm ��ü����
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			//SELECT ���̱� ������ �˻��� ����� �����ϰ� �װ��� rs��ü�� �޾ƿ´�.
			rs = pstm.executeQuery();
			//rs.next() : ���� ��(�����ϸ� true)
			if (rs.next()) {
				//rs.getInt(1) : 1��° �÷��� ������ ��������
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
		//result�� 0�̸� �ߺ����� �ʴ´ٴ� ���̹Ƿ� true ����
		return result == 0;
	}

	public String encrypt(String userpw) {
		String en_pw = "";

		for (int i = 0; i < userpw.length(); i++) {
			en_pw += (char) (userpw.charAt(i) + KEY);
		}
		return en_pw;
	}

	public String decrypt(String en_pw) {
		String de_pw = "";

		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char) (en_pw.charAt(i) - KEY);
		}
		return de_pw;
	}

	public UserDTO login(String userid, String userpw) {
		String sql = "SELECT * FROM TBL_USER WHERE USERID=? AND USERPW=?";
		UserDTO user = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			pstm.setString(2, encrypt(userpw));
			rs = pstm.executeQuery();

			if (rs.next()) {
				user = new UserDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8));
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
		return user;
	}

	public void modify(int idx, String newData) {
		// UPDATE TBL_USER SET USERPW=? WHERE USERID=?;
		// UPDATE TBL_USER SET USERADDR = ? WHERE USERID=?;
		//�ΰ����� ����� ���� �ֱ� ������ �÷����� �������� �ۼ��Ǿ�� �Ѵ�.
		//idx���� 0�̶�� userpw ����, 1 �̶�� useraddr �������� ����ϰ�
		//�״�� ����ϱ� ���ؼ� �÷����� �� idx��� ����ִ� ���ڿ� �迭�� ������ش�.
		String[] columns = { "USERPW", "USERADDR" };
		//�÷����� ����� �� �ֱ� ������ ��� SET ������ �� �÷����� �����ִ� �迭���� ���� �����ͼ�
		//�����ϴ� ������ �������� �ۼ��� �ش�.
		String sql = "UPDATE TBL_USER SET " + columns[idx] + " = ? WHERE USERID=?";

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
				System.out.println("�� �� ���� ����");
			}
		}

	}

	public boolean leaveId(String userpw) {
		//Ż�� ���� �� �Է��� ��й�ȣ�� �α��ε� ������ ��й�ȣ�� ������ ���ϱ� ���ؼ�
		//���� USER ���̺��� ������ ��й�ȣ�� �˻��� �;� �Ѵ�.
		//151~170��
		String sql = "SELECT USERPW FROM TBL_USER WHERE USERID=?";
		String en_pw = "";
		int result = 0;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, Session.get("session_id"));
			rs = pstm.executeQuery();
			if (rs.next()) {
				en_pw = rs.getString(1);
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
		//en_pw�� �˻��� �Ǿ��ٸ� ��ȣȭ�� ��й�ȣ�� ��������Ƿ�, �ۿ��� �޾ƿ� userpw��
		//�� ��ȣȭ�� ��й�ȣ�� ��ȣȭ ���Ѽ� �����ش�.
		if (userpw.equals(decrypt(en_pw))) {
			//��й�ȣ�� �°� �Է������Ƿ� Ż�� ����
			//������ ��ǰ���� ���� �����־�� �Ѵ�.(176~189)
			sql = "DELETE FROM TBL_PRODUCT WHERE USERID=?";
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, Session.get("session_id"));
				pstm.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				try {
					pstm.close();
				} catch (SQLException e) {
					System.out.println("�� �� ���� ����");
				}
			}
			//��ǰ������ �������Ƿ� �������̺����� �����͸� �����ش�.(191~205)
			sql = "DELETE FROM TBL_USER WHERE USERID=?";
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
					System.out.println("�� �� ���� ����");
				}
			}
		}
		return result==1;
	}
}
