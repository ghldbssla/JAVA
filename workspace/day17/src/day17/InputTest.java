package day17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//절대경로 : D:\JAVA_1900_JDS\resource
		FileWriter fw=null;
		BufferedWriter bw=null;
		//프로그래밍 언어 세가지 입력받아서 파일에 쓰기(C Python Java)
		//bw.write(lang+"\n");
		//C
		//Python
		//Java
		//파일명 : pl.txt
		try {
			fw = new FileWriter("C:\\JAVA_JHY\\resource\\pl.txt");
			bw = new BufferedWriter(fw);
			bw.write("파일 입력 너무 쉽다~");
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		Scanner sc = new Scanner(System.in);
		try {
			fw=new FileWriter("C:\\JAVA_JHY\\resource\\pl.txt");
			bw=new BufferedWriter(fw);
	
			for (int i = 0; i < 3; i++) {
				//메모장은 \r\n이 개행문자의 정석
				bw.write(sc.next()+"\r\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류2");
		}
	}
}






