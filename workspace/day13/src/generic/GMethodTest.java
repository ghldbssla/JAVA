package generic;

public class GMethodTest {
	public static <T> void function(T data) {
		T result;
		if(data instanceof Integer) {
			System.out.println("정수");
		}else if(data instanceof Float || data instanceof Double) {
			System.out.println("실수");
		}else if(data instanceof String) {
			System.out.println("문자열");
		}else if(data instanceof Character) {
			System.out.println("문자");
		}else {
			System.out.println("null");
		}
	}
}
