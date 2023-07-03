import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//버튼 이벤트처리

@SuppressWarnings("serial")
class FrameEvent07 extends Frame{
	private static FrameEvent07 instance = new FrameEvent07(); //Singleton
	public static synchronized FrameEvent07 getInstance() {
		return instance;
	}
	
	Button redBtn, blueBtn;
	
	private FrameEvent07(){
		setVisible(true);
		setSize(300, 150);
		setLayout(new FlowLayout());
		
		redBtn = new Button("Red");
		blueBtn = new Button("Blue");
		
		add(redBtn);
		add(blueBtn);
		
		EListen07 el = new EListen07(this);
		
		redBtn.addActionListener(el);
		blueBtn.addActionListener(el);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
}

class EListen07 implements ActionListener{
	Frame frm;
	
	@SuppressWarnings("unused")
	private EListen07() {}
	public EListen07 (Frame frm) {
		this.frm=frm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("Red")) {
			frm.setBackground(Color.red);
		}else if (str.equals("Blue")) {
			frm.setBackground(Color.BLUE);
		}
	}
}
public class UiTest07 {
	public static void main(String[] args) {
		FrameEvent07.getInstance();
	}
}
