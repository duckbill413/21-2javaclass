package Num3;

class Circle{
	private int r;
	
	public Circle()
	{
		r=15;
	}
	public void view()
	{
		System.out.println("Circle�� �������� "+r+"�� ���̴�.");
	}
}
class ColorCircle extends Circle{
	private int r;
	private String color;
	
	public ColorCircle()
	{
		r=30;
		color = "�Ķ���";
		super.view();
		view();
	}
	
	public void view()
	{
		System.out.println("ColorCircle�� �������� "+r+"�� "+color+" ���̴�.");
	}
}
public class JC19013135E3 {
	public static void main(String args[])
	{
		Circle a = new ColorCircle();
	}
}
