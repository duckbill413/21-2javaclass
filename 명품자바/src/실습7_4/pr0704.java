package 실습7_4;
import java.util.*;

public class pr0704 {
	public static void main(String []args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		
		while(true) {
			System.out.print("강수량 입력(0 입력식 종료)>> ");
			int num = sc.nextInt();
			if(num==0) break;
			
			v.add(num);
			sum+= (double)num;
			
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
			
			double avg = sum/v.size();
			System.out.println("현재 평균 " + (int)avg);
		}
	}
}
