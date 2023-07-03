import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//그리드 레이아웃 배치관리자에서 3개의 열과 필요한만큼의 행을 가지는 경우

class FrameEvent12 extends JFrame{
	public FrameEvent12() {
		setTitle("그리드 레이아웃");
		setSize(350, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0, 3)); //n행 3열
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("Long button"));
		
		pack(); // 컴포넌트들의 크기에맞게 프레임 사이즈 조절
	}
}
public class UiTest12 {
	public static void main(String[] args) {
		new FrameEvent12().setVisible(true);
	}
}
