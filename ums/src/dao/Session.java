package dao;

import java.util.HashMap;

public class Session {
	//���ǿ� ������ �������� key-value �������� ����� HashMap�� �������� �̿��Ѵ�.
	private static HashMap<String, String> session = new HashMap<>();
	
	//����ƽ �޼ҵ��� �����ϰ� ���� �����´�.
	public static void put(String key,String value) {
		session.put(key, value);
	}
	public static String get(String key) {
		return session.get(key);
	}
}
