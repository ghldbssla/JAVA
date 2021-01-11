package bms.dto;

public class Bank {
	public String account;
	public String pw;
	public String name;
	public String phone;
	public int balance;
	public Bank() {}
	public Bank(String account, String pw, String name, String phone) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
}
