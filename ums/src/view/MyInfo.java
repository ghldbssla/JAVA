package view;

import java.util.ArrayList;
import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dao.UserDAO;

public class MyInfo {
	public MyInfo() {
		UserDAO udao = new UserDAO();
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 정보\n1. 비밀번호\n2. 주소\n3. 회원탈퇴");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			//비밀번호 수정
			System.out.print("새로운 정보 : ");
			String newData = sc.next();
			udao.modify(0,udao.encrypt(newData));
			break;
		case 2:
			//주소 수정
			sc = new Scanner(System.in);
			System.out.print("새로운 정보 : ");
			newData = sc.nextLine();
			udao.modify(1,newData);
			break;
		case 3:
			//회원탈퇴
			System.out.print("비밀번호 재 입력 : ");
			String userpw = sc.next();
			if(udao.leaveId(userpw)) {
				System.out.println("이용해 주셔서 감사합니다.");
				ArrayList<String> arNum = pdao.getAllProd();
				for(String prodnum : arNum) {
					pdao.deleteProduct(prodnum);
				}
				Session.put("session_id", null);
			}else {
				System.out.println("비밀번호가 잘못되었습니다. 다시 시도해 주세요.");
			}
		}
	}
}






