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
		//추가하기
		DB.get(num).add(user);
	}
	void update() {
		//수정하기
	}
	void delete() {
		//삭제하기
	}
	HashSet<Bank> select(String keyword) {
		//검색하기
		//외부에서 keyword 받아온 후 같은 클래스에 있는 DB에서
		//모든 정보들을 돌면서 keyword가 계좌번호에 있거나 핸드폰 번호에 있다면
		//HashSet에 담아서 리턴해준다.
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





