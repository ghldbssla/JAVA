package army;

public class Private implements soldier{

	@Override
	public void eat() {
		System.out.println("�㸮�� 90���� ��� �������� �ɾ� �Ļ縦 �Ѵ�.");
	}

	@Override
	public void work() {
		System.out.println("�׻� �پ�ٴ����� ������� ����. ���� ��� ��������.");
	}

	@Override
	public void sleep() {
		System.out.println("�ڴٰ� �� ��� ��������. ���� ���� ��ģ��.");
	}

	@Override
	public void hello() {
		System.out.println("��!!!!!!!!!!!!!!!!!!!��!!!!!!!!!!!!!!!!!!!");
	}

}
