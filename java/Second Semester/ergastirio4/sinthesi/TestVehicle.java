class Vehicle
{
	String onomateponimo;
	String arKykloforias;
	int etosKat;
	SystimaDieuthunsis sysdief;
	Mixani eng;

	public Vehicle(int etos , SystimaDieuthunsis s , Mixani e)
	{

		etosKat = etos;
		sysdief = s;
		eng = e;
	}
	public void setOnomateponimo(String x)
	{
		onomateponimo=x;
	}
	public void setArKykloforias(String y)
	{
		arKykloforias = y;
	}
	public String getOnomateponimo()
	{
		return onomateponimo;
	}
	public String getArKykloforias()
	{
		return arKykloforias;
	}
	public SystimaDieuthunsis getSystimaDieuthunsis()
	{
		return sysdief;
	}
	public Mixani getMixani()
	{
		return eng;
	}
	public int getEtosKat()
	{
		return etosKat;
	}

}
class SystimaDieuthunsis
{
	String sistima;
	public void vazeiEmpros()
	{
		System.out.println("pire mpros");
	}
	public void svynei()
	{
System.out.println("esbise");
	}
	public void striveiAristera()
	{
		System.out.println("stribei aristera");
	}
	public void striveiDeksia()
	{
		System.out.println("stribei deksia");
	}
	public String getSistima()
	{
		return sistima;
	}





}

class Mixani
{
	String mixani;
	int kivismos;
	int ippodynami;
	public Mixani(String m,int k , int ip )
	{
		mixani =m;
		kivismos = k;
		ippodynami = ip;

	}
	public String getMixani()
	{
		return mixani;
	}


	public int getKivismos()
	{
		return kivismos;
	}
	public int getIppo()
	{
		return ippodynami;
	}


	public void leitourgeia()
	{
		System.out.println("leitourgia");
	}
	public void kinisi()
	{
		System.out.println("kinisi");
	}
	public void svisimo()
	{
		System.out.println("kubismos");
	}
}
class TestVehicle
{
	public static void main(String args[])
	{
	SystimaDieuthunsis s = new SystimaDieuthunsis("abgd");
	Mixani m = new Mixani("mix",10,10);
	int etos = 2001;



	Vehicle veh = new Vehicle(etos , s , m);
		Vehicle.setOnomateponimo("Nikos Nikas");
		Vehicle.setArKykloforias("1234abcp");
		System.out.println(veh.getOnomateponimo()+ " " + veh.getSystimaDieuthunsis().getSistima()+"  " + veh.getEtosKat());

}
}


