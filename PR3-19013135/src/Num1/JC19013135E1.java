package Num1;
import javax.swing.*;
import java.awt.*;

public class JC19013135E1 extends JFrame{
	public JC19013135E1()
	{
		setTitle("19013135 Á¤¿ìÇö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++)
		{
			JLabel num = new JLabel(Integer.toString(i+1));
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			num.setBackground(Color.BLUE);
			num.setLocation(x, y);
			num.setSize(10, 10);
			num.setOpaque(true);
			c.add(num);
		}
		
		setSize(300, 300);
		setLocation(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JC19013135E1();
	}
}
