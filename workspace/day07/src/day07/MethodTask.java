package day07;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		System.out.println(m.change_atoA("abcd1234"));
		System.out.println("abcd1234".toUpperCase());
		//StorageTest.s_data=10000000;
	}

//��� ����� println���� ����
	// 1~10���� ����ϴ� �޼ҵ�
	void print1to10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// 1~10������ �� �����ִ� �޼ҵ�
	int sum1toTen() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	// 1~n������ �� ����ϴ� �޼ҵ�
	void sum1toN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	// �� ������ ������ ����� �����ִ� �޼ҵ�
	double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	//��� �������� ���ϴ� �޼ҵ�
	int[] div2(int num1, int num2) {
		int[] arData = new int[2];
		arData[0]=(num1/num2);
		arData[1]=(num1%num2);
		
		return arData;
		//return�ڿ� ���� ������ �ϳ��� �;��ϱ� ������ �迭�� return����
	} 
	

	// �ҹ��ڸ� �빮�ڷ� �ٲ��ִ� �޼ҵ�
		//"���ڿ�".ToUpperCase();
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

	// ���ڿ� �Ųٷ� ����ϴ� �޼ҵ�
	void reverse(String msg) {
		String result = "";
		for (int i = msg.length() - 1; i >= 0; i--) {
			result += msg.charAt(i);
		}
		System.out.println(result);
	}

	// ������ �ѱ۷� �����ϴ� �޼ҵ�
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
			return"��";
		case 1:
			return"��";
		case 2:
			return"��";
		case 3:
			return"��";
		case 4:
			return"��";
		case 5:
			return"��";
		case 6:
			return"��";
		case 7:
			return"ĥ";
		case 8:
			return"��";
		case 9:
			return"��";
		default:
			return null;
		}
	}
	void changeToHangle1(int num) {
		//1024%10 == 4	 1024/10 ==102
		//102%10 == 2	 102/10 ==10
		//10%10 == 0	 10/10 ==1
		//1%10 == 1		 1/10 ==0
		String hangle="�����̻�����ĥ�ȱ�";
		String result="";
		while(num!=0) {
			result+=hangle.charAt(num%10);
			//���̰���
			num/=10;
		}
		reverse(result);//������ ���� -- �ϰ��̻�
		//������ ����� ���� reverse��� �޼ҵ带 ��������ν�
		//�Ųٷ� ����� ����ϴ� �κ� ������ ������ �� �ִ�.
		//main������ MethodTask m = new MethodTask();��
		//���� �ٸ� �޼ҵ带 ��������� �ٸ� �޼ҵ忡���� ������ ���� �ʰ�
		//����ϴ� ������ main�޼ҵ��� �տ��ִ�public static����
	}
}
