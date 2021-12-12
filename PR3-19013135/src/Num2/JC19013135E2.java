package Num2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JC19013135E2 extends JFrame{
	private JLabel move = new JLabel("C");
	
	public JC19013135E2()
	{
		setTitle("19013135 Á¤¿ìÇö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		setSize(500, 500);
		setLocation(500, 500);
		
		move.setLocation(100, 100);
		move.setSize(20, 20);
		c.add(move);
		
		MyMouseAdapter listener = new MyMouseAdapter();
		c.addMouseListener(listener);
		
		setVisible(true);
	}
	
	private class MyMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e)
		{
			int x = (int)(Math.random()*500);
			int y = (int)(Math.random()*400)+50;
			int xx = e.getX();
			int yy = e.getY();
			move.setLocation(xx,yy);
		}
	}
	public static void main(String args[]) {
		new JC19013135E2();
	}
}
