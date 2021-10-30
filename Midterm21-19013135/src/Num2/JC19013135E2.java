package Num2;

class Money{
	private int sum;
	private String name;
	
	public Money(){
		sum = 0;
		name = "";
	}
	public Money(String name, int sum) {
		setSum(sum);
		setName(name);
	}
	
	public int getSum() {
		return sum;
	}
	public String getName(){
		return name;
	}
	public void setSum(int sum)
	{
		this.sum += sum;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void minus(Money b, int total)
	{
		this.sum += total;
		b.setSum((-1)*total);
		
		System.out.println(b.getName());
		b.view();
		
		System.out.println(getName());
		view();
	}
	public void view() {
		int[] arrMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] nameMoney = {"오만원권", "만원권", "오천원권", "천원권", "500 원짜리 동전", "100 원짜리 동전", "50 원 짜리 동전", "10 원짜리 동전", "1 원짜리 동전"};
		int left = this.sum;
		for(int i=0; i<arrMoney.length; i++)
		{
			int print = left/arrMoney[i];
			if(print>0)
			System.out.println(nameMoney[i]+": "+print+" 매");
			left %= arrMoney[i];
		}
	}
	
	public void diff(Money b)
	{
		if(getSum()>b.getSum())
		{
			System.out.println("큰 액수: " + getSum() + " 차이: " + (getSum()-b.getSum()));
		}
		else {
			System.out.println("큰 액수: "+b.getSum() + " 차이: " + (b.getSum()-getSum()));
		}
	}
	
}
public class JC19013135E2 {
	public static void main(String []args)
	{
		Money [] mo = new Money [3];
		mo[0] = new Money("박철수", 107366);
		mo[1] = new Money("박영수", 68537);
		mo[2] = new Money("홍길동", 10337);
		
		for(int i=0; i<mo.length; i++)
		{
			System.out.println(mo[i].getName());
			mo[i].view();
		}
		
		mo[1].minus(mo[0], 23000);
		
		mo[1].diff(mo[0]);
	}
}
