package Num1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JC19013135_E1 extends JFrame{
	private JLabel la;
	private JPanel panel = new JPanel();
	
	public JC19013135_E1() {
		setTitle("19013135/정우현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		panel.setLayout(new BorderLayout());
		
		JButton btn = new JButton("Mouse Event테스트 버튼");
		btn.addMouseListener(new btnMouseAdapter());
		btn.setBackground(Color.YELLOW);
		btn.setEnabled(false);
		la = new JLabel("hello");
		la.setSize(60, 30);
		la.setLocation(50,30);
		
		panel.addMouseListener(new myMouseAdapter());
		
		panel.add(btn, BorderLayout.NORTH);
		panel.add(la, BorderLayout.SOUTH);
		
		c.add(panel);
		setVisible(true);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	private class btnMouseAdapter extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setBackground(Color.YELLOW);			
		}
	}
	
	private class myMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String args[]) {
		System.out.println("19013135/정우현");
		new JC19013135_E1();
	}
}
