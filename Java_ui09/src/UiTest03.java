import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 보더 레이아웃 배치 관리자

class FrameEvent03 extends Frame{
	FrameEvent03(){
		setSize(500, 300);
		setVisible(true);
		setLayout(new BorderLayout());
		
		
		add(new Button("BT01"), "North");
		add(new Button("BT02"), "West");
		add(new Button("BT03"), "Center");
		add(new Button("BT04"), "East");
		add(new Button("BT05"), "South");
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

}
public class UiTest03 {
	public static void main(String[] args) {
		new FrameEvent03();
	}
}
