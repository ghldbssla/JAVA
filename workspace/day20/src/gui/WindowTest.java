package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest {
	public static void main(String[] args) {
		 new WindowTest();
	}
	public WindowTest() {
		Frame window = new Frame("������ �׽�Ʈ â�Դϴ�");
		window.setSize(400, 300);//px �������� ���� 400 ���� 300���� ����
		window.setLocation(500,500);// �� ���� ����� �����̴�. (0,0)
		window.setVisible(true);
		
		Button btn1 = new Button("�����ư");
		//��ư���� �׼�(��� ����)�� �ν��� �� �ִ� �͸� �޾��ִ� �޼ҵ�
		//ActionListener ��ü �ϳ��� �Ű������� �ʿ��ϴ�.
		//���� �Ѱ��ٶ� ��üȭ�� �����ϰ� �Ǹ�, �������̽��� ������
		//�͸� Ŭ������ ������.
		btn1.addActionListener(new ActionListener() {
			
			//��ư���� �׼��� �־������� ȣ��Ǵ� �޼ҵ�
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
		});
		btn1.setSize(100,100);
		btn1.setLocation(150, 100);
		btn1.setFont(new Font("����ü",Font.ITALIC|Font.BOLD,20));
		//8CFAE7
		window.setBackground(new Color(140, 250, 231));
		//â ũ������ �Ұ��ϰ� �����
		window.setResizable(false);
		//����� ��ġ��� 
		// (â�� ����ũ��-������Ʈ ����ũ��)/2,(â�� ����ũ��-������Ʈ ����ũ��)/2
		//��ġ������ ���ֱ�, �� ���������� �츮�� ���� ��ġ, ũ�⸦ ������ �־�� �Ѵ�.
		window.setLayout(null);
		//â���ִ�(�� : �ݱ��ư) ��ҷ� ��� �׼��� �־��ְ� ������ �޾���� �ϴ� ������
		window.addWindowListener(new WindowAdapter() {
			//�ݱ��ư ������ ȣ��Ǵ� �޼ҵ�
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		window.add(btn1);
	}
}







