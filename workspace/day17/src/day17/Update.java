package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\JAVA_JHY\\resource\\test.txt"));
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 문자열 : ");
		String data=sc.next();
		System.out.print("새로운 문자열 : ");
		String newData = sc.next();
		String result="";
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}
			if(line.equals(data)) {
				result+=newData+"\n";
			}else {
				result+=line+"\n";
			}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JAVA_JHY\\resource\\test.txt"));
		bw.write(result);
		bw.close();
	}
}







