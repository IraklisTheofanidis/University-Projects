class Account1
{
	private String name;
	private double balance;


	Account1(String name , double balance)
	{
		this.name = name;
		this.balance = balance;


	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}

	public String toString(){
	        return "\nEponymo : "+name +
	                "\nBalance : "+balance;
    }

}

interface iDebit1
{
	void debit1(double poso);
}
interface iCredit1
{
	void credit1(double poso);
}
interface iMetafora1
{
	void metafora1(double poso);
}






class Debit1 extends Account1 implements iDebit1
{
	private double poso;
	Debit1(String name , double balance,double poso )
	{
		super(name,balance);
		this.poso = poso;

	}
	public void debit1(double poso)
	{


		double balance=super.getBalance() +poso;
		System.out.println("Neo Ypoloipo= "+balance);
	}

}
class Credit1 extends Account1 implements iCredit1
{
	private double poso;
	Credit1(String name , double balance ,double poso)
	{
		super(name,balance);
		this.poso = poso;

	}
	public void credit1(double poso)
	{
			double ipolipo;
			try
			{


			       if(getBalance()<poso)	throw new  ArithmeticException();
			       {
					   ipolipo =getBalance()-poso;
				   		    System.out.println("Neo ipoloipo= "+ ipolipo);
			        }
			     }

			       catch(ArithmeticException a){
			            System.out.println("Mi eparkeis Ypoloipo");
       }

	}
}
class Metafora1 extends Account1 implements iMetafora1
{
	private double poso;
	Metafora1(String name , double balance,double poso)
	{
		super(name,balance);
		this.poso = poso;
	}
	public void metafora1(double poso)
	{
		double balance= getBalance() - poso;
		System.out.println("Neo Ypoloipo metafora= "+balance);
	}
}






class TestAccount1
{
	public static void main(String args[])
	{


	//		iDebit1 deb = new Debit1("Papadopoulos", 1500, 500);
	//		System.out.println(deb.toString());
//			deb.debit1("Papadopoulos",1500,500);//an ithela na to kanw xwris na parw tis times apo tis get
	//		deb.debit1(((Debit1)deb).getName(),((Debit1)deb).getBalance(),((Debit1)deb).getPoso());
////		//System.out.println(((Debit1)deb).getName());
	//		iCredit1 cred = new Credit1("Ioanno", 1500, 2000);
	//		System.out.println(cred.toString());
	//		cred.credit1(((Credit1)cred).getName(),((Credit1)cred).getBalance(),((Credit1)cred).getPoso());

	//		iMetafora1 met = new Metafora1("Papazoglou",1500,1000);
	//		System.out.println(met.toString());
	//		met.metafora1(((Metafora1)met).getName(),((Metafora1)met).getBalance(),((Metafora1)met).getPoso());




		     Account1 acc[] = new Account1[3];
	        acc[0] = new Debit1("Papadopoulos", 1500.0,500.0);
	        acc[1] = new Credit1("Giannoy", 1500.0,500.0);
	        acc[2] = new Metafora1("Papazoglou",1500.0,500.0);
	        for (int i = 0; i < acc.length; i++)
	        {
            	System.out.println(acc[i].toString());
            	 if (acc[i]instanceof Debit1)
            	 {
					   ((Debit1)acc[i]).debit1( 500.0);

			      }
			      if (acc[i] instanceof Credit1)
			      {
			         ((Credit1)acc[i]).credit1( 2000.0);
			      }
			      if (acc[i] instanceof Metafora1)
			      {
			         ((Metafora1)acc[i]).metafora1( 500.0);
			      }
			}

	}
}