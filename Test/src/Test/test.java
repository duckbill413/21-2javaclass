package Test;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;

public class test extends JFrame {
	private JLabel la;
	private JPanel panel = new JPanel();
	
	public test() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		

	}

	public static void main(String[] args) {
		new test();
	}
}