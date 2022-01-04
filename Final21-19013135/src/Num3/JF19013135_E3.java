package Num3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JF19013135_E3 extends JFrame{
	private JPanel section1;
	private JPanel section2;
	private JPanel section3;
	private JPanel section4;
	public JF19013135_E3() {
		setTitle("JF19013135_E3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 2, 12, 12));

		section1 = new Block11();
		section2 = new Block12();
		section3 = new Block21();
		section4 = new Block22();
		c.add(section1);
		c.add(section2);
		c.add(section3);
		c.add(section4);
		setSize(720, 720);
		setVisible(true);
	}
	/*�׸��� ���� (1,1) ������Ʈ�� Ű���� �Է¿� ���� ����� �����ϴ� JPanel �� �����Ѵ�.
	��1��Ű�� �Է� ������ ������(RED), ��2�� Ű�� �Է� ������ Ǫ����(BLUE), ��3��Ű�� �Է� ������
	����� (YELLOW), <F1> Ű�� �Է� ������ �ʷϻ�(GREEN)���� ������ ���Ѵ�. �̿���
	�ٸ� Ű�� ��� �����Ѵ�. [���� ���� 10-7]*/
	class Block11 extends JPanel{
		public Block11() {
			setOpaque(true);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					System.out.println(e.getKeyCode() + "  " + e.getKeyChar());
					int key = e.getKeyCode();
					if(key==KeyEvent.VK_0)
						setBackground(Color.RED);
					else if(key==KeyEvent.VK_1)
						setBackground(Color.BLUE);
					else if(key==KeyEvent.VK_2)
						setBackground(Color.YELLOW);
					else if(key==KeyEvent.VK_F1)
						setBackground(Color.GREEN);
				}
			});

			//			setFocusable(true);
			//			requestFocus();
		}
	}

	class Block12 extends JPanel{
		private JLabel text = new JLabel("Hello~");
		public Block12() {
			setLayout(null);
			setVisible(true);

			add(text);
			text.setFont(new Font("���� ���", Font.PLAIN, 15));
			text.setForeground(Color.MAGENTA);
			text.setSize(250, 30);
			text.setLocation(50, 50);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if(key == KeyEvent.VK_LEFT)
						text.setLocation(text.getX()-10, text.getY());
					else if(key==KeyEvent.VK_RIGHT)
						text.setLocation(text.getX()+10, text.getY());
					else if(key==KeyEvent.VK_UP)
						text.setLocation(text.getX(), text.getY()-10);
					else if(key==KeyEvent.VK_DOWN)
						text.setLocation(text.getX(), text.getY()+10);
					else if(key==KeyEvent.VK_F2) {
						section1.setFocusable(true);
						section1.requestFocus();
					}
				}
			});
			setFocusable(true);
			requestFocus();
		}
	}
	
	class Block21 extends JPanel{
		JLabel mouseLocation = new JLabel("(0, 0)");
		private String location;
		public Block21() {
			setLayout(new FlowLayout());
			setVisible(true);
			add(mouseLocation);
			mouseLocation.setFont(new Font("Arial", Font.PLAIN, 30));
			MyMouseAdapter mouse = new MyMouseAdapter();
			addMouseListener(mouse);
			addMouseMotionListener(mouse);
		}
		class MyMouseAdapter extends MouseAdapter{
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				location = "("+x+", "+y+")";
				mouseLocation.setText(location);
			}
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				location = "("+x+", "+y+")";
				mouseLocation.setText(location);
			}
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				location = "("+x+", "+y+")";
				mouseLocation.setText(location);
			}
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				location = "("+x+", "+y+")";
				mouseLocation.setText(location);
			}
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				location = "("+x+", "+y+")";
				mouseLocation.setText(location);
			}
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.CYAN);
			}
			public void mouseExited(MouseEvent e) {
				setBackground(Color.YELLOW);
			}
		}
	}
	class Block22 extends JPanel{
		private JLabel text = new JLabel("19013135");
		private int x, y;
		public Block22() {
			setLayout(null);
			setVisible(true);
			randomLo();
			text.setLocation(x, y);
			text.setSize(150, 10);
			add(text);
			
			text.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					randomLo();
					text.setLocation(x, y);
				}
			});
		}
		public void randomLo() {
			this.x = (int)(Math.random()*300);
			this.y = (int)(Math.random()*300);
		}
	}
	public static void main(String args[]) {
		System.out.println("19013135/������");
		new JF19013135_E3();
	}
}
