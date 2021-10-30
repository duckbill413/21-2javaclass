package Num1;

class Triangle{
	private int id;
	private double x, y;

	public Triangle(Triangle [] tr, int cnt){
		while(true) {
			boolean found = true;
			int id = (int)(Math.random()*10)+1;
			for(int i=0; i<cnt; i++)
				if(tr[i].getid()==id) found=false;
			if(found==true) {
				this.id = id;
				break;
			}
		}
	}
	public void setXY(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getx()
	{
		return this.x;
	}
	public double gety()
	{
		return this.y;
	}
	public int getid()
	{
		return this.id;
	}
	public void cmp(Triangle b)
	{
		double size1, size2;
		size1 = this.x*this.y;
		size2 = b.getx()*b.gety();
		if(size1==size2) {
			System.out.println("==> (삼각형 Id:"+this.id+")와 (삼각형 Id:"+b.getid()+")는 면적이 같습니다.");
		}
		else
		{
			System.out.println("==> (삼각형 Id:"+this.id+")와 (삼각형 Id:"+b.getid()+")는 면적이 같지 않습니다.");
		}
	}

	public void view()
	{
		System.out.println("ID:"+id+" ,밑변:"+x+" ,높이:"+y+" ,면적:"+x*y/2);
	}
}
public class JC19013135E1 {
	public static void main(String args[])
	{
		System.out.println("19013135/정우현");
		Triangle tr[];
		tr = new Triangle [3];

		for(int i=0; i<tr.length; i++)
			tr[i] = new Triangle(tr, i);

		tr[0].setXY(15.0, 9.0);
		tr[1].setXY(9.0, 15.0);
		tr[2].setXY(12.0, 12.0);

		for(int i=0; i<tr.length; i++)
			tr[i].view();

		tr[0].cmp(tr[1]);
		tr[0].cmp(tr[2]);
	}
}
