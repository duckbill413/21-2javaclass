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
		
		System.out.print("�ο���>>");
		n = sc.nextInt();
		
		people = new Phone[n];
		
		for(int i=0; i<people.length; i++)
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			people[i] = new Phone(sc.next(), sc.next());
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while(true)
		{
			System.out.println("�˻��� �̸�>>");
			String name = sc.next();
			boolean found = false;
			if(name.equals("�׸�")) break;
			for(int i=0; i<people.length; i++)
			{
				if(name.equals(people[i].getName())) {
					System.out.println(name+"�� ��ȣ�� "+people[i].getNumber()+" �Դϴ�");
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(name+" �� �����ϴ�.");
			}
		}
		sc.close();
	}
}
