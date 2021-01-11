package army;

public class Private implements soldier{

	@Override
	public void eat() {
		System.out.println("허리를 90도로 펴고 직각으로 앉아 식사를 한다.");
	}

	@Override
	public void work() {
		System.out.println("항상 뛰어다니지만 결과물이 없다. 가끔 어디 끌려간다.");
	}

	@Override
	public void sleep() {
		System.out.println("자다가 또 어디 끌려간다. 자주 잠을 설친다.");
	}

	@Override
	public void hello() {
		System.out.println("충!!!!!!!!!!!!!!!!!!!성!!!!!!!!!!!!!!!!!!!");
	}

}
