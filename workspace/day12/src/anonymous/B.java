package anonymous;

public class B {
	public static void main(String[] args) {
		C c = new C();
		c.method(new A() {
			@Override
			public void function() {
				System.out.println("�����ǵ� function()");
			}
		});
	}
}
class C{
	void method(A a) {
		a.function();
	}
}