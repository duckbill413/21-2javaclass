package Num1;

class PrintShop{
	private char ch;
	private int num;

	public PrintShop() {
		ch = '#';
		num = 5;
	}

	public PrintShop(char ch) {
		this.ch = ch;
		this.num = 5;
	}
	public PrintShop(char ch, int num)
	{
		this.ch = ch;
		this.num = num;
	}

	public void print() {
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public void reverse()
	{
		for(int i=num; i>0; i--)
		{
			for(int j= 0; j<i; j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public void print(int cnt)
	{
		for(int k=0; k<cnt; k++)
		{
			if(k%2==0) print();
			else reverse();
		}
	}
	public void printReverse(int cnt)
	{
		for(int k=0; k<cnt; k++)
		{
			if(k%2==0) reverse();
			else print();
		}
	}

}
public class JT19013135_E1 {
	public static void main(String arg[])
	{
		System.out.println("19013135/Á¤¿ìÇö");

		PrintShop ps1 = new PrintShop();
		PrintShop ps2 = new PrintShop('@');
		PrintShop ps3 = new PrintShop('$',10);

		ps1.print();
		ps2.print(3);
		ps3.printReverse(2);
	}
}
