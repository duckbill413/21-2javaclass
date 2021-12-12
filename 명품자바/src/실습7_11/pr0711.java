package �ǽ�7_11;
import java.util.*;

class Nation{
	String country, capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
}

public class pr0711 {
	HashMap<String, String> city = new HashMap<String, String>();
	//Vector<Nation> v = new Vector<Nation>();
	Scanner sc = new Scanner(System.in);

	public pr0711(){
		city.put("�߽���", "�߽��ڽ�Ƽ");
		city.put("������", "������");
		city.put("������", "�ĸ�");
		city.put("����", "����");
		city.put("�׸���", "���׳�");
		city.put("����", "������");
		city.put("�Ϻ�", "����");
		city.put("�߱�", "������");
		city.put("���þ�", "��ũ��");
	}
	public void runGame() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");

		while(true) {
			System.out.print("�Է�:1, ����:2, ����3>> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: finish(); return;
			}
		}
	}
	public void input() {
		System.out.println("���� "+city.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");		
		while(true) {
			System.out.println("����� ���� �Է� "+(city.size()+1)+">>");
			String nation, capital;
			nation = sc.next();
			if(nation.equals("�׸�")) break;
			capital = sc.next();
			
			if(city.containsKey(nation)) {
				System.out.println(nation+"�� �̹� �ֽ��ϴ�!");
				continue;
			}
			
			city.put(nation, capital);
//			Set<String> keys = city.keySet();
//			Iterator<String> it = keys.iterator();
//			boolean found = false;
//			while(it.hasNext()) {
//				if(it.next().equals(na)) {
//					System.out.println(na+"�� �̹� �ֽ��ϴ�!");
//					found = true;
//					break;
//				}
//			}
//			if(!found)
//				city.put(na, ci);
		}
	}
	
	public void quiz() {
		Set<String> keys = city.keySet();
		Object [] obj = keys.toArray();
		
		while(true) {
			int index = (int)(Math.random()*city.size());
			System.out.print(obj[index]+"�� ������?");
			String srCapital = sc.next();
			if(srCapital.equals("�׸�")) break;
			
			if(srCapital.equals(city.get(obj[index])))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");
		}
	}
	
	public void finish() {
		System.out.println("������ �����մϴ�");
	}

	public static void main(String[]args) {
		pr0711 pr = new pr0711();
		pr.runGame();
	}
}