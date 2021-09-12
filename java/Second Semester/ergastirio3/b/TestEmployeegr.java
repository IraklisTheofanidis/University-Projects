class Employeegr
{
	private String onoma;
	private String epitheto;
	private int arithmos;
	private double misthos;
	public Employeegr(){}
	public Employeegr(String on , String ep , int ar , double m)
	{
		onoma = on;
		epitheto = ep;
		arithmos = ar;
		misthos = m;
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
	public double getmisthos()
	{
		return misthos;
	}
	public String toString()
	{
		return String.format("%-10s %-10s %-10s %-10s", onoma,epitheto,arithmos,misthos);
	}
}
class empgr
{
	public static int a(Employeegr[] f, String key)  // seiriaki anazitisi
	{
		for(int i = 0; i < f.length; i++)
			if(f[i].getepitheto().equals(key))
				return i;
			return -1;
	}

	public static void methodos(Employeegr[] list) // grigori taksinomisi
	{
		methodos(list, 0, list.length - 1);
	}
	public static void methodos(Employeegr[] list, int first, int last)
	{
		if (last > first)
		{
			int pivotIndex = partition(list, first, last);
			methodos(list, first, pivotIndex - 1);
			methodos(list, pivotIndex + 1, last);
		}
	}
	public static int partition(Employeegr[] list, int first, int last)
	{
		Employeegr pivot = list[first];
		int low = first + 1;
		int high = last;
		while (high > low)
		{
			while (low <= high && list[low].getarithmos() <= pivot.getarithmos())
				low++;
				while (low <= high && list[high].getarithmos() > pivot.getarithmos())
					high--;
			if (high > low)
			{
				Employeegr temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		while (high > first && list[high].getarithmos() >= pivot.getarithmos())
			high--;
		if (pivot.getarithmos() > list[high].getarithmos())
		{
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else
		{
			return first;
		}
	}
	//diadiki anazitisi
	public static int b(Employeegr[] f,int key1)
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
}
class TestEmployeegr
{
	public static void main(String args[])
	{
		Employeegr[] f = new Employeegr[2];
		for(int i =0; i < f.length; i++)
		{
			System.out.println("dwse onoma");
			String on = UserInput.getString();
			System.out.println("dwse epitheto");
			String ep = UserInput.getString();
			System.out.println("dwse arithmo mitroou");
			short ar = UserInput.getShort();
			System.out.println("dwse etos");
			double misthos = UserInput.getDouble();
			f[i] = new Employeegr(on,ep,ar,misthos);
		}
		System.out.println("dwse 1:gia anazitisi me eponimo H dwse 2:gia anazitisi me kodiko");
		int kwd = UserInput.getInteger();
		switch(kwd)
		{
			case 1:
				System.out.println("dwse eponimo gia anazitisi  ");
				String epitheto = UserInput.getString();
				int k = empgr.a(f,epitheto);
				if(k == -1)
					System.out.println(" den iparxei tetoio epitheto ");
				else
					System.out.println(f[k]);
			break;
			case 2:
				System.out.println(" prwta kanw taksinomisi ");
				empgr.methodos(f);
				System.out.println("twra dwse kodiko gia na ksekinisi i diadiki anazitisi ");
				int arithmos = UserInput.getInteger();
				int k1 = empgr.b(f,arithmos);
				if(k1 == -1)
					System.out.println(" den iparxei tetoios arithmos mitroou ");
				else
					System.out.println(f[k1]);
			break;
		}
	}
}