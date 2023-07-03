import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//javax.swing패키지의 스윙API

class FrameEvent10 extends JFrame{ //AWT Frame에 J가 붙으면 스윙
	public FrameEvent10() {
		super("스윙 프레임윈도우"); // or setTitle()
		setSize(300, 400);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		JLabel lbl = new JLabel("라벨");
		
		add(lbl);
		add(btn);
	}
}
public class UiTest10 {
	public static void main(String[] args) {
		new FrameEvent10();
	}
}
