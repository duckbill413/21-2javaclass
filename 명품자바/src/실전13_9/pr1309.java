package 실전13_9;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class panel extends JPanel{
	JLabel num[];
	JLabel result;
	private gameThread th;

	public panel(JLabel num[], JLabel result, gameThread th) {
		setLayout(null);

		this.num = num;
		this.result = result;
		this.th = th;

		for(int i=0; i<3; i++) {
			num[i] = new JLabel("0");
			num[i].setFont(new Font("Arial", Font.PLAIN, 30));
			num[i].setSize(80, 60);
			num[i].setLocation(50+100*i, 60);
			num[i].setBackground(Color.MAGENTA);
			num[i].setOpaque(true);
			num[i].setForeground(Color.YELLOW);
			//num[i].setVerticalAlignment(JLabel.CENTER);
			num[i].setHorizontalAlignment(JLabel.CENTER);
			add(num[i]);
		}

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				th.starting();
			}
		});

		result.setSize(200, 30);
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setLocation(100, 150);
		add(result);		
		
		requestFocus();
	}
}

class gameThread extends Thread{
	JLabel num[];
	JLabel result;

	public gameThread(JLabel num[], JLabel result) {
		this.num = num;
		this.result = result;
	}
	@Override
	public void run() {
		waiting();
		while(true) {
			try {
				for(int i=0; i<3; i++) {
					int n=  (int)(Math.random()*5);
					num[i].setText(Integer.toString(n));
					Thread.sleep(200);
				}
			}
			catch(InterruptedException e) { return;}
			int x = Integer.parseInt(num[0].getText());
			int y = Integer.parseInt(num[1].getText());
			int z = Integer.parseInt(num[2].getText());
			if(x==y&&y==z) {
				result.setText("축하합니다!!");
			}
			else 
				result.setText("아쉽군요");
			waiting();
		}
	}
	
	synchronized public void waiting() {
		try {
			wait();
		}
		catch(InterruptedException e) {return;}
	}
	synchronized public void starting() {
		notify();
	}
}
public class pr1309 extends JFrame{
	private JLabel num[]= new JLabel[3];
	private JLabel result = new JLabel("마우스를 클릭할 때 마다 게임합니다");
	
	public pr1309() {
		setTitle("실전 13-9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		gameThread th = new gameThread(num, result);
		setContentPane(new panel(num, result, th));
		th.start();
		
	    setSize(500, 300);
	    setVisible(true);
	    c.setFocusable(true);
	    c.requestFocus();
	}
	public static void main(String args[]) {
		new pr1309();
	}
}
