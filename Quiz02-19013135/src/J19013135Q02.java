public class J19013135Q02 {
	public static void main(String args[])
	{
		System.out.println("19013135 Á¤¿ìÇö");

		int intArray[][] = new int[4][];

		for(int i=0; i<intArray.length; i++)
			intArray[i] = new int[(intArray.length+1)-i];

		for(int i=0; i<intArray.length; i++)
		{
			for(int j=0; j<intArray[i].length; j++)
			{
				intArray[i][j] = (int)(Math.random()*100+1);
			}
		}

		int sum = 0;
		for(int i=0; i<intArray.length; i++)
		{
			sum = 0;
			for(int j=0; j<intArray[i].length; j++)
			{
				System.out.print(intArray[i][j]+" ");
				sum += intArray[i][j];
			}
			System.out.println("=> Sum of this row = "+sum);
		}
	}
}
