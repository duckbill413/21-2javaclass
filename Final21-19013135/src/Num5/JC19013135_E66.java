package Num5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JC19013135_E66 extends JFrame {
	private panel1 section1;
	private panel2 section2;
	private CountTh cnt1;
	private CountTh cnt2;
	public JC19013135_E66() {
		setTitle("19013135 정우현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= getContentPane();
		c.setLayout(new GridLayout(2,1, 12, 12));
		
		cnt1 = new CountTh();
		cnt2 = new CountTh();
		Thread th1 = new Thread(cnt1);
		Thread th2 = new Thread(cnt2);
		th1.start();
		th2.start();
		section1 = new panel1(200, cnt1);
		section2 = new panel2(1000, cnt2);
		add(section1);
		add(section2);
		setSize(300, 700);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class panel1 extends JPanel{
		private JLabel text = new JLabel("Java");
		private int inteval;
		private CountTh th;
		public panel1(int inteval, CountTh th) {
			this.inteval = inteval;
			this.th = th;
			setLayout(null);
			
			add(text);
			text.setSize(50, 10);
			text.setLocation(50, 50);
			setSize(300, 300);
			setVisible(true);
		}
		public void flowTime() {
			int x=(int)(Math.random()*300);
			int y=(int)(Math.random()*250+30);
			text.setLocation(x, y);
		}
	}
	class panel2 extends JPanel{
		private int inteval;
		private JLabel timer = new JLabel();
		private int time = 0;
		private CountTh th;
		public panel2(int inteval, CountTh th) {
			this.inteval = inteval;
			this.th = th;
			setLayout(new FlowLayout());
			
			add(timer);
			timer.setVisible(true);
			setSize(300, 300);
			setVisible(true);
		}
		public void flowTime() {
			time+=1;
			timer.setText(Integer.toString(time));
		}
	}
	class CountTh implements Runnable{
		synchronized public void waiting() {
			try {
				wait();
			}catch(InterruptedException e) {return;}
		}
		synchronized public void starting() {
				notify();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				while(true) {
					Thread.sleep(200);
				}
			}
			catch(InterruptedException e) {return;}
		}

	}
	public static void main(String[] args) {
		System.out.println("19013135/정우현");
		new JC19013135_E66();
	}
}