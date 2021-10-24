package Num3;

class Circle{
	private int r;
	
	public Circle()
	{
		r=15;
	}
	public void view()
	{
		System.out.println("Circle은 반지름이 "+r+"인 원이다.");
	}
}
class ColorCircle extends Circle{
	private int r;
	private String color;
	
	public ColorCircle()
	{
		r=30;
		color = "파란색";
		super.view();
		view();
	}
	
	public void view()
	{
		System.out.println("ColorCircle은 반지름이 "+r+"인 "+color+" 원이다.");
	}
}
public class JC19013135E3 {
	public static void main(String args[])
	{
		Circle a = new ColorCircle();
	}
}
