package Num4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class totalMoney extends JPanel{
	private int [] won = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	private String [] text = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	private JTextField tfdata;
	private JTextField [] tf = new JTextField [8];
	private JCheckBox [] check = new JCheckBox[8];

	public totalMoney(){
		setBackground(Color.GREEN);
		setLayout(null);

		//금액
		JLabel la = new JLabel("금액");
		la.setHorizontalAlignment(JLabel.LEFT);
		la.setSize(50, 20);
		la.setLocation(50, 20);
		add(la);
		//testfield
		tfdata = new JTextField(30);
		tfdata.setSize(110, 20);
		tfdata.setLocation(110, 20);
		add(tfdata);

		//계산 버튼
		JButton btn = new JButton("계산");
		btn.setSize(60, 20);
		btn.setLocation(230, 20);
		add(btn);

		//계산된 돈의 액수
		for(int i=0; i<won.length; i++) {
			la = new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(60, 30);
			la.setLocation(60, 50+i*30);
			add(la);

			tf[i] = new JTextField(20);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setSize(70, 30);
			tf[i].setLocation(150, 50+i*30);
			add(tf[i]);

			check[i] = new JCheckBox();
			//check[i].setHorizontalAlignment(JCheckBox.CENTER);
			check[i].setSize(20, 30);
			check[i].setLocation(250, 50+i*30);
			check[i].setBackground(Color.GREEN);
			add(check[i]);
			
			if(i==7) {
			check[i].setSelected(true);
			remove(check[i]);
			}
		}

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int money = Integer.parseInt(tfdata.getText());
				if(money==0) return;
				int res;
				for(int i=0; i<won.length; i++) {
					if(check[i].isSelected()) {
						System.out.println(money);
						res = money/won[i];
						tf[i].setText(Integer.toString(res));
						if(res>0)
							money = money%won[i];
					}
					else
						tf[i].setText("0");
				}
			}
		});
	}
}

public class JF19013135_E4 extends JFrame{
	public JF19013135_E4() {
		setTitle("JF19013135_E4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new totalMoney());

		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String args[]) {
		System.out.println("19013135/정우현");
		new JF19013135_E4();
	}
}
