package generic;

public class GMethodTest {
	public static <T> void function(T data) {
		T result;
		if(data instanceof Integer) {
			System.out.println("����");
		}else if(data instanceof Float || data instanceof Double) {
			System.out.println("�Ǽ�");
		}else if(data instanceof String) {
			System.out.println("���ڿ�");
		}else if(data instanceof Character) {
			System.out.println("����");
		}else {
			System.out.println("null");
		}
	}
}
