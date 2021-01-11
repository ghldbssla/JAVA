package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\JAVA_JHY\\resource\\test.txt");
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일 경로 문제발생");
		} catch (IOException ioe) {
			System.out.println("파일 입출력 예외발생");
		}
	}
}
