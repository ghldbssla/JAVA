package bms.dao;

import java.util.HashSet;
import java.util.Iterator;

import bms.dto.Bank;

public class BankDAO {
	DBConnection conn=null;
	public BankDAO() {
		//���� DB�� DBConnection Ŭ���� �ȿ� ������, ������ ���α׷��� ���鶧��
		//�ܺο� DB�� �����Ѵ�. ���� DBConnection Ŭ�������� �� �ܺο� �ִ�
		//DB�� �����ϴ� �ڵ带 ������ ����, DAO������ �� Ŭ������ ���� ��ü�� �޾ƿ´�.
		//DAOŬ������ DB�� �����ϱ� ���� ��ü�̹Ƿ� ������ ������ conn ��ü�� �޾ƿ��� �ȴ�.
		conn=DBConnection.getInstance();
	}
	public boolean duplicate(String account) {
		//duplicate �޼ҵ尡 ȣ��Ǿ��ٴ� ����, BankDAO() �����ڰ� ���� ȣ��Ǿ��ٴ� ���̹Ƿ�
		//���� conn���� null�� �ƴ� ��� DB�� ������ ���� ��ü�� ������� ���̴�.
		//���� �Ʒ������� �� conn��ü�� .�� ��� �ȿ��ִ� �޼ҵ���� ����� �� �ִ�.
		//conn.select()�� ��� ����� �߰��Ǿ��ִ� HashSet�� �������ֹǷ�
		//result��� HashSet�� ���� �� ����� �޴´�.
		HashSet<Bank> result = conn.select(account);
		
		//�޾ƿ� ����� ũ�Ⱑ 0�̶�� ���� �˻��� ����� ���ٴ� ���̹Ƿ�
		//�ݴ�� size�� 0�� �ƴҶ� true�� ������ �ش�.
		if(result.size()!=0) {
			return true;
		}else {
			return false;
		}
	}
	public void join(int num,Bank user) {
		//�Ѿ�� ���� ��ȣ�� ���Ե� user��ü�� DB�� �߰��ؾ� �ϹǷ�
		//conn.insert()�� �̿��ؼ� DB�� �߰��Ѵ�.
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







