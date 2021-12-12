package Num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JF19013135_E2 extends JFrame{
	JButton left, right, center;
	public JF19013135_E2() {
		setTitle("기말고사 2번문제, 19013135");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		left = new JButton("West");
		right = new JButton("East");
		center = new JButton("CENTER");
		left.setBackground(Color.RED);
		right.setBackground(Color.RED);
		center.setBackground(Color.YELLOW);
		
		left.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				left.setBackground(Color.BLUE);
				center.setBackground(Color.YELLOW);
				right.setBackground(Color.RED);
			}
			public void mousExited(MouseEvent e) {
				left.setBackground(Color.RED);
			}
			public void mouseClicked(MouseEvent e) {
				left.setBackground(Color.BLUE);
				right.setBackground(Color.BLUE);
			}
		});
		center.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				center.setBackground(Color.PINK);
				left.setBackground(Color.RED);
				right.setBackground(Color.RED);
			}
			public void mousExited(MouseEvent e) {
				center.setBackground(Color.YELLOW);
			}
			public void mouseClicked(MouseEvent e) {
				left.setBackground(Color.PINK);
				right.setBackground(Color.PINK);
			}
		});
		right.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				right.setBackground(Color.GREEN);
				center.setBackground(Color.YELLOW);
				left.setBackground(Color.RED);
			}
			public void mousExited(MouseEvent e) {
				right.setBackground(Color.RED);
			}
			public void mouseClicked(MouseEvent e) {
				left.setBackground(Color.RED);
				right.setBackground(Color.RED);
			}
		});
		
		c.add(left, BorderLayout.WEST);
		c.add(center, BorderLayout.CENTER);
		c.add(right, BorderLayout.EAST);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		System.out.println("19013135/정우현");
		new JF19013135_E2();
	}
}
