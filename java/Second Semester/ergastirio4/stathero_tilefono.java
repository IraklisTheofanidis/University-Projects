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