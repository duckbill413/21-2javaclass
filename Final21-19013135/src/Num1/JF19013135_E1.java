package Num1;
import java.util.*;
import java.io.*;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String show() {
		return "점:("+x+","+y+", 거리:"+Math.sqrt(x*x+y*y);
	}
}
public class JF19013135_E1 {
	public static void main(String args[]) {
		System.out.println("19013135/정우현");
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(4, 5));
		v.add(new Point(7, -10));
		v.add(new Point(-20, 15));

		try {
			FileWriter fout = new FileWriter("19013135.dat");
			Iterator<Point> it = v.iterator();
			while(it.hasNext()) {
				Point find = it.next();
				String st = find.show();

				fout.write(st, 0, st.length());
				fout.write("\r\n", 0, 2);

			}
			fout.close();
		}
		catch(IOException e) {
			return;
		}
	}
}
