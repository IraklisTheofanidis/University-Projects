class Employee1
{
	private String name = "Kanena onoma";
	private int age;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age) 
	{
		this.age=age;
	}
	public int getAge() 
	{
		return age;
	}
}
class Manager extends Employee1 
{ }

class TestEmployee1 
{
	public static void main(String[] args) 
	{
		Manager mgr = new Manager();
		mgr.setName("Nikos"); 
		String mgrName = mgr.getName(); 
		mgr.setAge(52);
		int mgrHlikia=mgr.getAge(); 
		System.out.println("To onoma tou manager: " + mgrName+ " Hlikia: "+ mgrHlikia);
	}
}