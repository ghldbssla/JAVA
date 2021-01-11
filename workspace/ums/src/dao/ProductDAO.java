package dao;

import java.util.HashSet;

import dto.ProductDTO;

public class ProductDAO {
	DBConnection conn = null;
	public ProductDAO() {
		conn=new DBConnection("ProductDB.txt");
	}
	public void addProd(ProductDTO product) {
		//���� �������� insert �޼ҵ� ����
		//product�� toString�� �Ѱ��ָ� ���Ͽ� ����.
		conn.insert(product.toString());
	}
	public HashSet<ProductDTO> showAll(String userid) {
		//ProductDB.txt���� ������ �濡 �ø� ������ id�� ����Ǿ��ִ�.
		//���� 4���濡�� ���� ������ id�� ���� ���� �������ִ� ���� �� ������ �ø�
		//��ǰ�� ������� ���̴�.
		return conn.selectProduct(4, userid);
	}
	public void deleteProd(String data) {
		//������ ��ǰ�� toString ���ڿ� �״�� �޾ƿͼ�
		//�Ʊ� �������� delete�޼ҵ忡 �Ѱ��ָ� ��
		conn.delete(data);
	}
	public void updateProd(ProductDTO product,int index,String newData) {
		//��ǰ, ������ ��ġ, ���ο� ���� �� �޾ƿͼ� ���� �α��� �Ǿ��ִ� session����
		//updateProduct()�� ���� �Ѱ��ش�.
		conn.updateProduct(UserDAO.session,product, index, newData);
	}
}







