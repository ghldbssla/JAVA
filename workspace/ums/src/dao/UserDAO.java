package dao;

import java.util.HashSet;
import java.util.Iterator;

import dto.UserDTO;

public class UserDAO {
	public static UserDTO session = null;
	//UserDAO Ŭ������ DB�� �����ϱ� ���� Ŭ�����̹Ƿ� �����Ǹ� conn�� �����־�� �Ѵ�.
	//User������ ����ִ� UserDB.txt ������ �а� ��� �ϱ� ������ DBConnection �����ڿ�
	//UserDB.txt ��� ���ϸ� ���ڿ��� �Ѱ��ش�.
	DBConnection conn = new DBConnection("UserDB.txt");
	public boolean join(UserDTO user) {
		//user �Ű������� ����� ��ü�� ���� �޾Ұ�
		//���� �� user�� userid�� �����ϴ� ȸ���� id�ϼ��� �ֱ� ������ ���� �˻��ؾ��Ѵ�.
		if(findUser(user.userid)==null) {
			//��ġ�� id�� ���ٴ� ���̹Ƿ� �׶� ���Ͽ� insert �õ�
			return conn.insert(user.toString());
		}
		//��ġ�� ���̵� �ִٴ� ���̹Ƿ� false ����
		return false;	
	}
	public int login(String userid,String userpw) {
		//�Ѱܹ��� id�� DB������ �ϴ� txt ���Ͽ��� ���� ù��° �κп� ���� ���� �ִ�����
		//���ϸ� ã�´�. DBConnection Ŭ���� �ȿ� �ִ� select�� �˻��ϴ� �޼ҵ��̴�.
		//ù��° �κ� : 0, �Ѱܹ��� id�� : userid
		HashSet<UserDTO> datas = conn.selectUser(0, userid);
		if(datas.size()==0) {
			return -1;//ȸ�� �������� ����
		}
		Iterator<UserDTO> iter = datas.iterator();
		while(iter.hasNext()) {
			UserDTO user = iter.next();
			if(user.userpw.equals(userpw)) {
				session=user;
				return 1;//�α��� ����
			}
		}
		return 0;//��й�ȣ Ʋ��
	}
	//ȸ���� id�� �޾ƿͼ� �� ȸ���� �����Ѵٸ� DTO�� �����ؼ� �����ִ� �޼ҵ�
	public UserDTO findUser(String userid) {
		//UserDB.txt�� ȸ�������� ����ִ� DB�̱� ������ �װ����� ã�ƿ;���
		//���Ͽ� �����ϱ� ���� �������� DBConnection Ŭ������ ������ �Ǿ� �ְ�
		//���� �� ��ü�� �ʿ��ϴ�.(conn)
		//���� ������ userid;userpw;username;userphone;useraddr
		//�������� UserDB.txt ���Ͽ� ���� �� ����Ǿ� �ִ�. ���� �Ѱ��� userid��
		//; �������� �������� �� 0�� �濡�� ã���� �� ���� ã�� ������ �����̴�.
		HashSet<UserDTO> datas = conn.selectUser(0, userid);
		//���̵�� �ߺ��Ұ��̱� ������ datas�� ũ��� 1���� Ŭ���� ����.
		Iterator<UserDTO> iter = datas.iterator();
		//���� iter�� ���� �Ѱ� �ִٸ�
		if(iter.hasNext()) {
			//�� ����ִ� UserDTO ����
			return iter.next();
		}
		//�Ѱ��� ���ٸ� null ����
		return null;
	}
	
	public String findId(String username,String userphone) {
		//�Ѱܹ��� �̸��� �ڵ��� ��ȣ�� conn�� select �޼ҵ带 ���� UserDB.txt ���Ͽ��� ã�´�
		//�̸� : 2����, �Ѱܹ��� �̸� : username
		//select�޼ҵ�� ����Ÿ���� HashSet<UserDTO> Ÿ���̴�.
		//HashSet�� ������ ���� ������ �ȿ� ����ִ� UserDTO ��ü�鿡 �ٷ� ������ ���� ����.
		//���� iterator() �޼ҵ带 ����Ͽ� Iterator Ÿ������ ��ȯ���ش�.
		Iterator<UserDTO> iter = conn.selectUser(2, username).iterator();
		//����� �ΰ� �̻��ϼ� �����Ƿ�, if���� �ƴ� while���� ���鼭 ��� ������� �� �����ش�.
		while(iter.hasNext()) {
//			�ȿ��ִ� UserDTO ��ü �ϳ� �޾ƿ���(user)
			UserDTO user = iter.next();
			//�޾ƿ� user�� �ڵ��� ��ȣ��, �Է¹��� �ڵ��� ��ȣ�� ���ٸ� �� �����
			//ã�ƾ� �ϴ� ���̵��̴�.
			if(user.userphone.equals(userphone)) {
//				�� user�� ���̵� ����
				return user.userid;
			}
		}
		//�̰����� �Դٸ� while���� �� ���� ����ߴٴ� ���̹Ƿ�, ã�� ���̵� ���ų�
		//�߸� �Է��� �����̴�. ���� null�� �������ش�.
		return null;
	}
	public String findPw(String userid, String username, String userphone) {
		UserDTO user = findUser(userid);
		if(user.username.equals(username)) {
			if(user.userphone.equals(userphone)) {
				return user.userpw;
			}
		}
		return null;
	}
	public void modify(int choice, String newData) {
		switch(choice) {
		case 1:
			//�����ؾ��� ���� ��ġ�� �˾ƾ� �ϱ� ������ ���� �α��� �Ǿ� �ִ�
			//session ��ü�� ���� �Ѱ��־ updateUser �޼ҵ� ���ο���
			//�Ѿ�� ��ü�� id�� DB�� 0������� ���Ѵ�.
			conn.updateUser(session,1,newData);
			break;
		case 2:case 3:
			conn.updateUser(session,choice+1,newData);
			break;
		}
	}
	public void leaveId(UserDTO user) {
		conn.delete(user.toString());
	}
}










;