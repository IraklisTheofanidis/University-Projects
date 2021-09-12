//Mono seiriaki anazitisi

class MyUtils//eprepe fititis
{
	private String onoma;
	private String eponimo;
	private int arithmos;
	private int etos;
	public MyUtils(String on,String ep,int ar, int et)
	{
		onoma = on;
		eponimo = ep;
		arithmos = ar;
		etos = et;
	}
	public String getOnoma()
	{
		return onoma;
	}
	public String getEponimo()
	{
		return eponimo;
	}
	public int getArithmos()
	{
		return arithmos;
	}
	public int getEtos()
	{
		return etos;
	}
	public String toString()
	{
		return String.format("%-10s %-10s %-10s %-10s", "onoma: "+onoma,"epomino: "+eponimo,"arithmos mitroou: "+arithmos,"etos: "+etos);
	}
}
class fititis //eprepe MyUtils
{
	public static int anazitisiMeEponimo(MyUtils[] EP, String key)
	{
		for(int i = 0; i < EP.length; i++)
		{
			if(EP[i].getEponimo().equals(key))
			{
				return i;

			}


		}
		return -1;
	}
}

class TestMyUtils
{
	public static void main(String args[])
	{
		MyUtils ep[] = new MyUtils[3];
		ep[0] = new MyUtils("iraklis","theofanidis",110000,2016);
		ep[1] = new MyUtils("xristos","elbasidis",220000,2016);
		ep[2] = new MyUtils("axileas","gkekas",330000,2016);
		//for(int i = 0; i < ep.length; i++)
		//{
	//		System.out.println("dwse onoma");
	//		String on = UserInput.getString();
		//	System.out.println("dwse epitheto");
		//	String epi = UserInput.getString();
		//	System.out.println("dwse arithmo mitroou");
		//	short ar = UserInput.getShort();
		//	System.out.println("dwse etos");
		//	short etos = UserInput.getShort();
		//	ep[i] = new MyUtils(on,epi,ar,etos);
		//}
		int k = fititis.anazitisiMeEponimo(ep,"theofanidis");
		if(k == -1)//den tha ginei pote auto epeidi exw dwsei automata to "theofanidis". Tha eprepe na xrisimopioisw UserInput kai na valw ta epitheta monos wste na iparxei i dinatotita lathous
		{
			System.out.println("dn iparxei auto to epitheto");
		}
		else// Ara tha ginei to else
		{
			System.out.println( ep[k] );
		}
	}
}



