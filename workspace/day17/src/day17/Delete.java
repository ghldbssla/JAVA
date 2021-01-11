package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\JAVA_JHY\\resource\\test.txt"));
		String result="";
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = br.readLine();
			if(line ==null) {
				break;
			}
			System.out.println(line);
		}
		br.close();
		br= new BufferedReader(new FileReader("C:\\JAVA_JHY\\resource\\test.txt"));
		System.out.print("삭제할 문자열 : ");
		String data = sc.next();
		while(true) {
			String line = br.readLine();
			if(line ==null) {
				break;
			}
			if(line.equals(data)) {
			}else {
				result+=line+"\r\n";
			}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JAVA_JHY\\resource\\test.txt"));
		bw.write(result);
		bw.close();
	}
}









