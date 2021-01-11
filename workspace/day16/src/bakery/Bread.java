package bakery;

public class Bread {
	int breadCnt;
	int eatCnt;
	synchronized void makeBread() {
		if(breadCnt>9) {
			System.out.println("빵이 가득 찼습니다.");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		breadCnt++;
		System.out.println("빵을 1개 만들었습니다. 총"+breadCnt+"개");
	}
	synchronized void eatBread() {
		if(eatCnt==20) {
			System.out.println("빵이 다 떨어졌습니다.");
			
		}else if(breadCnt<1) {
			System.out.println("빵을 만드는 중입니다. 기다려 주세요.");
		}else {
			breadCnt--;
			eatCnt++;
			System.out.println("빵을 한개 먹었습니다. 총 "+breadCnt+"개");
			
		}
		notify();
	}
}
