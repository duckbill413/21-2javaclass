
public class JC19013135PR0101 {
	public static void main(String args[])
	{
		
		int array[][] = new int[4][4];
		int num = 0;
		
		while(true)
		{
			int x,y;//x, y축 선언
			x = (int)(Math.random()*4);//0~4까지의 x축
			y = (int)(Math.random()*4);//0~4까지의 y축
			if(array[x][y]==0) {
				array[x][y] = (int)(Math.random()*10+1);//1~10까지의 수 입력
				num++;//채워진 숫자의 개수 카운팅
			}
			if(num == 10) break;//10개의 숫자를 채웠으면 종료
		}
		
		for(int i=0; i<array.length; i++)//배열 출력
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
