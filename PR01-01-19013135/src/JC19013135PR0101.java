
public class JC19013135PR0101 {
	public static void main(String args[])
	{
		
		int array[][] = new int[4][4];
		int num = 0;
		
		while(true)
		{
			int x,y;//x, y�� ����
			x = (int)(Math.random()*4);//0~4������ x��
			y = (int)(Math.random()*4);//0~4������ y��
			if(array[x][y]==0) {
				array[x][y] = (int)(Math.random()*10+1);//1~10������ �� �Է�
				num++;//ä���� ������ ���� ī����
			}
			if(num == 10) break;//10���� ���ڸ� ä������ ����
		}
		
		for(int i=0; i<array.length; i++)//�迭 ���
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
