package army;

public class Sergeant extends ArmyAdapter {
	// ����� �޼ҵ常 ��������
	@Override
	public void eat() {
		System.out.println("px�� �޷�����.");
	}
	@Override
	public void sleep() {
		System.out.println("�Ϸ����� �ܴ�.");
	}
}

//public class Sergeant implements soldier{
////�޼ҵ带 ���δ� �������ؾ���
//@Override
//public void eat() {
//	System.out.println("px�� �޷�����.");
//}
//@Override
//public void sleep() {
//	System.out.println("�Ϸ����� �ܴ�.");
//}
//@Override
//public void work() {;}
//@Override
//public void hello() {;}
//}