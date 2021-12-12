package �ǽ�10_4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//KeyListener�� �͸� Ŭ���� ��� <LEFT KEY>��� string�� substring���
public class pr1004 extends JFrame{
	private int index = 0;
	
	public pr1004() {
		setTitle("�ǽ� 10-4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String text = "Love Java";
		JLabel la = new JLabel(text);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String message = text.substring(index+1) + text.substring(0, index+1);
					index = (index+1)%text.length();//index ��ġ ����
					la.setText(message);
				}
			}
		});
		
		c.add(la);
		setSize(300, 100);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();//������Ʈ�� ��Ŀ�� ����
	}
	
	public static void main(String [] args) {
		new pr1004();
	}
}
