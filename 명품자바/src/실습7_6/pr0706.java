package �ǽ�7_6;
//��ǥ�� �����ϰ� �Է� �ޱ�

import java.util.*;

class Location {
	private String city;
	private int vertical;
	private int horizental;

	public Location(String city, int vertical, int horizental) {
		this.city = city;
		this.vertical = vertical;
		this.horizental = horizental;
	}

	public String show() {
		return city + ", " + vertical + ", " + horizental;
	}
}

public class pr0706 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> maps = new HashMap<String, Location>(4);

		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String inform = sc.nextLine();
			String [] informArray = inform.split(",");
			String city = informArray[0].trim();
			int vertical = Integer.parseInt(informArray[1].trim());
			int horizental = Integer.parseInt(informArray[2].trim());
			
			maps.put(city, new Location(city, vertical, horizental));
		}
		System.out.println("------------------");

		Set<String> keys = maps.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(maps.get(it.next()).show());
		}
		
		System.out.println("------------------");
		while(true) {
			System.out.print("���� �̸� >> ");
			String city = sc.next();
			if(city.equals("�׸�")) break;
			if(maps.get(city)==null)
				System.out.println(city+"�� �����ϴ�");
			else
				System.out.println(maps.get(city).show());
		}
		
	}
}
