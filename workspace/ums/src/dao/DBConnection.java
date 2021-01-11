package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

import dto.ProductDTO;
import dto.UserDTO;

public class DBConnection {
	//C
	//R
	//U
	//D
	//삽입
	String db;
	//객체가 생성될 때 넘어온 파일명을 전역변수 db에 넣는다.
	public DBConnection(String database) {
		this.db=database;
	}
	BufferedWriter bw = null;
	BufferedReader br = null;
	boolean insert(String data){
		try {
			//conn 객체를 생성할 때 넘겨주었던 파일명이 db에 담겨있기 때문에
			//그 파일을 쓰기모드로 열어준다.
			bw=new BufferedWriter(new FileWriter(db,true));
			//그 후 넘겨받은 문자열을 파일에 쓴다.
			bw.write(data+"\r\n");
			bw.close();
			//파일에  썼다는 말은 DB에 성공적으로 저장되었다는 뜻이므로
			//true 리턴
			return true;
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		//그 외에는 false 리턴
		return false;
	}
	//수정
	void updateUser(UserDTO user,int index,String newData) {
		try {
			//UserDB.txt 읽기모드로 열어준 후
			br = new BufferedReader(new FileReader(db));
			//전체 내용과 수정된 내용을 같이 연결해서 담을 result 변수 선언
			String result="";
			while(true) {
				//전체 파일을 돌면서 한줄씩 읽어온 후
				String line=br.readLine();
				if(line==null) {
					break;
				}
				//그 줄을 ; 기준으로 나누어 주면 각 방에 알맞은 정보들이 담길 것이다.
				String[] datas = line.split(";");
				//나누고 난 후 0번방이랑 넘겨준 session의 아이디가 같다면 그 줄이
				//수정할 대상이 되는 줄이다.
				if(datas[0].equals(user.userid)) {
					//아이디는 수정 불가이므로 일단 result에 연결
					result+=datas[0];
					//1번방~4번방까지가 수정할 대상이 되는 방들이고 따라서 for문을 1~datas의
					//길이까지 돌아준다.
					for (int i = 1; i < datas.length; i++) {
						result+=";";
						//i가 수정해야할 대상이 되는 인덱스가 되었다면
						if(i==index) {
							//기존 데이터인 datas[i]방 대신에 새로운 값인 newData를
							//연결해 준다.
							result+=newData;
						}else {
							//그 외에는 정상적으로 연결
							result+=datas[i];
						}
					}
					//마지막에 엔터까지 연결
					result+="\r\n";
				}else {
					//그 외에는 그대로 연결
					result+=line+"\r\n";
				}
			}
			//result에는 기존 내용에 수정될 내용이 덮어씌워진 문자열이 담겨있다.
			br.close();
			if(!result.equals("")) {
				//result가 비어있지만 않다면 기존 db 파일에 덮어씌우기로 수정 완료
				bw=new BufferedWriter(new FileWriter(db));
				bw.write(result);
				bw.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("DB 파일 오류, 파일을 찾을 수 없습니다.");
		} catch(IOException ioe) {
			System.out.println("파일 입출력 오류");
		}
	}
	void updateProduct(UserDTO user,ProductDTO product,int index,String newData) {
		try {
			br = new BufferedReader(new FileReader(db));
			String result="";
			while(true) {
				String line=br.readLine();
				if(line==null) {
					break;
				}
				String[] datas = line.split(";");
				if(datas[4].equals(user.userid) && product.prodname.equals(datas[0])) {
					result+=datas[0];
					//1번방~4번방까지가 수정할 대상이 되는 방들이고 따라서 for문을 1~datas의
					//길이까지 돌아준다.
					for (int i = 1; i < datas.length; i++) {
						result+=";";
						//i가 수정해야할 대상이 되는 인덱스가 되었다면
						if(i==index) {
							//기존 데이터인 datas[i]방 대신에 새로운 값인 newData를
							//연결해 준다.
							result+=newData;
						}else {
							//그 외에는 정상적으로 연결
							result+=datas[i];
						}
					}
					//마지막에 엔터까지 연결
					result+="\r\n";
				}else {
					//그 외에는 그대로 연결
					result+=line+"\r\n";
				}
			}
			//result에는 기존 내용에 수정될 내용이 덮어씌워진 문자열이 담겨있다.
			br.close();
			if(!result.equals("")) {
				//result가 비어있지만 않다면 기존 db 파일에 덮어씌우기로 수정 완료
				bw=new BufferedWriter(new FileWriter(db));
				bw.write(result);
				bw.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("DB 파일 오류, 파일을 찾을 수 없습니다.");
		} catch(IOException ioe) {
			System.out.println("파일 입출력 오류");
		}
	}
	//; 기준으로 찾는 위치와 찾는 문자열 즉 두개의 값을 넘겨받아야 한다.
	HashSet<UserDTO> selectUser(int index,String keyword) {
		//전체 검색된 결과를 담아줄 resultSet 객체 생성
		HashSet<UserDTO> resultSet = new HashSet<>();
		try {
			//현재 세팅되어 있는 db에서 파일 읽기 과정을 구현하면 된다.
			br=new BufferedReader(new FileReader(db));
			while(true) {
				//br에서 한줄씩 읽어오고
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//그 줄을 ; 기준으로 나눴을때 내가 검색하고자 하는 위치의 방에서 keyword와 같은
				//문자열을 갖고 있는 줄이 있는지 확인
				if(line.split(";")[index].equals(keyword)) {
					//찾는 정보가 있다는 뜻이므로 그 줄은 이제 user의 객체일 것이다.
					String[] userdata = line.split(";");
					//또 ; 기준으로 나누게 되면 정보가 매우 많기 때문에 DTO로 포장해야 한다.
					UserDTO user = new UserDTO(userdata[0],
							userdata[1], userdata[2],
							userdata[3],userdata[4]);
					//포장된 결과를 resultSet에 추가
					resultSet.add(user);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("DB 파일 오류, 파일을 찾을 수 없습니다.");
		} catch(IOException ioe) {
			System.out.println("파일 입출력 오류");
		}
		//검색된 결과가 추가되어 있는 resultSet 리턴
		return resultSet;
	}
	HashSet<ProductDTO> selectProduct(int index,String keyword) {
		HashSet<ProductDTO> resultSet = new HashSet<>();
		try {
			//현재 세팅되어 있는 db에서 파일 읽기 과정을 구현하면 된다.
			br=new BufferedReader(new FileReader(db));
			while(true) {
				//br에서 한줄씩 읽어오고
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//그 줄을 ; 기준으로 나눴을때 내가 검색하고자 하는 위치의 방에서 keyword와 같은
				//문자열을 갖고 있는 줄이 있는지 확인
				if(line.split(";")[index].equals(keyword)) {
					//찾는 정보가 있다는 뜻이므로 그 줄은 이제 product의 객체일 것이다.
					String[] productdata = line.split(";");
					//또 ; 기준으로 나누게 되면 정보가 매우 많기 때문에 DTO로 포장해야 한다.
					ProductDTO prod = new ProductDTO(productdata[0],
							Integer.parseInt(productdata[1]),
							Integer.parseInt(productdata[2]),
							productdata[3],productdata[4]);
					//포장된 결과를 resultSet에 추가
					resultSet.add(prod);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("DB 파일 오류, 파일을 찾을 수 없습니다.");
		} catch(IOException ioe) {
			System.out.println("파일 입출력 오류");
		}
		//검색된 결과가 추가되어 있는 resultSet 리턴
		return resultSet;
	}
	void delete(String data) {
		try {
			boolean flag = false;
			//UserDB.txt 읽기모드로 열어준 후
			br = new BufferedReader(new FileReader(db));
			//전체 내용과 수정된 내용을 같이 연결해서 담을 result 변수 선언
			String result="";
			while(true) {
				//전체 파일을 돌면서 한줄씩 읽어온 후
				String line=br.readLine();
				if(line==null) {
					break;
				}
				if(line.equals(data)) {
					flag = true;
					continue;
				}else {
					result+=line+"\r\n";
				}
			}
			br.close();
			if(flag || !result.equals("")) {
				bw=new BufferedWriter(new FileWriter(db));
				bw.write(result);
				bw.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("DB 파일 오류, 파일을 찾을 수 없습니다.");
		} catch(IOException ioe) {
			System.out.println("파일 입출력 오류");
		}
	}
}











