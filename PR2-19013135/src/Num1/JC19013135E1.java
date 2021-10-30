package Num1;
import java.util.*;

class Location{
	private String city;
	private int latitude, longitude;
	
	public Location(String city, int latitude, int longitude)
	{
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String toString()
	{
		return city+" "+latitude+" "+longitude;
	}
	
	
}
public class JC19013135E1 {
	public static void main(String[]args)
	{
		Location [] citys = new Location [4];
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> map = new HashMap<String, Location>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0; i<citys.length; i++)
		{
			System.out.print(">> ");
			String inform = sc.nextLine();
			String [] informArray = inform.split(",");
			String city = informArray[0].trim();
			int latitude = Integer.parseInt(informArray[1].trim());
			int longitude = Integer.parseInt(informArray[2].trim());
			
			citys[i] = new Location(city, latitude, longitude);
			map.put(city,  citys[i]);
		}
		
		System.out.println("--------------------------------");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
		}
		System.out.println("--------------------------------");
		
		while(true)
		{
			System.out.print("도시 이름 >> ");
			String search = sc.next();
			if(search.equals("그만")) break;
			Location answer = map.get(search);
			if(answer==null) System.out.println(search + "는 없습니다");
			else System.out.println(answer.toString());
		}
	}
}
