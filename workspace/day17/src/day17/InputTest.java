package day17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//������ : D:\JAVA_1900_JDS\resource
		FileWriter fw=null;
		BufferedWriter bw=null;
		//���α׷��� ��� ������ �Է¹޾Ƽ� ���Ͽ� ����(C Python Java)
		//bw.write(lang+"\n");
		//C
		//Python
		//Java
		//���ϸ� : pl.txt
		try {
			fw = new FileWriter("C:\\JAVA_JHY\\resource\\pl.txt");
			bw = new BufferedWriter(fw);
			bw.write("���� �Է� �ʹ� ����~");
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("���� ����� ����");
		}
		Scanner sc = new Scanner(System.in);
		try {
			fw=new FileWriter("C:\\JAVA_JHY\\resource\\pl.txt");
			bw=new BufferedWriter(fw);
	
			for (int i = 0; i < 3; i++) {
				//�޸����� \r\n�� ���๮���� ����
				bw.write(sc.next()+"\r\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("���� ����� ����2");
		}
	}
}






