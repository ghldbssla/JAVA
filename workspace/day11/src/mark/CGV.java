package mark;

public class CGV {
	public static void main(String[] args) {
		Animation[] arAni = {new Zzangu(),new Frozen()};
		Movie[] arMovie = { new Frozen(), new Zzangu(), new Avengers(), new Parasite()};
		for (int i = 0; i < arMovie.length; i++) {
			if(arMovie[i] instanceof Animation) {
				//객체 출력시 자동적으로 객체.toString()이 호출되며 그 문자열이 출력된다.
				System.out.println(arMovie[i]+"는(은) 애니메이션 입니다.");
			}else {
				System.out.println(arMovie[i]+"는(은) 애니메이션이 아닙니다.");
			}
		}
		System.out.println(arMovie[0]);
		System.out.println(arAni[1]);
		System.out.println(arMovie[0].name);
		System.out.println(arMovie[0].toString());
	}//arMovie[i]는 주소값을 가지며 arMovie[i].toString()과 값이 같다.
	//Object클래스의 toString()을 재정의하여 리턴값을 바꾸면 그냥 arMovie[i]로 사용 가능하다.
}
