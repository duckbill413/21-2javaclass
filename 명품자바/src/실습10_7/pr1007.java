package 실습10_7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Font 사용 getKeyChar() Font f = getFont(); f.getSize();
public class pr1007 extends JFrame{
	private JLabel la;
	public pr1007(){
		super.setTitle("실습10-5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c=getContentPane();
		c.setLayout(new FlowLayout());

		la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));

		//c.addKeyListener(new myKeyAdapter());
		//		c.addMouseListener(new myMouseAdapter());
		//		c.addMouseMotionListener(new myMouseAdapter());
		c.addMouseWheelListener(new myMouseAdapter());
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
		c.add(la);
		setSize(300, 200);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	//	private class myKeyAdapter extends KeyAdapter{
	//		public void keyPressed(KeyEvent e) {
	//			Font f = la.getFont();
	//			int size = f.getSize();
	//			if(e.getKeyChar()=='+') {
	//				la.setFont(new Font("Arial", Font.PLAIN, size+5));
	//			}
	//			else if(e.getKeyChar()=='-') {
	//				if(size!=5)
	//					la.setFont(new Font("Arial", Font.PLAIN, size-5));
	//			}
	//		}
	//	}
	private class myMouseAdapter implements MouseWheelListener{
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int move = e.getWheelRotation();
			Font f = la.getFont();
			int size = f.getSize();
			if(move<0) {
				if(size!=5)
					la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
			else {
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}
		}

	}

	public static void main(String args[]) {
		new pr1007();
		new pr1007();
	}
}
