package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		// HashSet�� �� �߰��ϱ�
//		set.add(10);
//		set.add(10);
//		set.add(10);
//		set.add(10);
// 		�ߺ��� ������� �����Ƿ� �Ѱ��� �νĵ�.
		// ���찳 : ����
		// ���찳 : ���찳
		// ���ټ� : ���찳
		// ���찳�� �˻��ϸ� 4���� �������� �ߺ��� �����ش�.
		// ���� �����ͺ��̽����� �˻��Ҷ� ����.
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		//HashSetũ��
		System.out.println(set.size());
		
		//HashSet���� ����?
		System.out.println(set.isEmpty());
		
		//HashSet�� �����
		set.remove(30);
		
		//HashSet �� ���Կ���
		System.out.println(set.contains(30));
		
		// ������ ���� ������ ���� �ִ��� �������� ���θ� Ȯ���ϴ� �뵵�� ���
		System.out.println(set);
		
		// HashSet�� ������ �ο����ִ� iterator()
		// ���Ϲ��� iterator�� IteratorŸ���� ��ü�� ��Ƴ���,
		// �װ��� �̿��� ���� �����Ѵ�.
		Iterator<Integer> iter = set.iterator();
		//is, has : boolean
		//�������� ������ true.(ó������ �ƹ��͵� ���� ������ ���.)
		while(iter.hasNext()) {
			//���� �� ������ ��
			//�� ���� ��������.
			System.out.println(iter.next());
			//iterator�� ���������� �� iterator�� ������ ����. �ٽ� ������
			//�ٽ� iter = set.iterator();�۾��� ���־�� �Ѵ�.
		}
	
		//iterator�� .next()�޼ҵ�� �ѹ� ���� ���� �ٽ� �� �����ͷ� 
		//������ ���� ����. ���� iterator()�޼ҵ�� ���ο� ��ü�� �ٽ� ����� �־�� �Ѵ�.
		iter = set.iterator();
		while(iter.hasNext()) {
			int data = iter.next();
			if(data==20) {
				System.out.println("20 ����");
			}
		}
		
		//�����ϸ� ������ ��ƶ�!
		ArrayList<Integer> ar = new ArrayList<Integer>(5);
		int size=ar.size();
		
		//�� ����
		int[] arData = new int[5];
		int length=arData.length;
		for (int i = 0; i < length; i++) {
			
		}
		
		
		
		
		
	}
}
