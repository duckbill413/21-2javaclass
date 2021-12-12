package 예제9_6;
import javax.swing.*;
import java.awt.*;
//Null Layout with panel
public class ex0906 extends JFrame{
	JPanel panel;
	public ex0906(){
		setTitle("Null Layout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		panel = new JPanel();
		panel.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Button");
		la.setLocation(130, 50);
		setSize(200, 20);
		panel.add(la);
		
		for(int i=0; i<10; i++) {
			JButton btn = new JButton(Integer.toString(i+1)+"버튼!");
			btn.setLocation(i*30, i*15);
			btn.setSize(80, 30);
			panel.add(btn);
		}
		
		c.add(panel);
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ex0906();
	}
}
