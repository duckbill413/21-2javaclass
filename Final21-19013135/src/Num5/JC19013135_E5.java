package Num5;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class showJava extends JPanel{
	private JLabel txt = new JLabel("Java");
	private JLabel ftxt = new JLabel("finish");
	private int interval;
	public showJava(int interval) {
		this.interval = interval;
		add(txt);
		txt.setSize(50, 10);
		txt.setLocation(0, 0);

		add(ftxt);
		ftxt.setSize(80, 10);
		ftxt.setLocation(50, 50);

		setSize(300, 300);
		setVisible(true);
	}
	public void setLocation() {
		int x = (int)(Math.random()*300);
		int y = (int)(Math.random()*250+30);
		txt.setLocation(x, y);
	}
	public int getInterval() {
		return interval;
	}
}
class operThread implements Runnable{
	private showJava panel;
	public operThread(showJava panel) {
		this.panel = panel;
		
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton()==MouseEvent.BUTTON1) {
					leftwait();
				}
				else if(e.getButton()==MouseEvent.BUTTON3) {
					rightnotify();
				}
			}
		});
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(panel.getInterval());
				panel.setLocation();
			}
			catch(InterruptedException e) { return;}
		}
	}
	synchronized public void leftwait() {
		try {
			wait();
		}
		catch(InterruptedException e) {return;}
	}
	synchronized public void rightnotify() {
		notify();
	}
}
public class JC19013135_E5 extends JFrame{
	private showJava p1;
	public JC19013135_E5() {
		setTitle("19013135 Á¤¿ìÇö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1, 12, 12));

		p1 = new showJava(200);

		add(p1);

		setSize(300, 700);
		setVisible(true);

		operThread runnable1 =new operThread(p1);
		Thread th1 = new Thread(runnable1);
		th1.start();
	}

	public static void main(String [] args) {
		new JC19013135_E5();
	}
}
