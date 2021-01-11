package view;

import java.util.Scanner;

import dao.UserDAO;

public class MyInfo {
	public MyInfo() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.println("1. 비밀번호 수정\n2. 핸드폰 번호 수정\n3. 주소 수정\n4. 뒤로가기\n5. 회원탈퇴");
		int choice = sc.nextInt();
		String newData = "";
		switch (choice) {
		case 1:
			System.out.print("새로운 비밀번호 : ");
			newData=sc.next();
			break;
		case 2:
			System.out.print("새로운 핸드폰 번호 : ");
			newData=sc.next();
			break;
		case 3:
			sc=new Scanner(System.in);
			System.out.print("새로운 주소 : ");
			newData=sc.nextLine();
			break;
		case 4:
			break;
		case 5:
			//회원탈퇴
			System.out.print("비밀번호 재입력 : ");
			String userpw=sc.next();
			if(UserDAO.session.userpw.equals(userpw)) {
				udao.leaveId(UserDAO.session);
				System.out.println("회원탈퇴 성공!");
				UserDAO.session=null;
			}
		}
		if(choice!=4 && choice!=5) {
			udao.modify(choice,newData);
		}
	}
}








