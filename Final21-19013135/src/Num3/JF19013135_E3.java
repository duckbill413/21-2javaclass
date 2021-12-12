package Num3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class section11 extends JPanel{
	public section11() {
		setLayout(null);
		setOpaque(true);
		
		setFocusable(true);
		requestFocus(true);
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				Container con = (Container)e.getSource();
				System.out.println(e.getKeyChar());
				if(e.getKeyChar()=='0') {
					con.setBackground(Color.RED);
				}
				else if(e.getKeyChar()=='1') {
					con.setBackground(Color.BLUE);
				}
				else if(e.getKeyChar()=='3') {
					con.setBackground(Color.YELLOW);
				}
				else if(e.getKeyCode()==KeyEvent.VK_F1) {
					con.setBackground(Color.GREEN);
				}
			}
		});
	}
}
class section12 extends JPanel{
	public section12() {
		setOpaque(true);
		setLayout(null);
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()=='+') {
					
				}
			}
		});
	}
}
public class JF19013135_E3 extends JFrame{
	public JF19013135_E3() {
		setTitle("JF19013135_E3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 2, 12, 12));
		
		c.add(new section11());
		setSize(720, 720);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	;
	public static void main(String args[]) {
		System.out.println("19013135/Á¤¿ìÇö");
		new JF19013135_E3();
	}
}
