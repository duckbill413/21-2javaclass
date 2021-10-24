package DictionaryApp;

abstract class PairMap{
	protected String keyArray[];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap{
	@Override
	public String get(String key)
	{
		for(int i=0; i<keyArray.length; i++)
		{
			if(keyArray[i]==key) return valueArray[i];
		}
		return null;
	}
	@Override
	public void put(String key, String value)
	{
		for(int i=0; i<keyArray.length; i++)
		{
			if(keyArray[i]==key || keyArray[i]==null) {
				keyArray[i] = key;
				valueArray[i] = value;
				break;
			}
		}
	}
	@Override
	public String delete(String key)
	{
		for(int i=0; i<keyArray.length; i++)
		{
			if(keyArray[i]==key) {
				String tmp = valueArray[i];
				valueArray[i] = null;
				return tmp;
			}
		}
		return null;
	}
	@Override
	public int length() {
		int cnt = 0;
		for(int i=0; i<keyArray.length; i++)
		{
			if(keyArray[i]!=null) cnt++;
		}
		return cnt;
	}
	public Dictionary(int size)
	{
		keyArray = new String[size];
		valueArray = new String[size];
	}
	
}
public class DictionaryApp {
	public static void main(String args[])
	{
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}
}
