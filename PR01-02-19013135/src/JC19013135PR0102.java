import java.util.Scanner;

class Phone{
	private String name;
	private String number;
	
	Phone(String name, String number)
	{
		this.name = name;
		this.number = number;
	}
	
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}
}
public class JC19013135PR0102 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Phone people[];
		int n;
		
		System.out.print("인원수>>");
		n = sc.nextInt();
		
		people = new Phone[n];
		
		for(int i=0; i<people.length; i++)
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			people[i] = new Phone(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다...");
		
		while(true)
		{
			System.out.println("검색할 이름>>");
			String name = sc.next();
			boolean found = false;
			if(name.equals("그만")) break;
			for(int i=0; i<people.length; i++)
			{
				if(name.equals(people[i].getName())) {
					System.out.println(name+"의 번호는 "+people[i].getNumber()+" 입니다");
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(name+" 이 없습니다.");
			}
		}
		sc.close();
	}
}
