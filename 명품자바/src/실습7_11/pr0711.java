package 실습7_11;
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
		city.put("멕시코", "멕시코시티");
		city.put("스페인", "리스본");
		city.put("프랑스", "파리");
		city.put("영국", "런던");
		city.put("그리스", "아테네");
		city.put("독일", "베를린");
		city.put("일본", "동경");
		city.put("중국", "베이찡");
		city.put("러시아", "모스크바");
	}
	public void runGame() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료3>> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: finish(); return;
			}
		}
	}
	public void input() {
		System.out.println("현재 "+city.size()+"개 나라와 수도가 입력되어 있습니다.");		
		while(true) {
			System.out.println("나라와 수도 입력 "+(city.size()+1)+">>");
			String nation, capital;
			nation = sc.next();
			if(nation.equals("그만")) break;
			capital = sc.next();
			
			if(city.containsKey(nation)) {
				System.out.println(nation+"는 이미 있습니다!");
				continue;
			}
			
			city.put(nation, capital);
//			Set<String> keys = city.keySet();
//			Iterator<String> it = keys.iterator();
//			boolean found = false;
//			while(it.hasNext()) {
//				if(it.next().equals(na)) {
//					System.out.println(na+"는 이미 있습니다!");
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
			System.out.print(obj[index]+"의 수도는?");
			String srCapital = sc.next();
			if(srCapital.equals("그만")) break;
			
			if(srCapital.equals(city.get(obj[index])))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");
		}
	}
	
	public void finish() {
		System.out.println("게임을 종료합니다");
	}

	public static void main(String[]args) {
		pr0711 pr = new pr0711();
		pr.runGame();
	}
}