package mark;

public class Avengers extends Movie{

	public Avengers() {
		super();
		this.name = "�����";
	}
	//toString() : Object Ŭ������ �����ϴ� �޼ҵ��̸�
	//��ü ��ü�� ����Ҷ� ������ �ּҰ����� ������� ���ڿ��� return�Ѵ�.
	//���� Object �� ��� Ŭ������ �θ�Ŭ���� �̹Ƿ� �ٸ� Ŭ��������
	//toString�� ���ϴ� ���ڿ��� ������ �Ͽ� ����� �� �ִ�.
	//�� �����ǵ� Ŭ������ ��ü�� ����� �� �ּҰ����� ������� ���ڿ� ���
	//�츮�� �������� �� return������ ����� �ȴ�.
	@Override
	public String toString() {
		return "�����";
	}
}
