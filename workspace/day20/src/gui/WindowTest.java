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
		Frame window = new Frame("윈도우 테스트 창입니다");
		window.setSize(400, 300);//px 기준으로 가로 400 세로 300으로 설정
		window.setLocation(500,500);// 맨 좌측 상단이 기준이다. (0,0)
		window.setVisible(true);
		
		Button btn1 = new Button("종료버튼");
		//버튼에게 액션(어떠한 행위)을 인식할 수 있는 귀를 달아주는 메소드
		//ActionListener 객체 하나가 매개값으로 필요하다.
		//따라서 넘겨줄때 객체화를 진행하게 되면, 인터페이스기 때문에
		//익명 클래스가 열린다.
		btn1.addActionListener(new ActionListener() {
			
			//버튼에게 액션이 주어졌을때 호출되는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
		});
		btn1.setSize(100,100);
		btn1.setLocation(150, 100);
		btn1.setFont(new Font("굴림체",Font.ITALIC|Font.BOLD,20));
		//8CFAE7
		window.setBackground(new Color(140, 250, 231));
		//창 크기조절 불가하게 만들기
		window.setResizable(false);
		//정가운데 배치방법 
		// (창의 가로크기-컴포넌트 가로크기)/2,(창의 세로크기-컴포넌트 세로크기)/2
		//배치관리자 없애기, 즉 절대적으로 우리가 직접 위치, 크기를 설정해 주어야 한다.
		window.setLayout(null);
		//창에있는(예 : 닫기버튼) 요소로 어떠한 액션을 주어주고 싶을때 달아줘야 하는 리스너
		window.addWindowListener(new WindowAdapter() {
			//닫기버튼 누를시 호출되는 메소드
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		window.add(btn1);
	}
}







