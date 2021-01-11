package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();

		// HashMap�� �߰��ϱ�
		hm.put("��", 1);
		hm.put("��", 10);// HashMap�� ������ Key���� ���ο� Value ��
						// put()�� ����ϰ� �Ǹ� ���� ������ �Ͼ��.

		hm.put("�ϳ�", 1);// Value�� �ߺ��� ����.
		hm.put("��", 2);
		hm.put("��", 3);
		hm.put("��", 4);
		hm.put("��", 5);

		System.out.println(hm);

//		hm.get(key)
		// HashMap���� �� ��������
		// Map������ Key������ Value�� ã�ƿ��� ������ �Ű������� Key���� �Ѱ��ָ� �ȴ�.
		System.out.println(hm.get("��"));

		// HashMap�� ũ��
		System.out.println(hm.size());

		// HashMap���� �� �����
//		hm.remove(key) 			: �ѽ��� ����鼭 ���� return���ش�.(�Ҹ�)
//		hm.remove(key, value) 	: �ѽ��� ����鼭 �� ���������� return ���ش�.

		Set<String> keyset = hm.keySet();// Key���鸸 ����ִ� Set �����

		// 1. KeySet���� �� �������� ���(iterator ���)

		// 2. KeySet���� �� �������� ���(���� for�� ���)
//		for(String key : keyset) {
//			System.out.println(hm.get(key));
//		}
//		
		// Values�� EntrySet�� �����ϰ� �ΰ��� ������� ������ ������ �� �ִ�.

		Collection<Integer> values = hm.values();// Value����� Collection �����
//		for(int data : values) {
//			System.out.println(data);
//		}

		// Entry -> util.map
		// Set �ȿ� Entry�� ����ְ�, �� Entry�� Key�� Value�� �������� ������� �ִ�.

		Set<Entry<String, Integer>> entrySet = hm.entrySet();

		// EntrySet�ȿ��� EntryŸ���� ����ֱ� ������ ������ ��� Ÿ����
		// Entry<keyŸ��, ValueŸ��>���� ������ �־�� �Ѵ�.
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			hm.get(iter.next());
		}
//		for(Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry.getKey()+"="+entry.getValue());
//		}

		System.out.println(entrySet);
	}
}
