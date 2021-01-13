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
		//입력된 정보들이 newUser에 포장된 채 날라온 상태
		//sql문 작성(INSERT문 사용)
		String sql = "INSERT INTO TBL_USER VALUES(?,?,?,?,?,?,?,?)";
		int check = 0;
		if (newUser.getUserpw().length() < 8) {
			return -1;
		} else {
			// 가입 가능한 상태
			// 암호화
			String en_pw = encrypt(newUser.getUserpw());
			newUser.setUserpw(en_pw);
			try {
				//쿼리문 명령을 내리기 위한 pstm객체 생성
				pstm = conn.prepareStatement(sql);
				//위의 쿼리문에 있는 ? 들에 들어갈 동적 데이터들을 세팅해 주어야 한다.
				pstm.setString(1, newUser.getUserid());
				pstm.setString(2, newUser.getUserpw());
				pstm.setString(3, newUser.getUsername());
				pstm.setInt(4, newUser.getUserage());
				pstm.setString(5, newUser.getUserphone());
				pstm.setString(6, newUser.getUseraddr());
				pstm.setInt(7, newUser.getLikeCnt());
				pstm.setInt(8, newUser.getTradeCnt());
				//쿼리문 실행(처리된 행 수가 리턴)
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
		//sql문(SELECT문 사용)
		String sql = "SELECT COUNT(*) FROM TBL_USER WHERE USERID=?";
		int result = 0;
		try {
			//pstm 객체생성
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			//SELECT 문이기 때문에 검색된 결과가 존재하고 그것을 rs객체로 받아온다.
			rs = pstm.executeQuery();
			//rs.next() : 다음 행(존재하면 true)
			if (rs.next()) {
				//rs.getInt(1) : 1번째 컬럼의 정수값 가져오기
				result = rs.getInt(1);
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
		//result가 0이면 중복되지 않는다는 뜻이므로 true 리턴
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
				System.out.println("알 수 없는 오류");
			}
		}
		return user;
	}

	public void modify(int idx, String newData) {
		// UPDATE TBL_USER SET USERPW=? WHERE USERID=?;
		// UPDATE TBL_USER SET USERADDR = ? WHERE USERID=?;
		//두가지의 경우의 수가 있기 때문에 컬럼명이 동적으로 작성되어야 한다.
		//idx값이 0이라면 userpw 수정, 1 이라면 useraddr 수정으로 약속하고
		//그대로 사용하기 위해서 컬럼명이 그 idx대로 담겨있는 문자열 배열을 만들어준다.
		String[] columns = { "USERPW", "USERADDR" };
		//컬럼명이 변경될 수 있기 때문에 가운데 SET 다음에 을 컬럼명을 위에있는 배열에서 값을 가져와서
		//연결하는 식으로 쿼리문을 작성해 준다.
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
				System.out.println("알 수 없는 오류");
			}
		}

	}

	public boolean leaveId(String userpw) {
		//탈퇴를 위해 재 입력한 비밀번호가 로그인된 유저의 비밀번호와 같은지 비교하기 위해서
		//먼저 USER 테이블에서 세션의 비밀번호를 검색해 와야 한다.
		//151~170줄
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
				System.out.println("알 수 없는 오류");
			}
		}
		//en_pw에 검색이 되었다면 암호화된 비밀번호가 담겨있으므로, 밖에서 받아온 userpw와
		//그 암호화된 비밀번호를 복호화 시켜서 비교해준다.
		if (userpw.equals(decrypt(en_pw))) {
			//비밀번호를 맞게 입력했으므로 탈퇴 진행
			//유저의 상품부터 먼저 지워주어야 한다.(176~189)
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
					System.out.println("알 수 없는 오류");
				}
			}
			//상품삭제가 끝났으므로 유저테이블에서도 데이터를 지워준다.(191~205)
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
					System.out.println("알 수 없는 오류");
				}
			}
		}
		return result==1;
	}
}
