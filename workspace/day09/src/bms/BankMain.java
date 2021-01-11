package bms;

import java.util.Random;
import javax.swing.JOptionPane;

public class BankMain {
	static Bank[][] arUser = new Bank[3][100];

	public static void main(String[] args) {
		//session : 로그인시 이용될 현재 로그인된 유저 담을 변수
		Bank session = null;
		//랜덤한 계좌번호 생성을 위한 객체
		Random r = new Random();
		//행동선택 메뉴를 위한 배열
		String[] arBankMenu = { "국민은행", "우리은행", "신한은행", "나가기" };
		String[] arDoMenu = { "계좌개설", "로그인" ,"뒤로가기"};
		String[] arLoginMenu = { "입금하기", "출금하기", "계좌조회", "로그아웃" };
		//각 은행별 회원수를 담을 배열
		//bankChoice : 내가 현재 선택한 은행 번호를 담을 변수 (국민은행 =0 우리은행 =1 신한은행 =2)
		int[] arcnt = { 0, 0, 0 };
		String helloMsg = "===안녕하세요 BMS 프로그램 입니다.===";
		String title = "BMS";
		int doChoice = 0;
		int loginChoice = 0;
		JOptionPane.showMessageDialog(null, helloMsg);
		while (true) {
//			JOptionPane.showOptionDialog(): 배열을 넘겨주면 그대로 버튼을 생성해 준다.첫번째버튼 0번
			//닫기버튼(x)누를 시 -1 return
			int bankChoice = JOptionPane.showOptionDialog(null, "은행을 선택하세요", title, JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, arBankMenu, arBankMenu[0]);
			//나가기버튼 3, 닫기-1을 선택시 break로 while문 탈출
			if (bankChoice == 3 || loginChoice == JOptionPane.CLOSED_OPTION) {
				break;
			}
			//그외 선택은 은행선택이므로 bankChoice에 은행 번호가 담겨있을 것이고, 그대로 아래 while문으로 들어간다.
			while (true) {
				doChoice = JOptionPane.showOptionDialog(null, arBankMenu[bankChoice], title, JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, arDoMenu, arDoMenu[0]);
				if (doChoice == 0) {
					// 계좌개설
					String name = JOptionPane.showInputDialog("이름을 입력하세요");
					String pw = JOptionPane.showInputDialog("비밀번호를 입력하세요");
					String account = "";
					//acount에 초기 계좌 번호 하나 미리 넣어놓기
					account = r.nextInt(90000) + 10000 + "";
					//아래에 구현한 duplicate() 메소드를 통해 중복시 true를 리턴받고
					//false가 나올때 까지 반복하여 난수를 발생하여 중복되지 않는 게좌 번호가 나올때 까지 반복한다.
					while (duplicate(account)) {
						account = r.nextInt(90000) + 10000 + "";
					}
					//이부분까지 왔다면 account는 중복되지 않는 계좌번호가 됨
					//arMake는 각은행에 맞는 객체를 생성해주기위한 배열
					Bank[] arMake = { new Kookmin(account, pw, name), new Woori(account, pw, name),
							new Shinhan(account, pw, name) };
					//arUser는 Bank타입의 2차원 배열이지만 , 자식 객체들이 업캐스팅 된채로 들어갈 수 없다.
					//arUser의행 : 각은행의 user들이 담길 1차원 배열
					//arUser의열 : arCnt을 참조하여 각은행의 회원수를 확인하고, 현재 회원수 열에 새로만든 객체를 넣는다.
					arUser[bankChoice][arcnt[bankChoice]] = arMake[bankChoice];
					JOptionPane.showMessageDialog(null, name+"님 \n계좌번호 : "+account);
					//해당하는 은행ㅇ의 arCnt는 하나증가
					arcnt[bankChoice]++;
				} else if (doChoice==1) {
					// 로그인
					String account = JOptionPane.showInputDialog("계좌번호 입력");
					String pw = JOptionPane.showInputDialog("비밀번호 입력");
					//arUser의 bankChoice 행은 현재 내가 선택한 은행에 해당하는 행
					//user로 그안에 객체 하나씩 가져오기
					for (Bank user : arUser[bankChoice]) {
						if (user != null) {
							//그 가져온 user가 null이 아니라면
							if (user.account.equals(account)) {
								if (user.pw.equals(pw)) {
									// 로그인 성공시 오는 구간 : session에 로그인 성공한 그 user객체를 넣어준다.
									session = user;
									break;
								}
							}
						}
					}
					//위에서 session에 user객체를 넣었음에도 불구하고 null로 남아있다면 if문에 들어가지 못했다는 소리로
					//로그인 실패라는 뜻이다.
					if (session == null) {
						// 로그인 실패
						JOptionPane.showMessageDialog(null, "로그인 실패입니다.");
					} else {
						// 로그인 성공
						while (true) {
							//로그인시 띄워줄 메뉴
							loginChoice = JOptionPane.showOptionDialog(null, arBankMenu[bankChoice], title,
									JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, arLoginMenu,
									arLoginMenu[0]);
							//로그인 성공한 객체는 session에 업캐스팅 된 채로 담겨있으므로 아래에서는 session을 사용한다.
							// 입금하기
							if (loginChoice == 0) {
								session.deposit(Integer.parseInt(JOptionPane.showInputDialog("입력하실 금액을 입력하세요")));

								// 출금하기
							} else if (loginChoice == 1) {
								session.withdraw(Integer.parseInt(JOptionPane.showInputDialog("출금하실 금액을 입력하세요")));

								// 잔액조회
							} else if (loginChoice == 2) {
								session.show();

								// 로그아웃
							} else if (loginChoice == 3) {
								session = null;
								break;
							} else if (loginChoice == JOptionPane.CLOSED_OPTION) {
								session = null;
								return;
							}
						}
					}
				} else if (doChoice == -1) {
					return;
				}else if(doChoice==2) {
					break;
				}
			}
		}
	}

	// 계좌 중복 검사 메소드
	static boolean duplicate(String account) {
		for (Bank[] bank : arUser) {
			//전체 arUser 배열에서 한행씩 가져오기 (bank가 가져옴)
			for (Bank user : bank) {
				//그 가져온 행에서 Bank타입의 객체 하나씩 가져오가 (User가 가져옴)
				if (user != null) {
					//user가 null이 아닐때만 객체가 있다는 뜻이므로 그때만 계좌번호 비교
					if (user.account.equals(account)) {
						//true
						return true;
					}
				}
			}
		}
		return false;
		//그외에는 모두 false
	}
}
