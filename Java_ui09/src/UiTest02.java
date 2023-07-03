import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//플로우 레이아웃 배치관리자

class FrameEvent02 extends Frame {
	public FrameEvent02() {
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.out.println(e);
			}

			@Override
			public void windowLostFocus(WindowEvent e) {
				System.out.println(e);
			}

			@Override
			public void windowActivated(WindowEvent e) {
				
				System.out.println(e);
			}
			
		});
		
		setVisible(true);
		setSize(300, 200);
		setLayout(new FlowLayout()); //플로우 레이아웃 배치관리자 설정
		/*	플로우 레이아웃은 각 컴포넌트(컨테이너에 배치되는 각 그림 개체)가
		 * 	컨테이너(레이아웃)에 배치될 때 위에서 아래로 좌에서 우로 물 흐르듯 자연스럽게 배치된다.
		 * */
		add(new Button("Button 01"));
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		

		
	}
}

public class UiTest02 {
	public static void main(String[] args) {
		new FrameEvent02();
	}
}