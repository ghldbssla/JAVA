package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dao.UserDAO;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginWindow implements ActionListener{

	private JFrame frame;
	private JTextField idText;
	private JPasswordField pwText;
	private JButton joinBtn;

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel idLabel = new JLabel("���̵�");
		idLabel.setBounds(30, 30, 57, 15);
		frame.getContentPane().add(idLabel);
		JLabel pwLabel = new JLabel("�н�����");
		pwLabel.setBounds(30, 101, 57, 15);
		frame.getContentPane().add(pwLabel);
		
		idText = new JTextField();
		idText.setBounds(95, 27, 116, 21);
		frame.getContentPane().add(idText);
		idText.setColumns(10);
		
		pwText = new JPasswordField();
		pwText.setBounds(95, 98, 116, 21);
		frame.getContentPane().add(pwText);
		
		JButton loginBtn = new JButton("�α���");
		loginBtn.setBounds(283, 49, 97, 52);
		loginBtn.addActionListener(this);
		frame.getContentPane().add(loginBtn);
		
		joinBtn = new JButton("ȸ������");
		joinBtn.setBounds(283, 165, 97, 23);
		joinBtn.addActionListener(this);
		
		frame.getContentPane().add(joinBtn);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		UserDAO udao = new UserDAO();
		switch(e.getActionCommand()) {
		case "ȸ������":
			//ȸ������ ����
			break;
		case "�α���":
			String userid="";
			String userpw="";
			userid=idText.getText();
			char[] arPw = pwText.getPassword();
			for (int i = 0; i < arPw.length; i++) {
				userpw+=arPw[i];
			}
			int result = udao.login(userid, userpw);

			//�α��� �����ÿ��� ���� â�� �ݾ��ֱ�
			frame.dispose();
			if(result==-1) {
				System.out.println("���̵� ����. ���̵� Ȯ���� �ּ���");
			}else if(result==0) {
				System.out.println("��й�ȣ ����. ��й�ȣ�� Ȯ���� �ּ���");
			}else {
				System.out.println(userid+"�� �ȳ��ϼ���!");
				//�α��� ������ ����
				new MainView();
			}
			break;
		
		}
		
	}
}






