package 실습9_8;
import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*300);
			int y = (int)(Math.random()*150+30);
			JLabel la = new JLabel("*");
			la.setForeground(Color.RED);
			la.setSize(20, 20);
			la.setLocation(x, y);
			add(la);
		}
	}
}
class SouthPanel extends JPanel{
	public SouthPanel() {
		setLayout(new FlowLayout());
		setBackground(Color.YELLOW);
		JButton btn = new JButton("Word Input");
		btn.setSize(200, 20);
		add(btn);
		JTextField text = new JTextField("", 15);
		add(text);
	}
}
public class pr0908 extends JFrame{
	private JPanel mainPanel= new JPanel();
	public pr0908() {
		setTitle("실습9-8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		mainPanel.setLayout(new BorderLayout());
		
		mainPanel.add(new NorthPanel(), BorderLayout.NORTH);
		mainPanel.add(new CenterPanel(), BorderLayout.CENTER);
		mainPanel.add(new SouthPanel(), BorderLayout.SOUTH);
		
		c.add(mainPanel);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new pr0908();
	}
}
