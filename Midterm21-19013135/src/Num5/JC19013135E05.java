package Num5;

class Rectangle{
	private int xy [][];
	private int id;

	public Rectangle(int x1, int y1, int x2, int y2){
		this.id = (int)(Math.random()*1000+1);
		xy = new int [2][2];
		setXY(x1, y1, x2, y2);
	}

	public void setXY(int x1, int y1, int x2, int y2)
	{
		this.xy[0][0] = x1;
		this.xy[0][1] = y1;
		this.xy[1][0] = x2;
		this.xy[1][1] = y2;
	}
	public void view()
	{
		System.out.println("ID번호: "+id+", 좌표= ("+xy[0][0]+","
				+xy[0][1]+") ("+xy[1][0]+","+xy[1][1]+")");
		System.out.println("면적 = " + area() + ", 둘레길이의 합계 = " + range());
	}
	public boolean equals(Rectangle r)
	{
		int ax = xy[1][0] - xy[0][0];
		int ay = xy[1][1] - xy[0][1];
		int bx = r.getXY()[1][0]-r.getXY()[0][0];
		int by = r.getXY()[1][1]-r.getXY()[0][1];
		if(ax==bx && ay==by) return true;
		else return false;
	}

	public boolean collision(Rectangle r)
	{
		int ax = xy[1][0] - xy[0][0];
		int ay = xy[1][1] - xy[0][1];
		int bx = r.getXY()[1][0]-r.getXY()[0][0];
		int by = r.getXY()[1][1]-r.getXY()[0][1];

		if(xy[0][0]+ax>=r.getXY()[0][0] && xy[0][0] <= r.getXY()[0][0] + bx && 
				xy[0][1]+ay>=r.getXY()[0][1] && xy[0][1] <= r.getXY()[0][1] + by) {
			return true;
		}
		else return false;
	}

	public int range()
	{
		return 2*((xy[1][0]-xy[0][0])+(xy[1][1]-xy[0][1]));
	}

	public int area()
	{
		return (xy[1][0]-xy[0][0])*(xy[1][1]-xy[0][1]);
	}

	public int[][] getXY()
	{
		return xy;
	}
}
public class JC19013135E05 {
	public static void main(String args[])
	{
		Rectangle a, b;
		a = new Rectangle(8,5,13,12);
		b = new Rectangle(7,10, 12, 11);
		
		a.view();
		b.view();
		
		if(a.equals(b)) {
			System.out.println("두 사각형은 같다");
		}
		else System.out.println("두 사각형은 다르다");

		if(a.collision(b))
			System.out.println("충돌한다");
		else System.out.println("충돌하지 않는다");

		b.setXY(6, 6, 11, 13);

		a.view();
		b.view();

		if(a.equals(b)) {
			System.out.println("두 사각형은 같다");
		}
		else System.out.println("두 사각형은 다르다");

		if(a.collision(b))
			System.out.println("충돌한다");
		else System.out.println("충돌하지 않는다");

	}
}
