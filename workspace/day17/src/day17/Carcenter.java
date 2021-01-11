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
		//�����
		//.\ : ��������
		//..\ : ��������
		//\ : �ֻ�������
//		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\CarDB.txt"));
		Scanner sc = new Scanner(System.in);
		Carcenter c = new Carcenter();
		while(true) {
			System.out.println("1. �������\n2. �������\n3. �������\n4. ������");
			int choice=sc.nextInt();
			if(choice==4) {
				System.out.println("�ȳ���������");
				break;
			}
			switch(choice) {
			case 1:
				//�������
				System.out.print("�귣�� : ");
				String brand = sc.next();
				System.out.print("���� : ");
				String color = sc.next();
				System.out.print("���� ��ȣ : ");
				String carNum = sc.next();
				System.out.print("���� : ");
				String owner = sc.next();
				System.out.print("�Ƿڳ��� : ");
				sc.nextLine();
				String request = sc.nextLine();
				c.insert(brand,color,carNum,owner,request);
				System.out.println("��� �Ϸ�!");
				break;
			case 2:
				//�������
				c.showAll();
				break;
			case 3:
				//�������
				c.showAll();
				System.out.print("����� �� ��ȣ : ");
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
		System.out.println("===========�������==========");
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String[] datas = line.split(";");
			//������ȣ : �귣��/����/������/�䱸����
			//������ȣ : �귣��/����/������/�䱸����
			//������ȣ : �귣��/����/������/�䱸����
			//������ȣ : �귣��/����/������/�䱸����
			System.out.println(datas[2]+" : "+datas[0]+"/"+datas[1]+"/"+datas[3]+"/"+datas[4]);
		}
		System.out.println("==========================\n");
		br.close();
	}
}








