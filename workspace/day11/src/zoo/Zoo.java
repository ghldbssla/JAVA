package zoo;

public class Zoo {
	//���� ������
	//�������� ���� ���
	//��ũ �������̽� ���
	public static void main(String[] args) {
		Animal[] arAni= {new Tiger(), new Frog(), new Rabbit()};
		for (int i = 0; i < arAni.length; i++) {
			if(arAni[i] instanceof Mammalia) {
				Mammalia m = (Mammalia)arAni[i];
				m.makeSomeNoise();
			}
		}
	}
}
	