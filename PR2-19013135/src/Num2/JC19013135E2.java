package Num2;
import java.util.*;

abstract class Shape{
	public abstract void draw();
}
class Line extends Shape{
	public void draw() { System.out.println("Line");};
}
class Rect extends Shape{
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{
	public void draw() {System.out.println("Circle");}	
}

public class JC19013135E2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Vector<Shape> shape = new Vector<Shape>();
		
		System.out.println("�׷��� ������ beauty�� �����մϴ�");
		while(true)
		{
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int select1 = sc.nextInt();
			if(select1==1)
			{
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int select2 = sc.nextInt();
				if(select2==1)
					shape.add(new Line());
				else if(select2==2)
					shape.add(new Rect());  
				else if(select2==3)
					shape.add(new Circle());
			}
			else if(select1==2)
			{
				System.out.print("������ ������ ��ġ>>");
				int select3= sc.nextInt();
				if(shape.size()==0 || select3>=shape.size())
					System.out.println("������ �� �����ϴ�.");
				else
					shape.remove(select3);
			}
			else if(select1==3)
			{
				for(int i=0; i<shape.size(); i++)
				{
					shape.get(i).draw();
				}
			}
			else if(select1==4)
			{
				System.out.println("beauty�� �����մϴ�");
				break;
			}
		}
	}
}
