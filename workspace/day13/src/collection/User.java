package collection;

public class User {
	//시퀀스 : 하나씩 증가하는 값
//	public static int seq=0;
	private int userNum;
	private String userid;
	private String userpw;
	private String username;

	public User() {
	}
	
	public User(int userNum, String userid, String userpw, String username) {
//		this.userNum = ++seq;
		this.userNum = userNum;
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
	}

	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	//김사과(apple)
	@Override
	public String toString() {
		return this.username+"("+this.userid+")";
	}
	
	@Override
	public int hashCode() {
		return userNum;
	}
	
//	user.equals(new User());
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			
			User newObj = (User)obj;
			return newObj.userNum==this.userNum;
		}
		return false;
	}
}









