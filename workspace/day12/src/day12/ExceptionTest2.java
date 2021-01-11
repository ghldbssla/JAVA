package day12;

import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {
		ExceptionTest2 e = new ExceptionTest2();
		while (true) {
			String Msg="";
			Scanner sc = new Scanner(System.in);
			System.out.println("ä�� :  ");
			Msg=sc.next();
			try {
				e.filltering(Msg);
			} catch (MyException me) {
				System.out.println("�ٸ��� ����.");
				//�������� �޼ҵ�
				System.out.println(me.getMessage());
			}
		}
	}
	//throw�� ���� ���ܸ� throws�� ��� ���������
	void filltering(String msg) throws MyException{
		String[] badWords = {"�ٺ�","��û��"};
		for (int i = 0; i < badWords.length; i++) {
			//���� msg�� badWords[i]�� �����ϰ� ���� ��.
			if(msg.contains(badWords[i])) {
				//������ �߻� ���Ѿ���.(��ü��)
				throw new MyException();
			}
		}
	}
}
class MyException extends Exception{
	
	@Override
	public String getMessage() {
		return "���� ���� ����";
	}
}