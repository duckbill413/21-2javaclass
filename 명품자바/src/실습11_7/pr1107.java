package 실습11_7;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class panel extends JPanel{
	private int size;
	private JLabel la;
	public panel() {
		setLayout(new BorderLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setSize(300, 100);
		add(slider, BorderLayout.NORTH);
		
		slider.addChangeListener(new MyChangeListener());
		
		la = new JLabel("I Love Java");
		size = slider.getValue();
		la.setFont(new Font("Arial", Font.PLAIN, size));
		la.setHorizontalAlignment(SwingConstants.CENTER);
		add(la, BorderLayout.CENTER);
	}
	
	private class MyChangeListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			JSlider js = (JSlider)e.getSource();
			size = js.getValue();
			la.setFont(new Font("Arial", Font.PLAIN, size));
		}
	}
}
public class pr1107 extends JFrame{
	public pr1107() {
		setTitle("실전 11-7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		setContentPane(new panel());
		//c.add(new panel());
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new pr1107();
	}
}
