import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//패널은 각 컴포넌트들을 그룹화해서 배치하는 레이아웃의 일종
//AWT나 스윙을 사용하여 각 그림 개체들을 배치할때 패널도 그룹화하여 프레임윈도우에 배치해야
//효과적인 배치가 가능함

class FrameEvent05 extends Frame{
	Panel pan01, pan02, pan03;
	
	public FrameEvent05(int width, int height){
		setSize(width, height);
		setLayout(new FlowLayout());
		setVisible(true);
		
		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();
		
		pan01.setBackground(Color.orange);
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.red);
		
		add(BorderLayout.NORTH, pan01);
		add(BorderLayout.CENTER, pan02);
		add(BorderLayout.SOUTH, pan03);
		Button bt = new Button("1");
		
		pan01.add(bt);
		pan01.add(new Button("2"));
		pan01.add(new Button("3"));
		pan01.add(new Label("pan01 Label"));
		
		pan02.add(new Button("1"));
		pan02.add(new Button("2"));
		pan02.add(new Button("3"));
		pan02.add(new Label("pan02 Label"));
		
		pan03.add(new Button("1"));
		pan03.add(new Button("2"));
		pan03.add(new Button("3"));
		pan03.add(new Label("pan03 Label"));
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}

public class UiTest05 {
	public static void main(String[] args) {
		new FrameEvent05(500, 300);
	}
}