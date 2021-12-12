package ����9_3;
import javax.swing.*;
import java.awt.*;
/*JFrame : JPanel�� Flowlayout ���� ���
 * FlowLayout(int align, int hGap, int vGap)
 * align: ������Ʈ�� ���� ���. LEFT, RIGHT, CENTER(����Ʈ)
 */
public class ex0903 extends JFrame{
	private JPanel panel = new JPanel();
	
	public ex0903() {
		setTitle("FlowLayout sample using JPanel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//JPanel�� FlowLayout ��ġ������ ����
		//���� ���� 30, ���� ���� 40
		panel.add(new JButton("add"));
		panel.add(new JButton("sub"));
		panel.add(new JButton("mul"));
		panel.add(new JButton("div"));
		panel.add(new JButton("Calculate"));
		
		c.add(panel);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[]agrs) {
		new ex0903();
	}
}
