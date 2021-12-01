package Num1;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.event.*;
import java.util.Vector;

public class JC19013135E1 extends JFrame{
	File dir = new File("C:\\Users\\uhyeo\\Pictures\\Saved Pictures\\images");
	//이미지 파일에 대한 경로 설정 필요
	private JLabel imageLabel;
	private Vector<ImageIcon> image = new Vector<ImageIcon>();
	private int index = 0;
	
	public JC19013135E1(){
		setTitle("19013135 정우현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		File[] files = dir.listFiles();
		for(int i=0; i<files.length; i++) {
			ImageIcon imag = new ImageIcon(files[i].getPath());
			image.add(imag);
		}
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton left = new JRadioButton("left");
		JRadioButton right = new JRadioButton("right");
		left.setSelected(true);
		
		imageLabel = new JLabel(image.get(0));
		imageLabel.setPreferredSize(new Dimension(400, 300));
		imageLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(left.isSelected()) {
					index = (index+1)%image.size();
				}
				else if(right.isSelected()) {
					index = index-1;
					if(index<0) index = image.size()-1;
				}
				imageLabel.setIcon(image.get(index));
			}
		});
		g.add(left);
		g.add(right);
		c.add(left);
		c.add(right);
		c.add(imageLabel);
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new JC19013135E1();
	}
}
