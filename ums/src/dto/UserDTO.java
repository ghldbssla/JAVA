package dto;

public class UserDTO {
	//아이디	비밀번호	이름	나이	핸드폰번호	주소	추천수	거래수
	
	//alt shift a 후 / shift 누른채 방향키로 커서 늘리고 쓰기!
	private String userid;
	private String userpw;
	private String username;
	private int userage;
	private String userphone;
	private String useraddr;
	private int likeCnt;
	private int tradeCnt;
	
	//alt shift s > r : getter, setter 만들기
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

	public int getUserage() {
		return userage;
	}

	public void setUserage(int userage) {
		this.userage = userage;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUseraddr() {
		return useraddr;
	}

	public void setUseraddr(String useraddr) {
		this.useraddr = useraddr;
	}

	public int getLikeCnt() {
		return likeCnt;
	}

	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}

	public int getTradeCnt() {
		return tradeCnt;
	}

	public void setTradeCnt(int tradeCnt) {
		this.tradeCnt = tradeCnt;
	}

	public UserDTO() {;}

	public UserDTO(String[] datas) {
		this.userid = datas[0];
		this.userpw = datas[1];
		this.username = datas[2];
		this.userage = Integer.parseInt(datas[3]);
		this.userphone = datas[4];
		this.useraddr = datas[5];
		this.likeCnt=Integer.parseInt(datas[6]);
		this.tradeCnt=Integer.parseInt(datas[7]);
	}
	public UserDTO(String userid, String userpw, String username, int userage, String userphone, String useraddr,
			int likeCnt, int tradeCnt) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.userage = userage;
		this.userphone = userphone;
		this.useraddr = useraddr;
		this.likeCnt = likeCnt;
		this.tradeCnt = tradeCnt;
	}

	public UserDTO(String userid, String userpw, String username, int userage, String userphone, String useraddr) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.userage = userage;
		this.userphone = userphone;
		this.useraddr = useraddr;
		this.likeCnt=0;
		this.tradeCnt=0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof UserDTO) {
			UserDTO target = (UserDTO)obj;
			if(this.userid.equals(target.userid)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return userid+"\t"+userpw+"\t"+username+"\t"+userage+"\t"+userphone+"\t"
				+useraddr+"\t"+likeCnt+"\t"+tradeCnt;
	}
	
}
