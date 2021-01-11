package nike;

public class Continue {
	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
////break의 위치에 따라서 수행하는 코드가 달라질 수 있다.
////			if(i==4) {break;}	(1~3출력)
//			System.out.println(i);
////			if(i==4) {break;}	(1~4출력)
//
//		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 4) {
				// continue;
				// 다음 반복으로(현재 반복되는 코드의 가장 마지막으로 이동)
				//continue는 아래에 건너뛸만한 의미있는 문장이 있을 때 사용
				continue;
			}
		}
	}
}
