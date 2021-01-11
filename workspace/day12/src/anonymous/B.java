package anonymous;

public class B {
	public static void main(String[] args) {
		C c = new C();
		c.method(new A() {
			@Override
			public void function() {
				System.out.println("재정의된 function()");
			}
		});
	}
}
class C{
	void method(A a) {
		a.function();
	}
}