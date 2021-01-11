package zoo;

public class Zoo {
	//동물 세종류
	//포유류만 세번 울기
	//마크 인터페이스 사용
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
	