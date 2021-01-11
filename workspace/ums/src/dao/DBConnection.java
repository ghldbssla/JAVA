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
	//����
	String db;
	//��ü�� ������ �� �Ѿ�� ���ϸ��� �������� db�� �ִ´�.
	public DBConnection(String database) {
		this.db=database;
	}
	BufferedWriter bw = null;
	BufferedReader br = null;
	boolean insert(String data){
		try {
			//conn ��ü�� ������ �� �Ѱ��־��� ���ϸ��� db�� ����ֱ� ������
			//�� ������ ������� �����ش�.
			bw=new BufferedWriter(new FileWriter(db,true));
			//�� �� �Ѱܹ��� ���ڿ��� ���Ͽ� ����.
			bw.write(data+"\r\n");
			bw.close();
			//���Ͽ�  ��ٴ� ���� DB�� ���������� ����Ǿ��ٴ� ���̹Ƿ�
			//true ����
			return true;
		} catch (IOException e) {
			System.out.println("���� ����� ����");
		}
		//�� �ܿ��� false ����
		return false;
	}
	//����
	void updateUser(UserDTO user,int index,String newData) {
		try {
			//UserDB.txt �б���� ������ ��
			br = new BufferedReader(new FileReader(db));
			//��ü ����� ������ ������ ���� �����ؼ� ���� result ���� ����
			String result="";
			while(true) {
				//��ü ������ ���鼭 ���پ� �о�� ��
				String line=br.readLine();
				if(line==null) {
					break;
				}
				//�� ���� ; �������� ������ �ָ� �� �濡 �˸��� �������� ��� ���̴�.
				String[] datas = line.split(";");
				//������ �� �� 0�����̶� �Ѱ��� session�� ���̵� ���ٸ� �� ����
				//������ ����� �Ǵ� ���̴�.
				if(datas[0].equals(user.userid)) {
					//���̵�� ���� �Ұ��̹Ƿ� �ϴ� result�� ����
					result+=datas[0];
					//1����~4��������� ������ ����� �Ǵ� ����̰� ���� for���� 1~datas��
					//���̱��� �����ش�.
					for (int i = 1; i < datas.length; i++) {
						result+=";";
						//i�� �����ؾ��� ����� �Ǵ� �ε����� �Ǿ��ٸ�
						if(i==index) {
							//���� �������� datas[i]�� ��ſ� ���ο� ���� newData��
							//������ �ش�.
							result+=newData;
						}else {
							//�� �ܿ��� ���������� ����
							result+=datas[i];
						}
					}
					//�������� ���ͱ��� ����
					result+="\r\n";
				}else {
					//�� �ܿ��� �״�� ����
					result+=line+"\r\n";
				}
			}
			//result���� ���� ���뿡 ������ ������ ������� ���ڿ��� ����ִ�.
			br.close();
			if(!result.equals("")) {
				//result�� ��������� �ʴٸ� ���� db ���Ͽ� ������� ���� �Ϸ�
				bw=new BufferedWriter(new FileWriter(db));
				bw.write(result);
				bw.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("DB ���� ����, ������ ã�� �� �����ϴ�.");
		} catch(IOException ioe) {
			System.out.println("���� ����� ����");
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
					//1����~4��������� ������ ����� �Ǵ� ����̰� ���� for���� 1~datas��
					//���̱��� �����ش�.
					for (int i = 1; i < datas.length; i++) {
						result+=";";
						//i�� �����ؾ��� ����� �Ǵ� �ε����� �Ǿ��ٸ�
						if(i==index) {
							//���� �������� datas[i]�� ��ſ� ���ο� ���� newData��
							//������ �ش�.
							result+=newData;
						}else {
							//�� �ܿ��� ���������� ����
							result+=datas[i];
						}
					}
					//�������� ���ͱ��� ����
					result+="\r\n";
				}else {
					//�� �ܿ��� �״�� ����
					result+=line+"\r\n";
				}
			}
			//result���� ���� ���뿡 ������ ������ ������� ���ڿ��� ����ִ�.
			br.close();
			if(!result.equals("")) {
				//result�� ��������� �ʴٸ� ���� db ���Ͽ� ������� ���� �Ϸ�
				bw=new BufferedWriter(new FileWriter(db));
				bw.write(result);
				bw.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("DB ���� ����, ������ ã�� �� �����ϴ�.");
		} catch(IOException ioe) {
			System.out.println("���� ����� ����");
		}
	}
	//; �������� ã�� ��ġ�� ã�� ���ڿ� �� �ΰ��� ���� �Ѱܹ޾ƾ� �Ѵ�.
	HashSet<UserDTO> selectUser(int index,String keyword) {
		//��ü �˻��� ����� ����� resultSet ��ü ����
		HashSet<UserDTO> resultSet = new HashSet<>();
		try {
			//���� ���õǾ� �ִ� db���� ���� �б� ������ �����ϸ� �ȴ�.
			br=new BufferedReader(new FileReader(db));
			while(true) {
				//br���� ���پ� �о����
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//�� ���� ; �������� �������� ���� �˻��ϰ��� �ϴ� ��ġ�� �濡�� keyword�� ����
				//���ڿ��� ���� �ִ� ���� �ִ��� Ȯ��
				if(line.split(";")[index].equals(keyword)) {
					//ã�� ������ �ִٴ� ���̹Ƿ� �� ���� ���� user�� ��ü�� ���̴�.
					String[] userdata = line.split(";");
					//�� ; �������� ������ �Ǹ� ������ �ſ� ���� ������ DTO�� �����ؾ� �Ѵ�.
					UserDTO user = new UserDTO(userdata[0],
							userdata[1], userdata[2],
							userdata[3],userdata[4]);
					//����� ����� resultSet�� �߰�
					resultSet.add(user);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("DB ���� ����, ������ ã�� �� �����ϴ�.");
		} catch(IOException ioe) {
			System.out.println("���� ����� ����");
		}
		//�˻��� ����� �߰��Ǿ� �ִ� resultSet ����
		return resultSet;
	}
	HashSet<ProductDTO> selectProduct(int index,String keyword) {
		HashSet<ProductDTO> resultSet = new HashSet<>();
		try {
			//���� ���õǾ� �ִ� db���� ���� �б� ������ �����ϸ� �ȴ�.
			br=new BufferedReader(new FileReader(db));
			while(true) {
				//br���� ���پ� �о����
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//�� ���� ; �������� �������� ���� �˻��ϰ��� �ϴ� ��ġ�� �濡�� keyword�� ����
				//���ڿ��� ���� �ִ� ���� �ִ��� Ȯ��
				if(line.split(";")[index].equals(keyword)) {
					//ã�� ������ �ִٴ� ���̹Ƿ� �� ���� ���� product�� ��ü�� ���̴�.
					String[] productdata = line.split(";");
					//�� ; �������� ������ �Ǹ� ������ �ſ� ���� ������ DTO�� �����ؾ� �Ѵ�.
					ProductDTO prod = new ProductDTO(productdata[0],
							Integer.parseInt(productdata[1]),
							Integer.parseInt(productdata[2]),
							productdata[3],productdata[4]);
					//����� ����� resultSet�� �߰�
					resultSet.add(prod);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("DB ���� ����, ������ ã�� �� �����ϴ�.");
		} catch(IOException ioe) {
			System.out.println("���� ����� ����");
		}
		//�˻��� ����� �߰��Ǿ� �ִ� resultSet ����
		return resultSet;
	}
	void delete(String data) {
		try {
			boolean flag = false;
			//UserDB.txt �б���� ������ ��
			br = new BufferedReader(new FileReader(db));
			//��ü ����� ������ ������ ���� �����ؼ� ���� result ���� ����
			String result="";
			while(true) {
				//��ü ������ ���鼭 ���پ� �о�� ��
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
			System.out.println("DB ���� ����, ������ ã�� �� �����ϴ�.");
		} catch(IOException ioe) {
			System.out.println("���� ����� ����");
		}
	}
}











