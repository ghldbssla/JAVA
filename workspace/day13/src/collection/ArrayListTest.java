package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		//ArrayList ��ü ����
		ArrayList<Integer> arNum = new ArrayList<>();
		
		//ArrayList �� �߰��ϱ�
		arNum.add(10);
		arNum.add(20);
		arNum.add(30);
		arNum.add(40);
		arNum.add(50);
		
		//ArrayList ����
//		System.out.println("���� : "+arNum.size());

		//ArrayList �� ��������
//		System.out.println("0 : "+arNum.get(0));
		
		//ArrayList ��ü ���
//		System.out.println(arNum);
		
		//ArrayList �� �����ϱ�
//		arNum.remove(new Integer(30));
		//remove��� �޼ҵ�� �׳� �������� �ѱ� ��� index ��ȣ�� �ν��Ѵ�.
		//���� 30�̶�� ���� ����� �ʹٸ�, �߰��Ҷ� Boxing �� ä �߰��Ǳ� ������
		//remove�� �Ѱ��ִ� �Ű����� Boxing�� ���־�� �Ѵ�.
//		System.out.println(arNum);
		
		//ArrayList �� ���� ���� ����
//		System.out.println(arNum.contains(30));
		
		//ArrayList ���� index ����
//		System.out.println(arNum.indexOf(30));
		
		//ArrayList ���� ����
		Collections.shuffle(arNum);
//		System.out.println(arNum);
		
		//ArrayList ����
		Collections.sort(arNum);
//		System.out.println(arNum);
		
		//ArrayList ������
		Collections.reverse(arNum);
		System.out.println(arNum);
	}
}






