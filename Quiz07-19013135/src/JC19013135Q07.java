import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JC19013135Q07 extends JFrame{
	public JC19013135Q07() {
		setTitle("19013135 Á¤¿ìÇö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		
		MyMouseAdapter listener = new MyMouseAdapter();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.setBackground(Color.GREEN);
		
		setSize(300, 250);
		setLocation(1000, 500);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
	}
	
	public static void main(String args[])
	{
		new JC19013135Q07();
	}
}