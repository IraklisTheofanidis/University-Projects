//a=seiriaki anazitisi b=diadiki anazitisi c=anadromiki diadiki anazitisi


class foititis1
{
	private String onoma;
	private String epitheto;
	private int arithmos;
	private int etos;
	public foititis1(String on , String ep , int ar , int et)
	{
		onoma = on;
		epitheto = ep;
		arithmos = ar;
		etos = et;
	}
	public String getepitheto()
	{
		return epitheto;
	}
	public String getonoma()
	{
		return onoma;
	}
	public int getarithmos()
	{
		return arithmos;
	}
	public int getetos()
	{
		return etos;
	}
	public String toString()
	{
		return String.format("%-10s %-10s %-10s %-10s", onoma,epitheto,arithmos,etos);
	}
}
class my1
{
	public static int a(foititis1[] f, String key)
	{
		for(int i = 0; i < f.length; i++)
			if(f[i].getepitheto().equals(key))
				return i;
			return -1;
	}
	public static int b(foititis1[] f,int key1)
	{
		int left = 0;
		int right = f.length-1;
		int mid;
		int found = -1;
		while(found ==-1 && left <= right)
		{
			mid = (left + right)/2;
			if(key1 < f[mid].getarithmos())
				right = mid-1;
			else if(key1 > f[mid].getarithmos())
				left = mid+1;
			else
				found = mid;
		}
		return found;
	}
	public static int c(foititis1[] f, int key2 , int left , int right)
	{
		int mid = (left + right)/2;
		if(left>right)
			return -1;
		if(key2 < f[mid].getarithmos())
			return c(f,key2,left,mid-1);
		else if(key2 > f[mid].getarithmos())
			return c(f,key2,mid+1,right);
		else
			return mid;
	}
}
class TestMy
{
	public static void main(String args[])
	{
		foititis1[] f = new foititis1[3];
		f[0] = new foititis1("iraklis","theofanidis",110000,2016);
		f[1] = new foititis1("xristos","elbasidis",220000,2016);
		f[2] = new foititis1("axileas","gkekas",330000,2016);



		//an ithela me UserInput
		//for(int i =0; i < f.length; i++)
		//{
		//	System.out.println("dwse onoma");
		//	String on = UserInput.getString();
		//	System.out.println("dwse epitheto");
		//	String ep = UserInput.getString();
		//	System.out.println("dwse arithmo mitroou");
		//	short ar = UserInput.getShort();
		//	System.out.println("dwse etos");
		//	short etos = UserInput.getShort();
		//	f[i] = new foititis1(on,ep,ar,etos);
		//		}

		//anazitisi me vasi to epitheto
		System.out.println("pios einai o prwtos  fititis pou psaxneis  ");
		String epitheto = UserInput.getString();
		int k = my1.a(f,epitheto);
		if(k == -1)
			System.out.println(" den iparxei tetoio epitheto ");
		else
			System.out.println(f[k]);
		System.out.println();
		//anazitisi me vasi to mitroo
		System.out.println("poios einai o deuteros fititis pou psaxneis ");
		int arithmos = UserInput.getInteger();
		int k1 = my1.b(f,arithmos);
		if(k1 == -1)
			System.out.println(" den iparxei tetoios arithmos mitroou ");
		else
			System.out.println(f[k1]);
		System.out.println();
		//anazitisi me mitroo pali
		System.out.println("poios einai o tritos fititis pou psaxneis ");
		int left=0;
		int right = f.length-1;
		int arithmos2 = UserInput.getInteger();
		int k2 = my1.c(f,arithmos2,left,right);
		if(k2 == -1)
			System.out.println("den eiparxei tetoios arithmos mitroou ");
		else
			System.out.println(f[k2]);
	}
}




