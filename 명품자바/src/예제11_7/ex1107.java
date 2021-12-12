package 예제11_7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex1107 extends JFrame{
	private JRadioButton [] radio= new JRadioButton[3];
	private String [] text = {"사과", "배", "체리"};

	private ImageIcon [] image ={
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")
	};

	private JLabel imageLabel = new JLabel();

	public ex1107() {
		setTitle("예제 11-7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel1 = new JPanel();
		radioPanel1.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<text.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel1.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		c.add(radioPanel1, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.SOUTH);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(250, 200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	private class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED) {
				return;
			}
			else if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			}
			else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			}
			else if(radio[2].isSelected()) {
				imageLabel.setIcon(image[2]);
			}
		}
	}
	
	public static void main(String args[]) {
		new ex1107();
	}
}
