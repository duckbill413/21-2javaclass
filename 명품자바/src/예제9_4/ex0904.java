package ����9_4;
import javax.swing.*;
import java.awt.*;
import java.util.*;
//BorderLayout
//North
//WEST CENTER EAST
//SOUTH
public class ex0904 extends JFrame{
	private JPanel panel = new JPanel();
	private JPanel panelLab = new JPanel();

	public ex0904() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		panel.setLayout(new BorderLayout(30, 20));

		panel.add(new JButton("add"), BorderLayout.NORTH);
		panel.add(new JButton("div"), BorderLayout.WEST);
		panel.add(new JButton("Calculate"), BorderLayout.CENTER);
		panel.add(new JButton("mul"), BorderLayout.EAST);
		panel.add(new JButton("sub"), BorderLayout.SOUTH);

		c.add(panel);
		setSize(300, 200);
		setVisible(true);
		
		panelLab.setLayout(new FlowLayout());
		panelLab.add(new JButton("��ư1"));
		panelLab.add(new JButton("��ư2"));
		panelLab.add(new JButton("��ư3"));
		
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt()==1) {//1�Է½� �г� ��ȯ
			c.add(panelLab);
			c.remove(panel);//�г� ��ȯ
		setVisible(true);
		}
	}
	public static void main(String [] args) {
		new ex0904();
	}
}
