class Employee
{
	protected String name;
	protected int b;
	protected int h;
	protected int payType;//0=misthis, 1=me tin wra
	Employee(String s, int b_, int h_, int p)
	{
		name=s; b=b_; h=h_; payType=p;
	}
	public String getName()
	{
		return name;
	}
	public String getPayType()
	{
		String pType;
		if (payType==0)
			pType="Misthos";
		else
			pType="Me tin Ora";
		return pType;
	}
	public String getEmpType()
	{
		return "Employee";
	}
	public void calcSalary()
	{
		int s=1000;
		System.out.println(" Misthos Employee  = " + s);
	}
}
class Administrator extends Employee
{
	Administrator(String s, int b, int h, int p)
	{
		super(s,b,h,p);
	}
	public void calcSalary()
	{
		int s=0;
		if (payType==0)
			s=1200+b; //vasikos=1200
		else
			s=(h*12);  //12 Euro per hour
		System.out.println(" Misthos (Dioikitikou) = " + s);
	}
}
class Technical extends Employee
{
	Technical(String s, int b, int h, int p)
	{
		super(s,b,h,p);
	}
	public String getEmpType()
	{
		return "Tehnikos Ypalilos";
	}
	public void calcSalary()
	{
		int s=0;
		if (payType==0)
			s=800+b; //vasikos=800
		else
			s=(h*10); //10 Euro per hour
		System.out.println(" Misthos (Tehnikou)= " + s);
	}
}

class TestEmployeetest
{
	public static void main(String[] args)
	{
		int a;
		Employee emp[]= new Employee[4];
		Employee e1= new Technical("Nikas",1000,10,0);
		Employee e2=new Administrator("Vasileiou",1000,20,0);
		Employee e3= new Technical("Paylidis",10,10,1);
		Employee e4=new Administrator("Apostolatos",10,10,1);
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;

		for (int i=0;i<4; i++)
		{
			System.out.println();
			System.out.println("Onoma          = "+ emp[i].getName());
			System.out.println("Typos Ypalilou = "+ emp[i].getEmpType());
			System.out.println("Typos Pliromis = "+ emp[i].getPayType());
			emp[i].calcSalary();
		}
	}
}