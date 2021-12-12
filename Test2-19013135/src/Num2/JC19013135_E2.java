package Num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class timerThread implements Runnable{
	private int time = 0;
	private com21 section;
	public timerThread(com21 section) {
		this.section = section;
		this.time = section.gettime();
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				time++;
				section.setTime(time);
			}
			catch(InterruptedException e) {return;}
		}
	}

}

class com11 extends JPanel{
	JLabel la = new JLabel("hello");
	public com11() {
		setLayout(null);
		addMouseListener(new myMouseAdapter());
		add(la);
		la.setSize(60, 30);
		la.setLocation(0,0);
		la.setFont(new Font("Arial", Font.PLAIN, 15));
	}

	private class myMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
}

class com21 extends JPanel{
	private JLabel timer = new JLabel();
	private int time = 0;
	public com21() {
		setLayout(new FlowLayout());
		timer.setText(Integer.toString(time));
		timer.setFont(new Font("Arial", Font.PLAIN, 30));
		add(timer);
	}
	public int gettime() {
		return Integer.parseInt(timer.getText());
	}
	public void setTime(int time) {
		this.time = time;
		timer.setText(Integer.toString(time));
	}
}

public class JC19013135_E2 extends JFrame{
	private JPanel panel = new JPanel();
	private com11 section1 = new com11();
	private com21 section2 = new com21();

	public JC19013135_E2() {
		setTitle("19013135 Á¤¿ìÇö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= getContentPane();
		panel.setLayout(new GridLayout(2,1, 12, 12));

		timerThread runnable = new timerThread(section2);
		Thread th = new Thread(runnable);
		th.start();

		panel.add(section1);
		panel.add(section2);
		c.add(panel);
		setSize(500, 500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String args[]) {
		new JC19013135_E2();
	}
}