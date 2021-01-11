package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		// HashSet에 값 추가하기
//		set.add(10);
//		set.add(10);
//		set.add(10);
//		set.add(10);
// 		중복을 허용하지 않으므로 한개만 인식됨.
		// 지우개 : 연필
		// 지우개 : 지우개
		// 정다솔 : 지우개
		// 지우개를 검색하면 4번이 나오지만 중복을 없애준다.
		// 따라서 데이터베이스에서 검색할때 쓰임.
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		//HashSet크기
		System.out.println(set.size());
		
		//HashSet값이 없니?
		System.out.println(set.isEmpty());
		
		//HashSet값 지우기
		set.remove(30);
		
		//HashSet 값 포함여부
		System.out.println(set.contains(30));
		
		// 순서가 없기 때문에 값이 있는지 없는지의 여부만 확인하는 용도로 사용
		System.out.println(set);
		
		// HashSet에 순서를 부여해주는 iterator()
		// 리턴받은 iterator를 Iterator타입의 객체에 담아놓고,
		// 그것을 이용해 값에 접근한다.
		Iterator<Integer> iter = set.iterator();
		//is, has : boolean
		//다음것이 있을때 true.(처음에는 아무것도 없는 곳에서 물어봄.)
		while(iter.hasNext()) {
			//다음 것 가지고 옴
			//전 것은 못가져옴.
			System.out.println(iter.next());
			//iterator로 끝까지가면 이 iterator는 역할이 끝남. 다시 쓰려면
			//다시 iter = set.iterator();작업을 해주어야 한다.
		}
	
		//iterator의 .next()메소드는 한번 쓰는 순간 다시 전 데이터로 
		//접근할 수가 없다. 따라서 iterator()메소드로 새로운 객체를 다시 만들어 주어야 한다.
		iter = set.iterator();
		while(iter.hasNext()) {
			int data = iter.next();
			if(data==20) {
				System.out.println("20 있음");
			}
		}
		
		//가능하면 변수에 담아라!
		ArrayList<Integer> ar = new ArrayList<Integer>(5);
		int size=ar.size();
		
		//더 빠름
		int[] arData = new int[5];
		int length=arData.length;
		for (int i = 0; i < length; i++) {
			
		}
		
		
		
		
		
	}
}
