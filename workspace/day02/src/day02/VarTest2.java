package day02;

public class VarTest2 {
	public static void main(String[] args) {
		//이름 : 정회윤
		//나이 : 24살
		//키 : 179.55cm
		//몸무게 : 71.2kg
		//애완동뭄 이름 : 뽀삐
		String name="정회윤";
		int age = 24;
		double height = 179.55;
		float weight = 71.2F;
		//**float(4바이트)를 쓰기위해 기본형인 double(8바이트)를 F를 붙여 4바이트로 바꿔준다. 
		String petName = "뽀삐";
		//syso + Ctrl + spaceBar - System.out.println(); 자동완성
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"살");
		System.out.println("키 : "+height+"cm");
		System.out.printf("몸무게 : %.3fkg\n",weight);
		//실수의 오류때문에 서식문자 %.3f라고 소숫점 둘째자리까지로 맞춰줌
		System.out.printf("애완동물 이름 : %s\n",petName);
	}
}
