import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
class FrameEvent09 extends Frame {
	FrameEvent09(){
		super("FrameWindow Closing");
		setSize(600, 400);
		setVisible(true);
		setLayout(new FlowLayout());
		
		addWindowListener(new SubFrame09()); 
		//내부클래스로 이벤트처리 -> 외부클래스명$내부클래스명.class (FrameEvent09$SubFrame09.class)
	}
	
	class SubFrame09 extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println(this.getClass());
			System.out.println(this.getClass().getSimpleName());
			System.out.println(this.getClass().getSuperclass());
			System.exit(0);
		}
	}
}


public class UiTest09 {
	public static void main(String[] args) {
		new FrameEvent09();
	}
}
