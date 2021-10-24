package p24407;
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work==null) System.out.println("업습니다");
		else System.out.println(work + "입니다.");
	}
}

public class Q07{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이번달 스케쥴 관리 프로그램");
		Day p [] = new Day[31];
		for(int i=0; i<p.length; i++)
			p[i] = new Day();
		
		while(true)
		{
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int select = sc.nextInt();

			if(select == 1) {
				System.out.print("날짜(1~30)?");
				int date = sc.nextInt();

				System.out.print("할일(빈칸없이입력)?");
				String sub = sc.next();
				p[date-1].set(sub);
			}
			else if(select==2)
			{
				System.out.print("날짜(1~30)?");
				int date = sc.nextInt();
				
				p[date-1].show();
			}
			else if(select ==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}