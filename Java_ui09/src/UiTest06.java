import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

//이벤트 처리 예제
class FrameEvent06 extends Frame{
	Button redBtn, blueBtn;
	
	public FrameEvent06(){
		setLayout(new FlowLayout());
		setSize(300, 200);
		setVisible(true);
		setBackground(Color.YELLOW);
	
		
		redBtn = new Button("Red");
		blueBtn = new Button("Blue");
		
		add(redBtn);
		add(blueBtn);
		
		ButtonListener btnL = new ButtonListener();
		
		redBtn.addActionListener(btnL);
		blueBtn.addActionListener(btnL);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

//이벤트 처리 클래스
class ButtonListener implements ActionListener{
	int i=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		++i;
		System.out.println(e.getActionCommand()+ " " + i);
	}
}
public class UiTest06 {
	public static void main(String[] args) {
		new FrameEvent06();
	}
}