abstract class Course
{
	private double vathmos_eksetasis;
	private double vathmos_ergasias;
	Course(double eks , double erg)
	{
		vathmos_eksetasis = eks;
		vathmos_ergasias = erg;
	}
	public abstract double TelikosVathmos();//afirimeni methodos i opoia prepei na ilopioithei stis ipoklaseis
	public String toString()
	{
		return String.format("%-10s %-10s  " , vathmos_eksetasis , vathmos_ergasias  );
	}
	public double getVathmosEksetasis()
	{
			return vathmos_eksetasis;
	}
	public double getVathmosErgasias()
	{
		return vathmos_ergasias;
	}

}
class Theoritiko extends Course
{
		//override tin TelikosVathmos()
		Theoritiko(double eks,double erg)
		{
			super(eks,erg);
		}
		public double TelikosVathmos()
		{
			double telikos = getVathmosEksetasis()*70/100 + getVathmosErgasias()*30/100;
			return telikos;
		}
		public String toString()
		{
			return String.format("%-10s %-10s %-10s ", "o vathmos tis eksetasis einai: " + getVathmosEksetasis(),"   o vathmos tis ergasias einai: " +getVathmosErgasias(),"  Epomenos o telikos vathmos tha einai: " + TelikosVathmos());
		}

}
class Ergastiriako extends Course
{
	//override tin TelikosVathmos()
	Ergastiriako(double eks,double erg)
	{
		super(eks,erg);
	}
	public double TelikosVathmos()
	{
		double telikos = getVathmosEksetasis();
		return telikos;
	}
	public String toString()
	{
		return String.format("%-10s %-10s  " ,"o vathmos tis eksetasis einai: " + getVathmosEksetasis() ,"  Epomenos o telikos vathmos tha einai: " + TelikosVathmos());
	}
}

class TestCourse
{
	public static void main(String args[])
	{
		Course theor = new Theoritiko(9,8);
		System.out.println(theor.toString());
		Course Ergas = new Ergastiriako(10.0,0.0);
		System.out.println(Ergas.toString());
	}
}