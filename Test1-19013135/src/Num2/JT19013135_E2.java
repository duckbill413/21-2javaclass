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
		return this.color + "색의 "+"("+getX()+","+getY()+")의 점";
	}
}
public class JT19013135_E2 {
	public static void main(String arg[])
	{
		System.out.println("19013135/정우현");
		
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);//(10,10)위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("Red");
		System.out.println(cp.toString()+"입니다.");
	}
}