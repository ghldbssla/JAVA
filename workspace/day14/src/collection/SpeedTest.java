package collection;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.IntStream;

public class SpeedTest {
	public static void main(String[] args) {

		final int SIZE = 10_000_000;
		final int data = 900_000;
		//크기 설정
		final ArrayList<Integer> arrayList = new ArrayList<>(SIZE);
		final HashSet<Integer> hashSet = new HashSet<>(SIZE);

		// 순차 병렬 집계 연산
		IntStream.range(0, SIZE).forEach(value -> {
			arrayList.add(value);
			hashSet.add(value);
		});
		//0~10_000_000까지 순차적으로 집어넣음.
		
	//시간 시작
	Instant start = Instant.now();
	//data를 찾음.
	arrayList.contains(data);
		//시간 끝
	Instant end = Instant.now();
			//시작과 끝 사이에 걸린 시간
	long time=Duration.between(start, end).toMillis();
	//출력
	System.out.println("ArrayList 걸린시간 : "+time+"밀리 초");

	start = Instant.now();
	hashSet.contains(data);
	end = Instant.now();
	time=Duration.between(start, end).toMillis();
	System.out.println("HashSet 걸린시간 : "+time+"밀리 초");
	}
}
