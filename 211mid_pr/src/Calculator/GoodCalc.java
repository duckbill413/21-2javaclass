package Calculator;

interface Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int [] a);
	int multiplex(int a, int b);
}
class gam implements Calculator{
	@Override
	public int multiplex(int a, int b) {
		return a*b;
	}
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int []a) {
		double sum = 0.0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		return sum/a.length;
	}
}
public class GoodCalc implements Calculator {
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int []a) {
		double sum = 0.0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		return sum/a.length;
	}

	public static void main(String [] args)
	{
		Calculator c = new GoodCalc();
		System.out.println(c.add(2,  3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2,3,4,5}));
	}
	@Override
	public int multiplex(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
