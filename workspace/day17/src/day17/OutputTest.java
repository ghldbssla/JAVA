package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class OutputTest {
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
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\JAVA_JHY\\resource\\test.txt",true));
			bw.write("Java\r\n");
			bw.close();
		} catch (IOException e) {
		}
	}
}


















