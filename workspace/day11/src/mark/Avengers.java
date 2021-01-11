package mark;

public class Avengers extends Movie{

	public Avengers() {
		super();
		this.name = "어벤져스";
	}
	//toString() : Object 클래스에 존재하는 메소드이며
	//객체 자체를 출력할때 나오는 주소값으로 만들어진 문자열을 return한다.
	//따라서 Object 는 모든 클래스의 부모클래스 이므로 다른 클래스에서
	//toString을 원하는 문자열로 재정의 하여 사용할 수 있다.
	//그 재정의된 클래스는 객체를 출력할 시 주소값으로 만들어진 문자열 대신
	//우리가 재정의한 그 return값으로 출력이 된다.
	@Override
	public String toString() {
		return "어벤져스";
	}
}
