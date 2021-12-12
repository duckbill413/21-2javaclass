package 실습10_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Font 사용 getKeyChar() Font f = getFont(); f.getSize();
public class pr1005 extends JFrame{
	private JLabel la;
	public pr1005(){
		super.setTitle("실습10-5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		c.addKeyListener(new myKeyAdapter());
		
		c.add(la);
		setSize(300, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	private class myKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Font f = la.getFont();
			int size = f.getSize();
			if(e.getKeyChar()=='+') {
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}
			else if(e.getKeyChar()=='-') {
				if(size!=5)
					la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
		}
	}
	
	public static void main(String args[]) {
		new pr1005();
	}
}
