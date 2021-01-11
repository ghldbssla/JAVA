package army;

public class Sergeant extends ArmyAdapter {
	// 사용할 메소드만 재정의함
	@Override
	public void eat() {
		System.out.println("px로 달려간다.");
	}
	@Override
	public void sleep() {
		System.out.println("하루종일 잔다.");
	}
}

//public class Sergeant implements soldier{
////메소드를 전부다 재정의해야함
//@Override
//public void eat() {
//	System.out.println("px로 달려간다.");
//}
//@Override
//public void sleep() {
//	System.out.println("하루종일 잔다.");
//}
//@Override
//public void work() {;}
//@Override
//public void hello() {;}
//}