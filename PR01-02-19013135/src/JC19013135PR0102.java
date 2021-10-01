import java.util.Scanner;

class Phone{
	private String name;
	private String number;//�̸��� ��ȭ��ȣ
	
	Phone(String name, String number)
	{
		this.name = name;//�Է¹��� �̸�, ��ȣ�� Phone��ü�� �Ѱ��ش�
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
public class JC19013135PR0102 {//PhoneBookŬ����
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο���>>");
		int n = sc.nextInt();//�ο��� �Է�
		Phone[] people = new Phone[n];//�ο����� �´� Phone��ü �迭 ����
		
		for(int i=0; i<people.length; i++)
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			people[i] = new Phone(sc.next(), sc.next());//�̸��� ��ȭ��ȣ string�Է�
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		while(true)
		{
			System.out.println("�˻��� �̸�>>");
			String name = sc.next();
			boolean found = false;
			
			if(name.equals("�׸�")) break;//�׸��� �Է� �Ǹ� ����
			
			for(int i=0; i<people.length; i++)
			{
				if(name.equals(people[i].getName())) {//i��° people��ü�� ������ �̸� ���� �ҽ�
					System.out.println(name+"�� ��ȣ�� "+people[i].getNumber()+" �Դϴ�");
					found = true;//�̸��� ã�����Ƿ� true�� �����ϰ� ����
					break;
				}
			}
			if(!found)//������ �̸��� �������� ���� ��
				System.out.println(name+" �� �����ϴ�.");
		}
		sc.close();//Scanner sc ��ü free
	}
}
