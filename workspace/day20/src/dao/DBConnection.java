package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static Connection conn = null;
	//� �����ͺ��̽��� ������ ������
	static String driver = "oracle.jdbc.driver.OracleDriver";
	//� IP�ּҿ� ������ ������
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	//����Ŭ ������ ��й�ȣ
	static String user = "dbms";
	static String password = "dbms";
	
	public static Connection getConnection() {
		if(conn==null) {
			try {
				Class.forName(driver);
				System.out.println("driver �ε� ����");
				//������ ��� �Ұ������� ������ �� �� get���� �޾ƿ´�.
				conn=DriverManager.getConnection(url, user, password);
				System.out.println("����Ŭ ���� ����");
			} catch (ClassNotFoundException e) {
				System.out.println("driver �ε� ����");
			} catch (SQLException sqle) {
				System.out.println("����Ŭ ���� ����!");
			}
		}
		return conn;
	}
}
