package bms.dao;

import java.util.HashSet;
import java.util.Iterator;

import bms.dto.Bank;

public class BankDAO {
	DBConnection conn=null;
	public BankDAO() {
		//현재 DB는 DBConnection 클래스 안에 있지만, 실제로 프로그램을 만들때는
		//외부에 DB가 존재한다. 따라서 DBConnection 클래스에는 그 외부에 있는
		//DB와 연결하는 코드를 구현해 놓고, DAO에서는 그 클래스를 통해 객체를 받아온다.
		//DAO클래스는 DB에 접근하기 위한 객체이므로 생성될 때마다 conn 객체를 받아오면 된다.
		conn=DBConnection.getInstance();
	}
	public boolean duplicate(String account) {
		//duplicate 메소드가 호출되었다는 뜻은, BankDAO() 생성자가 먼저 호출되었다는 뜻이므로
		//현재 conn에는 null이 아닌 어떠한 DB와 연결을 위한 객체가 담겨있을 것이다.
		//따라서 아래에서는 그 conn객체에 .을 찍고 안에있는 메소드들을 사용할 수 있다.
		//conn.select()는 모든 결과가 추가되어있는 HashSet을 리턴해주므로
		//result라는 HashSet을 만들어서 그 결과를 받는다.
		HashSet<Bank> result = conn.select(account);
		
		//받아온 결과의 크기가 0이라는 말은 검색된 결과가 없다는 뜻이므로
		//반대로 size가 0이 아닐때 true를 리턴해 준다.
		if(result.size()!=0) {
			return true;
		}else {
			return false;
		}
	}
	public void join(int num,Bank user) {
		//넘어온 은행 번호와 가입된 user객체를 DB에 추가해야 하므로
		//conn.insert()를 이용해서 DB에 추가한다.
		conn.insert(num-1,user);
	}
	public boolean login(String account,String pw) {
		HashSet<Bank> result = conn.select(account);
		if(result.size()==1) {
			Iterator<Bank> iter=result.iterator();
			if(iter.next().pw.equals(pw)) {
				return true;
			}
		}
		return false;
	}
}







