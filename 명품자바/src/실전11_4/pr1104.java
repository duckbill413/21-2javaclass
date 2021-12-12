package 실전11_4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class totalMoney extends JPanel{
	private int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
	private String [] text = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"}; // 환산할 돈의 이름. 레이블로 출력됨
	private JTextField source; // 사용자로부터 금액이 입력될 텍스트 필드
	private JTextField [] tf = new JTextField [8]; // 환산된 돈의 개수가 출력될 텍스트필드
	private JCheckBox [] check = new JCheckBox[8];

	public totalMoney(){
		setBackground(Color.PINK);
		setLayout(null);

		//금액
		JLabel la = new JLabel("금액");
		la.setHorizontalAlignment(JLabel.RIGHT);
		la.setSize(50, 20);
		la.setLocation(20, 20);
		add(la);
		//testfield
		source = new JTextField(30);
		source.setSize(100, 20);
		source.setLocation(100, 20);
		add(source);

		//계산 버튼
		JButton btn = new JButton("계산");
		btn.setSize(60, 20);
		btn.setLocation(210, 20);
		add(btn);

		//계산된 돈의 액수
		for(int i=0; i<unit.length; i++) {
			la = new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(60, 20);
			la.setLocation(40, 50+i*30);
			add(la);

			tf[i] = new JTextField(20);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setSize(70, 20);
			tf[i].setLocation(120, 50+i*30);
			add(tf[i]);

			check[i] = new JCheckBox();
			check[i].setHorizontalAlignment(JCheckBox.LEFT);
			check[i].setSize(20, 30);
			check[i].setLocation(220, 50+i*30);
			check[i].setBackground(Color.PINK);
			add(check[i]);
			
			if(i==7) {
			check[i].setSelected(true);
			remove(check[i]);
			}
		}

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int money = Integer.parseInt(source.getText());
				if(money==0) return;
				int res;
				for(int i=0; i<unit.length; i++) {
					if(check[i].isSelected()) {
						System.out.println(money);
						res = money/unit[i];
						tf[i].setText(Integer.toString(res));
						if(res>0)
							money = money%unit[i];
					}
					else
						tf[i].setText("0");
				}
			}
		});
	}
}

public class pr1104 extends JFrame{
	public pr1104() {
		setTitle("실전 11-4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new totalMoney());

		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String args[]) {
		new pr1104();
	}
}
