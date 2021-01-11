package multi_interitance;

public interface A {
	//default 키워드를 붙이면 인터페이스 내부에서 일반메소드 선언이 가능해진다.
	default void intro() {
		System.out.println("A인터페이스 : 디폴트 메소드");
	}
}
