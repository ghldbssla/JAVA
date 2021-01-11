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
		//ũ�� ����
		final ArrayList<Integer> arrayList = new ArrayList<>(SIZE);
		final HashSet<Integer> hashSet = new HashSet<>(SIZE);

		// ���� ���� ���� ����
		IntStream.range(0, SIZE).forEach(value -> {
			arrayList.add(value);
			hashSet.add(value);
		});
		//0~10_000_000���� ���������� �������.
		
	//�ð� ����
	Instant start = Instant.now();
	//data�� ã��.
	arrayList.contains(data);
		//�ð� ��
	Instant end = Instant.now();
			//���۰� �� ���̿� �ɸ� �ð�
	long time=Duration.between(start, end).toMillis();
	//���
	System.out.println("ArrayList �ɸ��ð� : "+time+"�и� ��");

	start = Instant.now();
	hashSet.contains(data);
	end = Instant.now();
	time=Duration.between(start, end).toMillis();
	System.out.println("HashSet �ɸ��ð� : "+time+"�и� ��");
	}
}
