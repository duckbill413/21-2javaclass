package p11108;
import java.util.Scanner;



public class Q07 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
	{
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) return true;
		else return false;
	}
	public static void main(String argg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ��ǥ�� �Է��Ͻÿ�.:");
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("�浹����: " + inRect(x, y, 100,100, 200, 200));
		
		sc.close();
	}
}
