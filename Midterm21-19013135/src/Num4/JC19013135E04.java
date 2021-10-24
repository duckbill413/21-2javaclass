package Num4;

class Person{
	private String name;
	private int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void view()
	{
		System.out.println("���-[�̸� : "+name+", ���� : "+age+"]");
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}

class Student extends Person{
	private int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void view()
	{
		System.out.println("�л�-[�̸� : "+getName()+", ���� : "+getAge()+", �й� : "+id+"]");
	}
}

class ForeignStudent extends Student{
	private String nation;

	public ForeignStudent(String name, int age, int id, String nation) {
		super(name, age, id);
		this.nation = nation;
	}
	
	@Override
	public void view()
	{
		System.out.println("�ܱ��л�-[�̸� : "+getName()+", ���� : "+getAge()+", �й� : "+getId()+", ���� : "+nation+"]");
	}
}

public class JC19013135E04 {
	public static void main(String args[]) {
		Person p[] = new Person [3];
		p[0] = new Person("��ö��", 30);
		p[1] = new Student("�̿���", 24, 1867570);
		p[2] = new ForeignStudent("Steve Jobs", 26, 3866570, "U.S.A.");

		for(int i=0; i<p.length; i++)
			p[i].view();
	}
}
