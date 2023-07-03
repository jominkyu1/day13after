import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

class MyFrame01 extends Frame{
	Panel pn;
	Button b1, b2, b3;
	Label lbl;
	
	public MyFrame01() {
		setSize(300, 200);
		setVisible(true);
		setLayout(new GridLayout());
		
		pn = new Panel();
		pn.setLayout(new FlowLayout());
		pn.setBackground(Color.GRAY);
		
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		
		pn.add(b1);
		pn.add(b2);
		pn.add(b3);
		
		lbl = new Label("Label");
		
		pn.add(lbl);
		
		add(pn);
	}
}
public class MyUi01 {
	public static void main(String[] args) {
		new MyFrame01();
	}
}
