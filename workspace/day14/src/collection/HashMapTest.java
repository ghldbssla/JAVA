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

		// HashMap에 추가하기
		hm.put("일", 1);
		hm.put("일", 10);// HashMap은 동일한 Key값에 새로운 Value 로
						// put()을 사용하게 되면 값의 수정이 일어난다.

		hm.put("하나", 1);// Value는 중복이 가능.
		hm.put("이", 2);
		hm.put("삼", 3);
		hm.put("사", 4);
		hm.put("오", 5);

		System.out.println(hm);

//		hm.get(key)
		// HashMap에서 값 가져오기
		// Map구조는 Key값으로 Value를 찾아오기 때문에 매개변수에 Key값을 넘겨주면 된다.
		System.out.println(hm.get("일"));

		// HashMap의 크기
		System.out.println(hm.size());

		// HashMap에서 값 지우기
//		hm.remove(key) 			: 한쌍을 지우면서 값을 return해준다.(소모)
//		hm.remove(key, value) 	: 한쌍을 지우면서 잘 지워졌나를 return 해준다.

		Set<String> keyset = hm.keySet();// Key값들만 담겨있는 Set 만들기

		// 1. KeySet에서 값 가져오는 방법(iterator 사용)

		// 2. KeySet에서 값 가져오는 방법(빠른 for문 사용)
//		for(String key : keyset) {
//			System.out.println(hm.get(key));
//		}
//		
		// Values나 EntrySet도 동일하게 두가지 방법으로 값들을 가져올 수 있다.

		Collection<Integer> values = hm.values();// Value값들로 Collection 만들기
//		for(int data : values) {
//			System.out.println(data);
//		}

		// Entry -> util.map
		// Set 안에 Entry가 담겨있고, 그 Entry는 Key와 Value의 조합으로 만들어져 있다.

		Set<Entry<String, Integer>> entrySet = hm.entrySet();

		// EntrySet안에는 Entry타입이 담겨있기 때문에 접근할 요소 타입을
		// Entry<key타입, Value타입>으로 설정해 주어야 한다.
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
