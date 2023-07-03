import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

//그리드 레이아웃 배치 관리자
class FrameEvent04 extends Frame{
	int count=0;
	FrameEvent04(){
		
		setSize(500, 300);
		setVisible(true);
		setLayout(new GridLayout(3, 2)); //3행 2열의 그리드 레이아웃
		
		Button btn = new Button("btn");
		Label lbl = new Label("LABEL");
		
		add(btn);
		add(lbl);
		add(new Button("BT1"));
		add(new Button("BT2"));
		add(new Button("BT3"));
		add(new Button("BT4"));
		add(new Button("BT5"));
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(e);
				++count;
				lbl.setText("btn click"+count);
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e);
				System.out.println(e.getButton());
			}
		});
		
		
	}
}
public class UiTest04 {
	public static void main(String[] args) {
		new FrameEvent04();
	}
}
