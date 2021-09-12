class Employee
{
	private String eponimia;
	private int PayType;
	public Employee(String eponimia,int PayType)
	{
		this.eponimia=eponimia;
		this.PayType=PayType;
	}
	public String getEponimia()
	{
		return eponimia;
	}
	public int getPatType()
	{
		if (PayType==0)
		{
			System.out.println("Misthotos");
		}
		else if(PayType==1)
		{
			System.out.println("Oromisthios");
		}
		else
		{
			System.out.println("Symvasiouxos");
		}

		return PayType;
	}
	public String toString()
	{
		return  "\nEponimia: " + eponimia +
				"\nPayType: " + PayType;
	}
}


interface iMisthotos
{
	public void Katharos_Misthotou();
}

interface iOromisthios
{
	public void Katharos_Oromisthiou();
}

interface iSymvasiouxos
{
	public void Katharos_Symvasiouxou();
}


class Misthotos extends Employee implements iMisthotos
{
	private double akatharistos;
	private double kratiseis;
	public Misthotos(String eponimia,int PayType,double akatharistos, double kratiseis)
	{
		super(eponimia,PayType);
		this.akatharistos=akatharistos;
		this.kratiseis=kratiseis;
	}
	public void Katharos_Misthotou()
	{
		double teliko_poso;
		try
		{
			if(akatharistos==0)throw new ArithmeticException();
			{
				teliko_poso = akatharistos - kratiseis;
				System.out.println("To teliko poso einai: " + teliko_poso);
			}
		}
		catch(ArithmeticException A)
		{
			System.out.println("Lathos Akatharistos");
		}
	}
	public String toString()
	{
		return super.toString() + "\nAkatharistos: " + akatharistos +
									"\nKratiseis: " + kratiseis;
	}
}


class Oromisthios extends Employee implements iOromisthios
{
	private double ores_ergasias;
	private double oromisthio;
	public Oromisthios(String eponimia,int PayType,double ores_ergasias, double oromisthio)
	{
		super(eponimia,PayType);
		this.ores_ergasias=ores_ergasias;
		this.oromisthio=oromisthio;
	}
	public void Katharos_Oromisthiou()
	{
		double teliko_poso;
		teliko_poso = ores_ergasias*oromisthio-(ores_ergasias*oromisthio)*0.10;
		System.out.println("To teliko poso einai: " + teliko_poso);
	}
	public String toString()
	{
		return super.toString() + "\nOres_ergasias: " + ores_ergasias +
								"\nOromisthio: " + oromisthio;
	}
}

class Symvasiouxos extends Employee implements iSymvasiouxos
{
	private double akatharistos;
	private double kratiseis;
	public Symvasiouxos(String eponimia,int PayType,double akatharistos, double kratiseis)
	{
		super(eponimia,PayType);
		this.akatharistos=akatharistos;
		this.kratiseis=kratiseis;
	}
	public void Katharos_Symvasiouxou()
	{
		double teliko_poso;
		teliko_poso = akatharistos - kratiseis - (akatharistos - kratiseis) * 0.08;
		System.out.println("To teliko poso einai: " + teliko_poso);
	}
	public String toString()
	{
		return super.toString() + "\nAkatharistos: " + akatharistos +
									"\nKratiseis: " + kratiseis;
	}
}



class TestEmployee
{
	public static void main(String args[])
	{

		  Employee emp[] = new Employee[3];
		  emp[0] = new Misthotos("giorgos",0,0.0,40.0);//Evala 0 ton akatharisto gia na emfanisei to minima lathous
		  emp[1] = new Oromisthios("iraklis",1,10.0,5.0);
		  emp[2] = new Symvasiouxos("vasilis",2,100.0,30.0);
		  for (int i = 0; i < emp.length; i++)
		  {
		  	System.out.println(emp[i].toString());
		  	 if (emp[i]instanceof Misthotos)
		  	 {
				System.out.println();
				((Misthotos)emp[i]).Katharos_Misthotou();
				System.out.println("-----------------------------------");
	           }
           	if (emp[i] instanceof Oromisthios)
           	{
				System.out.println();
	       	   ((Oromisthios)emp[i]).Katharos_Oromisthiou();
	       	   System.out.println("-----------------------------------");
           	}
           	if (emp[i] instanceof Symvasiouxos)
           	{
           	   System.out.println();
           	   ((Symvasiouxos)emp[i]).Katharos_Symvasiouxou();
           	   System.out.println("-----------------------------------");
		  	}
		}

	}
}