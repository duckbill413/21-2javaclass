package �ǽ�7_2;
import java.util.*;

public class pr0702 {
	public static void main(String []args) {
		ArrayList<String> li = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>> ");
		for(int i=0; i<6; i++)
			li.add(sc.next());
		
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("A",  4.0);
		map.put("B",  3.0);
		map.put("C",  2.0);
		map.put("D",  1.0);
		map.put("F",  (double) 0);
		
		//HashMap search : Set<String> keys = map.keySet();
		//HashMap search : Iterator<String> it = keys.iterator();
		Iterator<String> it = li.iterator();
		double sum = 0.0;
		while(it.hasNext()) {
			sum+=map.get(it.next());
		}
		sum/=li.size();
		System.out.println(sum);
	}
}
