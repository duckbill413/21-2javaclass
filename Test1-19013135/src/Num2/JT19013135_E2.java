package Num2;

class Point{
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super(0,0);
		this.color = "Black";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public String toString() {
		return this.color + "���� "+"("+getX()+","+getY()+")�� ��";
	}
}
public class JT19013135_E2 {
	public static void main(String arg[])
	{
		System.out.println("19013135/������");
		
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10, 10);//(10,10)��ġ�� BLACK �� ��
		cp.setXY(5, 5);
		cp.setColor("Red");
		System.out.println(cp.toString()+"�Դϴ�.");
	}
}