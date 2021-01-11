package dao;

import java.util.HashSet;
import java.util.Iterator;

import dto.UserDTO;

public class UserDAO {
	public static UserDTO session = null;
	//UserDAO 클래스는 DB에 접근하기 위한 클래스이므로 생성되면 conn을 열어주어야 한다.
	//User정보가 담겨있는 UserDB.txt 파일을 읽고 써야 하기 때문에 DBConnection 생성자에
	//UserDB.txt 라는 파일명 문자열을 넘겨준다.
	DBConnection conn = new DBConnection("UserDB.txt");
	public boolean join(UserDTO user) {
		//user 매개변수에 포장된 객체를 전달 받았고
		//만약 그 user의 userid가 존재하는 회원의 id일수도 있기 때문에 먼저 검사해야한다.
		if(findUser(user.userid)==null) {
			//겹치는 id가 없다는 뜻이므로 그때 파일에 insert 시도
			return conn.insert(user.toString());
		}
		//겹치는 아이디가 있다는 뜻이므로 false 리턴
		return false;	
	}
	public int login(String userid,String userpw) {
		//넘겨받은 id를 DB역할을 하는 txt 파일에서 가장 첫번째 부분에 같은 값이 있는지를
		//비교하며 찾는다. DBConnection 클래스 안에 있는 select가 검색하는 메소드이다.
		//첫번째 부분 : 0, 넘겨받은 id값 : userid
		HashSet<UserDTO> datas = conn.selectUser(0, userid);
		if(datas.size()==0) {
			return -1;//회원 존재하지 않음
		}
		Iterator<UserDTO> iter = datas.iterator();
		while(iter.hasNext()) {
			UserDTO user = iter.next();
			if(user.userpw.equals(userpw)) {
				session=user;
				return 1;//로그인 성공
			}
		}
		return 0;//비밀번호 틀림
	}
	//회원의 id를 받아와서 그 회원이 존재한다면 DTO로 포장해서 돌려주는 메소드
	public UserDTO findUser(String userid) {
		//UserDB.txt가 회원정보가 담겨있는 DB이기 때문에 그곳에서 찾아와야함
		//파일에 접근하기 위한 과정들은 DBConnection 클래스에 구현이 되어 있고
		//따라서 그 객체가 필요하다.(conn)
		//유저 정보는 userid;userpw;username;userphone;useraddr
		//형식으로 UserDB.txt 파일에 한줄 씩 저장되어 있다. 따라서 넘겨준 userid를
		//; 기준으로 나누었을 때 0번 방에서 찾으면 그 줄이 찾는 유저의 정보이다.
		HashSet<UserDTO> datas = conn.selectUser(0, userid);
		//아이디는 중복불가이기 때문에 datas의 크기는 1보다 클수가 없다.
		Iterator<UserDTO> iter = datas.iterator();
		//따라서 iter에 값이 한개 있다면
		if(iter.hasNext()) {
			//그 담겨있는 UserDTO 리턴
			return iter.next();
		}
		//한개도 없다면 null 리턴
		return null;
	}
	
	public String findId(String username,String userphone) {
		//넘겨받은 이름과 핸드폰 번호를 conn의 select 메소드를 통해 UserDB.txt 파일에서 찾는다
		//이름 : 2번방, 넘겨받은 이름 : username
		//select메소드는 리턴타입이 HashSet<UserDTO> 타입이다.
		//HashSet은 순서가 없기 때문에 안에 들어있는 UserDTO 객체들에 바로 접근할 수가 없다.
		//따라서 iterator() 메소드를 사용하여 Iterator 타입으로 변환해준다.
		Iterator<UserDTO> iter = conn.selectUser(2, username).iterator();
		//결과가 두개 이상일수 있으므로, if문이 아닌 while문을 돌면서 모든 결과들을 다 비교해준다.
		while(iter.hasNext()) {
//			안에있는 UserDTO 객체 하나 받아오기(user)
			UserDTO user = iter.next();
			//받아온 user의 핸드폰 번호와, 입력받은 핸드폰 번호가 같다면 그 대상이
			//찾아야 하는 아이디이다.
			if(user.userphone.equals(userphone)) {
//				그 user의 아이디 리턴
				return user.userid;
			}
		}
		//이곳까지 왔다면 while문을 다 돌고도 통과했다는 뜻이므로, 찾는 아이디가 없거나
		//잘못 입력한 상태이다. 따라서 null을 리턴해준다.
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
			//수정해야할 줄의 위치를 알아야 하기 때문에 현재 로그인 되어 있는
			//session 객체를 같이 넘겨주어서 updateUser 메소드 내부에서
			//넘어온 객체의 id와 DB의 0번방들을 비교한다.
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