class Account
{
	private String name;
	private double balance;
	private double poso;

	Account(String name , double balance,double poso)
	{
		this.name = name;
		this.balance = balance;
		this.poso = poso;

	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getPoso()
	{
		return poso;
	}
	public String toString(){
	        return "\nEponymo : "+name +
	                "\nBalance : "+balance +
	                "\nPoso : "+poso;
    }

}

interface iDebit
{
	void debit(String name, double balance, double poso);
}
interface iCredit
{
	void credit(String name, double balance, double poso);
}
interface iMetafora
{
	void metafora(String name, double balance, double poso);
}






class Debit extends Account implements iDebit
{

	Debit(String name , double balance ,double poso)
	{
		super(name,balance,poso);

	}
	public void debit(String name, double balance, double poso)
	{


		balance=balance +poso;
		System.out.println("Neo Ypoloipo= "+balance);
	}
	public String getName()
	{
			return super.getName();
	}



}
class Credit extends Account implements iCredit
{

	Credit(String name , double balance ,double poso)
	{
		super(name,balance,poso);

	}
	public void credit(String name, double balance, double poso)
	{
			double ipolipo;
			try
			{
				if(balance<poso)	throw new  ArithmeticException();
			    {
					  ipolipo =balance-poso;
					    System.out.println("Neo ipoloipo= "+ ipolipo);
			     }
		    }
		    catch(ArithmeticException a)
	      {
	           System.out.println("Mi eparkeis Ypoloipo");
       		}

	}
}
class Metafora extends Account implements iMetafora
{

	Metafora(String name , double balance,double poso)
	{
		super(name,balance,poso);

	}
	public void metafora(String name, double balance, double poso)
	{
		balance= balance -poso;
		System.out.println("Neo Ypoloipo metafora= "+balance);
	}
}






class TestAccount
{
	public static void main(String args[])
	{


			iDebit deb = new Debit("Papadopoulos", 1500, 500);
			System.out.println(deb.toString());
			deb.debit(((Debit)deb).getName(),((Debit)deb).getBalance(),((Debit)deb).getPoso());

			iCredit cred = new Credit("Ioannou", 1500, 2000);
			System.out.println(cred.toString());
			cred.credit(((Credit)cred).getName(),((Credit)cred).getBalance(),((Credit)cred).getPoso());

			iMetafora met = new Metafora("Papazoglou",1500,1000);
			System.out.println(met.toString());
			met.metafora(((Metafora)met).getName(),((Metafora)met).getBalance(),((Metafora)met).getPoso());




		     Account acc[] = new Account[3];
	        acc[0] = new Debit("Papadopoulos", 1500, 500);
	        acc[1] = new Credit("Giannoy", 1500, 1000);
	        acc[2] = new Metafora("Papazoglou",1500,1000);
	        for (int i = 0; i < acc.length; i++) {
            System.out.println(acc[i].toString());
             if (acc[i]instanceof Debit) {

			        ((Debit)acc[i]).debit("Nikos", acc[i].getBalance(), acc[i].getPoso());

			           }
			           if (acc[i] instanceof Credit) {
			              ((Credit)acc[i]).credit("Petros", acc[i].getBalance(), acc[i].getPoso());
			           }
			           if (acc[i] instanceof Metafora) {
			              ((Metafora)acc[i]).metafora("Giorgos", acc[i].getBalance(), acc[i].getPoso());
			           }
			       }

	}
}
//iMisthotos m = new Misthotos("giorgos",0,200.0,40.0);
		//System.out.println(m.toString());
		//m.Katharos_Misthotou();

		//iOromisthios o = new Oromisthios("iraklis",1,10.0,5.0);
		//System.out.println(o.toString());
		//o.Katharos_Oromisthiou();

		//iSymvasiouxos s = new Symvasiouxos("vasilis",2,100.0,30.0);
		//System.out.println(s.toString());
		//s.Katharos_Symvasiouxou();