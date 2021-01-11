package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList<Integer> arNum = new ArrayList<>();
		
		//ArrayList 값 추가하기
		arNum.add(10);
		arNum.add(20);
		arNum.add(30);
		arNum.add(40);
		arNum.add(50);
		
		//ArrayList 길이
//		System.out.println("길이 : "+arNum.size());

		//ArrayList 값 가져오기
//		System.out.println("0 : "+arNum.get(0));
		
		//ArrayList 전체 출력
//		System.out.println(arNum);
		
		//ArrayList 값 삭제하기
//		arNum.remove(new Integer(30));
		//remove라는 메소드는 그냥 정수값을 넘길 경우 index 번호로 인식한다.
		//따라서 30이라는 값을 지우고 싶다면, 추가할때 Boxing 된 채 추가되기 때문에
		//remove에 넘겨주는 매개값도 Boxing을 해주어야 한다.
//		System.out.println(arNum);
		
		//ArrayList 값 존재 여부 묻기
//		System.out.println(arNum.contains(30));
		
		//ArrayList 값의 index 추출
//		System.out.println(arNum.indexOf(30));
		
		//ArrayList 순서 섞기
		Collections.shuffle(arNum);
//		System.out.println(arNum);
		
		//ArrayList 정렬
		Collections.sort(arNum);
//		System.out.println(arNum);
		
		//ArrayList 뒤집기
		Collections.reverse(arNum);
		System.out.println(arNum);
	}
}






