package p24407;
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work==null) System.out.println("�����ϴ�");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class Q07{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�̹��� ������ ���� ���α׷�");
		Day p [] = new Day[31];
		for(int i=0; i<p.length; i++)
			p[i] = new Day();
		
		while(true)
		{
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int select = sc.nextInt();

			if(select == 1) {
				System.out.print("��¥(1~30)?");
				int date = sc.nextInt();

				System.out.print("����(��ĭ�����Է�)?");
				String sub = sc.next();
				p[date-1].set(sub);
			}
			else if(select==2)
			{
				System.out.print("��¥(1~30)?");
				int date = sc.nextInt();
				
				p[date-1].show();
			}
			else if(select ==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		sc.close();
	}
}