package mark;

public class CGV {
	public static void main(String[] args) {
		Animation[] arAni = {new Zzangu(),new Frozen()};
		Movie[] arMovie = { new Frozen(), new Zzangu(), new Avengers(), new Parasite()};
		for (int i = 0; i < arMovie.length; i++) {
			if(arMovie[i] instanceof Animation) {
				//��ü ��½� �ڵ������� ��ü.toString()�� ȣ��Ǹ� �� ���ڿ��� ��µȴ�.
				System.out.println(arMovie[i]+"��(��) �ִϸ��̼� �Դϴ�.");
			}else {
				System.out.println(arMovie[i]+"��(��) �ִϸ��̼��� �ƴմϴ�.");
			}
		}
		System.out.println(arMovie[0]);
		System.out.println(arAni[1]);
		System.out.println(arMovie[0].name);
		System.out.println(arMovie[0].toString());
	}//arMovie[i]�� �ּҰ��� ������ arMovie[i].toString()�� ���� ����.
	//ObjectŬ������ toString()�� �������Ͽ� ���ϰ��� �ٲٸ� �׳� arMovie[i]�� ��� �����ϴ�.
}
