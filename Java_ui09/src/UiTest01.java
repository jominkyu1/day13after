import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent01 extends Frame{
	public FrameEvent01() {
		super("Frame Window");
		setSize(300, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {//익명클래스 FrameEvent01$1.class
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); //닫기
				//System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println(this.getClass());
				
			}  
		});
		
	}
}
public class UiTest01 {
	public static void main(String[] args) {
		new FrameEvent01();
	}
}
