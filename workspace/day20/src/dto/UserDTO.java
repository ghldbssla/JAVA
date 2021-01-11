package dto;

public class UserDTO {
	public String userid;
	public String userpw;
	public String username;
	public String userphone;
	public String useraddr;
	public UserDTO() {
	}
	public UserDTO(String userid, String userpw, String username, String userphone, String useraddr) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.userphone = userphone;
		this.useraddr = useraddr;
	}
	@Override
	public String toString() {
		return userid+";"+userpw+";"+username+";"+userphone+";"+useraddr;
	}
}







