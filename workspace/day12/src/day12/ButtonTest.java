package day12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame{
	JButton btn1 = new JButton("�����ּ���~");
	JButton btn2 = new JButton("����������~");
	public ButtonTest() {
		super("��ư�׽�Ʈ");
		setBounds(300,300,400,400);
		setLayout(new FlowLayout());
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ù��° ��ư");				
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ι�° ��ư");				
			}
		});
		add(btn1);
		add(btn2);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonTest();
	}
}
