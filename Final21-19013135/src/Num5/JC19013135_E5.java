package Num5;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class showJava extends JPanel{
	private JLabel txt = new JLabel("Java");
	private int x, y;

	public showJava() {
		setLayout(null);
		setVisible(true);

		add(txt);
		txt.setSize(80, 10);
		randomPoint();
		txt.setLocation(x, y);

		setSize(300, 300);
		setVisible(true);
	}
	public void randomPoint() {
		x = (int) (Math.random() * getWidth());
		y = (int) (Math.random() * getHeight());
	}

	public void moveJLabel() {
		randomPoint();
		txt.setLocation(x, y);
	}
	
	public void setOnTxt() {
		txt.setText("Java");
	}
	public void setOffTxt() {
		txt.setText("Finish");
		txt.setLocation(50, 50);
	}
}

class operThread1 implements Runnable{
	showJava p;
	private boolean flag = true;
	private int inteval;
	public operThread1(showJava p1, int inteval) {
		p = p1;
		this.inteval = inteval;
	}

	public void setFlag(boolean flag1) {
		flag = flag1;
	}
	public void stop() {
		p.setOffTxt();
	}
	synchronized public void play() {
		notify();
		p.setOnTxt();
	}

	public void run() {
		while (true) {
			try {
				if (flag) {
					p.moveJLabel();
				}
				Thread.sleep(inteval);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

class showTimer extends JPanel{
	private int time = 0;
	private JLabel txt = new JLabel(Integer.toString(time));
	public showTimer() {
		setLayout(null);
		setVisible(true);

		add(txt);
		txt.setSize(100, 50);
		txt.setLocation(140, 50);
		txt.setFont(new Font("Arail", Font.PLAIN, 25));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public void TimerOn() {
		time += 1;
		txt.setText(Integer.toString(time));
	}
}

class operThread2 implements Runnable{
	showTimer p;
	private boolean flag = true;
	private int inteval;
	public operThread2(showTimer p2, int inteval) {
		p = p2;
		this.inteval = inteval;
	}

	public void setFlag(boolean flag1) {
		flag = flag1;
	}
	synchronized public void play() {
		notify();
	}

	public void run() {
		while (true) {
			try {
				if (flag) {
					p.TimerOn();
				}
				Thread.sleep(inteval);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
public class JC19013135_E5 extends JFrame{
	private operThread1 runnable1;
	private operThread2 runnable2;
	private showJava p = new showJava();
	private showTimer q = new showTimer();
	public JC19013135_E5() {
		setTitle("쓰레드 Runnable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1, 12, 12));
		//패널1
		runnable1 = new operThread1(p, 200);
		Thread th1 = new Thread(runnable1);
		th1.start();
		//패널2
		runnable2 = new operThread2(q, 1000);
		Thread th2 = new Thread(runnable2);
		th2.start();
		
		c.add(p);
		c.add(q);
		setVisible(true);
		setSize(300, 630);

		p.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==MouseEvent.BUTTON1) {
					runnable1.setFlag(false);
					runnable1.stop();
				}
				else if(e.getButton()==MouseEvent.BUTTON3) {
					runnable1.setFlag(true);
					runnable1.play();
				}
			}
		});
		q.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==MouseEvent.BUTTON1) {
					runnable2.setFlag(false);
				}
				else if(e.getButton()==MouseEvent.BUTTON3) {
					runnable2.setFlag(true);
					runnable2.play();
				}
			}
		});
	}

	public static void main(String [] args) {
		new JC19013135_E5();
	}
}
