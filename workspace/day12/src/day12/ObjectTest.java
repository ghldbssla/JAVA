package day12;

public class ObjectTest {
	public static void main(String[] args) {
//		Object[] arobj = {10,'a',"hello",10.57,true};
//		String msg1 = new String("hello");
//		String msg2 = new String("hello");
//		//==�� �ּҰ� ��
//		System.out.println(msg1==msg2);
		Test obj1 = new Test();
		obj1.num=1;
		Test obj2 = new Test();
		obj2.num=1;
		System.out.println(obj1.hashCode()==obj2.hashCode());
	}
}
class Test{
	int num;
	@Override
	//num�� objectŸ������ ��ĳ���� ��
	public boolean equals(Object obj) {
		//obj �� TestŸ���̸�
		if(obj instanceof Test) {
			//�ٿ�ĳ����
			Test t = (Test)obj;
			//num������ ��
			return this.num==t.num;
		}
		return false;
//		return super.equals(obj);
	}
//"".equals(anObject)�� equals�� ���� String���� �����ǰ� �Ǿ� �ִ�.

	
	@Override
	public int hashCode() {
		return num;
//		return super.equals(obj);
	}
}
