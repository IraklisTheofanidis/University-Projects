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

		 //dimiourgei 1-10 antikimena tixaia
		 int n = 1 + (int) (Math.random() * 10);
		 System.out.println("Ari8mos antikimenwn : "+n);
		  Account acc[] = new Account[n];

	       // acc[0] = new Debit("Papadopoulos", 1500, 500);
	       // acc[1] = new Credit("Giannoy", 1500, 1000);
	       // acc[2] = new Metafora("Papazoglou",1500,1000);
	        for(int i = 0; i< acc.length; i++)
	        {
				if(i<(int) ( acc.length *0.3))
				{
					acc[i] = new Debit("Papadoupolos", 1500, 500);
				}
				else if(i>(int) ( acc.length *0.3) && i <(int) (acc.length*0.7))
	        	{
					acc[i] = new Credit("Giannoy", 1500, 1000);
				}
				else
				{
					acc[i] = new Metafora("Papazoglou",1500,1000);
				}
			}


	        for (int i = 0; i < acc.length; i++) {
			// Account acc[] = new Account[n];
			// acc[0] = new Debit("Papadopoulos", 1500, 500);
		   // acc[1] = new Credit("Giannoy", 1500, 1000);
	       // acc[2] = new Metafora("Papazoglou",1500,1000);
            System.out.println(acc[i].toString());
             if (acc[i]instanceof Debit)
             {
			        ((Debit)acc[i]).debit("Nikos", acc[i].getBalance(), acc[i].getPoso());

			           }
			           if (acc[i] instanceof Credit) {
			              ((Credit)acc[i]).credit("Petros", acc[i].getBalance(), acc[i].getPoso());
			           }
			           if (acc[i] instanceof Metafora) {
			              ((Metafora)acc[i]).metafora("Giorgos", acc[i].getBalance(), acc[i].getPoso());
			           }
			       }
			     //  System.out.println(UserInput.rndAddress() );

	}
}