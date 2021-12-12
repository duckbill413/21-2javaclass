package Num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JC19013135E2 extends JFrame{
	private JLabel num[] = new JLabel[3];
	private JLabel result = new JLabel("마우스를 클릭할 때 마다 게임합니다");

	public JC19013135E2() {
		setTitle("19013135 정우현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0; i<3; i++) {			
			num[i] = new JLabel("0");
		}
		showNumTh th = new showNumTh(num, result);
		th.start();
		Container c = getContentPane();
		setContentPane(new setNum(num, result, th));

		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String args[]) {
		new JC19013135E2();
	}
}
class showNumTh extends Thread{
	private JLabel result;
	private JLabel num[];
	private int n[] = new int[3];
	public showNumTh(JLabel num[], JLabel result) {
		this.num = num;
		this.result = result;
	}

	synchronized public void waiting() {
		try {
			wait();
		}catch(InterruptedException e) {return;}
	}
	synchronized public void starting() {
		notify();
	}
	public void run() {
		waiting();
		while(true) {
			try {
				for(int i=0; i<3; i++) {
					num[i].setText(Integer.toString((int)(Math.random()*5)));
					if(i!=2)sleep(200);
				}
			}
			catch(InterruptedException e) { return;}
			for(int i=0; i<3; i++) {
				n[i] = Integer.parseInt(num[i].getText());
			}
			result.setLocation(160, 180);
			if(n[0]==n[1] && n[1]==n[2])
				result.setText("축하합니다!!");
			else
				result.setText("아쉽군요");
			waiting();
		}
	}
}

class setNum extends JPanel{
	private JLabel num[];
	private JLabel result;
	private showNumTh th;

	public setNum(JLabel num[], JLabel result, showNumTh th) {
		this.num = num;
		this.result = result;
		this.th = th;
		setLayout(null);

		for(int i=0; i<3; i++)
		{
			num[i].setFont(new Font("Gothic", Font.ITALIC, 40));
			num[i].setForeground(Color.YELLOW);

			JPanel numPanel = new JPanel();
			numPanel.add(num[i]);
			numPanel.setBackground(Color.MAGENTA);
			add(numPanel);
			numPanel.setSize(80, 60);
			numPanel.setLocation(100*i+50, 60);

			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					th.starting();
				}
			});
			numPanel.requestFocus();
		}
		add(result);
		result.setFont(new Font("Gothic", Font.ITALIC, 15));
		result.setSize(400, 30);
		result.setLocation(80, 180);		
	}
}