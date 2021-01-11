package day12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame{
	JButton btn1 = new JButton("눌러주세요~");
	JButton btn2 = new JButton("나도눌러줘~");
	public ButtonTest() {
		super("버튼테스트");
		setBounds(300,300,400,400);
		setLayout(new FlowLayout());
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번째 버튼");				
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼");				
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
