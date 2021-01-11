package day12;

public class ObjectTest {
	public static void main(String[] args) {
//		Object[] arobj = {10,'a',"hello",10.57,true};
//		String msg1 = new String("hello");
//		String msg2 = new String("hello");
//		//==는 주소값 비교
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
	//num이 object타입으로 업캐스팅 됨
	public boolean equals(Object obj) {
		//obj 가 Test타입이면
		if(obj instanceof Test) {
			//다운캐스팅
			Test t = (Test)obj;
			//num값으로 비교
			return this.num==t.num;
		}
		return false;
//		return super.equals(obj);
	}
//"".equals(anObject)의 equals에 들어가면 String으로 재정의가 되어 있다.

	
	@Override
	public int hashCode() {
		return num;
//		return super.equals(obj);
	}
}
