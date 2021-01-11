package view;

import java.util.HashSet;
import java.util.Scanner;

import dao.ProductDAO;
import dao.UserDAO;
import dto.ProductDTO;

public class MainView {
	public MainView() {
		// �α��� ������ ����� â ����
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		while (true) {
			System.out.println("1. ȸ������ ����\n2. ��ǰ ���\n" + 
		"3. ��ǰ ����\n4. ��ǰ ����\n5. ��ǰ ���\n6. �α׾ƿ�");
			int choice = sc.nextInt();
			if (choice == 6) {
				UserDAO.session=null;
				break;
			}
			//���� �������� �α��� �Ǿ��ִ� ������ ���̵� �Ѱ��ش�.
			//�׷��� �� id�� �ø� ��� ��ǰ���� ���� ProductDTO�� ����� �� HashSet�� �߰��� ä
			//���ϵȴ�. �� ����� result�� ��Ƴ��� �Ʒ��� ����, ����, ��Ϻ��⿡�� ����Ѵ�.
			HashSet<ProductDTO> result = pdao.showAll(UserDAO.session.userid);
			switch(choice) {
			case 1:
				//ȸ������ ����
				new MyInfo();
				break;
			case 2:
				//��ǰ ���
				new ProductView();
				break;
			case 3:
				//��ǰ ����
				//������ ������ �ø� ��� ��ǰ�� �߰��� ����� �����ڿ� �״�� �Ѱ��ش�
				//��? View�� �ű� �� �ٽ� �ҷ����� �۾��� ���ǹ��ϱ� ������
				new UpdateView(result);
				break;
			case 4:
				//��ǰ ����
				//������ ������ �ø� ��� ��ǰ�� �߰��� ����� �����ڿ� �״�� �Ѱ��ش�
				new DeleteView(result);
				break;
			case 5:
				//��ǰ ���
				System.out.println("======"+UserDAO.session.userid+
						"���� ��ǰ ���=====");
				String resultMsg="";
				int cnt = 1;
				//������ ���õ� result �״�� ���(���� ������ �ø� ��� ��ǰ�� ����ִ� hashset)
				for(ProductDTO prod : result) {
					//���찳 / 1000��(5��)
					resultMsg+=cnt+". "+prod.prodname+" / "+prod.prodprice+"��("+prod.prodamount
							+"��)\n";
					cnt++;
				}
				if(resultMsg.equals("") || resultMsg==null) {
					System.out.println("��ǰ�� �����ϴ�.");
				}else {
					System.out.print(resultMsg);
				}
				System.out.println("==========================");
				break;
			}
			if(UserDAO.session==null) {
				break;
			}
		}
	}
}







