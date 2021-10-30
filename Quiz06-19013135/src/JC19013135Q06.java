import java.util.*;

class Point{
	private int x,y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	public int sum() {
		return x+y;
	}
}
public class JC19013135Q06 {
	public static void main(String args[])
	{
		Point [] xandy = new Point [4];
		xandy[0] = new Point(-10, 10);
		xandy[1] = new Point(10, 10);
		xandy[2] = new Point(20, 20);
		xandy[3] = new Point(3, 30);
		
		HashMap<Integer, Point> map = new HashMap<Integer, Point>();
		
		for(int i=0; i<xandy.length; i++)
			map.put(xandy[i].sum(), xandy[i]);
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));			
		}
	}
}
