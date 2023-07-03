import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UiTest11 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 150);
		
		f.setLocationRelativeTo(null);


		
		
		JPanel pn = new JPanel(); // 컴포넌트 그룹화(=레이아웃)
		f.add(pn);
		
		/*	배치관리자 기본값)
		 * 1. JFrame은 기본 배치관리자로 보더레이아웃
		 * 2. 스윙패널은 기본 배치관리자로 플로우레이아웃
		 * */
		
		JLabel lbl = new JLabel("화씨 온도: ");
		JLabel lbl2 = new JLabel("섭씨 온도: ");
		JTextField txt = new JTextField(15); // JTextField는 한줄입력필드
		JTextField txt2 = new JTextField(15);
		JButton btn = new JButton("변환");
		
		pn.add(lbl);
		pn.add(txt);
		
		pn.add(lbl2);
		pn.add(txt2);
		
		pn.add(btn);
		
		
		f.setVisible(true);
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			double d = (Integer.parseInt(txt2.getText())*1.8+32);
				txt.setText(String.valueOf(d));
			}
		});
	}
}
