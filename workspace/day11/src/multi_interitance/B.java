package multi_interitance;

public interface B {
	default void intro() {
		System.out.println("B인터페이스 : 디폴트 메소드");
	}
}
