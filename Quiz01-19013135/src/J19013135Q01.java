import java.util.Scanner;

public class J19013135Q01 {
	public static void main(String[] args) {
		char grade;
		System.out.println("19013135 정우현");
		Scanner a = new Scanner(System.in);
		while(a.hasNext())
		{
			int score = a.nextInt();
			if(score>=95)
				grade = 'A';
			else if(score>=75)
				grade = 'B';
			else if(score>= 60)
				grade = 'C';
			else if(score>=40)
				grade = 'D';
			else
				grade = 'F';
			System.out.println("학점은 "+grade+"입니다.");
		}
	}

}