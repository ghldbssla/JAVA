package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Carcenter {
	BufferedReader br = null;
	BufferedWriter bw = null;
	public static void main(String[] args) throws IOException, FileNotFoundException{
		//상대경로
		//.\ : 현재폴더
		//..\ : 상위폴더
		//\ : 최상위폴더
//		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\CarDB.txt"));
		Scanner sc = new Scanner(System.in);
		Carcenter c = new Carcenter();
		while(true) {
			System.out.println("1. 차량등록\n2. 차량목록\n3. 차량출고\n4. 나가기");
			int choice=sc.nextInt();
			if(choice==4) {
				System.out.println("안녕히가세요");
				break;
			}
			switch(choice) {
			case 1:
				//차량등록
				System.out.print("브랜드 : ");
				String brand = sc.next();
				System.out.print("색깔 : ");
				String color = sc.next();
				System.out.print("차량 번호 : ");
				String carNum = sc.next();
				System.out.print("차주 : ");
				String owner = sc.next();
				System.out.print("의뢰내용 : ");
				sc.nextLine();
				String request = sc.nextLine();
				c.insert(brand,color,carNum,owner,request);
				System.out.println("등록 완료!");
				break;
			case 2:
				//차량목록
				c.showAll();
				break;
			case 3:
				//차량출고
				c.showAll();
				System.out.print("출고할 차 번호 : ");
				carNum=sc.next();
				c.delete(carNum);
				break;
			}
		}
	}
	void insert(String brand, String color,String carNum, String owner, String request)	throws IOException{
		bw = new BufferedWriter(new FileWriter("CarDB.txt",true));
		bw.write(brand+";"+color+";"+carNum+";"+owner+";"+request+"\r\n");
		bw.close();
	}
	void delete(String carNum) throws FileNotFoundException,IOException{
		br= new BufferedReader(new FileReader("CarDB.txt"));
		String result="";
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			if(line.split(";")[2].equals(carNum)) {
				continue;
			}
			result+=line+"\r\n";
		}
		bw = new BufferedWriter(new FileWriter("CarDB.txt"));
		bw.write(result);
		bw.close();
	}
	void showAll() throws FileNotFoundException,IOException{
		br=new BufferedReader(new FileReader("CarDB.txt"));
		System.out.println("===========차량목록==========");
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String[] datas = line.split(";");
			//차량번호 : 브랜드/색깔/소유자/요구사항
			//차량번호 : 브랜드/색깔/소유자/요구사항
			//차량번호 : 브랜드/색깔/소유자/요구사항
			//차량번호 : 브랜드/색깔/소유자/요구사항
			System.out.println(datas[2]+" : "+datas[0]+"/"+datas[1]+"/"+datas[3]+"/"+datas[4]);
		}
		System.out.println("==========================\n");
		br.close();
	}
}








