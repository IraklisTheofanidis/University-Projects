class Tilefono
{
	 int tipos;//0=kiniti tilefonia, 1=statheri tilefonia
	 int arithmos ;
	 int lepta;
	Tilefono(int t, int a, int l)
	{
		tipos = t;
		arithmos = a;
		lepta =l;
	}
	public int getTipos()
	{
		return tipos;
	}
	public int getLepta()
	{
			return lepta;
	}
	public String TyposTilefonou()
	{
		String Type;
		if(tipos==0)
		{
			Type = "kinito"	;
		}
		else
		{
			Type = "stathero";
		}
		return Type;
	}
	 public String toString()
	 {
	         return ("Lepta Klhshs: "+lepta+" |Arithmos Klhsewn: "+arithmos  +" |Tipos: " + tipos);
     }
}
class StatheroTilefono extends Tilefono
{
	public double KlisiStatherou()
	{
		double  xreosi = 0.1 * getLepta();
		return xreosi;
	}

	StatheroTilefono(int t, int a, int l)
	{
		super(t,a,l);
	}
	public  String  TyposTilefonou()
	{
		return "Stathero";
	}
	public String toString()
	{
	          return super.toString()+" |Typos Thlefwnou:  "+TyposTilefonou()+" |Poso Klhshs Pros Stathera: "+KlisiStatherou();
    }
}
class KinitoTilefono extends Tilefono
{
	public double KlisiKinitou()
	{
			double xreosi;
			xreosi = 0.2 * getLepta();
			return xreosi;
	}

	KinitoTilefono(int t, int a, int l)
	{
		super(t,a,l);
	}
	public String TyposTilefonou()
	{
		return "kinito";
	}
	 public String toString()
	 {
	           return super.toString()+" |Typos Thlefwnou:  "+TyposTilefonou()+" |Poso Klhshs Pros Stathera: "+KlisiKinitou();
    }
}
class TestTilefono
{
	public static void main(String args[])
	{
		KinitoTilefono kin = new KinitoTilefono(0,10,10);
		System.out.println(kin.toString());
		StatheroTilefono stath = new StatheroTilefono(1,10,20);
		System.out.println(stath.toString());
	}
}



//System.out.println("i xreosi gia ta stathera tilefona einai " + xreosi);


