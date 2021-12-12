package 실습9_4;
import java.awt.*;
import javax.swing.*;
//GridLayout: setOpaque, setBackground
public class pr0904 extends JFrame{
	private JPanel panel = new JPanel();
	private Color[] col= {Color.RED, Color.ORANGE, 
			Color.YELLOW, Color.GREEN, Color.CYAN,
			Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

	public pr0904() {
		setTitle("실습 9-4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		panel.setLayout(new GridLayout(1, 10));
		for(int i=0; i<10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setOpaque(true);//배경색 적용
			btn.setBackground(col[i]);//배경색 등록
			panel.add(btn);
		}
		
		c.add(panel);
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String []args) {
		new pr0904();
	}
}