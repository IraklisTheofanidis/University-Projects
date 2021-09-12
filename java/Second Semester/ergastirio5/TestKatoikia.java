class Katoikia
{
	private int kodikos;
	private int dwmatia;
	private double tm;
	private String dieuthinsi;
	public Katoikia(int kodikos,int dwmatia,double tm,String dieuthinsi)
	{
		this.kodikos=kodikos;
		this.dwmatia=dwmatia;
		this.tm=tm;
		this.dieuthinsi=dieuthinsi;
	}
	public void TyposSinalagis()
	{
		System.out.println("Polisi i enoikio , analoga me ton kodiko");
	}
	public double Poso()
	{
		double poso=0;
		return poso;
	}
	public int getKodikos()
	{
		return kodikos;
	}
	public int getDwmatia()
	{
		return dwmatia;
	}
	public double getTm()
	{
		return tm;
	}
	public String getDieuthinsi()
	{
		return dieuthinsi;
	}
	public String toString()
	{
	return  "\nKodikos: " + kodikos +
			"\nDwmatia: " + dwmatia +
			"\nTetragwnika metra: " + tm +
			"\nDieuthinsi: " + dieuthinsi;
	}
}

class Diamerisma extends Katoikia
{
	private double timiD;
	public Diamerisma(int kodikos, int dwmatia, double tm, String dieuthinsi, double timiD)
	{
		super(kodikos,dwmatia,tm,dieuthinsi);
		this.timiD=timiD;
	}
	//Ypervasi tis TyposSinalagis
	public void TyposSinalagis()
	{
		try
		{
			if(getKodikos()<1 || getKodikos()>2)throw new ArithmeticException();
			{
				if(getKodikos()==1)
				{
					System.out.println("Polisi");
				}
				else
				{
					System.out.println("enikiasi");
				}
			}
		}
		catch(ArithmeticException A)
		{
			System.out.println("Lathos kodikos Sinalagis");
		}
	}
	public double getTimiD()
	{
		return timiD;
	}

	//Ypervasi tis poso
	 public double Poso()
	{
		double poso;
		try
		{
			if(getKodikos()>2||getKodikos()<1)throw new ArithmeticException();
			{
				if(getKodikos()==1)
				{
					poso = (timiD*2) + (timiD/2);
				}
				else
				{
					poso = timiD + 1200;
				}
				return poso;
			}
		}
		catch(ArithmeticException A)
		{
			System.out.println("Efoson einai lathos o kodikos sinalagis den ginete o ipologismos");
			return 0;
		}

	}
	 public String toString()
	{
		return super.toString() + "\nTimi diamerismatos: " + timiD;
	}
}

class ExohikiKatoikia extends Katoikia
{
	private double timiEx;
	public ExohikiKatoikia(int kodikos, int dwmatia, double tm, String dieuthinsi, double timiEx)
	{
		super(kodikos,dwmatia,tm,dieuthinsi);
		this.timiEx=timiEx;
	}
	//Ypervasi tis TyposSinalagis
	public void TyposSinalagis()
	{
		try
		{
			if(getKodikos()<1 || getKodikos()>2)throw new ArithmeticException();
			{
				if(getKodikos()==1)
				{
					System.out.println("Polisi");
				}
				else
				{
					System.out.println("enikiasi");
				}
			}
		}
		catch(ArithmeticException A)
		{
			System.out.println("Lathos kodikos Sinalagis");
		}
	}
	public double getTimiEx()
	{
		return timiEx;
	}

	//Ypervasi tis poso
	public double Poso()
	{
		double poso;
		try
		{
			if(getKodikos()>2||getKodikos()<1)throw new ArithmeticException();
			{
				if(getKodikos()==1)
				{
					poso = (timiEx*2) + (timiEx/2);
				}
				else
				{
					poso = timiEx + 1200;
				}
				return poso;
			}
		}
		catch(ArithmeticException A)
		{
			System.out.println("Efoson einai lathos o kodikos sinalagis den ginete o ipologismos");
			return 0;
		}

	}
	public String toString()
	{
		return super.toString() + "\nTimi diamerismatos: " + timiEx;
	}
}

class Mesonette extends Katoikia
{
	private double timiM;
	public Mesonette(int kodikos, int dwmatia, double tm, String dieuthinsi, double timiM)
	{
		super(kodikos,dwmatia,tm,dieuthinsi);
		this.timiM=timiM;
	}
	//Ypervasi tis TyposSinalagis
	public void TyposSinalagis()
	{
		try
		{
			if(getKodikos()<1 || getKodikos()>2)throw new ArithmeticException();
			{
				if(getKodikos()==1)
				{
					System.out.println("Polisi");
				}
				else
				{
					System.out.println("enikiasi");
				}
			}
		}
		catch(ArithmeticException A)
		{
			System.out.println("Lathos kodikos Sinalagis");
		}
	}
	public double getTimiM()
	{
		return timiM;
	}

	//Ypervasi tis poso
	public double Poso()
	{
		double poso;
		try
		{
			if(getKodikos()>2||getKodikos()<1)throw new ArithmeticException();
			{
				if(getKodikos()==1)
				{
					poso = (timiM*2) + (timiM/2);
				}
				else
				{
					poso = timiM + 1200;
				}
				return poso;
			}
		}
		catch(ArithmeticException A)
		{
			System.out.println("Efoson einai lathos o kodikos sinalagis den ginete o ipologismos");
			return 0;
		}

	}
	public String toString()
	{
		return super.toString() + "\nTimi diamerismatos: " + timiM;
	}
}





public class TestKatoikia
{
	public static void main(String args[])
	{
		Katoikia diam = new Diamerisma(3,10,500.0,"polizoidi 8", 600.0);
		System.out.println(diam.toString());
		System.out.println();
		diam.TyposSinalagis();
		double p =diam.Poso();
		System.out.println("To teliko poso einai: "  + p);
		System.out.println("---------------------------------------------------");
		Katoikia exoh = new ExohikiKatoikia(2,10,500.0,"polizoidi 8", 500.0);
		System.out.println(exoh.toString());
		System.out.println();
		exoh.TyposSinalagis();
		double p2 =exoh.Poso();
		System.out.println("To teliko poso einai: "  + p2);
		System.out.println("---------------------------------------------------");
		Katoikia mes = new Mesonette(1,15,544.0,"polizoidi 8", 250.0);
		System.out.println(mes.toString());
		System.out.println();
		mes.TyposSinalagis();
		double p3 =mes.Poso();
		System.out.println("To teliko poso einai: "  + p3);



	}
}
