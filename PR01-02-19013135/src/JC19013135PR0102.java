import java.util.Scanner;

class Phone{
	private String name;
	private String number;//이름과 전화번호
	
	Phone(String name, String number)
	{
		this.name = name;//입력받은 이름, 번호을 Phone객체로 넘겨준다
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
public class JC19013135PR0102 {//PhoneBook클래스
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int n = sc.nextInt();//인원수 입력
		Phone[] people = new Phone[n];//인원수에 맞는 Phone객체 배열 생성
		
		for(int i=0; i<people.length; i++)
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			people[i] = new Phone(sc.next(), sc.next());//이름과 전화번호 string입력
		}
		
		System.out.println("저장되었습니다...");
		
		while(true)
		{
			System.out.println("검색할 이름>>");
			String name = sc.next();
			boolean found = false;
			
			if(name.equals("그만")) break;//그만이 입력 되면 종료
			
			for(int i=0; i<people.length; i++)
			{
				if(name.equals(people[i].getName())) {//i번째 people객체에 동일한 이름 존재 할시
					System.out.println(name+"의 번호는 "+people[i].getNumber()+" 입니다");
					found = true;//이름을 찾았으므로 true로 변경하고 종료
					break;
				}
			}
			if(!found)//동일한 이름이 존재하지 않을 때
				System.out.println(name+" 이 없습니다.");
		}
		sc.close();//Scanner sc 객체 free
	}
}
