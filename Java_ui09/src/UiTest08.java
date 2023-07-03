import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
class FrameEvent08 extends Frame implements ActionListener{

	Button orgB, yelB;
	
	public FrameEvent08() {
		setVisible(true);
		setSize(500, 300);
		setLayout(new FlowLayout());
		
		orgB = new Button("Orange");
		yelB = new Button("Yellow");
		
		add(orgB);
		add(yelB);
		
		orgB.addActionListener(this);
		yelB.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == orgB) this.setBackground(Color.orange);
		else this.setBackground(Color.YELLOW);
	}
	
}
public class UiTest08 {
	public static void main(String[] args) {
		new FrameEvent08();
	}
}
