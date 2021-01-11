package day07;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		System.out.println(m.change_atoA("abcd1234"));
		System.out.println("abcd1234".toUpperCase());
		//StorageTest.s_data=10000000;
	}

//모든 출력은 println으로 통일
	// 1~10까지 출력하는 메소드
	void print1to10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// 1~10까지의 합 구해주는 메소드
	int sum1toTen() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	// 1~n까지의 합 출력하는 메소드
	void sum1toN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	// 두 정수의 나눗셈 결과를 구해주는 메소드
	double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	//몫과 나머지를 구하는 메소드
	int[] div2(int num1, int num2) {
		int[] arData = new int[2];
		arData[0]=(num1/num2);
		arData[1]=(num1%num2);
		
		return arData;
		//return뒤에 값은 무조건 하나만 와야하기 때문에 배열을 return해줌
	} 
	

	// 소문자를 대문자로 바꿔주는 메소드
		//"문자열".ToUpperCase();
	String change_atoA(String msg) {
		//a : 97
		//A : 65
		String result="";
		for (int i = 0; i < msg.length(); i++) {
			char ch=msg.charAt(i);
			if(ch>='a' && ch<='z') {
				result+=(char)(ch-32);
			}else {
				result+=ch;
			}
		}
		return result;
	}

	// 문자열 거꾸로 출력하는 메소드
	void reverse(String msg) {
		String result = "";
		for (int i = msg.length() - 1; i >= 0; i--) {
			result += msg.charAt(i);
		}
		System.out.println(result);
	}

	// 정수를 한글로 변경하는 메소드
	void changeToHangle(int num) {
		String reverseNum="";
		String result="";
			for (int j = num; j > 0;j/=10) {
				reverseNum+=korean(j%10);
				
			}
			for (int i = reverseNum.length()-1; i>=0 ; i--) {
				result+=reverseNum.charAt(i);
			}
			System.out.println(result);
	}
	
	String korean(int num) {
		
		switch (num) {
		case 0:
			return"공";
		case 1:
			return"일";
		case 2:
			return"이";
		case 3:
			return"삼";
		case 4:
			return"사";
		case 5:
			return"오";
		case 6:
			return"육";
		case 7:
			return"칠";
		case 8:
			return"팔";
		case 9:
			return"구";
		default:
			return null;
		}
	}
	void changeToHangle1(int num) {
		//1024%10 == 4	 1024/10 ==102
		//102%10 == 2	 102/10 ==10
		//10%10 == 0	 10/10 ==1
		//1%10 == 1		 1/10 ==0
		String hangle="공일이삼사오육칠팔구";
		String result="";
		while(num!=0) {
			result+=hangle.charAt(num%10);
			//사이공일
			num/=10;
		}
		reverse(result);//재사용의 목적 -- 일공이사
		//위에서 만들어 놓은 reverse라는 메소드를 사용함으로써
		//거꾸로 뒤집어서 출력하는 부분 구현을 생략할 수 있다.
		//main에서는 MethodTask m = new MethodTask();를
		//쓰고 다른 메소드를 사용하지만 다른 메소드에서는 선언을 하지 않고
		//사용하는 이유는 main메소드의 앞에있는public static때문
	}
}
