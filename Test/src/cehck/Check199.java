package cehck;

public class Check199 {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public Check199(int x) {
		this.x = x;
	}
	public static void main(String [] args)
	{
		Check199 a = new Check199(3);
		int n = a.getX();
	}
}
