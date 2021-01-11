package nike;

import java.util.Scanner;

public class Nike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String basket = "";
		String product1 = "흰티";
		String product2 = "나이키 써마 빅토리 하프집탑";
		int price1 = 20000;
		int price2 = 70000;
		int total = 0;
		//is,has 이름이 들어간 변수는 bollean타입일 가능성이 높다.
		boolean flag = false;
		while (true) {
			System.out.println("1. 쇼핑하기\n2. 마이페이지 \n3. 나가기");
			choice = sc.nextInt();
			if (choice == 3) {
				break;
			}
			switch (choice) {
			case 1:
				// 쇼핑하기
				while (true) {

					System.out.println("1. 남성용 상품\n2. 여성용 상품\n 3. 뒤로가기");
					// 변수의 재사용
					// 장점 : 메모리를 낭비하지 않아도 된다.
					// 단점 : 가독성이 떨어진다.
					choice = sc.nextInt();
					if (choice == 3) {
						break;
					} else if (choice == 1) {
						// 남성용 상품
						while (true) {
							System.out.println("1. 티셔츠\n2. 바지\n3. 신발\n4. 뒤로가기");
							choice = sc.nextInt();
							if (choice == 1) {
								// 티셔츠
								System.out.println("1. 흰티(20000)\n2. 나이키 써마 빅토리 하프집탑(70000)");
								choice = sc.nextInt();
								if (choice == 1) {
									basket += product1 + "\n";
									total += price1;
								} else if (choice == 2) {
									basket += product2 + "\n";
									total += price2;
								}
							} else if (choice == 2) {
								// 바지
							} else if (choice == 3) {
								// 신발
							} else if (choice == 4) {
								// 뒤로가기
								break;
							}
						}
					} else if (choice == 2) {
						// 여성용 상품
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				break;
				}
			case 2:
				// 마이페이지
				System.out.println("1.장바구니\n2.내 정보 수정\n3.뒤로가기");
				choice = sc.nextInt();
				if (choice == 1) {
					// 장바구니
					while (true) {
						System.out.println("1. 내 장바구니 목록\n2.결제하기\n3.뒤로가기");
						choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("===========매 상품 목록===========");
							System.out.println(basket);
							System.out.println("==============================");
						} else if (choice == 2) {
							if(total<=20000) {
								//결제 실패시 오는 구역
								//flag기법 : 구역 진입 여부를 확인 할때 자주 사용되는 기법
								//깃발을 들었는지 안들었는지 두경우로 나누어서 다른쪽에서 확인 하는 방법
								flag = true;
								break;
							}else {
								//결제 성공시 오는 구역
								System.out.println("총 금액 "+total+"원 입니다.");
								basket="";
								total=0;
							}
						}
					}
					if(flag) {
						System.out.println("결제는 20000원 초과시 가능합니다.\n메인메뉴로 돌아갑니다.");
						break;
					}
				} else if (choice == 2) {
					// 내 정보 수정
				} else if (choice == 3) {
					// 뒤로가기
					
					break;
				}
			}
		
		}
	}
}
