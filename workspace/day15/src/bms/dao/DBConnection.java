package bms.dao;

import java.util.ArrayList;
import java.util.HashSet;

import bms.dto.Bank;

public class DBConnection {
	private static DBConnection conn = null;
	public static DBConnection getInstance() {
		if(conn==null) {
			conn=new DBConnection();
		}
		return conn;
	}
	public static ArrayList<ArrayList<Bank>> DB;
	private DBConnection() {
		DB  = new ArrayList<>();
		DB.add(new ArrayList<Bank>());
		DB.add(new ArrayList<Bank>());
		DB.add(new ArrayList<Bank>());
	}
	void insert(int num,Bank user) {
		//�߰��ϱ�
		DB.get(num).add(user);
	}
	void update() {
		//�����ϱ�
	}
	void delete() {
		//�����ϱ�
	}
	HashSet<Bank> select(String keyword) {
		//�˻��ϱ�
		//�ܺο��� keyword �޾ƿ� �� ���� Ŭ������ �ִ� DB����
		//��� �������� ���鼭 keyword�� ���¹�ȣ�� �ְų� �ڵ��� ��ȣ�� �ִٸ�
		//HashSet�� ��Ƽ� �������ش�.
		HashSet<Bank> result = new HashSet<>();
		for (ArrayList<Bank> row : DB) {
			if(row==null) { break; }
			for(Bank user : row) {
				if(user==null) {break;}
				if(keyword.equals(user.account)) {
					result.add(user);
				}else if(keyword.equals(user.phone)) {
					result.add(user);
				}
			}
		}
		return result;
	}
	
}





