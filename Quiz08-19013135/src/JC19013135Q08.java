import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JC19013135Q08 extends JFrame{
	private JTextField tf = new JTextField(10);
	
	public JC19013135Q08() {
		setTitle("19013135 Á¤¿ìÇö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> combo = new JComboBox<String>();
		c.add(tf);
		c.add(combo);
		setSize(300, 300);
		setVisible(true);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				combo.addItem(t.getText());
				t.setText("");
			}
		});
	}
	
	public static void main(String args[]) {
		new JC19013135Q08();
	}
}
