package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static Connection conn = null;
	//어떤 데이터베이스에 연결할 것인지
	static String driver = "oracle.jdbc.driver.OracleDriver";
	//어떤 IP주소에 연결할 것인지
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	//오라클 계정과 비밀번호
	static String user = "dbms";
	static String password = "dbms";
	
	public static Connection getConnection() {
		if(conn==null) {
			try {
				Class.forName(driver);
				System.out.println("driver 로딩 성공");
				//연결을 어떻게 할것인지를 설정해 준 후 get으로 받아온다.
				conn=DriverManager.getConnection(url, user, password);
				System.out.println("오라클 연결 성공");
			} catch (ClassNotFoundException e) {
				System.out.println("driver 로딩 실패");
			} catch (SQLException sqle) {
				System.out.println("오라클 연결 실패!");
			}
		}
		return conn;
	}
}
