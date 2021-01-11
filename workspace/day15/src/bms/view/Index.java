package bms.view;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요 JDS bms 프로그램 입니다.");
		while(true) {
			
			System.out.println("1. 은행선택\n2. 나가기");
			int choice=sc.nextInt();

			//컨트롤러 역할
			//Index class는 View단인데 컨트롤러가 그 안에 있으므로 MVC 1모델
			if(choice==1) {
				//은행선택을 눌렀으므로 새로운 View단을 열어주어야 하고
				//BankChoiceView 생성자 호출시 열리게 구현해 놓는다.
				new BankChoiceView();
			}else if(choice==2) {
				System.out.println("안녕히가세요");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}		
}
